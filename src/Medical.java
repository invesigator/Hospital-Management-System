import javax.swing.*;

public class Medical {
    private String name;
    private String manufacturer;
    private String expiryDate;
    private int cost;
    private int count;
    
    // Constructor
    public Medical(String name, String manufacturer, String expiryDate, int cost, int count) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.expiryDate = expiryDate;
        this.cost = cost;
        this.count = count;
    }
    
    // Default constructor
    public Medical() {}
    
    // Method to create new medical through GUI input
    public boolean newMedical() {
        try {
            this.name = JOptionPane.showInputDialog("Enter Medicine Name:");
            if (name == null || name.trim().isEmpty()) return false;
            
            this.manufacturer = JOptionPane.showInputDialog("Enter Manufacturer:");
            if (manufacturer == null || manufacturer.trim().isEmpty()) return false;
            
            this.expiryDate = JOptionPane.showInputDialog("Enter Expiry Date (DD/MM/YYYY):");
            if (expiryDate == null || expiryDate.trim().isEmpty()) return false;
            
            String costStr = JOptionPane.showInputDialog("Enter Cost:");
            if (costStr == null || costStr.trim().isEmpty()) return false;
            this.cost = Integer.parseInt(costStr);
            
            String countStr = JOptionPane.showInputDialog("Enter Number of Units:");
            if (countStr == null || countStr.trim().isEmpty()) return false;
            this.count = Integer.parseInt(countStr);
            
            return true;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid number format!");
            return false;
        }
    }
    
    // Method to show medical information
    public String findMedical() {
        return String.format("%-20s %-15s %-12s %-8d %-8d", name, manufacturer, expiryDate, cost, count);
    }
    
    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getManufacturer() { return manufacturer; }
    public void setManufacturer(String manufacturer) { this.manufacturer = manufacturer; }
    public String getExpiryDate() { return expiryDate; }
    public void setExpiryDate(String expiryDate) { this.expiryDate = expiryDate; }
    public int getCost() { return cost; }
    public void setCost(int cost) { this.cost = cost; }
    public int getCount() { return count; }
    public void setCount(int count) { this.count = count; }
}