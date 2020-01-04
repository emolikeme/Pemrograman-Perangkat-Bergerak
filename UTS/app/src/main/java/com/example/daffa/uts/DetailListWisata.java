package com.example.daffa.uts;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class DetailListWisata extends AppCompatActivity {
    private int wisata_id;
    ImageView imgDetail;
    TextView tvName, tvDesc;
    private ArrayList<wisata> listWisata = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_list_wisata);
        wisata_id = getIntent().getIntExtra("wisata_id", 0);
        tvName = findViewById(R.id.nama_wisata);
        tvDesc = findViewById(R.id.desc_detail);
        imgDetail = findViewById(R.id.img_detail);

        listWisata.addAll(WisataData.getListData());

        setLayout();

    }

    private void setLayout() {
        tvName.setText(listWisata.get(wisata_id).getName());
        tvDesc.setText(listWisata.get(wisata_id).getDescription());
        Glide.with(this)
                .load(listWisata.get(wisata_id).getPhoto())
                .apply(new RequestOptions().fitCenter())
                .into(imgDetail);
    }
}
