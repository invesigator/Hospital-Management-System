import javax.swing.*;

public class Doctor {
    private String id;
    private String name;
    private String specialist;
    private String workTime;
    private String qualification;
    private int room;
    
    // Constructor
    public Doctor(String id, String name, String specialist, String workTime, String qualification, int room) {
        this.id = id;
        this.name = name;
        this.specialist = specialist;
        this.workTime = workTime;
        this.qualification = qualification;
        this.room = room;
    }
    
    // Default constructor
    public Doctor() {}
    
    // Method to create new doctor through GUI input
    public boolean newDoctor() {
        try {
            this.id = JOptionPane.showInputDialog("Enter Doctor ID:");
            if (id == null || id.trim().isEmpty()) return false;
            
            this.name = JOptionPane.showInputDialog("Enter Doctor Name:");
            if (name == null || name.trim().isEmpty()) return false;
            
            this.specialist = JOptionPane.showInputDialog("Enter Doctor Specialization:");
            if (specialist == null || specialist.trim().isEmpty()) return false;
            
            this.workTime = JOptionPane.showInputDialog("Enter Work Time (e.g., 8-11AM):");
            if (workTime == null || workTime.trim().isEmpty()) return false;
            
            this.qualification = JOptionPane.showInputDialog("Enter Qualification:");
            if (qualification == null || qualification.trim().isEmpty()) return false;
            
            String roomStr = JOptionPane.showInputDialog("Enter Room Number:");
            if (roomStr == null || roomStr.trim().isEmpty()) return false;
            this.room = Integer.parseInt(roomStr);
            
            return true;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid room number format!");
            return false;
        }
    }
    
    // Method to show doctor information
    public String showDoctorInfo() {
        return String.format("%-10s %-20s %-15s %-10s %-15s %-8d", id, name, specialist, workTime, qualification, room);
    }
    
    // Getters and Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getSpecialist() { return specialist; }
    public void setSpecialist(String specialist) { this.specialist = specialist; }
    public String getWorkTime() { return workTime; }
    public void setWorkTime(String workTime) { this.workTime = workTime; }
    public String getQualification() { return qualification; }
    public void setQualification(String qualification) { this.qualification = qualification; }
    public int getRoom() { return room; }
    public void setRoom(int room) { this.room = room; }
}