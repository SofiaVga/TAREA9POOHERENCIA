public class Main {
    public static void main(String[] args)
    {
        //vehículo
        System.out.println("vehiculo");
        Vehiculo vehiculo = new Vehiculo("NISSAN", "CAMIONETA",18);
        vehiculo.apagar();
        vehiculo.encender();
        //Automovil
        System.out.println("automovil");
        Automovil automovil= new Automovil("TOYOTA", "COCHE", 21,"SUPRA", 2019, 120000);
        automovil.encender();
        automovil.apagar();
        automovil.calidad();
        automovil.mostrarDatos();
        //Taxi
        System.out.println("Taxi");
        Taxi taxi = new Taxi("CHEVROLETTE","CAMIONETA","AVEO",2016, 99561, "BDS412AJ", "JAHIR SILVA", 5);
        taxi.encender();
        taxi.apagar();
        taxi.mostrarDatos();
        taxi.calidad();
        taxi.mostrarEficiencia();
        taxi.solicitarViaje();

    }

}