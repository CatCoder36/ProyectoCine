import java.util.ArrayList;

public class Banco {

    public static String username;
    public int claveSecreta;
    public String fechaAfiliacion;
    public int montoInicial;
    private boolean bancoWeb;
    public String nombreBancoAfiiado;
//    ArrayList<Integer> fechaAfiliacion;

    ArrayList<String> listaBancosDisponibles; // nombre de tarjetas de crédito
    int operacionesRealizadas; // contador
    int gananciaBruta;
    int gananciaTotal;
    int saldoTotal;
    double impuestos = 0.13;


    // Constructor (Creando nuestro banco afiliado)
    public Banco(String username,int claveSecreta, String fechaAfiliacion, int montoInicial, boolean bancoWeb,
                 String nombreBancoAfiiado)
    {
        this.username = username;
        this.claveSecreta = claveSecreta;
        this.fechaAfiliacion = fechaAfiliacion;
        this.montoInicial = montoInicial;
        this.bancoWeb = bancoWeb;
        this.nombreBancoAfiiado = nombreBancoAfiiado;
    }

    // Métodos

    //Caja
    public void addListaBancosDisponibles()
    {
        listaBancosDisponibles.add("Elefante");
        listaBancosDisponibles.add("BCP");
        listaBancosDisponibles.add("Banco Sol");
        listaBancosDisponibles.add("Banco Fácil");
        listaBancosDisponibles.add("Banco Visa");
    }

    public boolean verificarListaBancosDisponibles(String nombreBanco) // ***
    {
        boolean verificador = true;
        for(int i = 0; i <= listaBancosDisponibles.size(); i++)
        {
            if (nombreBanco == listaBancosDisponibles.get(i))
            {
                verificador = true;
            }
            else
            {
                verificador = false;
            }
        }
        return verificador;
    }

    public int obtenerGananciaBruta(int precioPelicula) // ***
    {
        gananciaBruta += precioPelicula;
        return gananciaBruta;
    }

    public int obtenerGananciaTotal(int precioPelicula) // ***
    {
        gananciaTotal += precioPelicula;
        double aplicacionImpuestos = gananciaTotal * impuestos;
        gananciaTotal -= aplicacionImpuestos;
        return gananciaTotal;
    }

    public boolean activarCuenta(String username, int claveSecreta) // ***
    {
        if(username == this.username && claveSecreta == this.claveSecreta)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public String depositar(int deposito) // ***
    {
        String ingresoIncorrecto = "Ingreso Incorrecto";
        String ingresoCorrecto = "Ingreso Correcto";
        if(deposito < 0)
        {
            return ingresoIncorrecto;
        }
        else
        {
            saldoTotal += deposito;
            this.operacionesRealizadas += 1;
            return ingresoCorrecto;
        }
    }

    public void retirar(int retiro) // *** // Devolver cambio
    {
        if(retiro > saldoTotal)
        {
            String respuestaSaldoDisponible = "No tiene ese saldo disponible";
            System.out.println(respuestaSaldoDisponible);
        }
        else
        {
            saldoTotal -= retiro;
            this.operacionesRealizadas += 1;
        }
    }

    @Override // Factura o Estado de cuenta // ***
    public String toString() {
        return "Banco{" +
                "fechaAfiliacion='" + fechaAfiliacion + '\'' +
                ", bancoWeb=" + bancoWeb +
                ", nombreBancoAfiiado='" + nombreBancoAfiiado + '\'' +
                ", operacionesRealizadas=" + operacionesRealizadas +
                ", gananciaBruta=" + gananciaBruta +
                ", gananciaTotal=" + gananciaTotal +
                ", saldoTotal=" + saldoTotal +
                '}';
    }

    public boolean getBancoWeb()
    {
        return bancoWeb;
    }

    public int getPassword()
    {
        return claveSecreta;
    }

    public String getFechaAfiliacion()
    {
        return fechaAfiliacion;
    }

    public String getUsername() {
        return username;
    }

    public String getNombreBancoAfiliado() {
        return nombreBancoAfiiado;
    }

}

