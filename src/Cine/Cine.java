package Cine;

import Cartelera.Cartelera;
import Salas.Sala;
import Cartelera.Pelicula;

import java.util.ArrayList;
public class Cine {
    private String nombreCine;
    private ArrayList<Sala> listaSalas = new ArrayList<>();
    private final int NIT = 678934013;
    private Cartelera cartelera = new Cartelera();

    public Cine(String nombreCine) {
        this.nombreCine = nombreCine;
    }

    // Métodos
    public void setAgregarSala(Sala sala)
    {
        listaSalas.add(sala);
    }

    public int getNIT()
    {
        return NIT;
    }

    public void setNombreCine(String nombreCine) {
        this.nombreCine = nombreCine;
    }

    public void agregarSala(Sala sala){
        listaSalas.add(sala);
    }
    public void quitarSala(String codigoSala){
        for (int i = 0; i < listaSalas.size(); i++){
            if (listaSalas.get(i).getCodigoSala().equals(codigoSala)){
                listaSalas.remove(i);
            }
        }
    }

    public String getListaSalas(){
        String imprimirSalas = "";
        for (int i = 0; i < listaSalas.size(); i++){
            imprimirSalas += listaSalas.get(i).getNombreSala()+", ";
        }
        return imprimirSalas;
    }



    public String getNombreCine() {
        return nombreCine;
    }

    public void agregarPelicula(Pelicula pelicula){
        cartelera.addPeliculas(pelicula);
    }
    public void quitarPelicula(Pelicula pelicula){
        cartelera.deletePeliculas(pelicula);
    }
}