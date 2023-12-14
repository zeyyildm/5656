package com.example.modacafe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    Button ana_button;
    Button sicak;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ana_button = findViewById(R.id.ana_button);
        sicak = findViewById(R.id.sicak);

        ana_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent anamenuyedon = new Intent(MainActivity2.this, MainActivity.class);
                finish();
                startActivity(anamenuyedon);
            }
        });


        sicak.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent ikincibuttonIntent = new Intent(MainActivity2.this, MainActivity3.class);
                finish();
                startActivity(ikincibuttonIntent);
            }
        });
    }
}
