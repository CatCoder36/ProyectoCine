import java.time.Period;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Cliente{
    private String nombreCliente;
    private int contadorPuntos;
    private int carnetIdentidadCliente;
    private String nacionalidadCliente;
    private int diaNacimiento;
    private int mesNacimiento;
    private int anioNacimiento;

    public Cliente(String nombreCliente, int carnetIdentidadCliente, String nacionalidadCliente, int diaNacimiento, int mesNacimiento, int anioNacimiento){
        this.nombreCliente = nombreCliente;
        this.carnetIdentidadCliente = carnetIdentidadCliente;
        this.nacionalidadCliente = nacionalidadCliente;
        this.diaNacimiento = diaNacimiento;
        this.mesNacimiento = mesNacimiento;
        this.anioNacimiento = anioNacimiento;
    }

    //QUE PASA GENTE :P

    public int getDiaNacimiento() {
        return diaNacimiento;
    }

    public int getMesNacimiento() {
        return mesNacimiento;
    }

    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    public String verificadorEdad(){

        String fechaNacimiento = diaNacimiento+"/"+mesNacimiento+"/"+anioNacimiento;
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaNac = LocalDate.parse(fechaNacimiento, fmt);
        LocalDate ahora = LocalDate.now();
        Period edadPersona = Period.between(fechaNac, ahora);

        if (edadPersona.getYears() < 10){
            return String.valueOf(edadPersona.getYears());
        }else if (edadPersona.getYears() >= 60){
            return String.valueOf(edadPersona.getYears());
        }else{
            return String.valueOf(edadPersona.getYears());
        }
    }

    int precioBoleto = 10; //esta variable es temporal, hasta que se termine el metodo definirPrecio
    public void addPuntos(){
        if (precioBoleto == 40 || precioBoleto == 60) {
            contadorPuntos = contadorPuntos + 50;
        }else{
            contadorPuntos = contadorPuntos + 25;
        }
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
