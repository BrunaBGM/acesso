package dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class VeiculoDTO {

	private int veiculoId;
	private String nomeVeiculo;
	private String titulo;
	private String subtitulo;
	private double valor;

	public VeiculoDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public VeiculoDTO(int veiculoId, String nomeVeiculo,String titulo,String subtitulo,double valor) {
		this.veiculoId = veiculoId;
		this.nomeVeiculo = nomeVeiculo;
		this.titulo = titulo;
		this.subtitulo = subtitulo;
		this.valor = valor;
	}

	public int getVeiculoId() {
		return veiculoId;
	}

	public void setVeiculoId(int veiculoId) {
		this.veiculoId = veiculoId;
	}

	public String getNomeVeiculo() {
		return nomeVeiculo;
	}

	public void setNomeVeiculo(String nomeVeiculo) {
		this.nomeVeiculo = nomeVeiculo;
	}
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getSubtitulo() {
		return subtitulo;
	}

	public void setSubtitulo(String subtitulo) {
		this.subtitulo = subtitulo;
	}
	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

}