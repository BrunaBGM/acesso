package dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class AluguelDTO {

	private int usuarioId;
	private int veiculoId;

	public AluguelDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AluguelDTO(int usuarioId, int veiculoId) {
		super();
		this.usuarioId = usuarioId;
		this.veiculoId = veiculoId;
	}

	public int getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(int usuarioId) {
		this.usuarioId = usuarioId;
	}

	public int getVeiculoId() {
		return veiculoId;
	}

	public void setVeiculoId(int veiculoId) {
		this.veiculoId = veiculoId;
	}

}