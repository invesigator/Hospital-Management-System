import javax.swing.*;

public class Staff {
    private String id;
    private String name;
    private String designation;
    private String sex;
    private int salary;
    
    // Constructor
    public Staff(String id, String name, String designation, String sex, int salary) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.sex = sex;
        this.salary = salary;
    }
    
    // Default constructor
    public Staff() {}
    
    // Method to create new staff through GUI input
    public boolean newStaff() {
        try {
            this.id = JOptionPane.showInputDialog("Enter Staff ID:");
            if (id == null || id.trim().isEmpty()) return false;
            
            this.name = JOptionPane.showInputDialog("Enter Staff Name:");
            if (name == null || name.trim().isEmpty()) return false;
            
            this.designation = JOptionPane.showInputDialog("Enter Staff Designation:");
            if (designation == null || designation.trim().isEmpty()) return false;
            
            this.sex = JOptionPane.showInputDialog("Enter Staff Sex (M/F):");
            if (sex == null || sex.trim().isEmpty()) return false;
            
            String salaryStr = JOptionPane.showInputDialog("Enter Staff Salary:");
            if (salaryStr == null || salaryStr.trim().isEmpty()) return false;
            this.salary = Integer.parseInt(salaryStr);
            
            return true;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid salary format!");
            return false;
        }
    }
    
    // Method to show staff information
    public String showStaffInfo() {
        return String.format("%-10s %-20s %-15s %-5s %-10d", id, name, designation, sex, salary);
    }
    
    // Getters and Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getDesignation() { return designation; }
    public void setDesignation(String designation) { this.designation = designation; }
    public String getSex() { return sex; }
    public void setSex(String sex) { this.sex = sex; }
    public int getSalary() { return salary; }
    public void setSalary(int salary) { this.salary = salary; }
}