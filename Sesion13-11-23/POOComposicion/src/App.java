
public class App {

    public static void main(String[] args) throws Exception {

        TarjetaMadre miTarjetaMadre =new TarjetaMadre("Gigabyte 750", "Gigabyte", 4, 3, "Pheonix");

        Resolucion resolucionMonitor = new Resolucion(1440, 900);

        Monitor miMonitor = new Monitor("ThinkVision", "Lenovo", 15.3, resolucionMonitor);

        Dimensiones dimensionesCASE = new Dimensiones(173, 425, 275);

        Case miCase = new Case("AL-K34", "Aluna", "Platinium", dimensionesCASE);
        
        Computadora miPC = new Computadora(miCase, miMonitor, miTarjetaMadre);

        miPC.mostrarElCase().presionarBotonEncendido();
        miPC.mostrarMonitor().dibujarPixel(5, 100, "Naranja");
        miPC.mostrarTarjetaMadre().cargarPrograma("Visual Studio Code");
    }
}
