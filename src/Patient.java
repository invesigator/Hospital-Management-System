import javax.swing.*;

public class Patient {
    private String id;
    private String name;
    private String disease;
    private String sex;
    private String admitStatus;
    private int age;
    
    // Constructor
    public Patient(String id, String name, String disease, String sex, String admitStatus, int age) {
        this.id = id;
        this.name = name;
        this.disease = disease;
        this.sex = sex;
        this.admitStatus = admitStatus;
        this.age = age;
    }
    
    // Default constructor
    public Patient() {}
    
    // Method to create new patient through GUI input
    public boolean newPatient() {
        try {
            this.id = JOptionPane.showInputDialog("Enter Patient ID:");
            if (id == null || id.trim().isEmpty()) return false;
            
            this.name = JOptionPane.showInputDialog("Enter Patient Name:");
            if (name == null || name.trim().isEmpty()) return false;
            
            this.disease = JOptionPane.showInputDialog("Enter Disease:");
            if (disease == null || disease.trim().isEmpty()) return false;
            
            this.sex = JOptionPane.showInputDialog("Enter Sex (M/F):");
            if (sex == null || sex.trim().isEmpty()) return false;
            
            this.admitStatus = JOptionPane.showInputDialog("Enter Admit Status (Admitted/Discharged):");
            if (admitStatus == null || admitStatus.trim().isEmpty()) return false;
            
            String ageStr = JOptionPane.showInputDialog("Enter Age:");
            if (ageStr == null || ageStr.trim().isEmpty()) return false;
            this.age = Integer.parseInt(ageStr);
            
            return true;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid age format!");
            return false;
        }
    }
    
    // Method to show patient information
    public String showPatientInfo() {
        return String.format("%-10s %-20s %-15s %-5s %-12s %-5d", id, name, disease, sex, admitStatus, age);
    }
    
    // Getters and Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getDisease() { return disease; }
    public void setDisease(String disease) { this.disease = disease; }
    public String getSex() { return sex; }
    public void setSex(String sex) { this.sex = sex; }
    public String getAdmitStatus() { return admitStatus; }
    public void setAdmitStatus(String admitStatus) { this.admitStatus = admitStatus; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
}