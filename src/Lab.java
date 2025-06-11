import javax.swing.*;

public class Lab {
    private String lab;
    private int cost;
    
    // Constructor
    public Lab(String lab, int cost) {
        this.lab = lab;
        this.cost = cost;
    }
    
    // Default constructor
    public Lab() {}
    
    // Method to create new lab through GUI input
    public boolean newLab() {
        try {
            this.lab = JOptionPane.showInputDialog("Enter Lab Test Name:");
            if (lab == null || lab.trim().isEmpty()) return false;
            
            String costStr = JOptionPane.showInputDialog("Enter Lab Test Cost:");
            if (costStr == null || costStr.trim().isEmpty()) return false;
            this.cost = Integer.parseInt(costStr);
            
            return true;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid cost format!");
            return false;
        }
    }
    
    // Method to show lab information
    public String labList() {
        return String.format("%-30s %-10d", lab, cost);
    }
    
    // Getters and Setters
    public String getLab() { return lab; }
    public void setLab(String lab) { this.lab = lab; }
    public int getCost() { return cost; }
    public void setCost(int cost) { this.cost = cost; }
}
