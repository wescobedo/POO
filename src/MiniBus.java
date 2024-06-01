public class MiniBus extends Bus {
    public String tipoViaje;


    public MiniBus() {
    }

    public MiniBus(String tipoViaje) {
        this.tipoViaje = tipoViaje;
    }

    public MiniBus(int cantidadDeAsientos, String tipoViaje) {

        super(cantidadDeAsientos);
        this.tipoViaje = tipoViaje;
    }

    public MiniBus(String color, String patente, int cantidadDeAsientos, String tipoViaje) {
        super(color, patente, cantidadDeAsientos);
        this.tipoViaje = tipoViaje;
    }

    public String getTipoViaje() {
        return tipoViaje;
    }

    public void setTipoViaje(String tipoViaje) {
        this.tipoViaje = tipoViaje;
    }

    public void imprimeBus() {
               System.out.println("MiniBus{" +
                "color='" + getColor() + '\'' +
                ", patente='" + getPatente() + '\''+
                ", cantidad de asientos='" + getCantidadDeAsientos() + '\'' +
                ", tipo de viaje='"+ getTipoViaje() +
                "'}");
    }

}
