package com.android.mybookkeeping.fragment;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.mybookkeeping.recyclerview.Harian;
import com.android.mybookkeeping.recyclerview.HarianAdapter;
import com.android.mybookkeeping.R;
import com.android.mybookkeeping.TambahTransaksi;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class HarianFragment extends Fragment {

    private FloatingActionButton floatingActionButton;
    private RecyclerView recyclerView;
    private HarianAdapter harianAdapter;
    private ArrayList<Harian> harianArrayList;

    public HarianFragment() {
        // Required empty public constructor
    }

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

        getData();

        recyclerView = view.findViewById(R.id.recycleview);
        harianAdapter = new HarianAdapter(harianArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(harianAdapter);

        return view;
    }

    public void openTambahTransaksi(){
        Intent intent = new Intent(HarianFragment.this.getActivity(), TambahTransaksi.class);
        startActivity(intent);
    }

    public void getData(){
        harianArrayList = new ArrayList<>();
        harianArrayList.add(new Harian("Gaji","Gaji Bulan April","Rp 5.000.000"));
        harianArrayList.add(new Harian("Makanan","Beli Seblak","Rp 15.000"));
        harianArrayList.add(new Harian("Tagihan","Bayar Air dan Listrik","Rp 500.000"));
        harianArrayList.add(new Harian("Belanja","Belanja Bulanan","Rp 500.000"));
        harianArrayList.add(new Harian("Internet","Paket Internet Sebulan","Rp 200.000"));
        harianArrayList.add(new Harian("Kendaraan","Isi Bensin 2 Liter","Rp 25.000"));
        harianArrayList.add(new Harian("Minuman","Beli Boba","Rp 30.000"));
    }
}