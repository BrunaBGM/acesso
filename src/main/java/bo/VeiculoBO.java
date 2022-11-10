package bo;

import java.util.List;

import dao.VeiculoDAO;
import dto.VeiculoDTO;

public class VeiculoBO {
	VeiculoDAO veiculoDAO;

	public VeiculoDTO ObterVeiculo(int veiculoId) {
		veiculoDAO = new VeiculoDAO();
		VeiculoDTO veiculoDTO = veiculoDAO.ObterVeiculo(veiculoId);
		return veiculoDTO;
	}
	public List<VeiculoDTO> ListarVeiculo() {
		veiculoDAO = new VeiculoDAO();
		List<VeiculoDTO> lstveiculoDTO = veiculoDAO.ListarVeiculo();
		return lstveiculoDTO;
	}
}

