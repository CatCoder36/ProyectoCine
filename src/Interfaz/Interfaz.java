package Interfaz;

import Cine.Administrador;
import Cine.Cine;

public class Interfaz {
    static Administrador administrador = new Administrador();
    static Cine cine = new Cine("POO1");
    public static void main(String[] args) {
        administrador.cambiarNombreCine(cine);
    }

}