import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;
import java.util.ArrayList;


public class TestBanco {


    // Instancias de Banco
    Banco banco1 = new Banco("Cine OOP", 159, "01/01/2020",1500,true,
            "Banco Elefante");
    Banco banco2 = new Banco("Cine OOP", 259, "01/01/2020",1500,false,
            "Banco Visa");
    Banco banco3 = new Banco("Cine OOP", 359, "01/01/2020",1500,true,
            "Banco Union");

    ArrayList<Banco> bancosAfiliados = new ArrayList<>();

    @Test
    public void verificarCantidadBancosAfiliados()
    {
        bancosAfiliados.add(banco1);
        bancosAfiliados.add(banco2);
        bancosAfiliados.add(banco3);
        assertEquals(3, bancosAfiliados.size());
    }

    @Test
    public void verificarUsernameBancoAfiliado()
    {
        String usernameBanco1 = banco1.getUsername();
        String usernameBanco2 = banco2.getUsername();
        String usernameBanco3 = banco3.getUsername();

        assertEquals("Cine OOP", usernameBanco1);
        assertEquals("Cine OOP", usernameBanco2);
        assertEquals("Cine OOP", usernameBanco3);
    }

    @Test
    public void verificarClaveSecretaBancoAfiliado()
    {
        int passwordBanco1 = banco1.getPassword();
        int passwordBanco2 = banco2.getPassword();
        int passwordBanco3 = banco3.getPassword();

        assertEquals(159, passwordBanco1);
        assertEquals(259, passwordBanco2);
        assertEquals(359, passwordBanco3);
    }

    @Test
    public void verificarFechaAfiliacion()
    {
        String fechaAfiliacionBanco1 = banco1.getFechaAfiliacion();
        String fechaAfiliacionBanco2 = banco2.getFechaAfiliacion();
        String fechaAfiliacionBanco3 = banco3.getFechaAfiliacion();

        assertEquals("01/01/2020", fechaAfiliacionBanco1);
        assertEquals("01/01/2020", fechaAfiliacionBanco2);
        assertEquals("01/01/2020", fechaAfiliacionBanco3);
    }

    @Test
    public void verificarBancaWeb() // Si es permitido las transacciones internacionales
    {
        boolean bancaWebBanco1 = banco1.getBancoWeb();
        boolean bancaWebBanco2 = banco2.getBancoWeb();
        boolean bancaWebBanco3 = banco3.getBancoWeb();

        assertEquals(true, bancaWebBanco1);
        assertEquals(false, bancaWebBanco2);
        assertEquals(true, bancaWebBanco3);
    }

    @Test
    public void verificarNombreBancoAfiliado()
    {
        String nombreAfiliadoBanco1 = banco1.getNombreBancoAfiliado();
        String nombreAfiliadoBanco2 = banco2.getNombreBancoAfiliado();
        String nombreAfiliadoBanco3 = banco3.getNombreBancoAfiliado();

        assertEquals("Banco Elefante", nombreAfiliadoBanco1);
        assertEquals("Banco Visa", nombreAfiliadoBanco2);
        assertEquals("Banco Union", nombreAfiliadoBanco3);
    }

}
