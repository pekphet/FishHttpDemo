package cc.fish.fishhttpdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_get_joke).setOnClickListener((v) -> startActivity(new Intent(this, JokeActivity.class)));
        findViewById(R.id.btn_post).setOnClickListener((v)-> startActivity(new Intent(this, PostActivity.class)));
        findViewById(R.id.btn_post_json).setOnClickListener((v)-> startActivity(new Intent(this, PostJsonActivity.class)));
    }
}
