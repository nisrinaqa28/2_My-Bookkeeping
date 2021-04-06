package com.android.mybookkeeping;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.android.mybookkeeping.fragment.PemasukanFragment;
import com.android.mybookkeeping.fragment.PengeluaranFragment;

public class TambahTransaksi extends AppCompatActivity {

    private Button pemasukanButton, pengeluaranButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tambah_transaksi);

        pemasukanButton = findViewById(R.id.pemasukanButton);
        pengeluaranButton = findViewById(R.id.pengeluaranButton);

        pemasukanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.container, new PemasukanFragment());
                fragmentTransaction.commit();
            }
        });

        pengeluaranButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.container, new PengeluaranFragment());
                fragmentTransaction.commit();
            }
        });
    }
}