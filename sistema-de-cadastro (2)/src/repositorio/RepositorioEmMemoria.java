package repositorio;

import java.util.ArrayList;
import java.util.List;

import modelo.Usuario;

public class RepositorioEmMemoria implements RepositorioDeUsuario {

	List<Usuario> usuarios = new ArrayList<>();
	
	// Deve implementar os m�todos da interface RepositorioDeUsuario
}
