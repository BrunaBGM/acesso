package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;

import factory.ConectionFactory;
import dto.AluguelDTO;

public class AluguelDAO {
	private Connection con = null;

	public AluguelDAO() {
		this.con = new ConectionFactory().getConnection();
	}

	public boolean Salvar(AluguelDTO aluguelDTO) {		
		PreparedStatement ps = null;
		
		try {
			
			String sqlStr = "SELECT * FROM T_uncleplhil_usuario WHERE DS_LOGIN = ";
			
			ps = con.prepareStatement(sqlStr);			
			ResultSet rs =  ps.executeQuery();			
			rs.close();
			ps.close();
			con.close();			
			return true;
			
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
}