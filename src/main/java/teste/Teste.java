package teste;

import bo.UsuarioBO;
import to.UsuarioTO;

public class Teste {

	public static void main(String[] args) {
		//UsuarioDAO ud = new UsuarioDAO();
				UsuarioBO ub = new UsuarioBO();
				UsuarioTO ut = new UsuarioTO("4","4");
				
				System.out.println("RESPOSTA : " + ub.validacao(ut).getLogin());

			}

	}
