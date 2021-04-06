package com.android.mybookkeeping.recyclerview;

public class Harian {
    private String kategori;
    private String keterangan;
    private String jumlah;

    public Harian(String kategori, String keterangan, String jumlah) {
        this.kategori = kategori;
        this.keterangan = keterangan;
        this.jumlah = jumlah;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public String getJumlah() {
        return jumlah;
    }

    public void setJumlah(String jumlah) {
        this.jumlah = jumlah;
    }
}
