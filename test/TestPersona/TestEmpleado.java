package TestPersona;

import Persona.AreaTrabajo;
import Persona.Empleado;
import junit.framework.TestCase;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class TestEmpleado extends TestCase {

    Empleado alberto = new Empleado("Alberto", "Ramirez","Escobar",92837128,
            "Colombia",1, 1, 2000, "Hombre", AreaTrabajo.LIMPIEZA);

    Empleado fabian = new Empleado("Fabian", "Huanca","Ramirez",28462847,
            "Paraguay",2, 2, 2000, "Hombre", AreaTrabajo.ADMINISTRACION);

    Empleado rosa = new Empleado("Rosa", "Mamani","Espinoza",73829462,
            "Colombia",3, 3, 2000, "Mujer", AreaTrabajo.ALIMENTOS);

    Empleado miriam = new Empleado("Miriam", "Espinoza","Lazarte",93729462,
            "Bolivia",4, 4, 2000, "Mujer", AreaTrabajo.BOLETERIA);

    Empleado ramiro = new Empleado("Ramiro", "Arequipa","Camacho",46283648,
            "Colombia",5, 5, 2000, "Hombre", AreaTrabajo.PROYECTOR);

    Empleado rossmery = new Empleado("Rossmery", "Mejillones","Cameron",47284728,
            "Bolivia",6, 6, 2000, "Mujer", AreaTrabajo.SALAS);

    Empleado rambo = new Empleado("Rambo", "Guerrero","Hinojosa",74829472,
            "Venezuela",7, 7, 2000, "Hombre", AreaTrabajo.SEGURIDAD);

    @Test
    public void testNombresApellidosEmpleados()
    {
        ArrayList<String> NombreApellidosAlberto = new ArrayList<>();
        ArrayList<String> NombreApellidosFabian = new ArrayList<>();
        ArrayList<String> NombreApellidosRosa = new ArrayList<>();
        ArrayList<String> NombreApellidosMiriam = new ArrayList<>();
        ArrayList<String> NombreApellidosRamiro = new ArrayList<>();
        ArrayList<String> NombreApellidosRossmery = new ArrayList<>();
        ArrayList<String> NombreApellidosRambo = new ArrayList<>();

        NombreApellidosAlberto.add(alberto.getNombre());
        NombreApellidosAlberto.add(alberto.getApellidoPaterno());
        NombreApellidosAlberto.add(alberto.getApellidoMaterno());

        NombreApellidosFabian.add(fabian.getNombre());
        NombreApellidosFabian.add(fabian.getApellidoPaterno());
        NombreApellidosFabian.add(fabian.getApellidoMaterno());

        NombreApellidosRosa.add(rosa.getNombre());
        NombreApellidosRosa.add(rosa.getApellidoPaterno());
        NombreApellidosRosa.add(rosa.getApellidoMaterno());

        NombreApellidosMiriam.add(miriam.getNombre());
        NombreApellidosMiriam.add(miriam.getApellidoPaterno());
        NombreApellidosMiriam.add(miriam.getApellidoMaterno());

        NombreApellidosRamiro.add(ramiro.getNombre());
        NombreApellidosRamiro.add(ramiro.getApellidoPaterno());
        NombreApellidosRamiro.add(ramiro.getApellidoMaterno());

        NombreApellidosRossmery.add(rossmery.getNombre());
        NombreApellidosRossmery.add(rossmery.getApellidoPaterno());
        NombreApellidosRossmery.add(rossmery.getApellidoMaterno());

        NombreApellidosRambo.add(rambo.getNombre());
        NombreApellidosRambo.add(rambo.getApellidoPaterno());
        NombreApellidosRambo.add(rambo.getApellidoMaterno());

        // Alberto
        assertEquals("Alberto", NombreApellidosAlberto.get(0));
        assertEquals("Ramirez", NombreApellidosAlberto.get(1));
        assertEquals("Escobar", NombreApellidosAlberto.get(2));

        // Fabian
        assertEquals("Fabian", NombreApellidosFabian.get(0));
        assertEquals("Huanca", NombreApellidosFabian.get(1));
        assertEquals("Ramirez", NombreApellidosFabian.get(2));

        // Rosa
        assertEquals("Rosa", NombreApellidosRosa.get(0));
        assertEquals("Mamani", NombreApellidosRosa.get(1));
        assertEquals("Espinoza", NombreApellidosRosa.get(2));

        // Miriam
        assertEquals("Miriam", NombreApellidosMiriam.get(0));
        assertEquals("Espinoza", NombreApellidosMiriam.get(1));
        assertEquals("Lazarte", NombreApellidosMiriam.get(2));

        // Ramiro
        assertEquals("Ramiro", NombreApellidosRamiro.get(0));
        assertEquals("Arequipa", NombreApellidosRamiro.get(1));
        assertEquals("Camacho", NombreApellidosRamiro.get(2));

        // Rossmery
        assertEquals("Rossmery", NombreApellidosRossmery.get(0));
        assertEquals("Mejillones", NombreApellidosRossmery.get(1));
        assertEquals("Cameron", NombreApellidosRossmery.get(2));

        // Rambo
        assertEquals("Rambo", NombreApellidosRambo.get(0));
        assertEquals("Guerrero", NombreApellidosRambo.get(1));
        assertEquals("Hinojosa", NombreApellidosRambo.get(2));
    }

    @Test
    public void testID()
    {
        int idAlberto = alberto.getCarnetIdentidad();
        int idFabian = fabian.getCarnetIdentidad();
        int idRosa = rosa.getCarnetIdentidad();
        int idMiriam = miriam.getCarnetIdentidad();
        int idRamiro = ramiro.getCarnetIdentidad();
        int idRossmery = rossmery.getCarnetIdentidad();
        int idRambo = rambo.getCarnetIdentidad();

        assertEquals(92837128, idAlberto);
        assertEquals(28462847, idFabian);
        assertEquals(73829462, idRosa);
        assertEquals(93729462, idMiriam);
        assertEquals(46283648, idRamiro);
        assertEquals(47284728, idRossmery);
        assertEquals(74829472, idRambo);
    }

    @Test
    public void testNacionalidad()
    {
        String nacionalidadAlberto = alberto.getNacionalidad();
        String nacionalidadFabian = fabian.getNacionalidad();
        String nacionalidadRosa = rosa.getNacionalidad();
        String nacionalidadMiriam = miriam.getNacionalidad();
        String nacionalidadRamiro = ramiro.getNacionalidad();
        String nacionalidadRossmery = rossmery.getNacionalidad();
        String nacionalidadRambo = rambo.getNacionalidad();

        assertEquals("Colombia", nacionalidadAlberto);
        assertEquals("Paraguay", nacionalidadFabian);
        assertEquals("Colombia", nacionalidadRosa);
        assertEquals("Bolivia", nacionalidadMiriam);
        assertEquals("Colombia", nacionalidadRamiro);
        assertEquals("Bolivia", nacionalidadRossmery);
        assertEquals("Venezuela", nacionalidadRambo);
    }

    @Test
    public void testFechaNacimiento()
    {
        ArrayList<Integer> fechaNacimientoAlberto = new ArrayList<>();
        ArrayList<Integer> fechaNacimientoFabian = new ArrayList<>();
        ArrayList<Integer> fechaNacimientoRosa = new ArrayList<>();
        ArrayList<Integer> fechaNacimientoMiriam = new ArrayList<>();
        ArrayList<Integer> fechaNacimientoRamiro = new ArrayList<>();
        ArrayList<Integer> fechaNacimientoRossmery = new ArrayList<>();
        ArrayList<Integer> fechaNacimientoRambo = new ArrayList<>();

        fechaNacimientoAlberto.add(alberto.getDiaNacimiento());
        fechaNacimientoAlberto.add(alberto.getMesNacimiento());
        fechaNacimientoAlberto.add(alberto.getAnoNacimiento());

        fechaNacimientoFabian.add(fabian.getDiaNacimiento());
        fechaNacimientoFabian.add(fabian.getMesNacimiento());
        fechaNacimientoFabian.add(fabian.getAnoNacimiento());

        fechaNacimientoRosa.add(rosa.getDiaNacimiento());
        fechaNacimientoRosa.add(rosa.getMesNacimiento());
        fechaNacimientoRosa.add(rosa.getAnoNacimiento());

        fechaNacimientoMiriam.add(miriam.getDiaNacimiento());
        fechaNacimientoMiriam.add(miriam.getMesNacimiento());
        fechaNacimientoMiriam.add(miriam.getAnoNacimiento());

        fechaNacimientoRamiro.add(ramiro.getDiaNacimiento());
        fechaNacimientoRamiro.add(ramiro.getMesNacimiento());
        fechaNacimientoRamiro.add(ramiro.getAnoNacimiento());

        fechaNacimientoRossmery.add(rossmery.getDiaNacimiento());
        fechaNacimientoRossmery.add(rossmery.getMesNacimiento());
        fechaNacimientoRossmery.add(rossmery.getAnoNacimiento());

        fechaNacimientoRambo.add(rambo.getDiaNacimiento());
        fechaNacimientoRambo.add(rambo.getMesNacimiento());
        fechaNacimientoRambo.add(rambo.getAnoNacimiento());

        //Alberto
        assertEquals("1", fechaNacimientoAlberto.get(0).toString());
        assertEquals("1", fechaNacimientoAlberto.get(1).toString());
        assertEquals("2000", fechaNacimientoAlberto.get(2).toString());

        //Fabian
        assertEquals("2", fechaNacimientoFabian.get(0).toString());
        assertEquals("2", fechaNacimientoFabian.get(1).toString());
        assertEquals("2000", fechaNacimientoFabian.get(2).toString());

        //Rosa
        assertEquals("3", fechaNacimientoRosa.get(0).toString());
        assertEquals("3", fechaNacimientoRosa.get(1).toString());
        assertEquals("2000", fechaNacimientoRosa.get(2).toString());

        //Miriam
        assertEquals("4", fechaNacimientoMiriam.get(0).toString());
        assertEquals("4", fechaNacimientoMiriam.get(1).toString());
        assertEquals("2000", fechaNacimientoMiriam.get(2).toString());

        //Ramiro
        assertEquals("5", fechaNacimientoRamiro.get(0).toString());
        assertEquals("5", fechaNacimientoRamiro.get(1).toString());
        assertEquals("2000", fechaNacimientoRamiro.get(2).toString());

        //Rossmery
        assertEquals("6", fechaNacimientoRossmery.get(0).toString());
        assertEquals("6", fechaNacimientoRossmery.get(1).toString());
        assertEquals("2000", fechaNacimientoRossmery.get(2).toString());

        //Rambo
        assertEquals("7", fechaNacimientoRambo.get(0).toString());
        assertEquals("7", fechaNacimientoRambo.get(1).toString());
        assertEquals("2000", fechaNacimientoRambo.get(2).toString());
    }

    @Test
    public void testSexo()
    {
        String sexoAlberto = alberto.getSexo();
        String sexoFabian = fabian.getSexo();
        String sexoRosa = rosa.getSexo();
        String sexoMiriam = miriam.getSexo();
        String sexoRamiro = ramiro.getSexo();
        String sexoRossmery = rossmery.getSexo();
        String sexoRambo = rambo.getSexo();

        assertEquals("Hombre", sexoAlberto);
        assertEquals("Hombre", sexoFabian);
        assertEquals("Mujer", sexoRosa);
        assertEquals("Mujer", sexoMiriam);
        assertEquals("Hombre", sexoRamiro);
        assertEquals("Mujer", sexoRossmery);
        assertEquals("Hombre", sexoRambo);
    }

}