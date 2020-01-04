package com.example.daffa.uts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvWisata;
    private ArrayList<wisata> list = new ArrayList<>();

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.profil, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==R.id.item_about){
            startActivity(new Intent(this, aboutme.class));
        }
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvWisata = findViewById(R.id.rv_wisata);
        rvWisata.setHasFixedSize(true);

        list.addAll(WisataData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvWisata.setLayoutManager(new LinearLayoutManager(this));
        CardWisataAdapter cardWisataAdapter = new CardWisataAdapter(this, list);
        rvWisata.setAdapter(cardWisataAdapter);
    }
}
