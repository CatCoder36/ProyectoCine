package Cartelera;

import java.util.ArrayList;
import java.util.Locale;

public class HorarioPelicula {

    private final String nombrePelicula;

    private int hora1;
    private int hora2;
    static ArrayList<String> horarios;

    public HorarioPelicula(String nombrePelicula){
        this.nombrePelicula = nombrePelicula.toUpperCase();
        horarios = new ArrayList<>();
    }

    public String getNombrePelicula(){
        return nombrePelicula;
    }

    public void addHorarios(int hora1, int hora2){
        this.hora1 = hora1;
        this.hora2 = hora2;
        horarios.add(horas());
    }

    public String horas(){
        if (hora2 == 0){
            return hora1 + ":00";
        }
        else {
            return hora1 + ":" + hora2;
        }
    }

    public String toString(){
        String hora = "";
        int contador = 0;
        for (String horas: horarios){
            contador++;
            hora = hora + "\t\t" + contador + ". " + horas + "\n";
        }
        return hora;
    }




}
