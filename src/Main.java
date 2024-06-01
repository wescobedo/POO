
public class Main {
    public static void main(String[] args) {

        Taxi t = new Taxi(1000);
        t.pagarPasaje();

        Bus b = new Bus("verde", "JHLD45", 60);
        System.out.println( b.asientosDisponibles());

        MiniBus mb = new MiniBus("rojo", "LDBH43",24, "corto");
        mb.imprimeBus();

        Tienda ti = new Tienda( 34 );
        ti.existeStock();


    }
}