package com.example.daffa.myintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements  View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnMoveActivity = findViewById(R.id.btn_move_activity);
        btnMoveActivity.setOnClickListener(this);

        Button btnMoveWithDataActivity = findViewById(R.id.btn_move_activity_data);
        btnMoveWithDataActivity.setOnClickListener(this);

        Button btnDialPhone = findViewById(R.id.btn_dial_number);
        btnDialPhone.setOnClickListener(this);

        Button btnurl = findViewById(R.id.btn_url);
        btnurl.setOnClickListener(this);

        Button btnlatihan = findViewById(R.id.btn_latihan);
        btnlatihan.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_move_activity:
                Intent moveIntent = new Intent(MainActivity.this, MoveActivity.class);
                startActivity(moveIntent);
                break;
            case R.id.btn_move_activity_data:
                Intent moveWithDataIntent = new Intent(MainActivity.this, MoveWithDataActivity.class);
                moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_NAME, "DAFFA AGUSTA");
                moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_AGE, 19);
                startActivity(moveWithDataIntent);

                break;
            case R.id.btn_dial_number:
                String phoneNumber = "088981028346";
                Intent dialPhoneIntent = new Intent(Intent.ACTION_DIAL);
                dialPhoneIntent.setData(Uri.parse("tel : "+phoneNumber));
                startActivity(dialPhoneIntent);
                break;

            case R.id.btn_url:
                Intent urlIntent = new Intent(Intent.ACTION_VIEW);
                urlIntent.setData(Uri.parse("http://polines.ac.id"));
                startActivity(urlIntent);
                break;
            case R.id.btn_latihan:
                Intent movelatihan = new Intent(MainActivity.this, PindahPolines1.class);
                startActivity(movelatihan);
                break;
        }
    }
}
