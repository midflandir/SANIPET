package Menu;

import Appointments.Appointment;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Appoinments {


    private static Scanner in = new Scanner(System.in);
    private static List<Appointment> appointmentss = new ArrayList<Appointment>();


    public static void start() {
        int aux;

        try {

            System.out.println(" ___________..........___________" +
                    "\n" + "Sanipet - Veterinary care center" +
                    "\n" + "1. Create appointment. " +
                    "\n" + "2. Update appointment." +
                    "\n" + "3. Cancel appointment." +
                    "\n" + "4. Filter by day" +
                    "\n" + "5. Exit" +
                    "");
            aux = Integer.parseInt(in.nextLine());
            options(aux);


        } catch (Exception e) {
            System.out.println("invalid option");
        }

    }


    public static void options(int option) {

        switch (option) {
            case 1:
                Createappointment();
                break;
            case 2:
                Updateppointment();
                break;
            case 3:
                Cancelappointment();
                break;
            case 4:
                FilterAppointment();
            default:
                start();
        }
    }

    public static void Createappointment() {
        String aux;
        int auxb;
        Dog dogpatient = new Dog();

        System.out.println("Please enter the dog's Clinic number");
        aux = in.nextLine();
        dogpatient.setClinicNumber(aux);

        System.out.println("Please enter the dog's name");
        aux = in.nextLine();
        dogpatient.setName(aux);

        System.out.println("Please enter the dog's breed");
        aux = in.nextLine();
        dogpatient.setBreed(aux);

        try {
            System.out.println("Is the cat Vaccinated 1. Yes 2. No");
            auxb = Integer.parseInt(in.nextLine());
            if (auxb == 1) {
                dogpatient.setVaccinated(true);
            }
            if (auxb == 2) {
                dogpatient.setVaccinated(false);
            }
            if (auxb != 1 || auxb != 2) {
                System.out.println("invalid option");
            }
        } catch (Exception e) {
            System.out.println("invalid option");
        }

        System.out.println("Please Enter desparasitation Date");
        aux = in.nextLine();
        dogpatient.setDesparasitationDate(aux);


        dogpatient.setOwners(registerwoner());

        dogs.add(dogpatient);
    }


    public static void Updateppointment() {
        Owner catowner = new Owner();
        String aux;

        System.out.println("Please enter owner DNI");
        aux = in.nextLine();
        catowner.setDNI(aux);

        System.out.println("Please enter the owner's name");
        aux = in.nextLine();
        catowner.setName(aux);

        System.out.println("Please enter the owner's cellphone");
        aux = in.nextLine();
        catowner.setCellphone(aux);

        try {
            System.out.println("Please enter the owner's age");
            aux = in.nextLine();
            catowner.setAge(Integer.parseInt(aux));
        } catch (Exception e) {
            System.out.println("Error - invalid age");
        }

        return catowner;
    }


    public static void Cancelappointment() {
        Owner catowner = new Owner();
        String aux;

        System.out.println("Please enter owner DNI");
        aux = in.nextLine();
        catowner.setDNI(aux);

        System.out.println("Please enter the owner's name");
        aux = in.nextLine();
        catowner.setName(aux);

        System.out.println("Please enter the owner's cellphone");
        aux = in.nextLine();
        catowner.setCellphone(aux);

        try {
            System.out.println("Please enter the owner's age");
            aux = in.nextLine();
            catowner.setAge(Integer.parseInt(aux));
        } catch (Exception e) {
            System.out.println("Error - invalid age");
        }

        return catowner;
    }


    public static void FilterAppointment() {
        Owner catowner = new Owner();
        String aux;

        System.out.println("Please enter owner DNI");
        aux = in.nextLine();
        catowner.setDNI(aux);

        System.out.println("Please enter the owner's name");
        aux = in.nextLine();
        catowner.setName(aux);

        System.out.println("Please enter the owner's cellphone");
        aux = in.nextLine();
        catowner.setCellphone(aux);

        try {
            System.out.println("Please enter the owner's age");
            aux = in.nextLine();
            catowner.setAge(Integer.parseInt(aux));
        } catch (Exception e) {
            System.out.println("Error - invalid age");
        }

        return catowner;
    }


}
