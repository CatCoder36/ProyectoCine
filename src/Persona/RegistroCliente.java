package Persona;
import Util.Util;

import java.util.ArrayList;

public class RegistroCliente {
    //Lista de clientes registrados
    ArrayList<Cliente> listaClientes = new ArrayList<>();

    public void añadirCliente(Cliente cliente){
        listaClientes.add(cliente);
    }
    //Metodo para verificar si el usuario es un cliente registrado
    public boolean verificandoCliente(int carnetCliente){
        for (int clienteActual = 0; clienteActual < listaClientes.size(); clienteActual++){
            if(listaClientes.get(clienteActual).getCarnetIdentidad() == carnetCliente){
                return true;
            }
        }
        return false;
    }
    //Nos permite saber que clientes tenemos en el Cine
    public String mostrarListadeClientes(){
        String clientes = "";
        for (Cliente mostrarClientes: listaClientes){
            clientes = clientes + Util.lineaCorta + "\n" + mostrarClientes.toString() + "\n";
        }
        return clientes;
    }
    //Buscamos un la informacion de un cliente por su nombre y por su carnet
    public String mostrarClienteEspecifico(String nombreCliente, int carnetIdentidad){
        String may = nombreCliente.toUpperCase();
        String datosCliente = "";
        for (Cliente datoCliente: listaClientes){
            if (may.equals(datoCliente.getNombre()) || carnetIdentidad == datoCliente.getCarnetIdentidad()){
                datosCliente = Util.lineaCorta + "\n" + "CLIENTE " + datoCliente.getNombre() + " |\n" + Util.lineaCorta + "\n" + datoCliente;
            }
        }
        return datosCliente;
    }

    public int  getNumeroClientes(){
        return listaClientes.size();
    }
}
