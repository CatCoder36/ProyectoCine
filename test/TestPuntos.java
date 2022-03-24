import Persona.AdministrarPuntos;
import org.junit.Assert;
import org.junit.Test;

public class TestPuntos {

    @Test
    public void TestPuntos(){
        AdministrarPuntos a = new AdministrarPuntos();
        Assert.assertEquals("PUNTOS: 50", a.aumentarPuntos(40));
        Assert.assertEquals("PUNTOS: 10", a.disminuirPuntos(40));
    }

}
