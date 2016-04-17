	package datos;

import java.util.ArrayList;
import Entidades.Usuario;

public class ListaUsuarios extends Usuario{
	
	private ArrayList<Usuario> hijo= new ArrayList<Usuario>();
	
	public ListaUsuarios(){
		super();
	}

	/*@Override
	 * public Usuario creaUsuario(){
	 * return new Usuario(){};
	 * }
	*/
	
	@Override
	public void agregar(Usuario Usua) {
		hijo.add(Usua);
	}
	
	public Usuario getUsuario(int i){
		return hijo.get(i);
	}
	
	public String listar(){
		String cadena = "";
		for (int i = 0; i < hijo.size(); ++i){
			cadena=cadena+ hijo.get(i) + "/n";
		}
		return cadena;
	}
	
	public void ordenaPorApellidos(){
		try{
			for (int i = 0; i < hijo.size()- 1; ++i){
				for (int j = i + 1; j < hijo.size(); ++j){
					if (hijo.get(i).getApellidos().compareToIgnoreCase(hijo.get(j).getApellidos()) > 0){
						Usuario temporal = hijo.get(i);
						hijo.set(i, hijo.get(j));
						hijo.set(j, temporal);
					}
					
				}
			}
		} catch (NullPointerException ex){
			}
	}
	public int getTamano(){
		return hijo.size();				
	}
	
	
	

}
