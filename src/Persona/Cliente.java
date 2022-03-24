package Persona;

public class Cliente extends Persona{

    public Cliente(String nombre, String apellidoPaterno, String apellidoMaterno, int carnetIdentidad, String nacionalidad, int diaNacimiento, int mesNacimiento, int anoNacimiento, String sexo) {
        super(nombre, apellidoPaterno, apellidoMaterno, carnetIdentidad, nacionalidad, diaNacimiento, mesNacimiento, anoNacimiento, sexo);
    }



    //Este metodo se encarga de supervisar si es conciderado como una persona menor de 10 años o una persona de la tercera edad.
    public String verificacionEdad(){

        if (edad() <= 10){
            return "MENOR DE EDAD \nEDAD: "+edad();
        } if (edad() >= 60){
            return "TERCERA EDAD \nEDAD: "+edad();
        }
        return "NORMAL \nEDAD: "+ edad();
    }

    @Override
    public String toString(Persona persona) {
        return persona.toString()+"CLASIFICACION: "+verificacionEdad();
    }

    /*@Override
    public String toString(Empleado.Persona persona){
        return persona.toString()+"\nCLASIFICACION: "+verificacionEdad();
    }*/
}
