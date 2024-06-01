import java.util.Scanner;

public class Taxi extends Vehiculo{

    private int valorPasaje;

    public Taxi(){

    }

    public Taxi(int valorPasaje) {
        this.valorPasaje = valorPasaje;
    }

    public Taxi(String color, String patente, int valorPasaje) {
        super(color, patente);
        this.valorPasaje = valorPasaje;
    }

    public int getValorPasaje() {
        return valorPasaje;
    }

    public void setValorPasaje(int valorPasaje) {
        this.valorPasaje = valorPasaje;
    }
    public void pagarPasaje() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese monto a pagar\n");
        int pago = sc.nextInt();

        if (pago >= getValorPasaje()){
            int vuelto= pago-getValorPasaje();
            System.out.printf("su vuelto es %d\n", vuelto);
        } else {
            System.out.printf("el valor pasaje es %d\n", getValorPasaje());
        }
    }

}
