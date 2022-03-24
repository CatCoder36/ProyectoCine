package Interfaz;
import Cine.Administrador;
import Cine.Cine;
import Util.Util;

public class InterfazAdmin {

    static Administrador administrador = new Administrador();

    public static void cargandoAdmnistrador(Cine cine){
        System.out.print("USUARIO: ");
        String usuario = Util.scanner.next();
        System.out.print("CONTRASEÑA: ");
        String contraseña = Util.scanner.next();

        if (usuario.equals(administrador.getNombreUsuario())&&contraseña.equals(administrador.getContraseña())){
            loginAdministrador(cine);
        }

        else{
            System.out.println("VALORES INCORRECTOS....VOLVIENDO A INICIO");
            Interfaz.login();
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
        System.out.println("8.-ESTABLECER PRECIOS DE PELICULAS 2D Y 3D");
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
                Interfaz.login();
                break;
            case 8:
                administrador.definirPrecioPeliculas2d3d(cine);
                loginAdministrador(cine);
                break;
            case 0:
                Interfaz.login();
                break;
            default:
                System.out.println("VALOR INVALIDO");
                loginAdministrador(cine);
                break;
        }
    }
}
