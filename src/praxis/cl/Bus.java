package praxis.cl;

public class Bus extends Vehiculo  {
   private  int cantidadDeAsientos;

    public Bus(String patente, String color,int cantidadDeAsientos){
        super(color,patente);
        this.cantidadDeAsientos=cantidadDeAsientos;
    }

    public int getCantidadDeAsientos() {
        return cantidadDeAsientos;
    }

    public void setCantidadDeAsientos(int cantidadDeAsientos) {
        this.cantidadDeAsientos = cantidadDeAsientos;
    }
}
