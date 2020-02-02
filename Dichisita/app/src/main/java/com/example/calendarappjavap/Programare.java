package com.example.calendarappjavap;

public class Programare {
    // fields

    private String  ora,nume,numarTel,tipProgramare;
    // constructors
    public Programare() {}
    public Programare(String ora, String nume,String numarTel,String tipProgramare) {
        this.ora = ora;
        this.nume = nume;
        this.numarTel = numarTel;
        this.tipProgramare = tipProgramare;
    }
    // properties
    public void setOra(String ora) {
        this.ora = ora;
    }
    public String getOra() {
        return this.ora;
    }
    public void setNume(String nume) {
        this.nume = nume;
    }
    public String getNume() {
        return this.nume;
    }

    public String getNumarTel() {
        return numarTel;
    }

    public void setNumarTel(String numarTel) {
        this.numarTel = numarTel;
    }

    public String getTipProgramare() {
        return tipProgramare;
    }

    public void setTipProgramare(String tipProgramare) {
        this.tipProgramare = tipProgramare;
    }
}
