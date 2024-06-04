import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;



public class LibroVenta {
    private String nombreVenta;
    private String fechaVenta;

    public LibroVenta(String nombreVenta, String fechaVenta) {
        this.nombreVenta = nombreVenta;
        this.fechaVenta = fechaVenta;
    }

    public void guardarVenta(Cliente cliente, Vehiculo vehiculo){

        String nomdirectorio = "ficheros";

        String nomarchivo = this.nombreVenta;

        File directorio = new File("src/"+ nomdirectorio);
        File archivo = new File(directorio + "/" + nomarchivo + ".txt");

        if (!directorio.exists()) {
            if (directorio.mkdirs()) {
                System.out.printf("Directorio %s creado\n", directorio);
                    if (!archivo.exists()) {
                     try {
                         archivo.createNewFile();
                         System.out.printf("archivo %s creado\n", archivo);
                         FileWriter fileW = new FileWriter(archivo);
                         BufferedWriter bufferedWriter = new BufferedWriter(fileW);
                         String element = vehiculo.getPatente() + " " +
                                 cliente.getEdad() + " " +
                                 this.fechaVenta + " " +
                                 this.nombreVenta;
                         bufferedWriter.write(element);
                         bufferedWriter.newLine();
                         bufferedWriter.close();
                     } catch (IOException e) {
                         e.printStackTrace();
                     }
                 } else {
                     System.out.println("El archivo ya existe");
                 }
            } else {
                System.out.println("Error al crear directorio");
            }
        } else {
            System.out.println("El directorio ya existe");
        }
    }


    public String getNombreVenta() {
        return nombreVenta;
    }

    public void setNombreVenta(String nombreVenta) {
        this.nombreVenta = nombreVenta;
    }

    public String getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }
}
