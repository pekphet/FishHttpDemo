package cc.fish.fishhttpdemo;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.widget.TextView;
import android.widget.Toast;

import cc.fish.fishhttp.net.RequestHelper;
import cc.fish.fishhttp.net.annotation.NetInject;
import cc.fish.fishhttp.net.annotation.NetMethod;
import cc.fish.fishhttp.net.annotation.NetUrl;
import cc.fish.fishhttp.net.annotation.Result;
import cc.fish.fishhttp.thread.Done;

/**
 * Created by fish on 16-5-9.
 */
public class JokeActivity extends Activity {


    @NetMethod(RequestHelper.Method.GET)
    @NetUrl(Constant.JOKE_API_GET)
    @Result(JokeResponseEntity.class)
    RequestHelper<JokeResponseEntity> getHelper;
    private JokeResponseEntity.JokeResponseBody body;
    private TextView tv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);
        tv = (TextView) findViewById(R.id.tv_content);
        NetInject.inject(this);
        initData();
    }

    private void initData() {
        //set HEADER PROPERTY in request (api)
        getHelper.HeaderParam(Constant.JOKE_API_KEY, Constant.BAIDU_API_KEY)
                .UrlParam("path", "1", true)
                .Success(new Done<JokeResponseEntity>() {
                    @Override
                    public void run(JokeResponseEntity responseEntity) {
                        if (responseEntity.getShowapi_res_code() == 0) {  //server receive correct params
                            body = responseEntity.getShowapi_res_body();
                            initView();
                        } else {
                            Toast.makeText(JokeActivity.this, responseEntity.getShowapi_res_error(), Toast.LENGTH_SHORT).show();
                        }
                    }
                })
                .Failed((msg) -> Toast.makeText(JokeActivity.this, (String)msg, Toast.LENGTH_SHORT).show())
                .get(this, new Handler(Looper.getMainLooper()));
    }

    private void initView() {
        if (body != null) {
            tv.setText(body.toString());
        }
    }
}
