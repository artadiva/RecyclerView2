package com.example.myapplicationa;


public class Mahasiswa {

    private String nama;
    private String nim;
    private String nohp;

    public Mahasiswa(String nama, String nim, String nohp) {
        this.nama = nama;
        this.nim = nim;
        this.nohp = nohp;

    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getnim() {
        return nim;
    }

    public void setnim(String nim) {
        this.nim = nim;
    }

    public String getNohp() {
        return nohp;
    }

    public void setNohp(String nohp) {
        this.nohp = nohp;
    }
}