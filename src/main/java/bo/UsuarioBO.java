package bo;

import dao.UsuarioDAO;
import to.UsuarioTO;

public class UsuarioBO {
	UsuarioDAO ud = null;

	public UsuarioTO validacao(UsuarioTO u) {
		ud = new UsuarioDAO();
		return ud.loginDAO(u);
	}
}