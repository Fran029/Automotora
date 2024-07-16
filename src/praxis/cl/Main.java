package praxis.cl;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("18956789-0","Gabriel Zamora",25);
        Vendedor vendedor= new Vendedor("Samuel","14765567-4",56,"Las Fresas 890");
        Vehiculo vehiculo= new Vehiculo("verde","yu8909yu");
        //metodo pagarPasaje de la clase taxi


        Taxi taxi1= new Taxi("negro","TT6066",1200);
        taxi1.pagarPasaje(5000);

        // metodo de la clase Bus

        Bus bus1= new Bus("KW0404NT","verde",40);
        bus1.asientosDisponbles();
        System.out.println(bus1.getCantidadDeAsientos());

        //Metodo de la clase MiniBus

        MiniBus miniBus1= new MiniBus("Azul","JD8080KL",20,"Escolar");
        miniBus1.imprimeBus();

        //Metodo de la clase tienda

        Tienda tienda1= new Tienda(vendedor, vehiculo,5,"La Praxis");

// falla el return del stock

    }




}