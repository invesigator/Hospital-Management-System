import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class HospitalManagement extends JFrame implements ActionListener {
    private static final long serialVersionUID = 1L;
    
    // Arrays to store objects
    private ArrayList<Doctor> doctors;
    private ArrayList<Patient> patients;
    private ArrayList<Medical> medicals;
    private ArrayList<Lab> labs;
    private ArrayList<Facility> facilities;
    private ArrayList<Staff> staffs;
    
    // GUI Components
    private JButton doctorBtn, patientBtn, medicalBtn, labBtn, facilityBtn, staffBtn, exitBtn;
    private JLabel welcomeLabel, dateLabel;
    private JPanel mainPanel;
    
    public HospitalManagement() {
        // Initialize arrays
        initializeData();
        
        // Setup GUI
        setupGUI();
        
        // Show welcome message
        showWelcomeMessage();
    }
    
    private void initializeData() {
        doctors = new ArrayList<>();
        patients = new ArrayList<>();
        medicals = new ArrayList<>();
        labs = new ArrayList<>();
        facilities = new ArrayList<>();
        staffs = new ArrayList<>();
        
        // Initialize with sample data
        
        // Doctors
        doctors.add(new Doctor("001", "Dr. John Smith", "Surgeon", "8-11AM", "MBBS,MD", 11));
        doctors.add(new Doctor("002", "Dr. Sarah Johnson", "Physician", "10-3PM", "MBBS,MS", 45));
        doctors.add(new Doctor("003", "Dr. Michael Brown", "Cardiologist", "7-11AM", "MBBS,DM", 8));
        doctors.add(new Doctor("004", "Dr. Emily Davis", "Neurologist", "2-6PM", "MBBS,DM", 22));
        doctors.add(new Doctor("005", "Dr. Robert Wilson", "Orthopedist", "9-1PM", "MBBS,MS", 33));
        
        // Patients
        patients.add(new Patient("P001", "Alice Cooper", "Hypertension", "F", "Admitted", 45));
        patients.add(new Patient("P002", "Bob Wilson", "Diabetes", "M", "Discharged", 52));
        patients.add(new Patient("P003", "Carol Davis", "Migraine", "F", "Admitted", 38));
        patients.add(new Patient("P004", "David Brown", "Fracture", "M", "Admitted", 29));
        patients.add(new Patient("P005", "Eva Green", "Asthma", "F", "Discharged", 34));
        
        // Medicals
        medicals.add(new Medical("Paracetamol", "PharmaCorp", "12/12/2025", 50, 100));
        medicals.add(new Medical("Aspirin", "MediCo", "15/08/2026", 30, 200));
        medicals.add(new Medical("Insulin", "HealthPlus", "20/06/2025", 150, 50));
        medicals.add(new Medical("Antibiotics", "BioPharm", "10/10/2025", 80, 75));
        medicals.add(new Medical("Vitamins", "WellnessCorp", "25/12/2026", 25, 300));
        
        // Labs
        labs.add(new Lab("Blood Test", 500));
        labs.add(new Lab("X-Ray", 800));
        labs.add(new Lab("MRI Scan", 2500));
        labs.add(new Lab("CT Scan", 2000));
        labs.add(new Lab("Ultrasound", 1200));
        
        // Facilities
        facilities.add(new Facility("Emergency Room"));
        facilities.add(new Facility("ICU"));
        facilities.add(new Facility("Operation Theater"));
        facilities.add(new Facility("Pharmacy"));
        facilities.add(new Facility("Laboratory"));
        
        // Staff
        staffs.add(new Staff("S001", "Jennifer Adams", "Nurse", "F", 35000));
        staffs.add(new Staff("S002", "Mark Thompson", "Technician", "M", 28000));
        staffs.add(new Staff("S003", "Lisa Parker", "Administrator", "F", 45000));
        staffs.add(new Staff("S004", "James Miller", "Security", "M", 25000));
        staffs.add(new Staff("S005", "Nancy White", "Cleaner", "F", 20000));
    }
    
    private void setupGUI() {
        setTitle("Modern Hospital Management System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 700);
        setLocationRelativeTo(null);
        setResizable(true);
        
        // Create main panel with gradient background
        mainPanel = new JPanel() {
            /**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
                
                // Create gradient background
                GradientPaint gradient = new GradientPaint(
                    0, 0, new Color(240, 242, 247),
                    0, getHeight(), new Color(220, 231, 245)
                );
                g2d.setPaint(gradient);
                g2d.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        mainPanel.setLayout(new BorderLayout());
        
        // Create modern header panel
        JPanel headerPanel = createModernHeaderPanel();
        
        // Create modern button panel
        JPanel buttonPanel = createModernButtonPanel();
        
        // Create footer panel
        JPanel footerPanel = createFooterPanel();
        
        // Add panels to main panel
        mainPanel.add(headerPanel, BorderLayout.NORTH);
        mainPanel.add(buttonPanel, BorderLayout.CENTER);
        mainPanel.add(footerPanel, BorderLayout.SOUTH);
        
        add(mainPanel);
        setVisible(true);
    }
    
    private JPanel createModernHeaderPanel() {
        JPanel headerPanel = new JPanel() {
            /**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
                
                // Create modern gradient
                GradientPaint gradient = new GradientPaint(
                    0, 0, new Color(67, 56, 202),
                    getWidth(), getHeight(), new Color(139, 92, 246)
                );
                g2d.setPaint(gradient);
                g2d.fillRect(0, 0, getWidth(), getHeight());
                
                // Add subtle pattern
                g2d.setColor(new Color(255, 255, 255, 20));
                for (int i = 0; i < getWidth(); i += 50) {
                    for (int j = 0; j < getHeight(); j += 50) {
                        g2d.fillOval(i, j, 3, 3);
                    }
                }
            }
        };
        
        headerPanel.setLayout(new BoxLayout(headerPanel, BoxLayout.Y_AXIS));
        headerPanel.setBorder(BorderFactory.createEmptyBorder(40, 40, 40, 40));
        headerPanel.setOpaque(false);
        
        // Main title with modern styling
        welcomeLabel = new JLabel("Hospital Management System");
        welcomeLabel.setFont(new Font("Segoe UI", Font.BOLD, 32));
        welcomeLabel.setForeground(Color.WHITE);
        welcomeLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        // Subtitle
        JLabel subtitleLabel = new JLabel("Modern Healthcare Administration Portal");
        subtitleLabel.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        subtitleLabel.setForeground(new Color(230, 230, 255));
        subtitleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        // Date with modern styling
        dateLabel = new JLabel(new SimpleDateFormat("EEEE, MMMM dd, yyyy - HH:mm").format(new Date()));
        dateLabel.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        dateLabel.setForeground(new Color(200, 200, 255));
        dateLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        headerPanel.add(Box.createVerticalStrut(10));
        headerPanel.add(welcomeLabel);
        headerPanel.add(Box.createVerticalStrut(8));
        headerPanel.add(subtitleLabel);
        headerPanel.add(Box.createVerticalStrut(15));
        headerPanel.add(dateLabel);
        headerPanel.add(Box.createVerticalStrut(10));
        
        return headerPanel;
    }
    
    private JPanel createModernButtonPanel() {
        JPanel containerPanel = new JPanel(new BorderLayout());
        containerPanel.setOpaque(false);
        containerPanel.setBorder(BorderFactory.createEmptyBorder(30, 50, 30, 50));
        
        // Create grid panel for buttons (2x3 layout now)
        JPanel buttonGrid = new JPanel(new GridLayout(2, 3, 25, 25));
        buttonGrid.setOpaque(false);
        
        // Create modern styled buttons
        doctorBtn = createModernButton("Doctors", "Manage medical professionals", new Color(52, 168, 83));
        patientBtn = createModernButton("Patients", "Patient records & admission", new Color(234, 67, 53));
        medicalBtn = createModernButton("Medical", "Medicine inventory", new Color(251, 188, 5));
        labBtn = createModernButton("Laboratory", "Lab tests & reports", new Color(142, 36, 170));
        facilityBtn = createModernButton("Facilities", "Hospital infrastructure", new Color(26, 115, 232));
        staffBtn = createModernButton("Staff", "Employee management", new Color(121, 85, 72));
        
        // Create special exit button
        exitBtn = createExitButton();
        
        // Add action listeners
        doctorBtn.addActionListener(this);
        patientBtn.addActionListener(this);
        medicalBtn.addActionListener(this);
        labBtn.addActionListener(this);
        facilityBtn.addActionListener(this);
        staffBtn.addActionListener(this);
        exitBtn.addActionListener(this);
        
        // Add buttons to grid
        buttonGrid.add(doctorBtn);
        buttonGrid.add(patientBtn);
        buttonGrid.add(medicalBtn);
        buttonGrid.add(labBtn);
        buttonGrid.add(facilityBtn);
        buttonGrid.add(staffBtn);
        
        // Add exit button in separate panel below
        JPanel exitPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        exitPanel.setOpaque(false);
        exitPanel.setBorder(BorderFactory.createEmptyBorder(20, 0, 0, 0));
        exitPanel.add(exitBtn);
        
        containerPanel.add(buttonGrid, BorderLayout.CENTER);
        containerPanel.add(exitPanel, BorderLayout.SOUTH);
        return containerPanel;
    }
    
    private JPanel createFooterPanel() {
        JPanel footerPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        footerPanel.setOpaque(false);
        footerPanel.setBorder(BorderFactory.createEmptyBorder(10, 0, 20, 0));
        
        JLabel footerLabel = new JLabel("© 2024 Hospital Management System | Modern Healthcare Solutions");
        footerLabel.setFont(new Font("Segoe UI", Font.PLAIN, 13)); // Increased from 12 to 13
        footerLabel.setForeground(new Color(100, 100, 120));
        
        footerPanel.add(footerLabel);
        return footerPanel;
    }
    
    private JButton createModernButton(String text, String subtitle, Color primaryColor) {
        JButton button = new JButton() {
            /**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
            protected void paintComponent(Graphics g) {
                Graphics2D g2d = (Graphics2D) g;
                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                
                // Create modern rounded rectangle
                int arc = 20;
                Color color1 = primaryColor;
                Color color2 = new Color(
                    Math.min(255, primaryColor.getRed() + 30),
                    Math.min(255, primaryColor.getGreen() + 30),
                    Math.min(255, primaryColor.getBlue() + 30)
                );
                
                // Gradient background
                GradientPaint gradient = new GradientPaint(
                    0, 0, color1,
                    0, getHeight(), color2
                );
                g2d.setPaint(gradient);
                g2d.fillRoundRect(0, 0, getWidth(), getHeight(), arc, arc);
                
                // Hover effect
                if (getModel().isRollover()) {
                    g2d.setColor(new Color(255, 255, 255, 30));
                    g2d.fillRoundRect(0, 0, getWidth(), getHeight(), arc, arc);
                }
                
                // Shadow effect
                g2d.setColor(new Color(0, 0, 0, 30));
                g2d.drawRoundRect(1, 1, getWidth()-2, getHeight()-2, arc-1, arc-1);
            }
        };
        
        // Button styling
        button.setPreferredSize(new Dimension(200, 120));
        button.setFocusPainted(false);
        button.setBorderPainted(false);
        button.setContentAreaFilled(false);
        button.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        // Create custom layout for text
        button.setLayout(new BorderLayout());
        
        // Main text
        JLabel mainLabel = new JLabel(text, JLabel.CENTER);
        mainLabel.setFont(new Font("Segoe UI", Font.BOLD, 16));
        mainLabel.setForeground(Color.WHITE);
        
        // Subtitle
        JLabel subLabel = new JLabel(subtitle, JLabel.CENTER);
        subLabel.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        subLabel.setForeground(new Color(240, 240, 240));
        
        // Add labels to button
        JPanel textPanel = new JPanel(new BorderLayout());
        textPanel.setOpaque(false);
        textPanel.setBorder(BorderFactory.createEmptyBorder(15, 10, 15, 10));
        textPanel.add(mainLabel, BorderLayout.CENTER);
        textPanel.add(subLabel, BorderLayout.SOUTH);
        
        button.add(textPanel, BorderLayout.CENTER);
        
        // Hover animation effect
        button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button.repaint();
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button.repaint();
            }
        });
        
        return button;
    }
    
    private JButton createExitButton() {
        JButton button = new JButton() {
            /**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
            protected void paintComponent(Graphics g) {
                Graphics2D g2d = (Graphics2D) g;
                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                
                int arc = 20;
                // Dark theme for exit button
                GradientPaint gradient = new GradientPaint(
                    0, 0, new Color(75, 85, 99),
                    0, getHeight(), new Color(55, 65, 81)
                );
                g2d.setPaint(gradient);
                g2d.fillRoundRect(0, 0, getWidth(), getHeight(), arc, arc);
                
                if (getModel().isRollover()) {
                    g2d.setColor(new Color(220, 53, 69, 100));
                    g2d.fillRoundRect(0, 0, getWidth(), getHeight(), arc, arc);
                }
                
                g2d.setColor(new Color(0, 0, 0, 30));
                g2d.drawRoundRect(1, 1, getWidth()-2, getHeight()-2, arc-1, arc-1);
            }
        };
        
        button.setPreferredSize(new Dimension(200, 120));
        button.setFocusPainted(false);
        button.setBorderPainted(false);
        button.setContentAreaFilled(false);
        button.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button.setLayout(new BorderLayout());
        
        JLabel mainLabel = new JLabel("Exit System", JLabel.CENTER);
        mainLabel.setFont(new Font("Segoe UI", Font.BOLD, 16));
        mainLabel.setForeground(Color.WHITE);
        
        JLabel subLabel = new JLabel("Close application", JLabel.CENTER);
        subLabel.setFont(new Font("Segoe UI", Font.PLAIN, 13)); // Increased from 11 to 13
        subLabel.setForeground(new Color(200, 200, 200));
        
        JPanel textPanel = new JPanel(new BorderLayout());
        textPanel.setOpaque(false);
        textPanel.setBorder(BorderFactory.createEmptyBorder(15, 10, 15, 10));
        textPanel.add(mainLabel, BorderLayout.CENTER);
        textPanel.add(subLabel, BorderLayout.SOUTH);
        
        button.add(textPanel, BorderLayout.CENTER);
        
        return button;
    }
    
    private void showWelcomeMessage() {
        // Create custom welcome dialog
        JDialog welcomeDialog = new JDialog(this, "Welcome to HMS", true);
        welcomeDialog.setSize(500, 350);
        welcomeDialog.setLocationRelativeTo(this);
        welcomeDialog.setLayout(new BorderLayout());
        welcomeDialog.setResizable(false);
        
        // Create gradient background panel
        JPanel backgroundPanel = new JPanel() {
            /**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
                
                GradientPaint gradient = new GradientPaint(
                    0, 0, new Color(67, 56, 202),
                    getWidth(), getHeight(), new Color(139, 92, 246)
                );
                g2d.setPaint(gradient);
                g2d.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        backgroundPanel.setLayout(new BorderLayout());
        
        // Content panel
        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));
        contentPanel.setOpaque(false);
        contentPanel.setBorder(BorderFactory.createEmptyBorder(40, 40, 30, 40));
        
        // Welcome icon and title
        JLabel iconLabel = new JLabel("HMS", JLabel.CENTER);
        iconLabel.setFont(new Font("Segoe UI", Font.BOLD, 48));
        iconLabel.setForeground(Color.WHITE);
        iconLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        JLabel titleLabel = new JLabel("Welcome to HMS", JLabel.CENTER);
        titleLabel.setFont(new Font("Segoe UI", Font.BOLD, 24));
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        JLabel subtitleLabel = new JLabel("Hospital Management System", JLabel.CENTER);
        subtitleLabel.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        subtitleLabel.setForeground(new Color(230, 230, 255));
        subtitleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        // Current date and time
        JLabel dateTimeLabel = new JLabel(
            new SimpleDateFormat("EEEE, MMMM dd, yyyy").format(new Date()) + 
            " | " + new SimpleDateFormat("HH:mm:ss").format(new Date()), 
            JLabel.CENTER
        );
        dateTimeLabel.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        dateTimeLabel.setForeground(new Color(200, 200, 255));
        dateTimeLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        // Instructions
        JLabel instructionLabel = new JLabel("Select an option from the main menu to get started", JLabel.CENTER);
        instructionLabel.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        instructionLabel.setForeground(new Color(180, 180, 220));
        instructionLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        // Add components with spacing
        contentPanel.add(iconLabel);
        contentPanel.add(Box.createVerticalStrut(15));
        contentPanel.add(titleLabel);
        contentPanel.add(Box.createVerticalStrut(8));
        contentPanel.add(subtitleLabel);
        contentPanel.add(Box.createVerticalStrut(20));
        contentPanel.add(dateTimeLabel);
        contentPanel.add(Box.createVerticalStrut(15));
        contentPanel.add(instructionLabel);
        
        // Button panel
        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.setOpaque(false);
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(20, 0, 20, 0));
        
        // Continue button
        JButton continueBtn = new JButton("Continue");
        continueBtn.setFont(new Font("Segoe UI", Font.BOLD, 15));
        continueBtn.setBackground(Color.WHITE);
        continueBtn.setForeground(new Color(67, 56, 202));
        continueBtn.setPreferredSize(new Dimension(120, 35));
        continueBtn.setFocusPainted(false);
        continueBtn.setBorder(BorderFactory.createEmptyBorder(8, 20, 8, 20));
        continueBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        continueBtn.addActionListener(e -> welcomeDialog.dispose());
        
        buttonPanel.add(continueBtn);
        
        // Add to background panel
        backgroundPanel.add(contentPanel, BorderLayout.CENTER);
        backgroundPanel.add(buttonPanel, BorderLayout.SOUTH);
        
        welcomeDialog.add(backgroundPanel);
        welcomeDialog.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == doctorBtn) {
            displayDoctors();
        } else if (e.getSource() == patientBtn) {
            displayPatients();
        } else if (e.getSource() == medicalBtn) {
            displayMedicals();
        } else if (e.getSource() == labBtn) {
            displayLabs();
        } else if (e.getSource() == facilityBtn) {
            displayFacilities();
        } else if (e.getSource() == staffBtn) {
            displayStaff();
        } else if (e.getSource() == exitBtn) {
            showModernExitDialog();
        }
    }
    
    // Helper method to create consistent table dialogs
    private JDialog createTableDialog(String title, Color headerColor) {
        JDialog dialog = new JDialog(this, title, true);
        dialog.setSize(900, 600);
        dialog.setLocationRelativeTo(this);
        dialog.setLayout(new BorderLayout());
        return dialog;
    }
    
    private JPanel createTableHeader(String title, Color backgroundColor) {
        JPanel headerPanel = new JPanel();
        headerPanel.setBackground(backgroundColor);
        headerPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        
        JLabel titleLabel = new JLabel(title);
        titleLabel.setFont(new Font("Segoe UI", Font.BOLD, 20));
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setHorizontalAlignment(JLabel.CENTER);
        
        headerPanel.add(titleLabel);
        return headerPanel;
    }
    
    private JTable createStyledTable(Object[][] data, String[] columnNames) {
        JTable table = new JTable(data, columnNames);
        table.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        table.setRowHeight(35);
        table.setGridColor(new Color(230, 230, 230));
        table.setSelectionBackground(new Color(67, 56, 202, 50));
        table.setSelectionForeground(Color.BLACK);
        
        // Style table header
        table.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 13));
        table.getTableHeader().setBackground(new Color(240, 240, 240));
        table.getTableHeader().setForeground(new Color(60, 60, 60));
        table.getTableHeader().setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(67, 56, 202)));
        
        return table;
    }
    
    private JPanel createTableFooter(JDialog dialog, java.util.function.Supplier<Boolean> addAction) {
        JPanel footerPanel = new JPanel(new FlowLayout());
        footerPanel.setBackground(Color.WHITE);
        footerPanel.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));
        
        JButton addBtn = new JButton("Add New");
        addBtn.setFont(new Font("Segoe UI", Font.BOLD, 13));
        addBtn.setBackground(new Color(52, 168, 83));
        addBtn.setForeground(Color.WHITE);
        addBtn.setFocusPainted(false);
        addBtn.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        addBtn.addActionListener(e -> {
            if (addAction.get()) { // Only close dialog if operation was successful
                dialog.dispose();
            }
            // If operation failed, dialog stays open
        });
        
        JButton closeBtn = new JButton("Close");
        closeBtn.setFont(new Font("Segoe UI", Font.BOLD, 13));
        closeBtn.setBackground(new Color(108, 117, 125));
        closeBtn.setForeground(Color.WHITE);
        closeBtn.setFocusPainted(false);
        closeBtn.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        closeBtn.addActionListener(e -> dialog.dispose());
        
        footerPanel.add(addBtn);
        footerPanel.add(Box.createHorizontalStrut(10));
        footerPanel.add(closeBtn);
        
        return footerPanel;
    }
    
    private void displayDoctors() {
        JDialog dialog = createTableDialog("Doctors Directory", new Color(52, 168, 83));
        
        // Header panel
        JPanel headerPanel = createTableHeader("Medical Professionals Directory", new Color(52, 168, 83));
        
        // Create table data
        String[] columnNames = {"ID", "Name", "Specialization", "Working Hours", "Qualifications", "Room"};
        Object[][] data = new Object[doctors.size()][6];
        
        for (int i = 0; i < doctors.size(); i++) {
            Doctor doctor = doctors.get(i);
            data[i][0] = doctor.getId();
            data[i][1] = doctor.getName();
            data[i][2] = doctor.getSpecialist();
            data[i][3] = doctor.getWorkTime();
            data[i][4] = doctor.getQualification();
            data[i][5] = doctor.getRoom();
        }
        
        JTable table = createStyledTable(data, columnNames);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        scrollPane.getViewport().setBackground(Color.WHITE);
        
        // Footer panel with Add and Close buttons - using Supplier now
        JPanel footerPanel = createTableFooter(dialog, this::addNewDoctor);
        
        dialog.add(headerPanel, BorderLayout.NORTH);
        dialog.add(scrollPane, BorderLayout.CENTER);
        dialog.add(footerPanel, BorderLayout.SOUTH);
        
        dialog.setVisible(true);
    }

    private void displayPatients() {
        JDialog dialog = createTableDialog("Patients Directory", new Color(234, 67, 53));
        
        JPanel headerPanel = createTableHeader("Patient Records & Admission", new Color(234, 67, 53));
        
        String[] columnNames = {"ID", "Name", "Disease", "Sex", "Admit Status", "Age"};
        Object[][] data = new Object[patients.size()][6];
        
        for (int i = 0; i < patients.size(); i++) {
            Patient patient = patients.get(i);
            data[i][0] = patient.getId();
            data[i][1] = patient.getName();
            data[i][2] = patient.getDisease();
            data[i][3] = patient.getSex();
            data[i][4] = patient.getAdmitStatus();
            data[i][5] = patient.getAge();
        }
        
        JTable table = createStyledTable(data, columnNames);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        scrollPane.getViewport().setBackground(Color.WHITE);
        
        JPanel footerPanel = createTableFooter(dialog, this::addNewPatient);
        
        dialog.add(headerPanel, BorderLayout.NORTH);
        dialog.add(scrollPane, BorderLayout.CENTER);
        dialog.add(footerPanel, BorderLayout.SOUTH);
        
        dialog.setVisible(true);
    }

    private void displayMedicals() {
        JDialog dialog = createTableDialog("Medicine Inventory", new Color(251, 188, 5));
        
        JPanel headerPanel = createTableHeader("Medicine Inventory Management", new Color(251, 188, 5));
        
        String[] columnNames = {"Name", "Manufacturer", "Expiry Date", "Cost", "Count"};
        Object[][] data = new Object[medicals.size()][5];
        
        for (int i = 0; i < medicals.size(); i++) {
            Medical medical = medicals.get(i);
            data[i][0] = medical.getName();
            data[i][1] = medical.getManufacturer();
            data[i][2] = medical.getExpiryDate();
            data[i][3] = "$" + medical.getCost();
            data[i][4] = medical.getCount();
        }
        
        JTable table = createStyledTable(data, columnNames);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        scrollPane.getViewport().setBackground(Color.WHITE);
        
        JPanel footerPanel = createTableFooter(dialog, this::addNewMedical);
        
        dialog.add(headerPanel, BorderLayout.NORTH);
        dialog.add(scrollPane, BorderLayout.CENTER);
        dialog.add(footerPanel, BorderLayout.SOUTH);
        
        dialog.setVisible(true);
    }

    private void displayLabs() {
        JDialog dialog = createTableDialog("Laboratory Tests", new Color(142, 36, 170));
        
        JPanel headerPanel = createTableHeader("Laboratory Tests & Reports", new Color(142, 36, 170));
        
        String[] columnNames = {"Lab Test", "Cost"};
        Object[][] data = new Object[labs.size()][2];
        
        for (int i = 0; i < labs.size(); i++) {
            Lab lab = labs.get(i);
            data[i][0] = lab.getLab();
            data[i][1] = "$" + lab.getCost();
        }
        
        JTable table = createStyledTable(data, columnNames);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        scrollPane.getViewport().setBackground(Color.WHITE);
        
        JPanel footerPanel = createTableFooter(dialog, this::addNewLab);
        
        dialog.add(headerPanel, BorderLayout.NORTH);
        dialog.add(scrollPane, BorderLayout.CENTER);
        dialog.add(footerPanel, BorderLayout.SOUTH);
        
        dialog.setVisible(true);
    }

    private void displayFacilities() {
        JDialog dialog = createTableDialog("Hospital Facilities", new Color(26, 115, 232));
        
        JPanel headerPanel = createTableHeader("Hospital Infrastructure", new Color(26, 115, 232));
        
        String[] columnNames = {"Facility"};
        Object[][] data = new Object[facilities.size()][1];
        
        for (int i = 0; i < facilities.size(); i++) {
            Facility facility = facilities.get(i);
            data[i][0] = facility.getFacility();
        }
        
        JTable table = createStyledTable(data, columnNames);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        scrollPane.getViewport().setBackground(Color.WHITE);
        
        JPanel footerPanel = createTableFooter(dialog, this::addNewFacility);
        
        dialog.add(headerPanel, BorderLayout.NORTH);
        dialog.add(scrollPane, BorderLayout.CENTER);
        dialog.add(footerPanel, BorderLayout.SOUTH);
        
        dialog.setVisible(true);
    }

    private void displayStaff() {
        JDialog dialog = createTableDialog("Staff Directory", new Color(121, 85, 72));
        
        JPanel headerPanel = createTableHeader("Employee Management", new Color(121, 85, 72));
        
        String[] columnNames = {"ID", "Name", "Designation", "Sex", "Salary"};
        Object[][] data = new Object[staffs.size()][5];
        
        for (int i = 0; i < staffs.size(); i++) {
            Staff staff = staffs.get(i);
            data[i][0] = staff.getId();
            data[i][1] = staff.getName();
            data[i][2] = staff.getDesignation();
            data[i][3] = staff.getSex();
            data[i][4] = "$" + staff.getSalary();
        }
        
        JTable table = createStyledTable(data, columnNames);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        scrollPane.getViewport().setBackground(Color.WHITE);
        
        JPanel footerPanel = createTableFooter(dialog, this::addNewStaff);
        
        dialog.add(headerPanel, BorderLayout.NORTH);
        dialog.add(scrollPane, BorderLayout.CENTER);
        dialog.add(footerPanel, BorderLayout.SOUTH);
        
        dialog.setVisible(true);
    }
    
    private boolean addNewDoctor() {
        Doctor newDoctor = new Doctor();
        if (newDoctor.newDoctor()) {
            doctors.add(newDoctor);
            JOptionPane.showMessageDialog(this, "Doctor added successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Failed to add doctor!", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    private boolean addNewPatient() {
        Patient newPatient = new Patient();
        if (newPatient.newPatient()) {
            patients.add(newPatient);
            JOptionPane.showMessageDialog(this, "Patient added successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Failed to add patient!", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    private boolean addNewMedical() {
        Medical newMedical = new Medical();
        if (newMedical.newMedical()) {
            medicals.add(newMedical);
            JOptionPane.showMessageDialog(this, "Medicine added successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Failed to add medicine!", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    private boolean addNewLab() {
        Lab newLab = new Lab();
        if (newLab.newLab()) {
            labs.add(newLab);
            JOptionPane.showMessageDialog(this, "Lab test added successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Failed to add lab test!", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    private boolean addNewFacility() {
        Facility newFacility = new Facility();
        if (newFacility.newFacility()) {
            facilities.add(newFacility);
            JOptionPane.showMessageDialog(this, "Facility added successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Failed to add facility!", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    private boolean addNewStaff() {
        Staff newStaff = new Staff();
        if (newStaff.newStaff()) {
            staffs.add(newStaff);
            JOptionPane.showMessageDialog(this, "Staff added successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Failed to add staff!", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    private void showModernExitDialog() {
        JDialog exitDialog = new JDialog(this, "Confirm Exit", true);
        exitDialog.setSize(400, 250);
        exitDialog.setLocationRelativeTo(this);
        exitDialog.setLayout(new BorderLayout());
        
        // Content panel
        JPanel contentPanel = new JPanel();
        contentPanel.setBackground(Color.WHITE);
        contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));
        contentPanel.setBorder(BorderFactory.createEmptyBorder(30, 30, 20, 30));
        
        // Icon
        JLabel iconLabel = new JLabel("!", JLabel.CENTER);
        iconLabel.setFont(new Font("Segoe UI", Font.BOLD, 32));
        iconLabel.setForeground(new Color(220, 53, 69));
        iconLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        // Title
        JLabel titleLabel = new JLabel("Exit Hospital Management System?", JLabel.CENTER);
        titleLabel.setFont(new Font("Segoe UI", Font.BOLD, 16));
        titleLabel.setForeground(new Color(60, 60, 60));
        titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        // Message
        JLabel messageLabel = new JLabel("Are you sure you want to close the application?", JLabel.CENTER);
        messageLabel.setFont(new Font("Segoe UI", Font.PLAIN, 13)); // Increased from 12 to 13
        messageLabel.setForeground(new Color(100, 100, 100));
        messageLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        contentPanel.add(iconLabel);
        contentPanel.add(Box.createVerticalStrut(15));
        contentPanel.add(titleLabel);
        contentPanel.add(Box.createVerticalStrut(10));
        contentPanel.add(messageLabel);
        
        // Button panel
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 15, 20));
        buttonPanel.setBackground(Color.WHITE);
        
        // Cancel button
        JButton cancelBtn = new JButton("Cancel");
        cancelBtn.setFont(new Font("Segoe UI", Font.BOLD, 13)); // Increased from 12 to 13
        cancelBtn.setBackground(new Color(240, 240, 240));
        cancelBtn.setForeground(new Color(60, 60, 60));
        cancelBtn.setPreferredSize(new Dimension(100, 35));
        cancelBtn.setFocusPainted(false);
        cancelBtn.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        cancelBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        cancelBtn.addActionListener(e -> exitDialog.dispose());
        
        // Exit button
        JButton exitBtn = new JButton("Exit");
        exitBtn.setFont(new Font("Segoe UI", Font.BOLD, 13)); // Increased from 12 to 13
        exitBtn.setBackground(new Color(220, 53, 69));
        exitBtn.setForeground(Color.WHITE);
        exitBtn.setPreferredSize(new Dimension(100, 35));
        exitBtn.setFocusPainted(false);
        exitBtn.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        exitBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        exitBtn.addActionListener(e -> {
            exitDialog.dispose();
            System.exit(0);
        });
        
        buttonPanel.add(cancelBtn);
        buttonPanel.add(exitBtn);
        
        exitDialog.add(contentPanel, BorderLayout.CENTER);
        exitDialog.add(buttonPanel, BorderLayout.SOUTH);
        exitDialog.setVisible(true);
    }
    
    // Main method
    public static void main(String[] args) {
        // Set system look and feel (optional - simplified version)
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            // Continue with default look and feel if Nimbus not available
            System.out.println("Using default look and feel");
        }
        
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new HospitalManagement();
            }
        });
    }
}