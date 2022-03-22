import java.util.ArrayList;
import java.util.List;

public class Sala {
    private int cantidadAsientos;
    private String codigoSala;
    private int capacidadFila;
    private int capacidadColumna;
    private ArrayList <Asiento> listaAsientos;
    AdministradorAsientos administradorAsientos;
    ArrayList <String> idFila;
    ArrayList <String> idColumna;

    public Sala(int cantidadAsientos, String codigoSala, int capacidadFila, int capacidadColumna){
        this.cantidadAsientos = cantidadAsientos;
        this.codigoSala = codigoSala;
        this.capacidadFila = capacidadFila;
        this.capacidadColumna = capacidadColumna;
        listaAsientos = new ArrayList<>();

        generandoAsientos();
        administradorAsientos = new AdministradorAsientos(listaAsientos);


    }

    public int getNumeroDeAsientos(){
        return listaAsientos.size();
    }

    //Gestion de asientos ocupados y libres
    public void gestionAsientosSala(){
        //TODO


    }
    //Se generan los asientos en la clase para asignarlas una ubicacion de manera automatica
    private void generandoAsientos(){

        char ubicacionFila;
        int ubicacionColumna;
        int contadorFilasDisponibles = 0;
        int asciiValor = 65; //65 es A en el sistema ascii

        for (int i = 0; i< cantidadAsientos;){
            ubicacionColumna = 1;
            ubicacionFila = (char) (contadorFilasDisponibles+asciiValor);
            contadorFilasDisponibles++;

            for( int h = 0; h < capacidadColumna; h++ ){

                Asiento asiento = new Asiento(ubicacionFila, ubicacionColumna);
                ubicacionColumna++;

                listaAsientos.add(asiento);
                i++;
                if(i == cantidadAsientos){
                    break;
                }

            }

        }

    }

    public String imprimirListaAsientos(){
        String imprimirLista = "LISTA ASIENTOS: \n";
        String ubicacionAsiento;

        for(int i = 0; i < listaAsientos.size(); i++){
            ubicacionAsiento = listaAsientos.get(i).getUbicacion()+" ";
            imprimirLista += ubicacionAsiento;

        }


        return  imprimirLista;
    }

    public ArrayList<Asiento> getListaAsientos(){
        return listaAsientos;
    }





}
