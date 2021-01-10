package com.company.inheritance;

public class Activity {

    private String duration;
    private int durationMinutes;
    private String location;

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    public void setDurationMinutes(int durationMinutes) {
        this.durationMinutes = durationMinutes;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    void happy() {System.out.println("Having fun");}

    void running() {System.out.println("Can't catch me");}

}
