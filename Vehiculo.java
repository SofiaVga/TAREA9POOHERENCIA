public class Vehiculo {
    protected String marca;
    protected String tipo;
    protected int caballosDeFuerza;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String tipo, int caballosDeFuerza) {
        this.marca = marca;
        this.tipo = tipo;
        this.caballosDeFuerza = caballosDeFuerza;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int CaballosDeFuerza() {
        return caballosDeFuerza;
    }

    public void setCaballosDeFuerza(int caballosDeFuerza) {
        this.caballosDeFuerza = caballosDeFuerza;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", tipo='" + tipo + '\'' +
                ", caballosDeFuerza=" + caballosDeFuerza +
                '}';
    }
    public void encender(){
        System.out.println("El vehículo se ha encendido");
    }
    public void apagar(){
        System.out.println("El vehículo se ha apagado");
    }
}
