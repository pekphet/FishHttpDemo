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

/**
 * Created by fish on 16-5-9.
 */
public class PostActivity extends Activity {

    final private static String URL="http://192.168.1.201:58000/simple/post";

    @NetMethod(RequestHelper.Method.POST)
    @NetUrl(URL)
    @Result(ResponseEntity.class)
    private RequestHelper mHelper;
    private ResponseEntity entity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post);
        NetInject.inject(this);
        initData();
    }

    private void initData() {
        mHelper.PostParam(new PostParam("LALALA  I AM COMING~"))
                .Success((result) -> {
                    entity = (ResponseEntity) result;
                    if (entity != null) {
                        initView();
                    }
                }).Failed((msg)-> Toast.makeText(PostActivity.this, (String)msg, Toast.LENGTH_SHORT).show())
                .post(this, new Handler(Looper.getMainLooper()));
    }

    private void initView() {
        TextView tvIp = (TextView) findViewById(R.id.tv_ip);
        TextView tvContent = (TextView) findViewById(R.id.tv_content);
        tvIp.setText("Local IP is : " + entity.getIp());
        tvContent.setText("Send Content is : " + entity.getContent());
    }

    class ResponseEntity {
        private String ip, content;

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getIp() {

            return ip;
        }

        public void setIp(String ip) {
            this.ip = ip;
        }
    }
}
