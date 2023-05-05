import java.util.Scanner;
public class Automovil extends Vehiculo{
    protected String modelo;
    protected int anio;
    protected int precio;

    public Automovil(String marca, String tipo, int caballosDeFuerza, String modelo, int anio, int precio) {
        super(marca, tipo, caballosDeFuerza);
        this.modelo = modelo;
        this.anio = anio;
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "modelo='" + modelo + '\'' +
                ", anio=" + anio +
                ", precio=" + precio +
                ", marca='" + marca + '\'' +
                ", tipo='" + tipo + '\'' +
                ", caballosDeFuerza=" + caballosDeFuerza +
                '}';
    }

    @Override
    public void encender() {
        super.encender();
    }

    @Override
    public void apagar() {
        super.apagar();
    }

    public void mostrarDatos(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el modelo de su automovil: ");
        String opcion = sc.nextLine();
        System.out.println("el modelo es:" + modelo);


    }
    public void calidad(){
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuanto le costo su automovil?: ");
        int precio = sc.nextInt();
        if (precio <= 100000)
            System.out.println("su automovil no es de buena calidad o es usado");
        else
            System.out.println("su automovil es de buena calidad");

    }

}
