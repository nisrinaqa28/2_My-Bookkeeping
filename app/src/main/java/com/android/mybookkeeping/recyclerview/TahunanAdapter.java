package com.android.mybookkeeping.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mybookkeeping.R;
import java.util.ArrayList;

public class TahunanAdapter extends RecyclerView.Adapter<TahunanAdapter.TahunanViewHolder>{
    private ArrayList<Tahunan> listTahunan;

    public TahunanAdapter(ArrayList<Tahunan> listTahunan) {
        this.listTahunan = listTahunan;
    }

    @NonNull
    @Override
    public TahunanAdapter.TahunanViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_tahunan,parent,false);
        return new TahunanAdapter.TahunanViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TahunanAdapter.TahunanViewHolder holder, int position) {
        holder.tvTahun.setText(listTahunan.get(position).getTahun());
        holder.tvPemasukan.setText(listTahunan.get(position).getJumlahPemasukan());
        holder.tvPengeluaran.setText(listTahunan.get(position).getJumlahPengeluaran());
    }

    @Override
    public int getItemCount() {
        return (listTahunan!=null) ? listTahunan.size() : 0 ;
    }

    public class TahunanViewHolder extends RecyclerView.ViewHolder{

        private TextView tvTahun, tvPemasukan, tvPengeluaran;

        public TahunanViewHolder(View view){
            super(view);

            tvTahun = view.findViewById(R.id.tahun);
            tvPemasukan = view.findViewById(R.id.jumlahPemasukan);
            tvPengeluaran = view.findViewById(R.id.jumlahPengeluaran);
        }
    }
}
