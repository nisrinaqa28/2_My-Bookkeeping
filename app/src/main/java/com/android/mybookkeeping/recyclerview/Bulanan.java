package com.android.mybookkeeping.recyclerview;

public class Bulanan {
    private String bulan;
    private String jumlahPemasukan;
    private String jumlahPengeluaran;

    public Bulanan(String bulan, String jumlahPemasukan, String jumlahPengeluaran) {
        this.bulan = bulan;
        this.jumlahPemasukan = jumlahPemasukan;
        this.jumlahPengeluaran = jumlahPengeluaran;
    }

    public String getBulan() {
        return bulan;
    }

    public void setBulan(String bulan) {
        this.bulan = bulan;
    }

    public String getJumlahPemasukan() {
        return jumlahPemasukan;
    }

    public void setJumlahPemasukan(String jumlahPemasukan) {
        this.jumlahPemasukan = jumlahPemasukan;
    }

    public String getJumlahPengeluaran() {
        return jumlahPengeluaran;
    }

    public void setJumlahPengeluaran(String jumlahPengeluaran) {
        this.jumlahPengeluaran = jumlahPengeluaran;
    }
}
