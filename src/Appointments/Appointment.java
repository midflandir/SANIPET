package Appointments;
import java.time.LocalDateTime;
public class Appointment {

    private String clinicNumber;
    private Type type;
    private AppointmentStatus Status;
    private LocalDateTime date;

    public Appointment(String clinicNumber, Type type, AppointmentStatus status, LocalDateTime date) {
        this.clinicNumber = clinicNumber;
        this.type = type;
        Status = AppointmentStatus.NOT_STARTED;
        this.date = date;
    }

    public Appointment() {

    }

    public String getClinicNumber() {
        return clinicNumber;
    }

    public void setClinicNumber(String clinicNumber) {
        this.clinicNumber = clinicNumber;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public AppointmentStatus getStatus() {
        return Status;
    }

    public void setStatus(AppointmentStatus status) {
        Status = status;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
}
