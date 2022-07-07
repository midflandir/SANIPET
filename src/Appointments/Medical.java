package Appointments;

import java.time.LocalDateTime;

public class Medical extends Appointment {
    public Medical(String clinicNumber, String status, LocalDateTime date) {
        super(clinicNumber, status, date);
    }
}
