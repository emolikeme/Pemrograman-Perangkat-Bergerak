package com.example.daffa.uts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class aboutme extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutme);
        this.setTitle("Profil Saya");

    }

    public void instagram(View view) {
        Toast.makeText(getApplicationContext(), "@daffa_agusta", Toast.LENGTH_LONG).show();
    }

}
