public class Pelicula {

    private String infoPelicula;
    private final String nombrePelicula;
    private final String director;
    Clasificacion clasificacion;
    private final String idioma;
    private final String estreno;
    private final int ID;

    private final Double duracion;

    Dimension dimension;
    Genero genero;


    public Pelicula(int ID, String nombrePelicula, String director, Clasificacion clasificacion, String idioma, String estreno, Double duracion, Dimension dimension, Genero genero) {
        this.ID = ID;
        this.nombrePelicula = nombrePelicula;
        this.director = director;
        this.clasificacion = clasificacion;
        this.idioma = idioma;
        this.estreno = estreno;
        this.duracion = duracion;
        this.dimension = dimension;
        this.genero = genero;
    }
    public void addInfo(String infoPelicula){
        this.infoPelicula = infoPelicula;
    }

    public String idiomaPelicula(){
        return idioma;
    }

    public String mostrarPeliculaSeleccionadaNombre(){
        return nombrePelicula;
    }

    public int mostrarPeliculaSeleccionadaID(){
        return ID;
    }

    public String mostrarInfo(){
        return "\t\t| SINOPSIS: " + infoPelicula;
    }

    public String toString() {

        if (dimension == Dimension.D2) {
            return Util.lineaLarga + "\n" +
                    "\t\t\t\t\t\t| " + nombrePelicula + " | \t\t\t" +
                    "\n" + Util.lineaLarga +
                    "\n" + ID + ".\t\t| GENERO: " + genero + "\t|\tDIMENSION: 2D" +
                    "\n\t\t| DURACION: " + duracion + " min." +
                    "\n\t\t| CLASIFICACION: " + clasificacion +
                    "\n\t\t| ESTRENO: " + estreno +
                    "\n\t\t| DIRECTOR: " + director +
                    "\n\t\t| IDIOMA: " + idioma +
                    "\n\t\t| SINOPSIS: " + infoPelicula + "\n";
        }

        else{
            return Util.lineaLarga + "\n" +
                    "\t\t\t\t\t\t| " + nombrePelicula + " | \t\t\t" +
                    "\n" + Util.lineaLarga +
                    "\n" + ID + ".\t\t| GENERO: " + genero + "\t|\tDIMENSION: 3D" +
                    "\n\t\t| DURACION: " + duracion + " min." +
                    "\n\t\t| CLASIFICACION: " + clasificacion +
                    "\n\t\t| ESTRENO: " + estreno +
                    "\n\t\t| DIRECTOR: " + director +
                    "\n\t\t| IDIOMA: " + idioma +
                    "\n\t\t| SINOPSIS: " + infoPelicula + "\n";
        }
    }




}
