public class TarjetaMadre {
  
    private String modelo;
    private String fabricante;
    private int bancosMemoria;
    private int bancosExpansion;
    private String nombreBios;
  
    public TarjetaMadre(String modelo, String fabricante, int bancosMemoria, int bancosExpansion, String nombreBios) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.bancosMemoria = bancosMemoria;
        this.bancosExpansion = bancosExpansion;
        this.nombreBios = nombreBios;
    }
    public String mostrarModelo() {
        return modelo;
    }
    public void cambiarModelo(String modelo) {
        this.modelo = modelo;
    }
    public void cargarPrograma(String programa){
        System.out.println("El programa " + programa + " se esta cargando.");
    }
    
}
