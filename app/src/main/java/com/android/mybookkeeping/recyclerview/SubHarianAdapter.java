package com.android.mybookkeeping.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.android.mybookkeeping.R;

import java.util.List;

public class SubHarianAdapter extends RecyclerView.Adapter<SubHarianAdapter.SubHarianViewHolder> {
    private List<SubHarian> subHarianList;

    public SubHarianAdapter(List<SubHarian> subHarianList) {
        this.subHarianList = subHarianList;
    }

    @NonNull
    @Override
    public SubHarianAdapter.SubHarianViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.subitem_harian,parent,false);
        return new SubHarianAdapter.SubHarianViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SubHarianAdapter.SubHarianViewHolder holder, int position) {
        SubHarian subHarian = subHarianList.get(position);
        holder.tvKategori.setText(subHarian.getKategori());
        holder.tvKeterangan.setText(subHarian.getKeterangan());
        holder.tvJumlah.setText(subHarian.getJumlah());
    }

    @Override
    public int getItemCount() {
        return subHarianList.size();
    }

    class SubHarianViewHolder extends RecyclerView.ViewHolder{
        TextView tvKategori, tvKeterangan, tvJumlah;

        SubHarianViewHolder (View view){
            super(view);

            tvKategori = view.findViewById(R.id.kategori);
            tvKeterangan = view.findViewById(R.id.keterangan);
            tvJumlah = view.findViewById(R.id.jumlah);
        }
    }
}
