public class Nodo {
    private Object dato;
    private Nodo enlace;

    public Nodo() {
        dato = null;
        enlace = null;
    }

    public Nodo(Object dato) {
        this.dato = dato;
        enlace = null;
    }

    public Nodo(Object dato, Nodo enlace) {
        this.dato = dato;
        this.enlace = enlace;
    }

    public Nodo getEnlace() {
        return enlace;
    }

    public void setEnlace(Nodo enlace) {
        this.enlace = enlace;
    }

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    @Override
    public String toString() {
        return "Nodo [dato=" + dato + ", enlace=" + enlace + "]";
    }

}
