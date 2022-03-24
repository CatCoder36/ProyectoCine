import java.util.ArrayList;
import java.util.Objects;

public class Cartelera {

    private int precio2D;
    private int precio3D;
    static ArrayList<Pelicula> listaPeliculas;


    public Cartelera(){
        listaPeliculas = new ArrayList<>();

    }
    public void establecerPrecioEntrada(int d2, int d3){
        this.precio2D = d2;
        this.precio3D = d3;
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
                if (peliculaMostrar.dimension == Dimension.D2){
                    nombrePelicula = precios(may);
                }

                else{
                    nombrePelicula = precios(may);

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
                    nombrePelicula = precios(ID);
                }
                else{
                    nombrePelicula = precios(ID);
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


    public String precios(String nombrePelicula){
        String mostraPrecio23D = "";
        for (Pelicula peliculaPrecioMostrar: listaPeliculas){
            if (Objects.equals(nombrePelicula, peliculaPrecioMostrar.mostrarPeliculaSeleccionadaNombre())){
                if (peliculaPrecioMostrar.dimension == Dimension.D2){
                    mostraPrecio23D = Util.lineaCorta + "\n" + "PELICULA SELECCIONADA |\n" + peliculaPrecioMostrar + "\t\t| PRECIO: " + precio2D + " bs"
                            + "\n\t\t" +  Util.lineaCorta1Linea + "\n\t\tHORARIOS: \n" + peliculaPrecioMostrar.infoHorario() + "\n";
                    peliculaSeleccionadaNombre = Util.lineaCorta + "\n" + "PELICULA SELECCIONADA |\n" + peliculaPrecioMostrar + "\t\t| PRECIO: " + precio2D + " bs" + "\n\t\t"
                            +  Util.lineaCorta1Linea + "\n\t\tHORARIOS: \n" + peliculaPrecioMostrar.infoHorario() + "\n" ;
                }
                else if (peliculaPrecioMostrar.dimension == Dimension.D3){
                    mostraPrecio23D = Util.lineaCorta + "\n" + "PELICULA SELECCIONADA |\n" + peliculaPrecioMostrar + "\t\t| PRECIO: " + precio3D + " bs"
                            + "\n\t\t" +  Util.lineaCorta1Linea + "\n\t\tHORARIOS: \n" + peliculaPrecioMostrar.infoHorario() + "\n";
                    peliculaSeleccionadaNombre = Util.lineaCorta + "\n" + "PELICULA SELECCIONADA |\n" + peliculaPrecioMostrar + "\t\t| PRECIO: " + precio3D + " bs" + "\n\t\t"
                            +  Util.lineaCorta1Linea + "\n\t\tHORARIOS: \n" + peliculaPrecioMostrar.infoHorario() + "\n" ;
                }
            }
        }
        return mostraPrecio23D;
    }

    public String precios(int idPelicula){
        String mostraPrecio23D = "";
        for (Pelicula peliculaPrecioMostrar: listaPeliculas){
            if (peliculaPrecioMostrar.mostrarPeliculaSeleccionadaID() == idPelicula) {
                if (peliculaPrecioMostrar.dimension == Dimension.D2) {
                    mostraPrecio23D = Util.lineaCorta + "\n" + "PELICULA SELECCIONADA |\n" + peliculaPrecioMostrar + "\t\t| PRECIO: " + precio2D + " bs"
                            + "\n\t\t" + Util.lineaCorta1Linea + "\n\t\tHORARIOS: \n" + peliculaPrecioMostrar.infoHorario() + "\n";
                    peliculaSeleccionadaID = Util.lineaCorta + "\n" + "PELICULA SELECCIONADA |\n" + peliculaPrecioMostrar + "\t\t| PRECIO: " + precio2D + " bs" + "\n\t\t"
                            + Util.lineaCorta1Linea + "\n\t\tHORARIOS: \n" + peliculaPrecioMostrar.infoHorario() + "\n";
                } else {
                    mostraPrecio23D = Util.lineaCorta + "\n" + "PELICULA SELECCIONADA |\n" + peliculaPrecioMostrar + "\t\t| PRECIO: " + precio3D + " bs"
                            + "\n\t\t" + Util.lineaCorta1Linea + "\n\t\tHORARIOS: \n" + peliculaPrecioMostrar.infoHorario() + "\n";
                    peliculaSeleccionadaID = Util.lineaCorta + "\n" + "PELICULA SELECCIONADA |\n" + peliculaPrecioMostrar + "\t\t| PRECIO: " + precio3D + " bs" + "\n\t\t"
                            + Util.lineaCorta1Linea + "\n\t\tHORARIOS: \n" + peliculaPrecioMostrar.infoHorario() + "\n";
                }
            }
        }
        return mostraPrecio23D;
    }
}
