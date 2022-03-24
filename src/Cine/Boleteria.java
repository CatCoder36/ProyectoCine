package Cine;


import Persona.Cliente;
import Persona.Persona;
import Utils.Util;

import java.util.ArrayList;


public class Boleteria {

    static ArrayList<Cliente> listaclientes;
    private String listaAsientos = "";

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

    public void addCliente(Cliente cliente){
        listaclientes.add(cliente);
    }

    public String mostrarListadeClientes(){
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
    }




    public void definirPrecioPelicula() {
    }

    public void generadorBoleto() {
    }

    public void descuentoPrecio() {
    }

    public void addMetodoPago() {
    }

    public void mostrarMetodoPago() {
    }

}
