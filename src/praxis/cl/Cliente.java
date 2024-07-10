package praxis.cl;

public class Cliente extends Persona {

    private int edad2;

    public Cliente(String rut, String nombre, int edad, int edad2){
        super(rut,nombre, edad);
        edad=edad2;
    }

    public int getEdad2() {
        return edad2;
    }

    public void setEdad2(int edad2) {
        this.edad2 = edad2;
    }
}

