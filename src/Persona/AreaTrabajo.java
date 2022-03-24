package Persona;

public enum AreaTrabajo {
    //TEST
    ADMINISTRACION("ADMINISTRADOR: Encargado/a de la supervision del funcionamiento del cine"),
    LIMPIEZA("LIMPIEZA: Encargado/a de mantener la limpieza dentro del cine"),
    BOLETERIA("BOLETERIA: Encargado/a de vender boletos a los clientes"),
    ALIMENTOS("ALIMENTOS: Encargado/a de vender alimentos a los clientes"),
    SALAS("SALAS: Encargado/a de acomodar a los clientes en sus asientos asignados y administrar que ningun cliente incomode a los demas"),
    PROYECTOR("PROYECTOR: Encargado/a de proyectar la pelicula"),
    SEGURIDAD("SEGURIDAD: Encargado/a de resguardar la seguridad dentro del cine");

    final String description;
    AreaTrabajo(String description) {
        this.description = description;
    }
}