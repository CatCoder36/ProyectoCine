import java.time.Period;
import java.time.LocalDate;
import java.util.Locale;

public class Cliente{
    private String nombreCliente;
    private int contadorPuntos;
    private int carnetIdentidadCliente;
    private String nacionalidadCliente;
    private int diaNacimiento;
    private int mesNacimiento;
    private int anioNacimiento;

    public Cliente(String nombreCliente, int carnetIdentidadCliente, String nacionalidadCliente, int diaNacimiento, int mesNacimiento, int anioNacimiento){
        this.nombreCliente = nombreCliente.toUpperCase();
        this.carnetIdentidadCliente = carnetIdentidadCliente;
        this.nacionalidadCliente = nacionalidadCliente;
        this.diaNacimiento = diaNacimiento;
        this.mesNacimiento = mesNacimiento;
        this.anioNacimiento = anioNacimiento;
    }

    //QUE PASA GENTE :P
    public String getNombreCliente(){
        return nombreCliente;
    }
    public int getCarnetIdentidadCliente(){
        return carnetIdentidadCliente;
    }
    public int getContadorPuntos(){
        return contadorPuntos;
    }


    public int verificadorEdad(){

        Period edadPersona = Period.between(LocalDate.of(anioNacimiento,mesNacimiento,diaNacimiento), LocalDate.now());

        if (edadPersona.getYears() < 10){
            return edadPersona.getYears();
        }else if (edadPersona.getYears() >= 60){
            return edadPersona.getYears();
        }else{
            return edadPersona.getYears();
        }
    }


    public String addPuntos(int precioBoleto){
        if (precioBoleto == 40 || precioBoleto == 60) {
            contadorPuntos = contadorPuntos + 50;
        }else{
            contadorPuntos = contadorPuntos + 25;
        }
        return "PUNTOS: "+contadorPuntos;
    }

    @Override
    public String toString(){
        return "NOMBRE: "+nombreCliente+"\n" +
                "PUNTOS ACUMULADOS: "+contadorPuntos+"\n"+
                "CARNET IDENTIDDAD: "+carnetIdentidadCliente+"\n"+
                "NACIONALIDAD: "+nacionalidadCliente+"\n"+
                "FECHA NACIMIENTO: "+diaNacimiento+"/"+mesNacimiento+"/"+anioNacimiento;
    }
}
