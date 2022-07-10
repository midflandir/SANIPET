package Menu;
import java.util.Scanner;
public class Menu {

private static Scanner in = new Scanner(System.in);
    public static void mainmenu(){
        Integer opcion;

        System.out.println(" ___________..........___________" +
                "\n" + "Sanipet - Veterinary care center" +
                "\n" + "1. Register patient " +
                "\n" + "2. Appoinments" +
                "\n" + "3. Billing" +
                "\n" + "4. Medicine Stock" +
                "\n" + "5. Exit" +
                "");
        opcion = Integer.parseInt(in.nextLine());

        options(opcion);
    }

    public static void options(Integer Option){

        switch (Option) {
            case 1:
                Registerpatient.register();
                break;
            case 2:
                break;

        }

    }






}
