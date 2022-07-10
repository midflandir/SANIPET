package Appointments;
import java.time.LocalDateTime;
public class Appointment {

    protected String clinicNumber;
    protected Type type;
    protected AppointmentStatus Status;
    protected LocalDateTime date;

    public Appointment(String clinicNumber, Type type, AppointmentStatus status, LocalDateTime date) {
        this.clinicNumber = clinicNumber;
        this.type = type;
        Status = AppointmentStatus.NOT_STARTED;
        this.date = date;
    }
}
