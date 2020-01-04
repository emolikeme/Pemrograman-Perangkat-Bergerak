package com.example.daffa.myviewandviews;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btndonasi = findViewById(R.id.btn_donasi);
        btndonasi.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_donasi :
                Intent moveIntent = new Intent(MainActivity.this, FormDonasi.class);
                startActivity(moveIntent);
        }
    }
}
