package Appointments;
import java.time.LocalDateTime;
public class Appointment {

    protected String clinicNumber;
    protected ApointmentStatus Status;
    protected LocalDateTime date;


    public Appointment(String clinicNumber, String status, LocalDateTime date) {
        this.clinicNumber = clinicNumber;
        Status = ApointmentStatus.NOT_STARTED;
        this.date = date;
    }
}
