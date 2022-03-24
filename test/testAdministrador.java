import Cine.Administrador;
import Cine.Cine;
import org.junit.Test;
//import org.testng.annotations.Test;

public class testAdministrador {

    @Test

    public static void main(String[] args) {

        Cine miCine = new Cine("Pepito");

        Administrador administrador = new Administrador();

        administrador.agregarSala(miCine);

        System.out.println(miCine.getListaSalas());

        administrador.agregarSala(miCine);

        System.out.println(miCine.getListaSalas());

        System.out.println(miCine.getNombreCine());

        administrador.cambiarNombreCine(miCine);

        System.out.println(miCine.getNombreCine());

        administrador.quitarSala(miCine);

        System.out.println(miCine.getListaSalas());


    }
}
