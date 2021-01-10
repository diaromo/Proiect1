package com.company.inheritance;

public class Sleep extends Activity{
    public String getSleepType (){
        return sleepType;
    }
    public void setSleepType(String sleepType){
        this.sleepType = sleepType;
    }
    private String sleepType = "On the back";
    void getUp() {System.out.println("Sleepy!");}
}
