package com.android.mybookkeeping;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Detail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView txtTanggal = findViewById(R.id.tanggalDetail);
        TextView txtPemasukan = findViewById(R.id.pemasukanDetail);
        TextView txtPengeluaran = findViewById(R.id.pengeluaranDetail);

        String tanggal = "Tanggal not set";
        String pemasukan = "Pemasukan not set";
        String pengeluaran = "Pengeluaran not set";

        Bundle extras = getIntent().getExtras();
        if (extras != null){
            tanggal = extras.getString("tanggal");
            pemasukan = extras.getString("pemasukan");
            pengeluaran = extras.getString("pengeluaran");
        }

        txtTanggal.setText(tanggal);
        txtPemasukan.setText(pemasukan);
        txtPengeluaran.setText(pengeluaran);
    }
}