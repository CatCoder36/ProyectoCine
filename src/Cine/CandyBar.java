package Cine;

public class CandyBar {

    private int totalPuntos;


    public void getTotalPuntos(int puntosTotal){
        totalPuntos = puntosTotal;
    }

    public String toString(){
        return "| PUNTOS CLIENTE: " + totalPuntos +
                "\n| CANDYBAR" +
                "\t| 500 PUNTOS:\n" +
                "\t\t 1. Reclamar un boleto." +
                "\n\t\t2. Reclamar una porcion grande de pipocas." +
                "\n\t| 950 PUNTOS: Puede reclamar 2 boletos" +
                "\n\t\t1. Reclamar 2 boletos." +
                "\n\t\t2. Reclamar un combo grande de pipocas y dos refrescos medianos mas una gorra del cine." +
                "\n\t| 13450 PUNTOS: " +
                "\n\t\t1. Reclamar 3 boletos." +
                "\n\t\t2. Reclamar combo grande de pipocas y refresco mas la polera oficial del cine.";
    }

}
