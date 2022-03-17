import java.util.ArrayList;

public class AdministradorAsientos {
   ArrayList<Asiento> asientosAdministrados;

   public AdministradorAsientos(ArrayList<Asiento> listaAsientos){
       this.asientosAdministrados = listaAsientos;
   }

   public String getListaAsientosDisponibles(){
       String imprimirAsientosDisponibles = "";
       for (int i = 0; i < asientosAdministrados.size(); i++){
           if(asientosAdministrados.get(i).getEstadoAsiento().equals(Estado.LIBRE)) {
               imprimirAsientosDisponibles += asientosAdministrados.get(i).getUbicacion() + " ";
           }

       }
       return imprimirAsientosDisponibles;
   }

   public void reservarAsiento(int columna, char fila){
       for(int i = 0; i < asientosAdministrados.size(); i++){
          if (asientosAdministrados.get(i).getUbicacionFila() == fila && asientosAdministrados.get(i).getUbicacionColumna() == columna){
              if(asientosAdministrados.get(i).getEstadoAsiento().equals(Estado.LIBRE)){
                  asientosAdministrados.get(i).setEstadoAsiento(Estado.OCUPADO);
              }
          }
       }
   }



}
