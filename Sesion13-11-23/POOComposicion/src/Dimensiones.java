public class Dimensiones {
  
    private int anchura;
    private int altura;
    private int profundidad;
  
    public Dimensiones(int anchura, int altura, int profundidad) {
        this.anchura = anchura;
        this.altura = altura;
        this.profundidad = profundidad;
    }
    public int mostrarAnchura() {
        return anchura;
    }
    public void cambiarAnchura(int anchura) {
        this.anchura = anchura;
    }
    public int mostrarAltura() {
        return altura;
    }
    public void cambiarAltura(int altura) {
        this.altura = altura;
    }
    public int mostrarProfundidad() {
        return profundidad;
    }
    public void cambiarProfundidad(int profundidad) {
        this.profundidad = profundidad;
    }

    
}
