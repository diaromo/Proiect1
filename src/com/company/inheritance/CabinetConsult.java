package com.company.inheritance;

public class CabinetConsult extends Vet{
    public String getConsultType2() {
        return consultType2;
    }

    public void setConsultType2(String consultType2) {
        this.consultType2 = consultType2;
    }

    private String consultType2 = "Check ears";
    void beScared() {System.out.println("This is scary!");}
}
