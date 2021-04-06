package com.android.mybookkeeping.recyclerview;

public class Tahunan {
    private String tahun;
    private String jumlahPemasukan;
    private String jumlahPengeluaran;

    public Tahunan(String tahun, String jumlahPemasukan, String jumlahPengeluaran) {
        this.tahun = tahun;
        this.jumlahPemasukan = jumlahPemasukan;
        this.jumlahPengeluaran = jumlahPengeluaran;
    }

    public String getTahun() {
        return tahun;
    }

    public void setTahun(String tahun) {
        this.tahun = tahun;
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
