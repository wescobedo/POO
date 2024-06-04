
public class Main {
    public static void main(String[] args) {

        Vehiculo v = new Vehiculo("verde", "JHLD45");
        Cliente c = new Cliente( "8.999.777-2", "Juan", 35);
        LibroVenta lv = new LibroVenta("vta_mazda", "01012024" );

        lv.guardarVenta(c, v);

    }
}