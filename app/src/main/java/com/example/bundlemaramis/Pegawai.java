package com.example.bundlemaramis;

import java.io.Serializable;

public class Pegawai implements Serializable {
    private String nama;
    private String alamat;
    private String pekerjaan;
    private String nohp;
    private String lamakerja;
    private String asalsekolah;
    private String kompetensi;

    public Pegawai(String nama, String alamat,String pekerjaan,String nohp,String lamakerja,String asalsekolah,String kompetensi){
        this.nama=nama;
        this.alamat=alamat;
        this.pekerjaan=pekerjaan;
        this.nohp=nohp;
        this.lamakerja=lamakerja;
        this.asalsekolah=asalsekolah;
        this.kompetensi=kompetensi;
    }
    public String getNama(){

        return nama;
    }
    public void setNama(String nama){

        this.nama=nama;
    }
    public String getAlamat(){

        return alamat;
    }
    public void setAlamat(String alamat){

        this.alamat=alamat;
    }
    public String getPekerjaan(){

        return pekerjaan;
    }
    public void setPekerjaan(String pekerjaan){

        this.pekerjaan=pekerjaan;
    }
    public String getNohp(){

        return nohp;
    }
    public void setNohp(String nohp){

        this.nohp=nohp;
    }
    public  String getAsalsekolah(){

        return asalsekolah;
    }
    public void setAsalsekolah(String asalsekolah){

        this.asalsekolah=asalsekolah;
    }
    public  String getLamakerja(){

        return lamakerja;
    }
    public void setLamakerja(String lamakerja){
        this.lamakerja=lamakerja;
    }
    public String getKompetensi(){

        return kompetensi;
    }
    public void setKompetensi(){

        this.kompetensi=kompetensi;
    }
}


