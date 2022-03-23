import java.util.ArrayList;

public class Cartelera {
    static final int precio2D = 40;
    static final int precio3D = 60;
    static ArrayList<Pelicula> listaPeliculas;
    static ArrayList<HorarioPelicula> horarios;


    public Cartelera(){
        listaPeliculas = new ArrayList<>();
        horarios = new ArrayList<>();
    }


    public void addPeliculas(Pelicula pelicula){    // ADMIN
        listaPeliculas.add(pelicula);
    }

    public void deletePeliculas(Pelicula pelicula){     // ADMIN
        listaPeliculas.remove(pelicula);
    }

    public void addHoraPelicula(HorarioPelicula horarioPelicula){
        horarios.add(horarioPelicula);
    }

    public String mostrarHorarioPelicula(){
        String hora = "";
        for (HorarioPelicula horarioPelicula: horarios){
            hora = hora + horarioPelicula.horas();
        }
        return hora;
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
                if (peliculaMostrar.dimension == Dimension.D2){
                    nombrePelicula = Util.lineaCorta + "\n" + "PELICULA SELECCIONADA |\n" + peliculaMostrar + "\t\t| PRECIO: " + precio2D + " bs";
                    peliculaSeleccionadaNombre = Util.lineaCorta + "\n" + "PELICULA SELECCIONADA |\n" + peliculaMostrar + "\t\t| PRECIO: " + precio2D + " bs";
                }
                else if (peliculaMostrar.dimension == Dimension.D3){
                    nombrePelicula = Util.lineaCorta + "\n" + "PELICULA SELECCIONADA |\n" + peliculaMostrar + "\t\t| PRECIO: " + precio3D + " bs";
                    peliculaSeleccionadaNombre = Util.lineaCorta + "\n" + "PELICULA SELECCIONADA |\n" + peliculaMostrar + "\t\t| PRECIO: " + precio3D + " bs";
                }
            }
        }
        return nombrePelicula;
    }


    private String peliculaSeleccionadaID = "";
    public String mostrarPeliculaIDNombre(int ID){              // USER
        String nombrePelicula = "";
        for (Pelicula peliculaMostrar: listaPeliculas){
            if (ID == peliculaMostrar.mostrarPeliculaSeleccionadaID()){
                if (peliculaMostrar.dimension == Dimension.D2){
                    nombrePelicula = Util.lineaCorta + "\n" + "PELICULA SELECCIONADA |\n" + peliculaMostrar + "\t\t| PRECIO: " + precio2D + " bs";
                    peliculaSeleccionadaID = Util.lineaCorta + "\n" + "PELICULA SELECCIONADA |\n" + peliculaMostrar + "\t\t| PRECIO: " + precio2D + " bs";
                }
                else if (peliculaMostrar.dimension == Dimension.D3){
                    nombrePelicula = Util.lineaCorta + "\n" + "PELICULA SELECCIONADA |\n" + peliculaMostrar + "\t\t| PRECIO: " + precio3D + " bs";
                    peliculaSeleccionadaID = Util.lineaCorta + "\n" + "PELICULA SELECCIONADA |\n" + peliculaMostrar + "\t\t| PRECIO: " + precio3D + " bs";
                }
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
