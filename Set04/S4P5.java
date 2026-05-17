// Base Class
class Patient {
    private String patientId;      // Private: Only accessible within this class
    protected String disease;     // Protected: Accessible by subclasses and package
    public String name;           // Public: Accessible everywhere

    public Patient(String patientId, String name, String disease) {
        this.patientId = patientId;
        this.name = name;
        this.disease = disease;
    }

    // Public method to provide controlled access to private patientId
    public String getPatientId() {
        return patientId;
    }

    public void getDetails() {
        System.out.println("Patient Name: " + name);
        // Note: Base class can access its own private members
        System.out.println("ID: " + patientId); 
        System.out.println("Diagnosis: " + disease);
    }
}

// Subclass
class DoctorAccess extends Patient {
    
    public DoctorAccess(String patientId, String name, String disease) {
        super(patientId, name, disease);
    }

    public void checkMedicalRecords() {
        System.out.println("\n DOCTOR ASSIGINING RECORDS");
        System.out.println("Patient Name: " + name); // Public access
        
        // Direct access to protected member is allowed
        System.out.println("Diagnosis: " + disease); 
        
        // System.out.println(patientId); 
        // ^ UNCOMMENTING ABOVE WOULD CAUSE A COMPILER ERROR: patientId has private access in Patient

        // Must use public method to see the ID
        System.out.println("Accessing Private ID via Method: " + getPatientId());
    }
}

public class S4P5 {
    public static void main(String[] args) {
        // Initialize the DoctorAccess object
        DoctorAccess doc = new DoctorAccess("P-101", "John Doe", "Viral Fever");

        // Show general details
        System.out.println("Initial Patient Summary:");
        doc.getDetails();

        // Demonstrate specific subclass access
        doc.checkMedicalRecords();
    }
}