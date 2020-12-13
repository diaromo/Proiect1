package lab2.AnimalRescue;

public class Vet {

    String name = "Morutan";
    String location = "Zorilor";
    String specialisation = "Dogs";
    String schedule = "9:00 AM to 16:00 PM";
    int experience = 20;
    String prizes = "Best Vet, Clean office";

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
