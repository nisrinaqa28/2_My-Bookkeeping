package com.android.mybookkeeping.recyclerview;

import java.util.List;

public class Harian {
    private String tanggal;
    private String pemasukan;
    private String pengeluaran;
    private List<SubHarian> subHarianList;

    public Harian(String tanggal, String pemasukan, String pengeluaran, List<SubHarian> subHarianList) {
        this.tanggal = tanggal;
        this.pemasukan = pemasukan;
        this.pengeluaran = pengeluaran;
        this.subHarianList = subHarianList;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getPemasukan() {
        return pemasukan;
    }

    public void setPemasukan(String pemasukan) {
        this.pemasukan = pemasukan;
    }

    public String getPengeluaran() {
        return pengeluaran;
    }

    public void setPengeluaran(String pengeluaran) {
        this.pengeluaran = pengeluaran;
    }

    public List<SubHarian> getSubHarianList() {
        return subHarianList;
    }

    public void setSubHarianList(List<SubHarian> subHarianList) {
        this.subHarianList = subHarianList;
    }
}
