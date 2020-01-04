package com.example.daffa.onlineshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.lihatbtn);
        Button btn2 = (Button) findViewById(R.id.inputbtn);
        Button btn3 = (Button) findViewById(R.id.infobtn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lihatData = new Intent(MainActivity.this, DataDagangan.class);
                startActivity(lihatData);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inputData = new Intent(MainActivity.this, inputdata.class);
                startActivity(inputData);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent info = new Intent(MainActivity.this, informasi.class);
                startActivity(info);
            }
        });
    }
}