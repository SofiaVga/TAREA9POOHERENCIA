import java.util.Scanner;
public class Taxi extends Automovil {
    private String placa;
    private String nombreDelConductor;
    private int calificacion;

    public Taxi(String chevrolette, String camioneta, String aveo, int i, int i1, String bds412AJ, String jahirSilvaa, int i2);{
    }

    public Taxi(String marca, String tipo, int caballosDeFuerza, String modelo, int anio, int precio, String placa, String nombreDelConductor, int calificacion) {
        super(marca, tipo, caballosDeFuerza, modelo, anio, precio);
        this.placa = placa;
        this.nombreDelConductor = nombreDelConductor;
        this.calificacion = calificacion;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getNombreDelConductor() {
        return nombreDelConductor;
    }

    public void setNombreDelConductor(String nombreDelConductor) {
        this.nombreDelConductor = nombreDelConductor;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "placa='" + placa + '\'' +
                ", nombreDelConductor='" + nombreDelConductor + '\'' +
                ", calificacion=" + calificacion +
                ", modelo='" + modelo + '\'' +
                ", anio=" + anio +
                ", precio=" + precio +
                ", marca='" + marca + '\'' +
                ", tipo='" + tipo + '\'' +
                ", caballosDeFuerza=" + caballosDeFuerza +
                '}';
    }

    public void solicitarViaje(){
        Scanner sc = new Scanner(System.in);
        int tiempo=(int)Math.random()*5;
        System.out.println("A donde desea ir: ");
        String lugar = sc.nextLine();
        System.out.println("buscando conductor...");
        System.out.println("listo, el conductor: " + nombreDelConductor
                + " pasara por ti en : "
                + tiempo + " minutos");
    }
    public void mostrarEficiencia() {
        if (calificacion < 0 && calificacion > 5)
            System.out.println("ingrese un numero del 1 al 5");
        else {
            if (calificacion <= 2)
                System.out.println("es un mal conductor");
            if (calificacion == 3)
                System.out.println("es un conductor regular");
            if (calificacion >= 4)
                System.out.println("es un buen conductor");

        }
        System.out.println("su taxista es "+calificacion);
    }
}




