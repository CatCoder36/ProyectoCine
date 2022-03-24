package Cine;


import Persona.Cliente;
import Persona.Persona;
import Utils.Util;

import java.util.ArrayList;


public class Boleteria {

    static ArrayList<Cliente> listaclientes;
    private String listaAsientos = "";
    static String metodoPagoCliente;
    static String QR;

    public Boleteria(){
        listaclientes = new ArrayList<>();
    }

    public void getListaAsientosDisponibles(String datoEsperado){
        listaAsientos = listaAsientos + datoEsperado;
    }

    public void getListaAsientosSinReservar(String datoEsperado){
        listaAsientos = "";
        listaAsientos = listaAsientos + datoEsperado;
    }

    public String mostrarAsientosDisponibles(){
        return listaAsientos;
    }

    /*public void addCliente(Cliente cliente){
        listaclientes.add(cliente);
    }*/

    //ESTE CODIFO FUÉ TRASLADADO A REGISTROCLIENTES
    /*public String mostrarListadeClientes(){
        String clientes = "";
        for (Cliente mostrarClientes: listaclientes){
            clientes = clientes + Util.lineaCorta + "\n" + mostrarClientes.toString() + "\n";
        }
        return clientes;
    }

    public String mostrarClienteEspecifico(String nombreCliente, int carnetIdentidad){
        String may = nombreCliente.toUpperCase();
        String datosCliente = "";
        for (Persona datoCliente: listaclientes){
            if (may.equals(datoCliente.getNombre()) || carnetIdentidad == datoCliente.getCarnetIdentidad()){
                datosCliente = Util.lineaCorta + "\n" + "CLIENTE " + datoCliente.getNombre() + " |\n" + Util.lineaCorta + "\n" + datoCliente;
            }
        }
        return datosCliente;
    }*/




    public void definirPrecioPelicula() {
    }

    public void generadorBoleto() {
    }

    public void descuentoPrecio() {
    }

    public void addMetodoPago(String metodoPago)
    {
        switch (metodoPago)
        {
            case "QR":
                metodoPagoCliente = metodoPago;
                QR = "__ ______ __ " +
                        "|__| ______ |__|"+
                        "_|____|  __| ___"+
                        "__ |      |_____"+
                        "|__ | ____|  |__|"+
                        "|__ | ____|  |__|";
            case "Tarjeta De Credito":
                metodoPagoCliente = metodoPago;

            case "Tarjeta de Debito":
                metodoPagoCliente = metodoPago;

            case "Efectivo":
                metodoPagoCliente = metodoPago;
        }
    }


    public String mostrarMetodoPago() {
        if(metodoPagoCliente == "QR")
        {
            return "El método de pago del cliente es por: " + metodoPagoCliente + "\n" + "y su c+odigo es QR :\n" + QR;
        }
        else
        {
            return "El método de pago del cliente es por: " + metodoPagoCliente;
        }
    }


}
