package com.example.modacafe;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button menu_button;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        menu_button = findViewById(R.id.menu_button);

        menu_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sayfaiki = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(sayfaiki);
            }
        });
    }



    }



