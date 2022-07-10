package Menu;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import Patient.Cat;
import Patient.Dog;
import Patient.Patient;
import Patient.Owner;
public class Registerpatient {

    private static Scanner in = new Scanner(System.in);
    private static List<Cat> cats = new ArrayList<Cat>();
    private static List<Dog> dogs = new ArrayList<Dog>();
    private static List<Owner> woners = new ArrayList<Owner>();
    public static void register() {
        int aux;

        try {
            System.out.println("press 1 to cat or 2 for dog");
            aux = Integer.parseInt(in.nextLine());
            if (aux == 1) {
                registercats();
            }
            if (aux == 2) {
                registerdogs();
            }
            if (aux != 1 || aux != 2) {
                System.out.println("invalid option");
            }
        } catch (Exception e) {
            System.out.println("invalid option");
        }

    }

    public static void registercats() {
        String aux;
        int auxb;
        Cat catpatient = new Cat();

        System.out.println("Please enter the cat's Clinic number");
        aux = in.nextLine();
        catpatient.setClinicNumber(aux);

        System.out.println("Please enter the cat's name");
        aux = in.nextLine();
        catpatient.setName(aux);

        System.out.println("Please enter the cat's breed");
        aux = in.nextLine();
        catpatient.setBreed(aux);

        try {
            System.out.println("Is the cat Vaccinated 1. Yes 2. No");
            auxb = Integer.parseInt(in.nextLine());
            if (auxb == 1) {
                catpatient.setVaccinated(true);
            }
            if (auxb == 2) {
                catpatient.setVaccinated(false);
            }
            if (auxb != 1 || auxb != 2) {
                System.out.println("invalid option");
            }
        } catch (Exception e) {
            System.out.println("invalid option");
        }

        System.out.println("Please Enter desparasitationDate");
        aux = in.nextLine();
        catpatient.setDesparasitationDate(aux);


        catpatient.setOwners(registerwoner());

        cats.add(catpatient);
    }

    public static void registerdogs() {
        Dog dogpatient;
    }


    public static Owner registerwoner() {
        Owner catowner = new Owner();
        String aux;
        Cat catpatient = new Cat();
        return catowner;
    }

    public static void registernewowner() {
        Dog dogpatient;
    }


    public static void registerwoners() {
        String aux;
        Cat catpatient = new Cat();

    }

}