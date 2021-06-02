import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Hospital
{
    private Location h_location = Location.Bangalorecity;
    private List<Patient> patientrecord;

    //Constructor to initialize and create patient record object
    public Hospital(Location h_location)
    {
        this.h_location=h_location;
        patientrecord = new ArrayList();
    }

    // Function to add all the Patient record on arraylist
    public void addpatient(Patient patient){
        patientrecord.add(patient);
    }

    // Function to get the total patient count
    public long getTotalPatient(){
        return patientrecord.size();
    }

    // Function to get patient count from local City
    public long getInCitypatientCount(){
        return patientrecord.stream().filter(patient -> patient.getPatientLocation().
                equals(Location.Bangalorecity)).count();
    }

    // Function to get the patient count out of city
    public long getOutCityPatient(){
        return (patientrecord.size()-getInCitypatientCount());
    }

    //Stream function to return no of location patient visiting in last 3 days
    public long getLocalPatientin3days()
    {
       return patientrecord.stream().filter(patient -> patient.getPatientLocation().equals(Location.Bangalorecity)
               && patient.getPatientVisitdate().isBefore(LocalDate.now().plusDays(1))
               && patient.getPatientVisitdate().isAfter(LocalDate.now().minusDays(3))).count();
    }
    public long patientpercentage()
    {
        return ((getLocalPatientin3days()*100)/getTotalPatient());
    }

}