package Appointments;

import java.time.LocalDateTime;

public class Surgery extends Appointment{
    public Surgery(String clinicNumber, String status, LocalDateTime date) {
        super(clinicNumber, status, date);
    }
}
