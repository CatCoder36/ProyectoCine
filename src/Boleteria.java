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
        for (Cliente datoCliente: listaclientes){
            if (may.equals(datoCliente.getNombreCliente()) || carnetIdentidad == datoCliente.getCarnetIdentidadCliente()){
                datosCliente = Util.lineaCorta + "\n" + "CLIENTE " + datoCliente.getNombreCliente() + " |\n" + Util.lineaCorta + "\n" + datoCliente;
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
