public class Computadora {

  //Esto es composicion
    private Case elCase; 
  
    //Esto es composicion
    private Monitor monitor;  
  
  //Esto es composicion
    private TarjetaMadre tarjetaMadre;  
    
    public Computadora(Case elCase, Monitor monitor, TarjetaMadre tarjetaMadre) {
        this.elCase = elCase;
        this.monitor = monitor;
        this.tarjetaMadre = tarjetaMadre;
    }

    public Case mostrarElCase() {
        return elCase;
    }

    public void cambiarElCase(Case elCase) {
        this.elCase = elCase;
    }

    public Monitor mostrarMonitor() {
        return monitor;
    }

    public void cambiarMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public TarjetaMadre mostrarTarjetaMadre() {
        return tarjetaMadre;
    }

    public void cambiarTarjetaMadre(TarjetaMadre tarjetaMadre) {
        this.tarjetaMadre = tarjetaMadre;
    }

    
}
