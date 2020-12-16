package com.company.encapsulation;

public class Vet {

    private String name;
    private String location;
    private String specialisation;
    private String schedule;
    private int experience;
    private String prizes;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSpecialisation() {
        return specialisation;
    }

    public void setSpecialisation(String specialisation) {
        this.specialisation = specialisation;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getPrizes() {
        return prizes;
    }

    public void setPrizes(String prizes) {
        this.prizes = prizes;
    }

    void trim() {
        System.out.println("Cut hair " + "Trim nails");
    }

    void regularCheckup() {
        System.out.println("Checkup");
    }

    void desinfestation() {
        System.out.println("Take pill");
    }


}
