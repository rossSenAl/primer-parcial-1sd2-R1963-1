public class Lista implements ILista {
    private Nodo cabeza;

    public Lista() {
        cabeza = null;
    }

    public Lista(Nodo cabeza) {
        this.cabeza = cabeza;
    }

    public Nodo getCabeza() {
        return cabeza;
    }

    public void setCabeza(Nodo cabeza) {
        this.cabeza = cabeza;
    }

    @Override
    public void inicializacionoCreacion() {

    }

    @Override
    public Nodo buscarElemento(Object elementoaBuscar) {
        if (estaVacia()) {
            System.out.println("No se puede buscar un elemento en la lista, ya que esta vacia.");
            return null;
        }
        Nodo auxNodo = cabeza;
        while (auxNodo != null) {
            // if (auxNodo.getDato() == elementoaBuscar) {
            if (auxNodo.getDato().equals(elementoaBuscar)) {
                return auxNodo;
            }
            auxNodo = auxNodo.getEnlace();
        }
        return null;
    }

    // TODO: IMPLEMENTAR LA OPERACION eliminarElemento
    // * Debe considerar tres posibles casos:
    // 1. Cuando la lista esta vacia
    // 2. Cuando el elemento a eliminar es la cabeza
    // 3. Cuando no se encuentra el elemento a eliminar
    @Override
    public void eliminarElemento(Object elementoaEliminar) {

    }

    @Override
    public boolean estaVacia() {
        if (cabeza == null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Lista [cabeza=" + cabeza + "]";
    }

    @Override
    public void insertarElemento(Object elementoaInsertar) {
        Nodo nuevoNodo = new Nodo(); // se crea un nodo vacio
        nuevoNodo.setDato(elementoaInsertar); // se agrega el dato al nuevo nodo
        nuevoNodo.setEnlace(cabeza); // el enlace del nuevo nodo es la cabeza
        cabeza = nuevoNodo; // la cabeza es el nuevo nodo
    }

    @Override
    public String recorrerLista() {
        String recorridoString = "";
        if (estaVacia()) {
            return "No se puede recorrer la lista, ya que esta vacia.";
        }
        Nodo auxNodo = cabeza;
        while (auxNodo != null) {
            recorridoString = recorridoString + auxNodo.getDato() + " ";
            auxNodo = auxNodo.getEnlace();
        }
        return recorridoString;
    }

    @Override
    public boolean seEncuentraElemento(Object elementoaEncontrar) {
        if (estaVacia()) {
            System.out.println("No se puede determinar si se encuentra un elemento en la lista, ya que esta vacia.");
            return false;
        }
        Nodo auxNodo = cabeza;
        while (auxNodo != null) {
            // if (auxNodo.getDato() == elementoaBuscar) {
            if (auxNodo.getDato().equals(elementoaEncontrar)) {
                return true;
            }
            auxNodo = auxNodo.getEnlace();
        }
        return false;
    }

    @Override
    public void pop() {
        if (estaVacia()) {
            System.out.println("No se puede realizar el pop, ya que se encuentra vacia");
        } else {
            Nodo aux = cabeza;
            cabeza = aux.getEnlace();
        }
    }

}
