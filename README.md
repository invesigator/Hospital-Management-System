# Hospital Management System (HMS)

A comprehensive Java-based Hospital Management System with modern GUI interface built using Swing. This system manages various hospital operations including doctors, patients, medical inventory, laboratory tests, facilities, and staff records.

## 🏥 Overview

The Hospital Management System is designed to streamline hospital operations by providing a centralized platform for managing:
- Medical professionals (Doctors)
- Patient records and admissions
- Medicine inventory
- Laboratory tests and reports
- Hospital facilities
- Staff management

The system features a modern, user-friendly GUI with gradient backgrounds, styled buttons, and intuitive navigation.

## ✨ Features

### Core Functionality
- **Dashboard**: Modern welcome interface with current date/time
- **Doctor Management**: Add, view, and manage doctor profiles with specializations
- **Patient Management**: Track patient records, diseases, and admission status
- **Medical Inventory**: Monitor medicine stock, expiry dates, and costs
- **Laboratory Management**: Manage lab tests and associated costs
- **Facility Management**: Track hospital infrastructure and facilities
- **Staff Management**: Employee records with designation and salary information

### GUI Features
- Modern gradient-based UI design
- Responsive table displays with styled headers
- Interactive buttons with hover effects
- Professional dialog boxes
- Confirmation dialogs for critical actions
- Real-time date and time display

### Data Management
- Dynamic ArrayList-based data storage
- Input validation and error handling
- Formatted data display in tables
- Add new records through intuitive forms

## 🛠 Technologies Used

- **Java SE**: Core programming language
- **Swing**: GUI framework
- **AWT**: Additional UI components
- **ArrayList**: Dynamic data storage
- **JTable**: Data display in tabular format
- **Custom Graphics**: Gradient backgrounds and styling

## 💻 System Requirements

- Java Development Kit (JDK) 8 or higher
- Eclipse IDE (recommended) or any Java IDE
- Minimum 512MB RAM
- Windows/macOS/Linux operating system

## 🚀 Installation & Setup

1. **Clone the Repository**
   ```bash
   git clone https://github.com/yourusername/hospital-management-system.git
   cd hospital-management-system
   ```

2. **Open in IDE**
   - Open Eclipse IDE
   - Import the project: `File > Import > Existing Projects into Workspace`
   - Select the project directory

3. **Compile and Run**
   - Right-click on `HospitalManagement.java`
   - Select `Run As > Java Application`

## 📖 Usage

### Starting the Application
1. Run the `HospitalManagement.java` file
2. A welcome dialog will appear with system information
3. Click "Continue" to access the main dashboard

### Main Dashboard
The main interface provides six primary modules:
- **Doctors**: Manage medical professionals
- **Patients**: Handle patient records
- **Medical**: Monitor medicine inventory
- **Laboratory**: Manage lab tests
- **Facilities**: Track hospital infrastructure
- **Staff**: Employee management

### Adding New Records
1. Click on any module button
2. In the opened window, click "Add New"
3. Fill in the required information in the dialog boxes
4. Confirm to save the record

### Viewing Records
- Each module displays records in a formatted table
- Tables include relevant information for each category
- Scroll through records using the scroll pane

## 📁 Project Structure

```
src/
├── HospitalManagement.java    # Main application class
├── Doctor.java                # Doctor entity class
├── Patient.java               # Patient entity class
├── Medical.java               # Medicine entity class
├── Lab.java                   # Laboratory entity class
├── Facility.java              # Facility entity class
└── Staff.java                 # Staff entity class
```

## 🏗 Classes Overview

### HospitalManagement (Main Class)
- **Purpose**: Controls application flow and GUI
- **Key Features**: Main dashboard, event handling, data management
- **GUI Components**: Modern styled buttons, gradient panels, table displays

### Doctor
- **Attributes**: ID, Name, Specialization, Work Time, Qualification, Room Number
- **Methods**: `newDoctor()`, `showDoctorInfo()`

### Patient
- **Attributes**: ID, Name, Disease, Sex, Admit Status, Age
- **Methods**: `newPatient()`, `showPatientInfo()`

### Medical
- **Attributes**: Name, Manufacturer, Expiry Date, Cost, Count
- **Methods**: `newMedical()`, `findMedical()`

### Lab
- **Attributes**: Lab Test Name, Cost
- **Methods**: `newLab()`, `labList()`

### Facility
- **Attributes**: Facility Name
- **Methods**: `newFacility()`, `showFacility()`

### Staff
- **Attributes**: ID, Name, Designation, Sex, Salary
- **Methods**: `newStaff()`, `showStaffInfo()`

## 🖼 Screenshots

### Main Dashboard
![Main Dashboard](screenshots/dashboard.png)
*Modern gradient-based main interface with module buttons*

### Doctor Management
![Doctor Management](screenshots/doctors.png)
*Doctor records displayed in formatted table with add functionality*

### Patient Records
![Patient Records](screenshots/patients.png)
*Patient information management interface*

## 📄 License

This project is created for educational purposes as part of university coursework. All rights reserved.

---

**Note**: This Hospital Management System is developed as an academic project and is intended for educational purposes only. It should not be used in actual medical environments without proper testing and validation.

*Developed with ❤️ by [Group Name] for UCCD2044 Assignment*
