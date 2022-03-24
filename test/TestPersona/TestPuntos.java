package TestPersona;

import Persona.AdministrarPuntos;
import org.junit.Assert;
import org.junit.Test;

public class TestPuntos {
    //TEST
    @Test
    public void TestPuntos(){
        AdministrarPuntos a = new AdministrarPuntos();
        Assert.assertEquals("PUNTOS: 176", a.aumentarPuntos(50, 0.12, 4));
        Assert.assertEquals("PUNTOS: 136", a.disminuirPuntos(40));
    }

}