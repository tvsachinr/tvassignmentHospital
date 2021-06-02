import java.time.LocalDate;
import java.util.Date;

// Patient class creation to store all the details belonging to a patient
public class Patient {
    private String p_name;
    private Location p_location;
    private LocalDate p_visitdate;

    // Constructor to initialize variables
    Patient(String p_name,Location p_location, LocalDate p_visitdate) {
        this.p_name=p_name;
        this.p_location=p_location;
        this.p_visitdate=p_visitdate;
    }
    public String getPatientName() {
        return p_name;
    }
    public Location getPatientLocation() {
        return p_location;
    }
    public LocalDate getPatientVisitdate(){ return p_visitdate; }
}