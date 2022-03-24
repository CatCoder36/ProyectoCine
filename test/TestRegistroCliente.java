import Persona.Persona;
import Persona.Cliente;
import Persona.RegistroCliente;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class TestRegistroCliente {

    @Test

    public void testRegistroClientes(){
        Cliente cliente = new Cliente("Jorge","Heredia","Ramirez",13345445,"Boliviano",24,4,2002,"Varon" );
        RegistroCliente registroCliente = new RegistroCliente();
        registroCliente.añadirCliente(cliente);
        int numeroCLientes = registroCliente.getNumeroClientes();

        assertEquals(1,numeroCLientes);
        //Al añadir un cliente el numero esperado de clientes en el registro es 1

        //Verificando si un cliente esta registrado
        boolean clienteExistene = registroCliente.verificandoCliente(cliente.getCarnetIdentidad());

        assertEquals(true, clienteExistene);

        Cliente cliente2 = new Cliente("Jauna","Rivera","Candia",445454,"Peruana",4,5,1978,"Mujer");

        boolean clienteExistente2 = registroCliente.verificandoCliente(cliente2.getCarnetIdentidad());

        assertEquals(false, clienteExistente2);
    }
}
