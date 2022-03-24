package Salas;

import Cartelera.Pelicula;

import java.util.ArrayList;

public class Sala {
    private int cantidadAsientos;
    private String codigoSala;
    private int capacidadFila;
    private int capacidadColumna;
    private ArrayList <Asiento> listaAsientos;
    private ArrayList<Pelicula> peliculasPorReproducir = new ArrayList<>();

    public AdministradorAsientos administradorAsientos;



    public Sala(int cantidadAsientos, String codigoSala, int capacidadFila, int capacidadColumna){
        this.cantidadAsientos = cantidadAsientos;
        this.codigoSala = codigoSala;
        this.capacidadFila = capacidadFila;
        this.capacidadColumna = capacidadColumna;
        listaAsientos = new ArrayList<>();

        generandoAsientos();
        administradorAsientos = new AdministradorAsientos(listaAsientos);


    }

    public int getNumeroDeAsientos(){
        return listaAsientos.size();
    }
    //Se generan los asientos en la clase para asignarlas una ubicacion de manera automatica
    private void generandoAsientos(){

        char ubicacionFila;
        int ubicacionColumna;
        int contadorFilasDisponibles = 0;
        int asciiValor = 65; //65 es A en el sistema ascii

        for (int i = 0; i< cantidadAsientos;){
            ubicacionColumna = 1;
            ubicacionFila = (char) (contadorFilasDisponibles+asciiValor);
            contadorFilasDisponibles++;

            for( int h = 0; h < capacidadColumna; h++ ){

                Asiento asiento = new Asiento(ubicacionFila, ubicacionColumna);
                ubicacionColumna++;

                listaAsientos.add(asiento);
                i++;
                if(i == cantidadAsientos){
                    break;
                }

            }

        }

    }

    public String imprimirListaAsientos(){
        String imprimirLista = "LISTA ASIENTOS: \n";
        String ubicacionAsiento;

        for(int i = 0; i < listaAsientos.size(); i++){
            ubicacionAsiento = listaAsientos.get(i).getUbicacion()+" ";
            imprimirLista += ubicacionAsiento;

        }


        return  imprimirLista;
    }

    public ArrayList<Asiento> getListaAsientos(){
        return listaAsientos;
    }

    public boolean agregarPeliculaSala(Pelicula pelicula){
        if (peliculasPorReproducir.size() <= 5){
            peliculasPorReproducir.add(pelicula);
            return true;
        }
        else{
            return false;
        }
    }

    public String getPrintPeliculasEnSala(){
        String peliculasEnSala = "PELICULAS EN SALA:\n";
        for (int i = 0; i<peliculasPorReproducir.size(); i++){
            peliculasEnSala += peliculasPorReproducir.get(i).mostrarInfo()+"\n\n";
        }
        return peliculasEnSala;
    }

    public String getNombreSala(){
        return "SALA - "+codigoSala;
    }

    public String getCodigoSala() {
        return codigoSala;
    }
}
