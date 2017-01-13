package Lista;

public class Aplicacion {

	public static void main(String[] args) {
		 ListaSimple lista = new ListaSimple ();
		
	    lista.insertarInicio("Juan");
		lista.insertarFinal("Mario");
		lista.insertarInicio("Carla");
		lista.insertarFinal("Tatiana");
		lista.insertarFinal("Rebeca");
		
		
		lista.imprimirLista();
		
		lista.removerPorPosicion(3);
		
		lista.imprimirLista();
	
        
	// lista.tamañooo();
		
	 lista.buscar(1);
		
	 
	 
	}

}
