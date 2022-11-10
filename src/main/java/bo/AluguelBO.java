package bo;

import dao.AluguelDAO;
import dto.AluguelDTO;

public class AluguelBO {
	AluguelDAO aluguelDAO;

	public String Salvar(AluguelDTO aluguelDTO) {
		String mensagem = "";
		aluguelDAO = new AluguelDAO();
		boolean ok = aluguelDAO.Salvar(aluguelDTO);
		if (ok) {
			mensagem = "Aluguel cadastrado com sucesso";
		}
		else {
			mensagem = "Erro ao cadastrar aluguel";
		}

		return mensagem;
	}
}