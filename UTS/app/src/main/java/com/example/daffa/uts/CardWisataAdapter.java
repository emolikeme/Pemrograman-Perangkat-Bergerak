package com.example.daffa.uts;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class CardWisataAdapter extends RecyclerView.Adapter<CardWisataAdapter.ListViewHolder> {
    private ArrayList<wisata> listWisata;
    private Context context;

    public CardWisataAdapter(Context context, ArrayList<wisata> listWisata) {
        this.listWisata = listWisata;
        this.context = context;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_wisata, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        final wisata wisata = listWisata.get(position);
        Glide.with(holder.itemView.getContext())
                .load(wisata.getPhoto())
                .apply(new RequestOptions().fitCenter())
                .into(holder.imgPhoto);
        holder.tvName.setText(wisata.getName());
        holder.tvDesc.setText(wisata.getDescription());


        holder.cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailListWisata.class);
                intent.putExtra("wisata_id", wisata.getId());
                context.startActivity(intent);
            }
        });

    }

    @Override
    public  int getItemCount () { return listWisata.size(); }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDesc;
        CardView cv;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_wisata_list);
            tvName = itemView.findViewById(R.id.nama_wisata_list);
            tvDesc = itemView.findViewById(R.id.desc_wisata_list);
            cv = itemView.findViewById(R.id.cardview_item);
        }
    }
}

