package praxis.cl;

public class Taxi  extends Vehiculo{
   private int valorPasaje;


    public Taxi( String color, String patente,int valorPasaje){
        super(color,patente);
        this.valorPasaje=valorPasaje;

    }
    public int getValorPasaje() {
        return valorPasaje;
    }

    public void setValorPasaje(int valorPasaje) {
        this.valorPasaje = valorPasaje;
    }
}
