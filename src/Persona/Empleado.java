package Persona;

public class Empleado extends Persona{

    AreaTrabajo areaTrabajo;

    public Empleado(String nombre, String apellidoPaterno, String apellidoMaterno, int carnetIdentidad, String nacionalidad, int diaNacimiento, int mesNacimiento, int anoNacimiento, String sexo, AreaTrabajo areaTrabajo) {
        super(nombre, apellidoPaterno, apellidoMaterno, carnetIdentidad, nacionalidad, diaNacimiento, mesNacimiento, anoNacimiento, sexo);
        this.areaTrabajo = areaTrabajo;
    }

    //Esta metodo se basa en examinar si el empleado tiene la edad suficiente para poder trabajar segun la ley.
    public String verificarEdad(){
        if (edad() >= 18 && edad() <= 60){
            return "Apto/a por ley";
        }else if (edad() > 60){
            return "Jubilado/a";
        }else{
            return "Menor de edad";
        }
    }

    public String funcionArea(){
        if (areaTrabajo == AreaTrabajo.SALAS) {
            return "Encargado/a de acomodar a los clientes en sus asientos asignados y administrar que ningun cliente incomode a los demas";
        }else if (areaTrabajo == AreaTrabajo.ADMINISTRACION){
            return "Encargado/a de la supervision del funcionamiento del cine";
        }else if (areaTrabajo == AreaTrabajo.ALIMENTOS){
            return "Encargado/a de vender alimentos a los clientes";
        }else if (areaTrabajo == AreaTrabajo.LIMPIEZA){
            return "Encargado/a de mantener la limpieza dentro del cine";
        }else if (areaTrabajo == AreaTrabajo.BOLETERIA){
            return "Encargado/a de vender boletos a los clientes";
        }else if (areaTrabajo == AreaTrabajo.PROYECTOR){
            return "Encargado/a de proyectar la pelicula";
        }else if (areaTrabajo == AreaTrabajo.SEGURIDAD){
            return "Encargado/a de resguardar la seguridad dentro del cine";
        }else{
            return "Persona externa al cine";
        }

    }

    @Override
    public String toString(Persona persona) {
        return persona.toString()+"DISPONIBILIDAD PARA TRABAJAR: "+verificarEdad()+"\n AREA DE TRABAJO: "+areaTrabajo+"\n FUNCION: "+funcionArea();
    }
}
