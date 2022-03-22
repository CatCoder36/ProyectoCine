import Persona.Cliente;
import Persona.Empleado;
import Persona.AreaTrabajo;
import org.junit.Assert;
import org.junit.Test;

public class TestPersona {

    @Test
    public void TestCliente(){
        Cliente cliente1 = new Cliente("Denis Jorge", "Gandarillas", "Delgado", 9865321, "Boliviano", 10, 05, 2004, "Masculino");

        Assert.assertEquals("NORMAL\nEDAD: 17", cliente1.verificacionEdad());

        Assert.assertEquals("NOMBRE: Denis Jorge Gandarillas Delgado\nCARNET IDENTIDAD: 9865321\nNACIONALIDAD: Boliviano\nFECHA NACIMIENTO: 10/5/2004\nGENERO: Masculino\nCLASIFICACION: NORMAL\nEDAD: 17", cliente1.toString(cliente1));
    }

    @Test
    public void TestEmpleado(){
        Empleado empleado1 = new Empleado("Andres", "Meneses", "Padilla", 9078456, "Argentino", 20, 11, 1983, "Masculino", AreaTrabajo.SALAS);

        Assert.assertEquals("Apto/a por ley", empleado1.verificarEdad());

        Assert.assertEquals("Encargado/a de acomodar a los clientes en sus asientos asignados y administrar que ningun cliente incomode a los demas", empleado1.funcionArea());

        Assert.assertEquals("NOMBRE: Andres Meneses Padilla\nCARNET IDENTIDAD: 9078456\nNACIONALIDAD: Argentino\nFECHA NACIMIENTO: 20/11/1983\nGENERO: Masculino\nDISPONIBILIDAD PARA TRABAJAR: Apto/a por ley\n AREA DE TRABAJO: SALAS\n FUNCION: Encargado/a de acomodar a los clientes en sus asientos asignados y administrar que ningun cliente incomode a los demas", empleado1.toString(empleado1));
    }

}