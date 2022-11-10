package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import factory.ConectionFactory;
import dto.VeiculoDTO;

public class VeiculoDAO {
	private Connection con = null;

	public VeiculoDAO() {
		this.con = new ConectionFactory().getConnection();
	}

	public List<VeiculoDTO> ListarVeiculo() {		
		PreparedStatement ps = null;
		
		try {
			
			String sqlStr = "SELECT * FROM T_uncleplhil_usuario WHERE DS_LOGIN = ";
			
			ps = con.prepareStatement(sqlStr);			
			ResultSet rs =  ps.executeQuery();
			
			List<VeiculoDTO> lstVeiculoDTO = new ArrayList<>();
			VeiculoDTO veiculoDTO = null;
			
			rs.close();
			ps.close();
			con.close();
		
			return lstVeiculoDTO;
			
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public VeiculoDTO ObterVeiculo(int veiculoId) {		
		PreparedStatement ps = null;
		
		try {
			
			String sqlStr = "SELECT * FROM T_uncleplhil_usuario WHERE DS_LOGIN = ";
			
			ps = con.prepareStatement(sqlStr);			
			ResultSet rs =  ps.executeQuery();

			VeiculoDTO veiculoDTO=null;
			
			rs.close();
			ps.close();
			con.close();
			
			return veiculoDTO;
			
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
}