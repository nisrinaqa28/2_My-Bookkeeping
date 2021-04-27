package com.android.mybookkeeping.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mybookkeeping.R;
import java.util.List;

public class HarianAdapter extends RecyclerView.Adapter<HarianAdapter.HarianViewHolder> {
    private RecyclerView.RecycledViewPool viewPool = new RecyclerView.RecycledViewPool();
    private List<Harian> harianList;
    private RecyclerViewClickListener listener;

    public HarianAdapter(List<Harian> harianList, RecyclerViewClickListener listener) {
        this.harianList = harianList;
        this.listener = listener;
    }

    @NonNull
    @Override
    public HarianAdapter.HarianViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_harian, parent, false);
        return new HarianAdapter.HarianViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HarianAdapter.HarianViewHolder holder, int position) {
        Harian harian = harianList.get(position);
        holder.tvTanggal.setText(harian.getTanggal());
        holder.tvPemasukan.setText(harian.getPemasukan());
        holder.tvPengeluaran.setText(harian.getPengeluaran());

        LinearLayoutManager layoutManager = new LinearLayoutManager(holder.rvSubHarian.getContext(),LinearLayoutManager.VERTICAL,false);
        layoutManager.setInitialPrefetchItemCount(harian.getSubHarianList().size());

        SubHarianAdapter subHarianAdapter = new SubHarianAdapter(harian.getSubHarianList());
        holder.rvSubHarian.setLayoutManager(layoutManager);
        holder.rvSubHarian.setAdapter(subHarianAdapter);
        holder.rvSubHarian.setRecycledViewPool(viewPool);
    }

    @Override
    public int getItemCount() {
        return harianList.size();
    }

    class HarianViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private TextView tvTanggal, tvPemasukan, tvPengeluaran;
        private RecyclerView rvSubHarian;

        HarianViewHolder(View view){
            super(view);
            tvTanggal = view.findViewById(R.id.transaksiDate);
            tvPemasukan = view.findViewById(R.id.pemasukkanHarian);
            tvPengeluaran = view.findViewById(R.id.pengeluaranHarian);
            rvSubHarian = view.findViewById(R.id.childRecyclerview);
            view.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            listener.onClick(view, getAdapterPosition());
        }
    }

    public interface RecyclerViewClickListener{
        void onClick(View view, int position);
    }
}
