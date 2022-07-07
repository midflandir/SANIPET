package Appointments;
import java.time.LocalDateTime;
public class Appointment {

    protected String clinicNumber;
    protected Type type;
    protected ApointmentStatus Status;
    protected LocalDateTime date;

    public Appointment(String clinicNumber, Type type, ApointmentStatus status, LocalDateTime date) {
        this.clinicNumber = clinicNumber;
        this.type = type;
        Status = ApointmentStatus.NOT_STARTED;
        this.date = date;
    }
}
