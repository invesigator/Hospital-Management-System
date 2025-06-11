import javax.swing.*;

public class Facility {
    private String facility;
    
    // Constructor
    public Facility(String facility) {
        this.facility = facility;
    }
    
    // Default constructor
    public Facility() {}
    
    // Method to create new facility through GUI input
    public boolean newFacility() {
        this.facility = JOptionPane.showInputDialog("Enter Facility Name:");
        return facility != null && !facility.trim().isEmpty();
    }
    
    // Method to show facility information
    public String showFacility() {
        return String.format("%-30s", facility);
    }
    
    // Getters and Setters
    public String getFacility() { return facility; }
    public void setFacility(String facility) { this.facility = facility; }
}