package Cartelera;
import Salas.Sala;
import Util.Util;

import java.util.ArrayList;

public class Pelicula {

    private String infoPelicula;
    private final String nombrePelicula;
    private final String director;
    private final String idioma;
    private final String estreno;
    private final int ID;
    private final Double duracion;
    Clasificacion clasificacion;
    Dimension dimension;
    Genero genero;
    static ArrayList<HorarioPelicula> horarios;



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
        horarios = new ArrayList<>();


    }

    public void asisgnandoSalaExhibicion(ArrayList<Sala> listaSalas,Pelicula pelicula){
        for(int salaActual = 0; salaActual < listaSalas.size(); salaActual++){
            if(listaSalas.get(salaActual).agregarPeliculaSala(pelicula)){
                salaDeExhibicion = listaSalas.get(salaActual).getCodigoSala();
                break;

            }
        }
    }

    public String consultandoSalaExhibicion(){
        return salaDeExhibicion;
    }


    public int horariosSize(){
        return horarios.size();
    }

    public void addHoraPelicula(HorarioPelicula horarioPelicula){
        horarios.add(horarioPelicula);
    }

    public void limpiarHorarioPelicula(){
        horarios.clear();
    }

    private String peliculaHorario = "";
    private String hora = "";
    public void iniciarHorarioPelicula(){
        for (HorarioPelicula horarioPelicula: horarios){
            hora = hora + horarioPelicula.toString();
            peliculaHorario = peliculaHorario + horarioPelicula.getNombrePelicula();
        }
    }

    public String getNombrePeliculaHorario(){
        return peliculaHorario;
    }

    public String infoHorario(){
        return hora;
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

    public int getIdPelicula(){
        return ID;
    }

    public String getNombrePelicula(){
        return nombrePelicula;
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
                    "\n" + mostrarInfo() + "\n";
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
                    "\n" + mostrarInfo() + "\n";
        }
    }




}

