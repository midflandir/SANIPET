
import java.util.*;

public class Main {

   // private static List<Contacto> contactolista = new ArrayList<Contacto>();
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

/*
        Contacto c1 = new Contacto("Juan Ortiz","123","juan@gmail.com",800.0);
        Contacto c2 = new Contacto("Felipe Alvarez","234324","felipe@gmail.com",800.0);
        Contacto c3 = new Contacto("Carlos Montoya","94845","carlosm@gmail.com",500.0);
        Contacto c4 = new Contacto("Ana Zapata","456","anaz@gmail.com",500.0);

        contactolista.add(c1);
        contactolista.add(c2);
        contactolista.add(c3);
        contactolista.add(c4);*/

        Menu();
    }


    public static void Menu() {
        Integer opcion;

        System.out.println(" ___________..........___________" +
                "\n" + "Ingrese la opción" +
                "\n" + "1. Ingresar Contacto " +
                "\n" + "2. Actualizar Contacto" +
                "\n" + "3. Buscar contacto" +
                "\n" + "4. Lista Contactos" +
                "\n" + "5. Eliminar Contacto" +
                "\n" + "6. Tranferencia entre Contactos" +
                "\n" + "0. Para salir" +
                "");
        opcion = Integer.parseInt(in.nextLine());
        //opciones(opcion);

    }

/*
    public static void opciones(Integer opcion) {
        switch (opcion) {
            case 1:
                Ingresar();
                break;
            case 2:
                Actualizar();
                break;
            case 3:
                Buscar();
                break;
            case 4:
                Listar();
                break;
            case 5:
                Eliminar();
                break;
            case 6:
                Transferir();
                break;

            default:
                if (opcion != 0) {
                    System.out.println("Por favor ingrese una opcion valida");
                }
        }
        if (opcion != 0) {
            Menu();
        }
    }


    public static void Actualizar() {

        Integer contador;
        Boolean bandera;
        String correoaux;
        Contacto contaux;
        ListIterator<Contacto> itr = contactolista.listIterator();

        contador = 0;
        bandera = true;

        correoaux = IngresarCorreo();

        while (itr.hasNext() & bandera == true) {
            contaux = itr.next();
            if (contaux.Correo.equals(correoaux)) {
                modificar(contaux, contador);
                bandera = false;
            }
            contador = contador + 1;
        }
        if (bandera == true) {
            System.out.println("Error - Correo no encontrado en la agenda");
        }
    }


    public static void modificar(Contacto contaux, Integer contador) {
        ListIterator<Contacto> itr = contactolista.listIterator();
        Boolean bandera = true;
        Integer opcion, contador2 = 0;
        Double Saldoaux;
        String nombreaux, correoaux, telefonoaux;
        Contacto contaux2, contaux3;

        System.out.println(" ___________..........___________" +
                "\n" + "Se esta modificando el contacto con Correo: " + contaux.Correo +
                "\n" + "Ingrese:" +
                "\n" + "1. Modificar Nombre " +
                "\n" + "2. Modificar Teléfono" +
                "\n" + "3. Modificar Correo" +
                "\n" + "4. Modificar Saldo" +
                "\n" + "0. Para Volver al menú principal" +
                "");
        opcion = Integer.parseInt(in.nextLine());

        switch (opcion) {
            case 1:
                System.out.println("Ingrese el nuevo Nombre completo del Titular de la cuenta");
                nombreaux = in.nextLine();
                contaux2 = new Contacto(nombreaux, contaux.telefono, contaux.Correo, contaux.SaldoUSD);
                contaux = contaux2;
                contactolista.set(contador, contaux2);
                break;
            case 2:
                System.out.println("Ingrese el nuevo Teléfono del Titular de la cuenta");
                telefonoaux = in.nextLine();

                while (itr.hasNext() & bandera == true) {
                    contaux3 = itr.next();
                    if (contaux3.telefono.equals(telefonoaux) && contador != contador2) {
                        bandera = false;
                    }
                    contador2 = contador2 + 1;
                }
                if (bandera){
                    contaux2 = new Contacto(contaux.nombre, telefonoaux, contaux.Correo, contaux.SaldoUSD);
                    contaux = contaux2;
                    contactolista.set(contador, contaux2);
                }else{
                    System.out.println("Error - El teléfono ya esta registrado por otro usuario");
                }
                break;

            case 3:
                System.out.println("Ingrese el nuevo Correo del Titular de la cuenta");
                correoaux = in.nextLine();

                while (itr.hasNext() & bandera == true) {
                    contaux3 = itr.next();
                    if (contaux3.Correo.equals(correoaux) && contador != contador2) {
                        bandera = false;
                    }
                    contador2 = contador2 + 1;
                }
                if (bandera){
                    contaux2 = new Contacto(contaux.nombre, contaux.telefono, correoaux, contaux.SaldoUSD);
                    contaux = contaux2;
                    contactolista.set(contador, contaux2);
                }else{
                    System.out.println("Error - El correo ya esta registrado por otro usuario");
                }
                break;

            case 4:
                System.out.println("Ingrese el nuevo Saldo en dólares");
                Saldoaux = Double.parseDouble(in.nextLine());
                if (Saldoaux >= 0) {
                    contaux2 = new Contacto(contaux.nombre, contaux.telefono, contaux.Correo, Saldoaux);
                    contaux = contaux2;
                    contactolista.set(contador, contaux2);
                } else {
                    System.out.println("Error - El saldo no puede ser negativo");
                }
                break;

            default:
                if (opcion != 0) {
                    System.out.println("Por favor ingrese una opcion valida");
                }
        }
        if (opcion != 0) {
            modificar(contaux, contador);
        }
    }


    public static void Listar() {

        System.out.println("Nombre:   ---  Telefono:  ---  Correo:  ---  Saldo: ");

        for (Contacto aux : contactolista) {
            System.out.println(" " + aux.nombre + "   ---   " + aux.telefono + "  ---  " + aux.Correo + "   ---    $" + aux.SaldoUSD);
        }
    }


    public static void Transferir() {
        // Sen
        Integer contadorDes = 0, contadorOri = 0;
        Boolean bandera;
        String correoaux;
        Contacto contauxOri, contauxDes;
        Double Saldoaux;
        ListIterator<Contacto> itrOri = contactolista.listIterator();
        ListIterator<Contacto> itrDes = contactolista.listIterator();

        bandera = true;

        System.out.println("Ingrese el Correo del Titular de la cuenta Origen");
        correoaux = in.nextLine();

        while (itrOri.hasNext() & bandera == true) {

            contauxOri = itrOri.next();

            if (contauxOri.Correo.equals(correoaux)) {

                System.out.println("Ingrese el Saldo en dolares a tranferir");
                Saldoaux = Double.parseDouble(in.nextLine());

                if (Saldoaux >= 0 & (contauxOri.SaldoUSD - Saldoaux) >= 0) {

                    System.out.println("Ingrese el Correo del Titular de la cuenta Destino");
                    correoaux = in.nextLine();

                    while (itrDes.hasNext() & bandera == true) {

                        contauxDes = itrDes.next();

                        if (contauxDes.Correo.equals(correoaux)) {

                            contauxDes = new Contacto(contauxDes.nombre, contauxDes.telefono, contauxDes.Correo,
                                    contauxDes.SaldoUSD + Saldoaux);
                            contactolista.set(contadorDes, contauxDes);
                            contauxOri = new Contacto(contauxOri.nombre, contauxOri.telefono, contauxOri.Correo,
                                    contauxOri.SaldoUSD - Saldoaux);
                            contactolista.set(contadorOri, contauxOri);
                            bandera = false;
                            System.out.println("Transferencia Exitosa!");
                        }

                        contadorDes = contadorDes + 1;
                    }
                } else {

                    System.out.println("Error - Número negativo o saldo infusiciente");
                    bandera = false;
                }
            }
            contadorOri = contadorOri + 1;
        }
        if (bandera == true) {
            System.out.println("Error - Correo no encontrado en la agenda");
        }
    }


    public static void Ingresar() {

        ListIterator<Contacto> itr = contactolista.listIterator();
        Integer opcion;
        Double Saldoaux;
        Boolean bandera;
        String nombreaux, telefonoaux, correoaux;
        Contacto contaux;

        bandera = true;

        System.out.println("Ingrese el Telefono del Titular de la cuenta");
        telefonoaux = in.nextLine();
        correoaux = IngresarCorreo();

        while (itr.hasNext() & bandera == true) {
            contaux = itr.next();
            if (contaux.Correo.equals(correoaux) || contaux.telefono.equals(telefonoaux)) {
                bandera = false;
            }
        }
        if (bandera == true) {

            System.out.println("Ingrese el Nombre completo del Titular de la cuenta");
            nombreaux = in.nextLine();
            System.out.println("Desea agregar saldo 1. Para Si, o cualquier otro número para No");
            opcion = Integer.parseInt(in.nextLine());

            if (opcion == 1) {

                System.out.println("Ingrese el Saldo en dólares");
                Saldoaux = Double.parseDouble(in.nextLine());

                if (Saldoaux >= 0) {

                    contaux = new Contacto(nombreaux, telefonoaux, correoaux, Saldoaux);
                    contactolista.add(contaux);
                    System.out.println("Contacto ingresado exitosamente");
                } else {

                    System.out.println("Error - El saldo no puede ser negativo");
                }
            } else {

                contaux = new Contacto(nombreaux, telefonoaux, correoaux, null);
                contactolista.add(contaux);
                System.out.println("Contacto ingresado exitosamente");
            }
        } else {
            System.out.println("Error - Telefono o Correo ya estan Registrados");
        }
    }


    public static void Buscar() {

        Boolean bandera;
        String correoaux;
        Contacto contaux;
        ListIterator<Contacto> itr = contactolista.listIterator();

        bandera = true;

        correoaux = IngresarCorreo();

        while (itr.hasNext() & bandera == true) {
            contaux = itr.next();
            if (contaux.Correo.equals(correoaux)) {

                System.out.println("Contacto encotrado: ");
                System.out.println("Nombre: " + contaux.nombre + " Telefono: " + contaux.telefono +
                        " Correo: " + contaux.Correo + " Saldo: $" + contaux.SaldoUSD);
                bandera = false;
            }
        }
        if (bandera == true) {
            System.out.println("Error - Correo no encontrado en la agenda");
        }
    }


    public static void Eliminar() {
        Boolean bandera;
        String correoaux;
        Contacto contaux;
        ListIterator<Contacto> itr = contactolista.listIterator();

        bandera = true;
        correoaux = IngresarCorreo();

        while (itr.hasNext() & bandera == true) {
            contaux = itr.next();
            if (contaux.Correo.equals(correoaux)) {
                itr.remove();
                System.out.println("El contacto: " + contaux.nombre + ". Ha sido eliminado.");
                bandera = false;
            }
        }
        if (bandera == true) {
            System.out.println("Error - Correo no encontrado en la agenda");
        }
    }


    public static String IngresarCorreo(){
        System.out.println("Ingrese el Correo del Titular de la cuenta");
        return in.nextLine();
    }

    */
}