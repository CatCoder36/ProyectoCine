package TestCartelera;/*import Cartelera.Cartelera;
import Cartelera.Dimension;
import Cartelera.Genero;
import Cartelera.Pelicula;*/
import Cartelera.*;
import Cartelera.Clasificacion;
import Cartelera.Dimension;
import Cartelera.Genero;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
//import org.testng.annotations.Test;


public class TestCartelera {
    Cartelera cartelera = new Cartelera();

    @Test
    public void testMostrarCartelera(){
        /* ESTABLECER PRECIOS DE ENTRADAS */
        cartelera.establecerPrecioEntrada(40, 60);
        cartelera.establecerPrecioEntrada(50, 70);


        Pelicula peliculaBatman = new Pelicula(1,"BATMAN", "Matt Reves", Clasificacion.CLASIFICACION_B, "Español Latino", "3 de Marzo de 2022", 190.0, Dimension.D3, Genero.ACCION);
        peliculaBatman.addInfo("La trama es desconocida");
        cartelera.addPeliculas(peliculaBatman);
        assertEquals("\t\t| SINOPSIS: La trama es desconocida" , peliculaBatman.mostrarInfo());
        assertEquals("BATMAN", peliculaBatman.mostrarPeliculaSeleccionadaNombre());
        assertEquals(1, peliculaBatman.mostrarPeliculaSeleccionadaID());
        assertEquals("Español Latino", peliculaBatman.idiomaPelicula());

        /* AGREGAR HORARIOS A PELICULA BATMAN */
        HorarioPelicula horarioPeliculaBatman = new HorarioPelicula("BATMAN");
        horarioPeliculaBatman.addHorarios(20, 30);
        horarioPeliculaBatman.addHorarios(16, 00);
        horarioPeliculaBatman.addHorarios(9, 30);
        peliculaBatman.addHoraPelicula(horarioPeliculaBatman);
        peliculaBatman.iniciarHorarioPelicula();
        assertEquals(1, peliculaBatman.horariosSize());
        assertEquals("BATMAN", peliculaBatman.getNombrePeliculaHorario());
        assertEquals("\t\t1. 20:30\n" +
                "\t\t2. 16:00\n" +
                "\t\t3. 9:30\n", peliculaBatman.infoHorario());




        Pelicula peliculaExo = new Pelicula(2,"EL EXORCISMO DE DIOS", "Alejandro Hidalgo", Clasificacion.CLASIFICACION_C, "Español Latino", "03 marzo 2022", 110.0, Dimension.D2, Genero.TERROR);
        peliculaExo.addInfo("Un sacerdote estadounidense que trabaja en México es\n\t\tposeído durante un exorcismo y termina cometiendo un acto terrible.");
        cartelera.addPeliculas(peliculaExo);
        assertEquals("\t\t| SINOPSIS: Un sacerdote estadounidense que trabaja en México es\n\t\tposeído durante un exorcismo y termina cometiendo un acto terrible.", peliculaExo.mostrarInfo());
        assertEquals("EL EXORCISMO DE DIOS", peliculaExo.mostrarPeliculaSeleccionadaNombre());
        assertEquals(2, peliculaExo.mostrarPeliculaSeleccionadaID());
        assertEquals("Español Latino", peliculaExo.idiomaPelicula());

        /* AGREGAR HORARIOS A PELICULA EXORCISMO */
        HorarioPelicula horarioPeliculaExo = new HorarioPelicula("EL exorcismo de dios");
        horarioPeliculaExo.addHorarios(16, 30);
        horarioPeliculaExo.addHorarios(18, 30);
        horarioPeliculaExo.addHorarios(19, 30);
        horarioPeliculaExo.addHorarios(20, 30);
        horarioPeliculaExo.addHorarios(23, 00);
        peliculaExo.addHoraPelicula(horarioPeliculaExo);
        peliculaExo.iniciarHorarioPelicula();
        assertEquals(1, peliculaExo.horariosSize());
        assertEquals("EL EXORCISMO DE DIOS", peliculaExo.getNombrePeliculaHorario());
        assertEquals("\t\t1. 16:30\n" +
                "\t\t2. 18:30\n" +
                "\t\t3. 19:30\n" +
                "\t\t4. 20:30\n" + "\t\t5. 23:00\n", peliculaExo.infoHorario());




        Pelicula peliculaSpider = new Pelicula(3,"SPIDERMAN: NO WAY HOME", "Jon Watts", Clasificacion.CLASIFICACION_B, "Español Latino", "15 diciembre 2021", 160.0, Dimension.D3, Genero.ACCION);
        peliculaSpider.addInfo("Basada en los cómics de Stan Lee y Steve Ditko");
        cartelera.addPeliculas(peliculaSpider);
        assertEquals("\t\t| SINOPSIS: Basada en los cómics de Stan Lee y Steve Ditko", peliculaSpider.mostrarInfo());
        assertEquals("SPIDERMAN: NO WAY HOME", peliculaSpider.mostrarPeliculaSeleccionadaNombre());
        assertEquals(3, peliculaSpider.mostrarPeliculaSeleccionadaID());
        assertEquals("Español Latino", peliculaSpider.idiomaPelicula());

        /* AGREGAR HORARIOS A PELICULA SPIDER */
        HorarioPelicula horarioPeliculaSpider = new HorarioPelicula("spiderman: no way home");
        horarioPeliculaSpider.addHorarios(11,30);
        horarioPeliculaSpider.addHorarios(15,45);
        horarioPeliculaSpider.addHorarios(17,30);
        horarioPeliculaSpider.addHorarios(20,30);
        horarioPeliculaSpider.addHorarios(22,00);
        peliculaSpider.addHoraPelicula(horarioPeliculaSpider);
        peliculaSpider.iniciarHorarioPelicula();
        assertEquals(1, peliculaSpider.horariosSize());
        assertEquals("SPIDERMAN: NO WAY HOME", peliculaSpider.getNombrePeliculaHorario());
        assertEquals("\t\t1. 11:30\n" +
                "\t\t2. 15:45\n" +
                "\t\t3. 17:30\n" +
                "\t\t4. 20:30\n" + "\t\t5. 22:00\n", peliculaSpider.infoHorario());




        Pelicula peliculaUncharted = new Pelicula(4,"UNCHARTED: FUERA DEL MAPA", "Ruben Fleischer", Clasificacion.CLASIFICACION_B, "Ingles", "17 febrero 2022", 130.0, Dimension.D2, Genero.ACCION);
        peliculaUncharted.addInfo("Una precuela de la saga de videojuegos Uncharted, \n\t\tdonde descubrimos cómo Drake llego a conocer y hacerse amigo de\n\t\tSully.");
        cartelera.addPeliculas(peliculaUncharted);
        assertEquals("\t\t| SINOPSIS: Una precuela de la saga de videojuegos Uncharted, \n\t\tdonde descubrimos cómo Drake llego a conocer y hacerse amigo de\n\t\tSully.", peliculaUncharted.mostrarInfo());
        assertEquals("UNCHARTED: FUERA DEL MAPA", peliculaUncharted.mostrarPeliculaSeleccionadaNombre());
        assertEquals(4, peliculaUncharted.mostrarPeliculaSeleccionadaID());
        assertEquals("Ingles", peliculaUncharted.idiomaPelicula());

        /* AGREGAR HORARIOS A PELICULA UNCHARTED */
        HorarioPelicula horarioPeliculaUncha = new HorarioPelicula("uncharted: fuera del mapa");
        horarioPeliculaUncha.addHorarios(9, 45);
        horarioPeliculaUncha.addHorarios(14, 45);
        horarioPeliculaUncha.addHorarios(19, 45);
        peliculaUncharted.addHoraPelicula(horarioPeliculaUncha);
        peliculaUncharted.iniciarHorarioPelicula();
        peliculaUncharted.limpiarHorarioPelicula();
        assertEquals(0, peliculaUncharted.horariosSize());
        assertEquals("UNCHARTED: FUERA DEL MAPA", peliculaUncharted.getNombrePeliculaHorario());




        Pelicula peliculaSING2 = new Pelicula(5,"SING 2", "Garth Jennings", Clasificacion.CLASIFICACION_A, "Español Latino", "25 diciembre 2021", 120.0, Dimension.D2, Genero.ANIMACION);
        peliculaSING2.addInfo("Buster Moon y sus amigos deben persuadir a la estrella \n\t\tdel rock Clay Calloway para que se una a ellos en el estreno de un\n\t\tnuevo espectáculo.");
        cartelera.addPeliculas(peliculaSING2);
        assertEquals("\t\t| SINOPSIS: Buster Moon y sus amigos deben persuadir a la estrella \n\t\tdel rock Clay Calloway para que se una a ellos en el estreno de un\n\t\tnuevo espectáculo.", peliculaSING2.mostrarInfo());
        assertEquals("SING 2", peliculaSING2.mostrarPeliculaSeleccionadaNombre());
        assertEquals(5, peliculaSING2.mostrarPeliculaSeleccionadaID());
        assertEquals("Español Latino", peliculaSING2.idiomaPelicula());

        /* AGREGAR HORARIOS A PELICULA SING 2 */
        HorarioPelicula horarioPeliculasing2 = new HorarioPelicula("sing 2");
        horarioPeliculasing2.addHorarios(13, 30);
        horarioPeliculasing2.addHorarios(15, 30);
        horarioPeliculasing2.addHorarios(17, 30);
        peliculaSING2.addHoraPelicula(horarioPeliculasing2);
        peliculaSING2.iniciarHorarioPelicula();
        peliculaSING2.limpiarHorarioPelicula();
        assertEquals(0, peliculaSING2.horariosSize());
        assertEquals("SING 2", peliculaSING2.getNombrePeliculaHorario());





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
        assertEquals(cartelera.getPeliculaSeleccionadaNombre(), cartelera.mostrarPeliculaIDNombre("sing 2"));



        cartelera.mostrarPeliculaIDNombre(3);
        assertEquals(cartelera.getPeliculaSeleccionadaID(), cartelera.mostrarPeliculaIDNombre(3));



    }
}