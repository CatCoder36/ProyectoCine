package Persona;

public class Empleado extends Persona{

    AreaTrabajo areaTrabajo;

    public Empleado(String nombre, String apellidoPaterno, String apellidoMaterno, int carnetIdentidad, String nacionalidad, int diaNacimiento, int mesNacimiento, int anoNacimiento, String sexo, AreaTrabajo areaTrabajo) {
        super(nombre, apellidoPaterno, apellidoMaterno, carnetIdentidad, nacionalidad, diaNacimiento, mesNacimiento, anoNacimiento, sexo);
        this.areaTrabajo = areaTrabajo;
    }
    //TEST
    //Esta metodo se basa en examinar si el empleado tiene la edad suficiente para poder trabajar segun la ley.
    public String verificarEdad(){
        if (edad() >= 18 && edad() <= 60){
            return "Apto/a por ley";
        }
        if (edad() > 60){
            return "Jubilado/a";
        }
        return "Menor de edad";
    }

    public Object getAreaTrabajo() {
        return areaTrabajo.description;
    }

    @Override
    public String toString(Persona persona) {
        return persona.toString()+"DISPONIBILIDAD PARA TRABAJAR: "+verificarEdad()+"\n AREA DE TRABAJO: "+getAreaTrabajo();
    }
}