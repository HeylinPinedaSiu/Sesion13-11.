public class Resolucion {
  
    private int anchura;
   private int altura;
  
    public Resolucion(int anchura, int altura) {
        this.anchura = anchura;
        this.altura = altura;
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

    
}
