package datos;

import Entidades.Prestamo;

public class ListaPrestamo {
	public final static int TAM = 10;
	private Prestamo lista[];
	private int posicion;
	private static ListaPrestamo listaPrestamo;
	
	 /* 
	 * Patron singleton
	 */
	
	public static synchronized ListaPrestamo getInstance(){
		if(listaPrestamo == null){
			listaPrestamo = new ListaPrestamo();
		}
		return listaPrestamo;
		}
	private ListaPrestamo(){
		this(TAM);
		posicion = 1;
	}
	
	private ListaPrestamo(int tamanio) {	
		lista = new Prestamo[tamanio];	
			posicion = lista.length	-1;
			}
	
	public void setLista(Prestamo lista[]){
		this.lista = lista;
	}
	
	public Prestamo[] getLista(){
		return lista;
	}
	public int getPosicion() {
		return posicion;
	}
	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}

}
