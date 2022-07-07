package Appointments;

import java.time.LocalDateTime;

public class Aesthetic  extends Appointment{
    public Aesthetic(String clinicNumber, String status, LocalDateTime date) {
        super(clinicNumber, status, date);
    }
}
