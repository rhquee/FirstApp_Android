package pl.kfrak.firstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HelloActivity extends AppCompatActivity {

    private TextView helloText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);

        helloText = (TextView) findViewById(R.id.activity_helloText);

        Intent intent = getIntent();
        if(intent != null){
            String name = intent.getStringExtra("NAME");
            helloText.setText(String.format("Witaj %s ", name));
        }
    }
}
