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
                cargandoEmpleado();
                break;
            case 2:
                cargandoAdmnistrador();
                break;
            default:
                System.out.println("OPCION NO VALIDA...VOLVIENDO A INICIO");
                login();
        }

    }

    public static void loginRegistrador(){

       RegistradorUI.escojerPeliculasCartelera();

    }

    public static void cargandoAdmnistrador(){
        System.out.print("USUARIO: ");
        String usuario = Util.scanner.next();
        System.out.print("CONTRASEÑA: ");
        String contraseña = Util.scanner.next();

        if (usuario.equals(administrador.getNombreUsuario())&&contraseña.equals(administrador.getContraseña())){
            loginAdministrador(cine);
        }

        else{
            System.out.println("VALORES INCORRECTOS....VOLVIENDO A INICIO");
            login();
        }
    }

    public static void cargandoEmpleado(){
        System.out.print("INSERTE CARNET DE IDENTIDAD: ");
        int carnetID = Util.scanner.nextInt();
        if (cine.getEmpleadoAreaTrabajoPorID(carnetID).equals(AreaTrabajo.BOLETERIA)){
            loginRegistrador();
        }
        else{
            System.out.println("EMPLEADO NO HABILITADO PARA INCIAR SESION...VOLVIENDO A INICIO");
            login();
        }

   }

    public static void loginAdministrador(Cine cine){
        System.out.println("BIENVENIDO A OPCIONES DE ADMINISTRADOR: SELECCIONES EL NÚMERO DE OPCION");
        System.out.println("1.-CAMBIAR NOMBRE DEL CINE");
        System.out.println("2.-AGREGAR SALA");
        System.out.println("3.-QUITAR SALA");
        System.out.println("4.-AGREGAR PELICULA");
        System.out.println("5.-QUITAR PELICULA");
        System.out.println("6.-CAMBIAR NOMBRE USUARIO ADMINISTRADOR");
        System.out.println("7.-CAMBIAR CONTRASÑA ADMINISTRADOR");
        System.out.println("0.-VOLER A LOGIN INICIAL");
        System.out.print("ENTRADA: ");

        int opcionAdmin = Util.scanner.nextInt();

        switch (opcionAdmin){
            case 1:
                administrador.cambiarNombreCine(cine);
                loginAdministrador(cine);
                break;
            case 2:
                administrador.agregarSala(cine);
                loginAdministrador(cine);
                break;
            case 3:
                administrador.quitarSala(cine);
                loginAdministrador(cine);
                break;
            case 4:
                administrador.agregarPelicula(cine);
                loginAdministrador(cine);
                break;
            case 5:
                administrador.quitarPelicula(cine);
                loginAdministrador(cine);
                break;
            case 6:
                administrador.cambiarNombreUsuario();
                loginAdministrador(cine);
                break;
            case 7:
                administrador.cambiarContraseña();
                login();
                break;
            case 0:
                login();
                break;
            default:
                System.out.println("VALOR INVALIDO");
                loginAdministrador(cine);
                break;
        }



    }

}
