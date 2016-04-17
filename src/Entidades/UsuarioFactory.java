package Entidades;

public abstract class UsuarioFactory {
	/* Fabrica abstracta
	 * 
	 */
	
	public abstract Usuario creaUsuario(String codigo, String nombres, String apellidos, String direccion,
			String telefono, int estado, Object o1, Object o2, Object o3);
	
	// public abstract void agregar(UsuarioFactory Usua);	
	}
