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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public int getCarnetIdentidad() {
        return carnetIdentidad;
    }

    public void setCarnetIdentidad(int carnetIdentidad) {
        this.carnetIdentidad = carnetIdentidad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getDiaNacimiento() {
        return diaNacimiento;
    }

    public void setDiaNacimiento(int diaNacimiento) {
        this.diaNacimiento = diaNacimiento;
    }

    public int getMesNacimiento() {
        return mesNacimiento;
    }

    public void setMesNacimiento(int mesNacimiento) {
        this.mesNacimiento = mesNacimiento;
    }

    public int getAnoNacimiento() {
        return anoNacimiento;
    }

    public void setAnoNacimiento(int anoNacimiento) {
        this.anoNacimiento = anoNacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
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
