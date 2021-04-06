package com.android.mybookkeeping.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mybookkeeping.R;
import java.util.ArrayList;

public class BulananAdapter extends RecyclerView.Adapter<BulananAdapter.BulananViewHolder>{
    private ArrayList<Bulanan> listBulanan;

    public BulananAdapter(ArrayList<Bulanan> listBulanan) {
        this.listBulanan = listBulanan;
    }

    @NonNull
    @Override
    public BulananAdapter.BulananViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_bulanan,parent,false);
        return new BulananAdapter.BulananViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BulananAdapter.BulananViewHolder holder, int position) {
        holder.tvBulan.setText(listBulanan.get(position).getBulan());
        holder.tvPemasukan.setText(listBulanan.get(position).getJumlahPemasukan());
        holder.tvPengelaran.setText(listBulanan.get(position).getJumlahPengeluaran());
    }

    @Override
    public int getItemCount() {
        return (listBulanan!=null) ? listBulanan.size() : 0 ;
    }

    public class BulananViewHolder extends RecyclerView.ViewHolder{

        private TextView tvBulan, tvPemasukan, tvPengelaran;

        public BulananViewHolder(View view){
            super(view);

            tvBulan = view.findViewById(R.id.bulan);
            tvPemasukan = view.findViewById(R.id.jumlahPemasukan);
            tvPengelaran = view.findViewById(R.id.jumlahPengeluaran);
        }
    }
}
