package Entidades;

import java.util.Calendar;
import java.util.GregorianCalendar;

public abstract class Devolucion {
	private Usuario usuario;
	private MaterialBibliografico material;
	private static Fecha fechaDevolucion;
	
	public Devolucion(){	
	}
	
	public Devolucion(Usuario usuario, MaterialBibliografico material, Fecha fechaDevolucion1){
		this.usuario = usuario;
		this.material = material;
		fechaDevolucion = fechaDevolucion1;		
	}
	
	public abstract void agregar (Devolucion devolucion);
	
	public Fecha getFechaDevolucion(){
		return fechaDevolucion;
	}
	
	public void setFechaDevolucion(Fecha aFechaDevolucion){
		fechaDevolucion = aFechaDevolucion;
		}
	
	public Usuario getUsuario(){
		return usuario;
	}
	
	public void setUsuario (Usuario usuario){
		this.usuario = usuario;
	}
	
	public MaterialBibliografico getMaterial(){
		return material;
	}
	
	public void setMaterial(MaterialBibliografico material){
		this.material= material;
	}
	
	public static class Fecha{
		private int dia;
		private int mes;
		private int anio;
		
		public Fecha(int...fecha){
			GregorianCalendar fechaActual = new GregorianCalendar();
			int dd, mm, aa;
			dd = fechaActual.get(Calendar.DAY_OF_MONTH);
			mm = fechaActual.get(Calendar.MONTH) + 1;
			aa = fechaActual.get(Calendar.YEAR);
			dia = fecha.length > 0 ? fecha[0] : dd;
			mes = fecha.length > 1 ? fecha[1] : mm;
			anio = fecha.length > 2 ? fecha[2] : aa;
		}
		
		@Override
		public String toString1(){
			return (getDia() <= 9 ? "0" + getDia() : getDia())+ "/"
					+ (getMes() <= 9 ? "0" + getMes() : getMes())+ "/" + getAnio();
		}
		
		public void setFechaDevolucion(Fecha fecha){
			setFechaDevolucion (fecha);
		}
		
		public int getDia(){
			return dia;
		}	
		
		public void setDia(int dia)	{
			this.dia = dia;
		}
		
		public int getMes(){
			return mes;
		}
		
		public void setMes (int mes){
			this.mes = mes;
		}

		public int getAnio(){
			return anio;
		}
		
		public void setAnio(int anio){
			this.anio = anio;
		}
		
		@Override
		public String toString(){
			return "Devolucion{" + usuario.toString() + material.toString()+ "\nFecha Devolucion: " + 
		fechaDevolucion.toString();
			
		}
	}
	
	                                                                                                                                                                       	
	

}
