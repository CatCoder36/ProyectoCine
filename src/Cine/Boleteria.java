package Cine;
import Util.Util;

import Persona.Cliente;
import Persona.Persona;


import java.util.ArrayList;


public class Boleteria {

    private int D2;
    private int D3;
    private String diaDeLaSemana;
    private String banco;
    private int menores10;
    static ArrayList<Cliente> listaclientes;
    private String listaAsientos = "";
    static String metodoPagoCliente;
    static String QR;

    public void establerDescuentoMenores10(int descuento){

    }

    public void establecerPrecios(int d2, int d3){
        this.D2 = d2;
        this.D3 = d3;
    }


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

    public void definirPrecioPelicula() {
    }

    public void generadorBoleto() {
    }

    public void descuentoPrecio() {
    }

    public void addMetodoPago(String metodoPago, String diaSemana){
        this.diaDeLaSemana = diaSemana;
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
