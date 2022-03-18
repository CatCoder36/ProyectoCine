import java.util.ArrayList;

public class Cartelera {

    static ArrayList<Pelicula> listaPeliculas;


    public Cartelera(){
        listaPeliculas = new ArrayList<>();
    }

    public void addPeliculas(Pelicula pelicula){    // ADMIN
        listaPeliculas.add(pelicula);
    }

    public void deletePeliculas(Pelicula pelicula){     // ADMIN
        listaPeliculas.remove(pelicula);
    }

    private String peliculaMostradaPublico = "";

    public String mostrarPeliculas(){             // USER
        String mostrarPeli = "";
        for (Pelicula mostrarpeliculas: listaPeliculas){
            mostrarPeli = mostrarPeli + mostrarpeliculas.toString();

            peliculaMostradaPublico = peliculaMostradaPublico + "NOMBRE: " + mostrarpeliculas.mostrarPeliculaSeleccionadaNombre()
                    + "\t| CLASIFICACION: " + mostrarpeliculas.clasificacion
                    + "\t| IDIOMA: " + mostrarpeliculas.idiomaPelicula() + "\n";
        }
        return mostrarPeli;
    }

    private String peliculaSeleccionadaNombre = "";

    public String mostrarPeliculaIDNombre(String Nombrepelicula){       // USER
        String may = Nombrepelicula.toUpperCase();
        String nombrePelicula = "";
        for (Pelicula peliculaMostrar: listaPeliculas){
            if (may.equals(peliculaMostrar.mostrarPeliculaSeleccionadaNombre())){
                nombrePelicula = Util.lineaCorta + "\n" + "PELICULA SELECCIONADA |\n" + peliculaMostrar;
                peliculaSeleccionadaNombre = Util.lineaCorta + "\n" + "PELICULA SELECCIONADA |\n" + peliculaMostrar;
            }
        }
        return nombrePelicula;
    }

    private String peliculaSeleccionadaID = "";

    public String mostrarPeliculaIDNombre(int ID){              // USER
        String nombrePelicula = "";
        for (Pelicula peliculaMostrar: listaPeliculas){
            if (ID == peliculaMostrar.mostrarPeliculaSeleccionadaID()){
                nombrePelicula = Util.lineaCorta + "\n" + "PELICULA SELECCIONADA |\n" + peliculaMostrar;
                peliculaSeleccionadaID = Util.lineaCorta + "\n" + "PELICULA SELECCIONADA |\n" + peliculaMostrar;
            }
        }
        return nombrePelicula;
    }

    public ArrayList<Pelicula> mostrarListaDePeliculas(){   // ADMIN
        return listaPeliculas;
    }

    public int numeroDePeliculas(){        // ADMIN
        return listaPeliculas.size();
    }   // ADMIN

    public String carteleraMostrada(){      // ADMIN
        return "PUBLICO |\n" + peliculaMostradaPublico;
    }

    public String getPeliculaSeleccionadaNombre(){
        return peliculaSeleccionadaNombre;
    }

    public String getPeliculaSeleccionadaID(){
        return peliculaSeleccionadaID;
    }


}
