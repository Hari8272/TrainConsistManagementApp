import java.util.*;

/*
 * UC1: Initialize Train and Display Consist Summary
 * Single File Version
 */

// Coach class
class Coach {
    private String coachType;
    private int capacity;

    public Coach(String coachType, int capacity) {
        this.coachType = coachType;
        this.capacity = capacity;
    }

    public String getCoachType() {
        return coachType;
    }

    public int getCapacity() {
        return capacity;
    }
}

// Train class
class Train {

    private String trainName;
    private List<Coach> coaches;

    public Train(String trainName) {
        this.trainName = trainName;
        this.coaches = new ArrayList<>();
    }

    // Add coach
    public void addCoach(Coach coach) {
        coaches.add(coach);
    }

    // Display summary
    public void displaySummary() {
        System.out.println("🚆 Train Name: " + trainName);
        System.out.println("Total Coaches: " + coaches.size());

        int totalCapacity = 0;

        for (Coach c : coaches) {
            totalCapacity += c.getCapacity();
        }

        System.out.println("Total Capacity: " + totalCapacity);

        System.out.println("\nCoach Details:");
        for (Coach c : coaches) {
            System.out.println("- " + c.getCoachType() +
                    " | Capacity: " + c.getCapacity());
        }
    }
}

// Main class
public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Create Train
        Train train = new Train("Chennai Express");

        // Add Coaches
        train.addCoach(new Coach("Sleeper", 72));
        train.addCoach(new Coach("AC 3 Tier", 64));
        train.addCoach(new Coach("AC 2 Tier", 48));
        train.addCoach(new Coach("General", 90));

        // Display Summary
        train.displaySummary();
    }
}