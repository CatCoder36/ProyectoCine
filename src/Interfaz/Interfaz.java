package Interfaz;
import Cine.Administrador;
import Cine.Cine;
import Persona.AreaTrabajo;
import Util.Util;
import Cine.RegistradorUI;

public class Interfaz {
    static Cine cine = new Cine("Mi cinema Family");
    static Administrador administrador = new Administrador();


    public static void main(String[]args){
        login();
    }

    public static void login(){

        System.out.println("BIENVENIDO:");
        System.out.println("1.- ENTRAR MODO EN MODO EMPLEADO");
        System.out.println("2.- ENTRAR EN MODO ADMINISTRADOR");
        System.out.print("ENTRADA: ");

        int opcionDeInicio = Util.scanner.nextInt();

        switch (opcionDeInicio){
            case 1:
                //InterfazEmpleado
                        //.main();
                break;
            case 2:
                InterfazAdmin.cargandoAdmnistrador(cine);
                //cargandoAdmnistrador();
                break;
            default:
                System.out.println("OPCION NO VALIDA...VOLVIENDO A INICIO");
                login();
        }

    }






}
