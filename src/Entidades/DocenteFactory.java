package Entidades;

public class DocenteFactory extends UsuarioFactory{
	
	public DocenteFactory(){
		super();
	}

	@Override
	public Usuario creaUsuario(String codigo, String nombres, String apellidos, String direccion, String telefono,
			int estado, Object objeto1, Object objeto2, Object objeto3) {
		return new Docente((Integer)objeto1,(Integer)objeto2,(Integer)objeto3, codigo, nombres, apellidos, direccion,
				telefono, estado);
	}
	
	
		/*
		 * @Override
		 * public void agregar(UsuarioFactory Usua){
		 * throw new UnsupportedOperationException("Not supported yet.");//To change body of generated methods, 
		 * choose Tool
		 * }
		 */

	}
