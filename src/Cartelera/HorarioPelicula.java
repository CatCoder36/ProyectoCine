package Cartelera;

import java.util.ArrayList;

public class HorarioPelicula {

    private final String nombrePelicula;
    private int hora1;
    private int hora2;
    static ArrayList<String> horarios;

    public HorarioPelicula(String nombrePelicula){
        this.nombrePelicula = nombrePelicula;
        horarios = new ArrayList<>();
    }

    public String getNombrePelicula(){
        return nombrePelicula;
    }

    public void addHorarios(int hora1, int hora2){
        this.hora1 = hora1;
        this.hora2 = hora2;
        horarios.add(toString());
    }

    public String toString(){
        return hora1 + ":" + hora2;
    }

    public String horas(){
        String hora = "";
        for (String horas: horarios){
            hora = hora + horas + "\n";
        }
        return hora;
    }

}
