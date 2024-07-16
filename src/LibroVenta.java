public class LibroVenta {

    private String nombreVenta;
    private String  fechaVenta;

    public LibroVenta(String nombreVenta,String fechaVenta){
        this.nombreVenta=nombreVenta;
        this.fechaVenta=fechaVenta;
    }

    public String getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public String getNombreVenta() {
        return nombreVenta;
    }

    public void setNombreVenta(String nombreVenta) {
        this.nombreVenta = nombreVenta;
    }
}
