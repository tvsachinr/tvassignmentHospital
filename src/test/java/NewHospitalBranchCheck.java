import org.testng.Assert;
import org.testng.annotations.Test;
import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

@Test
public class NewHospitalBranchCheck {

    // To get the total count of Patient visiting Chinmaya Hospital
    public void getTotalPatient_Count() {
        Patient patient1 = new Patient("Vinay", Location.Mumbai, LocalDate.of(2021, 5, 30));
        Patient patient2 = new Patient("Rawat", Location.Bangalorecity, LocalDate.of(2021, 5, 31));
        Patient patient3 = new Patient("Rana", Location.Bangalorecity, LocalDate.of(2021, 6, 1));
        Patient patient4 = new Patient("Shetty", Location.Mumbai, LocalDate.of(2021, 6, 1));
        Patient patient5 = new Patient("Pavan", Location.Mumbai, LocalDate.of(2021, 5, 31));

        Hospital hospitalChinm = new Hospital(Location.Bangalorecity);
        hospitalChinm.addpatient(patient1); // adding patient to the hospitalchinm arraylist
        hospitalChinm.addpatient(patient2);
        hospitalChinm.addpatient(patient3);
        hospitalChinm.addpatient(patient4);
        hospitalChinm.addpatient(patient5);
        System.out.println("Total Number of patient visited in Chinmaya Hospital is: " + hospitalChinm.getTotalPatient());
        Assert.assertEquals(hospitalChinm.getTotalPatient(), 5);
    }

    // Function to get percentage of local_patient(Banglore City) visiting in 3 days
    public void getLocalPatient_Percentage() {
        Patient patient1 = new Patient("Vinay", Location.Mumbai, LocalDate.of(2021, 5, 3));
        Patient patient2 = new Patient("Rawat", Location.Bangalorecity, LocalDate.of(2021, 5, 31));
        Patient patient3 = new Patient("Rana", Location.Bangalorecity, LocalDate.of(2021, 6, 1));
        Patient patient4 = new Patient("Shetty", Location.Bangalorecity, LocalDate.of(2021, 6, 2));
        Patient patient5 = new Patient("Pavan", Location.Mumbai, LocalDate.of(2021, 5, 31));

        Hospital hospitalChinm = new Hospital(Location.Bangalorecity);
        hospitalChinm.addpatient(patient1); // adding patient to the hospitalchinm datag
        hospitalChinm.addpatient(patient2); // Adding 2nd patient record
        hospitalChinm.addpatient(patient3);
        hospitalChinm.addpatient(patient4);
        hospitalChinm.addpatient(patient5);

        //Printing the percentage result
        System.out.println("Out of total " +hospitalChinm.getTotalPatient()+" ,no of Patients visited in the last 3 days, Percentage of Local patient is : "
                + hospitalChinm.patientpercentage()+" %");
    }
}