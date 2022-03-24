package Cine;

import java.sql.SQLOutput;

public class RegistradorUI {

    public static void escojerPeliculasCartelera(Cine cine){
        System.out.println("SELECCIONE LA PELICULA QUE DESEA VER: ");
        cine.cartelera.mostrarPeliculas();
        System.out.println("INTRODUZCA EL NOMBRE DE LA PELICULA");
    }

}
