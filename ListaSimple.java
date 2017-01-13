package Lista;

public class ListaSimple {

	protected Nodo cabeza;
	protected long tamaño;
	
	
	public ListaSimple(){
		cabeza = null;
		tamaño =0;
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
	 
	 public long tamañooo(){
	     Nodo aux;
	     tamaño=0;
	     aux = cabeza;

	     while(aux != null){
	         tamaño++;
	         aux = aux.getSiguiente();
	     }
	     System.out.println("El tamaño de la lista es: "+tamaño);
	     return tamaño;
	 }
	 
	  
	 
	 public void buscar(int pos){
		 
	     Nodo aux= cabeza;
	     int contador=1;

	     if(pos<1 || pos>=tamañooo()){
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
	        // Verifica si la posición ingresada se encuentre en el rango
	        // >= 0 y < que el numero de elementos del la lista.
	        if(posicion>=0 && posicion<tamaño){
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
	            // Disminuye el contador de tamaño de la lista.
	            tamaño--;
	        }
	    }
	
	 
	
}
