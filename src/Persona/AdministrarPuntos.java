package Persona;

public class AdministrarPuntos {

    int contadorPuntos;

    public String aumentarPuntos(int precio){
        if (precio == 40 || precio == 60){
            contadorPuntos += 50;
        }else{
            contadorPuntos += 25;
        }
        return "PUNTOS: "+contadorPuntos;
    }

    public String disminuirPuntos(int gastoPuntos){
        contadorPuntos -= gastoPuntos;
        return "PUNTOS: "+contadorPuntos;
    }

}
