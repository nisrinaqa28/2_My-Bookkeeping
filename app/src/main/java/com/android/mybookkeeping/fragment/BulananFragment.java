package com.android.mybookkeeping.fragment;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.mybookkeeping.recyclerview.Bulanan;
import com.android.mybookkeeping.recyclerview.BulananAdapter;
import com.android.mybookkeeping.R;
import com.android.mybookkeeping.TambahTransaksi;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class BulananFragment extends Fragment {

    private FloatingActionButton floatingActionButton;
    private RecyclerView recyclerView;
    private BulananAdapter bulananAdapter;
    private ArrayList<Bulanan> bulananArrayList;

    public BulananFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_bulanan, container, false);
        floatingActionButton = view.findViewById(R.id.pencatatanButton);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTambahTransaksi();
            }
        });

        getData();

        recyclerView = view.findViewById(R.id.recycleview);
        bulananAdapter = new BulananAdapter(bulananArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(bulananAdapter);

        return view;
    }

    public void openTambahTransaksi(){
        Intent intent = new Intent(BulananFragment.this.getActivity(), TambahTransaksi.class);
        startActivity(intent);
    }

    public void getData(){
        bulananArrayList = new ArrayList<>();
        bulananArrayList.add(new Bulanan("April","Rp 5.000.000","Rp 1.200.000"));
        bulananArrayList.add(new Bulanan("Maret","Rp 0","Rp 0"));
        bulananArrayList.add(new Bulanan("Februari","Rp 0","Rp 0"));
        bulananArrayList.add(new Bulanan("Januari","Rp 0","Rp 0"));

    }
}