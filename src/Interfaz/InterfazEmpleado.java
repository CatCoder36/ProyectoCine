package Interfaz;
import Cine.Cine;
import Persona.AreaTrabajo;
import Persona.RegistroCliente;
import Util.Util;

public class InterfazEmpleado {

    public static void inicioVenta(Cine cine){
        escojerPeliculasCartelera(cine);
    }

    public static void cargandoEmpleado(Cine cine){


        System.out.print("INSERTE CARNET DE IDENTIDAD: ");
        int carnetID = Util.scanner.nextInt();
        if (cine.getEmpleadoAreaTrabajoPorID(carnetID).equals(AreaTrabajo.BOLETERIA)){
            inicioVenta(cine);
        }
        else{
            System.out.println("EMPLEADO NO HABILITADO PARA INCIAR SESION...VOLVIENDO A INICIO");
            Interfaz.login();
        }

    }

    static String nombrePelicula;
    public static void escojerPeliculasCartelera(Cine cine) {
        System.out.println("SELECCIONE LA PELICULA QUE DESEA VER: ");
        System.out.println(cine.cartelera.mostrarPeliculas());
        System.out.println("INTRODUZCA EL NOMBRE DE LA PELICULA");
        nombrePelicula = Util.scanner.next();
        System.out.println("USTED ESCOGIÓ LA PELICULA: ");
        System.out.println(cine.cartelera.mostrarPeliculaIDNombre(nombrePelicula));
        System.out.println("==ASIENTOS DISPONIBLES EN SALA==");
        //TODO: buscar sala





    }
    static RegistroCliente registroCliente = new RegistroCliente();
     public static void infoCliente(){
        System.out.println("INTRODUCE TU NOMBRE COMPLETO:");
        String nombreCliente = Util.scanner.next();
        System.out.println("INTRODUCE TU CARNET DE IDENTIDAD:");
        int ciCliente = Util.scanner.nextInt();
         System.out.println(registroCliente.mostrarClienteEspecifico(nombreCliente, ciCliente));
     }


     //TODO: TERMINAR OPCIONES BOLETERIA
    public static void opcionesBoleteria(){
        System.out.println("ELIGE UNA OPCION:");
        System.out.println("\t1.- Ver perfil cliente.\n\t2.- Registrarse nuevo cliente.\n\t3.- Seleccionar pelicula.\n\t4.- Ir al Candy Bar.");
        System.out.println("OPCION: ");
        int opcion = Util.scanner.nextInt();

        switch (opcion){
            case 1:
                infoCliente();
                System.out.println("VOLVER A BOLETERIA (Y/n)");
                break;
        }

        }
    }

    /*public static void main(String[] args) {
         opcionesBoleteria();
    }*/

