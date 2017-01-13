package Lista;

public class Nodo {
private String elemento;
private Nodo siguiente ;
	

public Nodo(String s, Nodo n) {
	this.elemento= s;
	siguiente = n; }
public Nodo(String s){
	elemento=s;
	siguiente =null;
	
}
/*public Nodo (String s, Nodo n){
	elemento = s;
	siguiente =n;
	
}*/
	
public String getElemento(){
	return elemento; 
}
public Nodo getSiguiente(){
	return siguiente; 
}
public void setElemento(String newElem){
	elemento=newElem;
}
public void setSiguiente(Nodo nexNext){
	siguiente = nexNext;
}


}
