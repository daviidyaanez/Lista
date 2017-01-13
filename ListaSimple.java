package Lista;

public class ListaSimple {

	protected Nodo cabeza;
	protected long tama�o;
	
	
	public ListaSimple(){
		cabeza = null;
		tama�o =0;
	}
	
	// Pregunta si la lista esta vacia
	public boolean esVacia(){
        return cabeza == null;
    }
	
	
// Inserta un elemnto al inicio de la lista 
	public void insertarInicio(String dato){
		 if (esVacia()) 
			  cabeza= new Nodo(dato);
		 else 
			  cabeza = new Nodo(dato,cabeza);	 
	 }
//	Inserta un elemnto al final de la lista 
	
	 public void insertarFinal(String dato){

	     Nodo aux = new Nodo(dato);
	     Nodo inicio;

	     if (esVacia()) {
	         insertarInicio(dato);
	     }else {
	         inicio = cabeza;         
	         while(inicio.getSiguiente() != null){
	             inicio=inicio.getSiguiente();
	         }              
	         inicio.setSiguiente(aux);
	     }
	 }
	 
 // Imprime la lista 
	 
	 public void imprimirLista(){
	     System.out.println(" << LISTA >> ");
	     
	     Nodo aux= cabeza;
	     
	     while(aux!=null){
	         System.out.println(aux.getElemento());
	         aux=aux.getSiguiente();
	     }
	     
	 }
	 
	 
	// Buscar un elemento 
	 
	 public long tama�ooo(){
	     Nodo aux;
	     tama�o=0;
	     aux = cabeza;

	     while(aux != null){
	         tama�o++;
	         aux = aux.getSiguiente();
	     }
	     System.out.println("El tama�o de la lista es: "+tama�o);
	     return tama�o;
	 }
	 
	  
	 
	 public void buscar(int pos){
		 
	     Nodo aux= cabeza;
	     int contador=1;

	     if(pos<1 || pos>=tama�ooo()){
	         System.out.println("Posicion Incorrecta");
	     }else{
	         while(aux!=null){
	             if (pos == contador){
	                 System.out.println("Elemento encontrado: "+aux.getElemento());
	                 System.out.println	("Su posicion es: "+ pos);
	                 aux=null;
	                 }
	                 
	             else{                 
	                 aux=aux.getSiguiente();
	                 contador++;
	             }
	         }
	     }
	 }
	
	// Elimina un nodo por su  elemento 
	 
	 public void removerPorPosicion(int posicion){
	        // Verifica si la posici�n ingresada se encuentre en el rango
	        // >= 0 y < que el numero de elementos del la lista.
	        if(posicion>=0 && posicion<tama�o){
	            // Consulta si el nodo a eliminar es el primero
	            if(posicion == 0){
	                // Elimina el primer nodo apuntando al siguinte.
	                cabeza = cabeza.getSiguiente();
	            }
	            // En caso que el nodo a eliminar este por el medio 
	            // o sea el ultimo
	            else{
	                // Crea una copia de la lista.
	                Nodo aux = cabeza;
	                // Recorre la lista hasta lleger al nodo anterior al eliminar.
	                for (int i = 0; i < posicion-1; i++) {
	                    aux = aux.getSiguiente();
	                }
	                // Guarda el nodo siguiente al nodo a eliminar.
	                Nodo siguiente = aux.getSiguiente();
	                // Elimina la referencia del nodo apuntando al nodo siguiente.
	                aux.setSiguiente(siguiente.getSiguiente());
	            }
	            // Disminuye el contador de tama�o de la lista.
	            tama�o--;
	        }
	    }
	
	 
	
}
