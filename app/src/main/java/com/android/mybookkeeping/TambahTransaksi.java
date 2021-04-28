package com.android.mybookkeeping;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import com.android.mybookkeeping.fragment.HarianFragment;
import com.android.mybookkeeping.fragment.PemasukanFragment;
import com.android.mybookkeeping.fragment.PengeluaranFragment;

public class TambahTransaksi extends AppCompatActivity {

    private Button pemasukanButton, pengeluaranButton;
    FrameLayout frameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tambah_transaksi);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        frameLayout = findViewById(R.id.container);
        pemasukanButton = findViewById(R.id.pemasukanButton);
        pengeluaranButton = findViewById(R.id.pengeluaranButton);

        replaceFragment(new PemasukanFragment());

        pemasukanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceFragment(new PemasukanFragment());
            }
        });

        pengeluaranButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceFragment(new PengeluaranFragment());
            }
        });
    }

    private void replaceFragment (Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.container, fragment);
        fragmentTransaction.commit();
    }
}