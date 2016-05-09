package cc.fish.fishhttpdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnGetJoke = (Button) findViewById(R.id.btn_get_joke);
        btnGetJoke.setOnClickListener((v) -> startActivity(new Intent(this, JokeActivity.class)));
    }
}
