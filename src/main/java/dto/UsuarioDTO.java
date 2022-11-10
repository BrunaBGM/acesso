package dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class UsuarioDTO {

	private int usuarioId;
	private String login;
	private String senha;

	public UsuarioDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UsuarioDTO(String login, String senha) {
		super();
		this.login = login;
		this.senha = senha;
	}
	public int getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(int usuarioId) {
		this.usuarioId = usuarioId;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}