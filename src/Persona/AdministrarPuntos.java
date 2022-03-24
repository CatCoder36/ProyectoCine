package Persona;

public class AdministrarPuntos {
    //TEST
    int contadorPuntos;

    public String aumentarPuntos(int puntos, double rebaja, int cantidadBoletos){
        int totalPuntos = (int) (puntos - (puntos * rebaja));
        int totalGanados = totalPuntos * cantidadBoletos;
        contadorPuntos += totalGanados;
        return "PUNTOS: "+contadorPuntos;
    }

    public String disminuirPuntos(int gastoPuntos){
        contadorPuntos -= gastoPuntos;
        return "PUNTOS: "+contadorPuntos;
    }

}