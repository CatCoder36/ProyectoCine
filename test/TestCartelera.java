/*import Cartelera.Cartelera;
import Cartelera.Dimension;
import Cartelera.Genero;
import Cartelera.Pelicula;*/
import Cartelera.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
//import org.testng.annotations.Test;


public class TestCartelera {
    Cartelera cartelera = new Cartelera();

    @Test
    public void testMostrarCartelera(){
        Pelicula peliculaBatman = new Pelicula(1,"BATMAN", "Matt Reves", Clasificacion.CLASIFICACION_B, "Español Latino", "3 de enero",190.0, Dimension.D3, Genero.ACCION);
        peliculaBatman.addInfo("La trama es desconocida");
        cartelera.addPeliculas(peliculaBatman);
        assertEquals("\t\t| SINOPSIS: La trama es desconocida" , peliculaBatman.mostrarInfo());
        assertEquals("BATMAN", peliculaBatman.mostrarPeliculaSeleccionadaNombre());
        assertEquals(1, peliculaBatman.mostrarPeliculaSeleccionadaID());
        assertEquals("Español Latino", peliculaBatman.idiomaPelicula());
        HorarioPelicula horarioPelicula = new HorarioPelicula("BATMAN");
        horarioPelicula.addHorarios(20, 30);
        horarioPelicula.addHorarios(16, 20);
        horarioPelicula.addHorarios(9, 30);
        cartelera.addHoraPelicula(horarioPelicula);
        System.out.println(cartelera.mostrarHorarioPelicula());


        Pelicula peliculaExo = new Pelicula(2,"EL EXORCISMO DE DIOS", "Alejandro Hidalgo", Clasificacion.CLASIFICACION_C, "Español Latino", "03 marzo 2022", 110.0, Dimension.D2, Genero.TERROR);
        peliculaExo.addInfo("Un sacerdote estadounidense que trabaja en México es\n\t\tposeído durante un exorcismo y termina cometiendo un acto terrible.");
        cartelera.addPeliculas(peliculaExo);
        assertEquals("\t\t| SINOPSIS: Un sacerdote estadounidense que trabaja en México es\n\t\tposeído durante un exorcismo y termina cometiendo un acto terrible.", peliculaExo.mostrarInfo());
        assertEquals("EL EXORCISMO DE DIOS", peliculaExo.mostrarPeliculaSeleccionadaNombre());
        assertEquals(2, peliculaExo.mostrarPeliculaSeleccionadaID());
        assertEquals("Español Latino", peliculaExo.idiomaPelicula());


        Pelicula peliculaSpider = new Pelicula(3,"SPIDERMAN: NO WAY HOME", "Jon Watts", Clasificacion.CLASIFICACION_B, "Español Latino", "15 diciembre 2021", 160.0, Dimension.D3, Genero.ACCION);
        peliculaSpider.addInfo("Basada en los cómics de Stan Lee y Steve Ditko");
        cartelera.addPeliculas(peliculaSpider);
        assertEquals("\t\t| SINOPSIS: Basada en los cómics de Stan Lee y Steve Ditko", peliculaSpider.mostrarInfo());
        assertEquals("SPIDERMAN: NO WAY HOME", peliculaSpider.mostrarPeliculaSeleccionadaNombre());
        assertEquals(3, peliculaSpider.mostrarPeliculaSeleccionadaID());
        assertEquals("Español Latino", peliculaSpider.idiomaPelicula());


        Pelicula peliculaUncharted = new Pelicula(4,"UNCHARTED: FUERA DEL MAPA", "Ruben Fleischer", Clasificacion.CLASIFICACION_B, "Ingles", "17 febrero 2022", 130.0, Dimension.D2, Genero.ACCION);
        peliculaUncharted.addInfo("Una precuela de la saga de videojuegos Uncharted, \n\t\tdonde descubrimos cómo Drake llego a conocer y hacerse amigo de\n\t\tSully.");
        cartelera.addPeliculas(peliculaUncharted);
        assertEquals("\t\t| SINOPSIS: Una precuela de la saga de videojuegos Uncharted, \n\t\tdonde descubrimos cómo Drake llego a conocer y hacerse amigo de\n\t\tSully.", peliculaUncharted.mostrarInfo());
        assertEquals("UNCHARTED: FUERA DEL MAPA", peliculaUncharted.mostrarPeliculaSeleccionadaNombre());
        assertEquals(4, peliculaUncharted.mostrarPeliculaSeleccionadaID());
        assertEquals("Ingles", peliculaUncharted.idiomaPelicula());


        Pelicula peliculaSING2 = new Pelicula(5,"SING 2", "Garth Jennings", Clasificacion.CLASIFICACION_A, "Español Latino", "25 diciembre 2021", 120.0, Dimension.D2, Genero.ANIMACION);
        peliculaSING2.addInfo("Buster Moon y sus amigos deben persuadir a la estrella \n\t\tdel rock Clay Calloway para que se una a ellos en el estreno de un\n\t\tnuevo espectáculo.");
        cartelera.addPeliculas(peliculaSING2);
        assertEquals("\t\t| SINOPSIS: Buster Moon y sus amigos deben persuadir a la estrella \n\t\tdel rock Clay Calloway para que se una a ellos en el estreno de un\n\t\tnuevo espectáculo.", peliculaSING2.mostrarInfo());
        assertEquals("SING 2", peliculaSING2.mostrarPeliculaSeleccionadaNombre());
        assertEquals(5, peliculaSING2.mostrarPeliculaSeleccionadaID());
        assertEquals("Español Latino", peliculaSING2.idiomaPelicula());


        /* Mostrar Cartelera.Cartelera */
        cartelera.mostrarPeliculas();
        assertEquals(5, cartelera.numeroDePeliculas());
        assertEquals("PUBLICO |" +
                "\nNOMBRE: BATMAN\t| CLASIFICACION: CLASIFICACION_B\t| IDIOMA: Español Latino\n" +
                "NOMBRE: EL EXORCISMO DE DIOS\t| CLASIFICACION: CLASIFICACION_C\t| IDIOMA: Español Latino\n" +
                "NOMBRE: SPIDERMAN: NO WAY HOME\t| CLASIFICACION: CLASIFICACION_B\t| IDIOMA: Español Latino\n" +
                "NOMBRE: UNCHARTED: FUERA DEL MAPA\t| CLASIFICACION: CLASIFICACION_B\t| IDIOMA: Ingles\n" +
                "NOMBRE: SING 2\t| CLASIFICACION: CLASIFICACION_A\t| IDIOMA: Español Latino\n", cartelera.carteleraMostrada());






        /* Mostrar Cartelera.Pelicula por el nombre o por el ID*/
        cartelera.mostrarPeliculaIDNombre("Sing 2");
        //System.out.println(cartelera.getPeliculaSeleccionadaNombre());
        assertEquals(cartelera.getPeliculaSeleccionadaNombre(), cartelera.mostrarPeliculaIDNombre("sing 2"));


        cartelera.mostrarPeliculaIDNombre(3);
        //System.out.println(cartelera.getPeliculaSeleccionadaID());
        assertEquals(cartelera.getPeliculaSeleccionadaID(), cartelera.mostrarPeliculaIDNombre(3));



    }
}