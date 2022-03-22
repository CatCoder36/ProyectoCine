package Persona;

import java.time.LocalDate;
import java.time.Period;

public abstract class Persona {

    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private int carnetIdentidad;
    private String nacionalidad;
    private int diaNacimiento;
    private int mesNacimiento;
    private int anoNacimiento;
    private String sexo;
    private String nombreUsuario; // Estos dos ultimos atributos podrian ser necesarios al momento del logeo y conexion a la base de datos
    private String contrasena;

    public Persona (String nombre, String apellidoPaterno, String apellidoMaterno, int carnetIdentidad, String nacionalidad, int diaNacimiento, int mesNacimiento, int anoNacimiento, String sexo){
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.carnetIdentidad = carnetIdentidad;
        this.nacionalidad = nacionalidad;
        this.diaNacimiento = diaNacimiento;
        this.mesNacimiento = mesNacimiento;
        this.anoNacimiento = anoNacimiento;
        this.sexo = sexo;
    }

    public int edad(){
        Period edad = Period.between(LocalDate.of(anoNacimiento, mesNacimiento, diaNacimiento), LocalDate.now());
        return edad.getYears();
    }

    @Override
    public String toString(){
        return "NOMBRE: "+nombre+" "+apellidoPaterno+" "+apellidoMaterno+"\n" +
                "CARNET IDENTIDAD: "+carnetIdentidad+"\n"+
                "NACIONALIDAD: "+nacionalidad+"\n"+
                "FECHA NACIMIENTO: "+diaNacimiento+"/"+mesNacimiento+"/"+anoNacimiento+"\n"+
                "GENERO: "+sexo+"\n";
    }

    public abstract String toString(Persona persona);
}
