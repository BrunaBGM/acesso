package bo;

import dao.UsuarioDAO;
import dto.UsuarioDTO;

public class UsuarioBO {
	UsuarioDAO usuarioDAO;

	public UsuarioDTO Autenticar(String email, String senha) {
		usuarioDAO = new UsuarioDAO();
		UsuarioDTO usuarioDTO = usuarioDAO.Autenticar(email, senha);
		return usuarioDTO;
	}
}