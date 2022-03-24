import Cine.*;
import Persona.Cliente;
import Persona.Persona;
import Salas.AdministradorAsientos;
import Salas.Sala;
import Utils.Util;
import org.junit.Test;
//import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;
//import static org.testng.AssertJUnit.assertEquals;


/*
public class TestBoleteria {

    @Test
    public void testMostrarBoleteria(){
        Sala salaPrueba1 = new Sala(24,"A",8,12);
        Boleteria boleteria = new Boleteria();

        //  MOSTRAR LISTA DE ASIENTOS DISPONIBLES AL CLIENTE

        boleteria.getListaAsientosDisponibles(salaPrueba1.administradorAsientos.getListaAsientosDisponibles());
        boleteria.mostrarAsientosDisponibles();
        //System.out.println(boleteria.mostrarAsientosDisponibles());
        assertEquals("1A 2A 3A 4A 5A 6A 7A 8A 9A 10A 11A 12A 1B 2B 3B 4B 5B 6B 7B 8B 9B 10B 11B 12B ", boleteria.mostrarAsientosDisponibles());



        //  ACTUALIZAR LISTA DE ASIENTOS DISPONIBLES UNA VEZ RESERVADA

        salaPrueba1.administradorAsientos.reservarAsiento(2,'A');
        salaPrueba1.administradorAsientos.reservarAsiento(12,'B');
        salaPrueba1.administradorAsientos.reservarAsiento(8,'B');
        salaPrueba1.administradorAsientos.reservarAsiento(7,'A');
        salaPrueba1.administradorAsientos.reservarAsiento(11,'A');
        boleteria.getListaAsientosSinReservar(salaPrueba1.administradorAsientos.getListaAsientosDisponibles());
        boleteria.mostrarAsientosDisponibles();
        //System.out.println(boleteria.mostrarAsientosDisponibles());
        assertEquals("1A 3A 4A 5A 6A 8A 9A 10A 12A 1B 2B 3B 4B 5B 6B 7B 9B 10B 11B ", boleteria.mostrarAsientosDisponibles());



        //  REGISTRAR AL CLIENTE

        Cliente cliente1 = new Cliente("Denis Jorge", "Gandarillas", "Delgado", 9865321, "Boliviano", 10, 05, 2004, "Masculino"); 
        boleteria.addCliente(cliente1);
        boleteria.addCliente(cliente2);
        boleteria.addCliente(cliente3);
        boleteria.addCliente(cliente4);
        boleteria.addCliente(cliente5);

        //  MOSTRAR LA LISTA DE TODOS NUESTROS CLIENTES REGISTRADOS

        boleteria.mostrarListadeClientes();
        assertEquals(Util.lineaCorta + "\n" +
                "NOMBRE: JUAN ROCABADO\n" +
                "PUNTOS ACUMULADOS: 0\n" +
                "CARNET IDENTIDDAD: 9865321\n" +
                "NACIONALIDAD: Bolivia\n" +
                "FECHA NACIMIENTO: 10/5/2004\n" +
                Util.lineaCorta + "\n" +
                "NOMBRE: PEDRO SANCHEZ\n" +
                "PUNTOS ACUMULADOS: 0\n" +
                "CARNET IDENTIDDAD: 1564654\n" +
                "NACIONALIDAD: Bolivia\n" +
                "FECHA NACIMIENTO: 19/3/1992\n" +
                Util.lineaCorta + "\n" +
                "NOMBRE: ELIAS MONTERREY\n" +
                "PUNTOS ACUMULADOS: 0\n" +
                "CARNET IDENTIDDAD: 8153133\n" +
                "NACIONALIDAD: Argentina\n" +
                "FECHA NACIMIENTO: 29/12/2002\n" +
                Util.lineaCorta + "\n" +
                "NOMBRE: MATIAS HIDALGO\n" +
                "PUNTOS ACUMULADOS: 0\n" +
                "CARNET IDENTIDDAD: 75211656\n" +
                "NACIONALIDAD: Bolivia\n" +
                "FECHA NACIMIENTO: 5/11/1998\n" +
                Util.lineaCorta + "\n" +
                "NOMBRE: ANTONIO BANDERAS\n" +
                "PUNTOS ACUMULADOS: 0\n" +
                "CARNET IDENTIDDAD: 91516556\n" +
                "NACIONALIDAD: Bolivia\n" +
                "FECHA NACIMIENTO: 1/8/2011\n", boleteria.mostrarListadeClientes());



        //  MOSTRAR CLIENTE POR EL NOMBRE Y SU CARNET

        boleteria.mostrarClienteEspecifico("matias hidalgo", 75211656);
        cliente4.addPuntos(60);
        cliente4.addPuntos(40);
        cliente4.addPuntos(20);
        assertEquals(Util.lineaCorta + "\n" +
                "CLIENTE MATIAS HIDALGO |\n" +
                Util.lineaCorta + "\n" +
                "NOMBRE: MATIAS HIDALGO\n" +
                "PUNTOS ACUMULADOS: 125\n" +
                "CARNET IDENTIDDAD: 75211656\n" +
                "NACIONALIDAD: Bolivia\n" +
                "FECHA NACIMIENTO: 5/11/1998", boleteria.mostrarClienteEspecifico("matias hidalgo", 75211656));


    }
}
*/
