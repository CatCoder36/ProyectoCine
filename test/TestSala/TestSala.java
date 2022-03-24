package TestSala;

import Cartelera.Clasificacion;
import Cartelera.Dimension;
import Cartelera.Genero;
import Cartelera.Pelicula;
import Salas.Sala;
import org.junit.Test;
//import org.testng.annotationscd P.Test;

import static org.junit.Assert.assertEquals;
//import static org.testng.AssertJUnit.assertEquals;

public class TestSala {
    @Test

    public void testGenerandoasientos(){
        Sala salaPrueba1 = new Sala(24,"A",8,12);
        int numeroAsientosEsperado = salaPrueba1.getNumeroDeAsientos();
        //System.out.println(salaPrueba1.imprimirListaAsientos());
        assertEquals(24,numeroAsientosEsperado);

        String datoEsperado = salaPrueba1.imprimirListaAsientos();
        assertEquals("LISTA ASIENTOS: \n"+"1A 2A 3A 4A 5A 6A 7A 8A 9A 10A 11A 12A 1B 2B 3B 4B 5B 6B 7B 8B 9B 10B 11B 12B ",datoEsperado);

    }

    @Test
    public void testAsientosDisponibles(){
        Sala salaPrueba1 = new Sala(26,"A",2,12);
        Sala salaPrueba2 = new Sala(5,"B",1,10);

        String datoEsperado = salaPrueba1.administradorAsientos.getListaAsientosDisponibles();

        assertEquals("1A 2A 3A 4A 5A 6A 7A 8A 9A 10A 11A 12A 1B 2B 3B 4B 5B 6B 7B 8B 9B 10B 11B 12B 1C 2C ",datoEsperado);

        //Reservando ASiento

        salaPrueba1.administradorAsientos.reservarAsiento(2,'A');

        String datoesperado2 = salaPrueba1.administradorAsientos.getListaAsientosDisponibles();

        assertEquals("1A 3A 4A 5A 6A 7A 8A 9A 10A 11A 12A 1B 2B 3B 4B 5B 6B 7B 8B 9B 10B 11B 12B 1C 2C ",datoesperado2);

    }

    @Test
    public void testAgregarPelicula(){
        Pelicula peliculaBatman = new Pelicula(1,"BATMAN", "Matt Reves", Clasificacion.CLASIFICACION_B, "Español Latino", "23 de marzo",190.0, Dimension.D3, Genero.ACCION);
        Sala salaPrueba1 = new Sala(24,"A",8,12);

        salaPrueba1.agregarPeliculaSala(peliculaBatman);

        System.out.println(salaPrueba1.getPrintPeliculasEnSala());
    }
}
