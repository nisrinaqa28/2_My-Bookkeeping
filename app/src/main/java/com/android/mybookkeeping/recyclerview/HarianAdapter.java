package com.android.mybookkeeping.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.android.mybookkeeping.R;

import java.util.ArrayList;

public class HarianAdapter extends RecyclerView.Adapter<HarianAdapter.HarianViewHolder> {

    private ArrayList<Harian> listHarian;

    public HarianAdapter(ArrayList<Harian> listHarian) {
        this.listHarian = listHarian;
    }

    @NonNull
    @Override
    public HarianAdapter.HarianViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_harian,parent,false);
        return new HarianViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HarianAdapter.HarianViewHolder holder, int position) {
        holder.tvKategori.setText(listHarian.get(position).getKategori());
        holder.tvKeterangan.setText(listHarian.get(position).getKeterangan());
        holder.tvJumlah.setText(listHarian.get(position).getJumlah());
    }

    @Override
    public int getItemCount() {
        return (listHarian!=null) ? listHarian.size() : 0 ;
    }

    public class HarianViewHolder extends RecyclerView.ViewHolder{

        private TextView tvKategori, tvKeterangan, tvJumlah;

        public HarianViewHolder(View view){
            super(view);

            tvKategori = view.findViewById(R.id.kategori);
            tvKeterangan = view.findViewById(R.id.keterangan);
            tvJumlah = view.findViewById(R.id.jumlah);
        }
    }
}
