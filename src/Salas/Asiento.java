package Salas;

public class Asiento {
// PRUEBA GIT
//Atributos

    private char ubicacionFila;
    private int ubicacionColumna;
    private Estado estadoAsiento;

    public Asiento(char ubicacionFila, int ubicacionColumna){
        this.ubicacionFila = ubicacionFila;
        this.ubicacionColumna = ubicacionColumna;
        estadoAsiento = Estado.LIBRE;
    }

    //Métodos
    public String getUbicacion()
    {
        return ubicacionColumna+""+ubicacionFila+"";
    }

    public char getUbicacionFila() {
        return ubicacionFila;
    }

    public int getUbicacionColumna() {
        return ubicacionColumna;
    }

    public Estado getEstadoAsiento() {
        return estadoAsiento;
    }

    public void setEstadoAsiento(Estado estadoAsiento) {
        this.estadoAsiento = estadoAsiento;
    }
}
