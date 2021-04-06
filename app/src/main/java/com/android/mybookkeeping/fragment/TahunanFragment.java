package com.android.mybookkeeping.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.mybookkeeping.R;
import com.android.mybookkeeping.TambahTransaksi;
import com.android.mybookkeeping.recyclerview.Bulanan;
import com.android.mybookkeeping.recyclerview.BulananAdapter;
import com.android.mybookkeeping.recyclerview.Tahunan;
import com.android.mybookkeeping.recyclerview.TahunanAdapter;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class TahunanFragment extends Fragment {

    private FloatingActionButton floatingActionButton;
    private RecyclerView recyclerView;
    private TahunanAdapter tahunanAdapter;
    private ArrayList<Tahunan> tahunanArrayList;

    public TahunanFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tahunan, container, false);
        floatingActionButton = view.findViewById(R.id.pencatatanButton);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTambahTransaksi();
            }
        });

        getData();

        recyclerView = view.findViewById(R.id.recycleview);
        tahunanAdapter = new TahunanAdapter(tahunanArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(tahunanAdapter);

        return view;
    }

    public void openTambahTransaksi(){
        Intent intent = new Intent(TahunanFragment.this.getActivity(), TambahTransaksi.class);
        startActivity(intent);
    }

    public void getData(){
        tahunanArrayList = new ArrayList<>();
        tahunanArrayList.add(new Tahunan("2021","Rp 5.000.000","Rp 1.270.000"));
    }
}