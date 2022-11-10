package teste;

import bo.UsuarioBO;
import dto.UsuarioDTO;

public class Teste {

	public static void main(String[] args) {
				UsuarioBO usuarioBO = new UsuarioBO();
				UsuarioDTO usuarioDTO = new UsuarioDTO("4","4");				
				System.out.println("RESPOSTA : " + usuarioBO.Autenticar(usuarioDTO.getLogin(),usuarioDTO.getSenha()));
			}
	}
