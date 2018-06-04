package mx.unam.ciencias.edd;

/**
 * Clase para pilas genéricas.
 */
public class Pila<T> extends MeteSaca<T> {

    /**
     * Agrega un elemento al tope de la pila.
     * @param elemento el elemento a agregar.
     * @throws IllegalArgumentException si <code>elemento</code> es
     *         <code>null</code>.
     */
    @Override public void mete(T elemento) {
	if(elemento == null)
	    throw new IllegalArgumentException();
	Nodo n = new Nodo(elemento);
	if(cabeza == null)
	    cabeza = rabo = n;
	else{
	    n.siguiente = cabeza;
	    cabeza = n;
	}
    }
}
