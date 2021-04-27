package com.android.mybookkeeping.fragment;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.mybookkeeping.Detail;
import com.android.mybookkeeping.R;
import com.android.mybookkeeping.TambahTransaksi;
import com.android.mybookkeeping.recyclerview.Bulanan;
import com.android.mybookkeeping.recyclerview.Harian;
import com.android.mybookkeeping.recyclerview.HarianAdapter;
import com.android.mybookkeeping.recyclerview.SubHarian;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class HarianFragment extends Fragment {

    private FloatingActionButton floatingActionButton;
    private HarianAdapter.RecyclerViewClickListener listener;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_harian, container, false);

        floatingActionButton = view.findViewById(R.id.pencatatanButton);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTambahTransaksi();
            }
        });

        setOnClickListener();
        RecyclerView recyclerView = view.findViewById(R.id.parentRecyclerview);
        LinearLayoutManager layoutManager = new LinearLayoutManager(HarianFragment.this.getActivity());
        HarianAdapter harianAdapter =new HarianAdapter(buildHarianList(), listener);
        recyclerView.setAdapter(harianAdapter);
        recyclerView.setLayoutManager(layoutManager);

        return view;
    }

    private void setOnClickListener() {
        listener = new HarianAdapter.RecyclerViewClickListener() {
            @Override
            public void onClick(View view, int position) {
                Intent intent = new Intent(HarianFragment.this.getActivity().getApplicationContext(), Detail.class);
                intent.putExtra("tanggal", buildHarianList().get(position).getTanggal());
                intent.putExtra("pemasukan", buildHarianList().get(position).getPemasukan());
                intent.putExtra("pengeluaran", buildHarianList().get(position).getPengeluaran());
                startActivity(intent);
            }
        };
    }

    private List<Harian> buildHarianList() {
        List<Harian> harianList = new ArrayList<>();
        harianList.add(new Harian("1 Apr 21","Rp 5.000.000","Rp 500.000", buildSubHarianList1()));
        harianList.add(new Harian("2 Apr 21","Rp 0","Rp 500.000", buildSubHarianList2()));
        harianList.add(new Harian("3 Apr 21","Rp 0","Rp 200.000", buildSubHarianList3()));

        return harianList;
    }

    private List<SubHarian> buildSubHarianList1(){
        List<SubHarian> subHarianList = new ArrayList<>();
        subHarianList.add(new SubHarian("Gaji","Gaji Bulan April","Rp 5.000.000"));
        subHarianList.add(new SubHarian("Belanja","Belanja Bulanan","Rp 300.000"));
        subHarianList.add(new SubHarian("Pulsa","Paket Internet Sebulan","Rp 200.000"));
        return subHarianList;
    }

    private List<SubHarian> buildSubHarianList2(){
        List<SubHarian> subHarianList = new ArrayList<>();
        subHarianList.add(new SubHarian("Tagihan","Tagihan Listrik","Rp 300.000"));
        subHarianList.add(new SubHarian("Tagihan","Tagihan Air","Rp 200.000"));
        return subHarianList;
    }

    private List<SubHarian> buildSubHarianList3(){
        List<SubHarian> subHarianList = new ArrayList<>();
        subHarianList.add(new SubHarian("Cemilan","Beli Seblak","Rp 20.000"));
        subHarianList.add(new SubHarian("Hiburan","Nonton Bioskop ","Rp 50.000"));
        subHarianList.add(new SubHarian("Kecantikan","Potong Rambut","Rp 30.000"));
        subHarianList.add(new SubHarian("Mobil","Isi Bensin","Rp 100.000"));
        return subHarianList;
    }

    public void openTambahTransaksi(){
        Intent intent = new Intent(HarianFragment.this.getActivity(), TambahTransaksi.class);
        startActivity(intent);
    }
}