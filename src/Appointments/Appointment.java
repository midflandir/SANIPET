package Appointments;
import java.time.LocalDateTime;
public class Appointment {

    protected String clinicNumber;
    protected String Status;
    protected LocalDateTime date;

    public Appointment(String clinicNumber, String status, LocalDateTime date) {
        this.clinicNumber = clinicNumber;
        Status = "Not started";
        this.date = date;
    }
}
