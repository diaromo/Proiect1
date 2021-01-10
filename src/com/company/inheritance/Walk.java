package com.company.inheritance;

public class Walk extends Activity{
    public String getWalkType (){
        return walkType;
    }
    public void setWalkType(String walkType){
        this.walkType = walkType;
    }
    private String walkType = "Outdoor";
    void escapeFromLeash() {System.out.println("Freedom!");}
}
