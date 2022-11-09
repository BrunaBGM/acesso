package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;

import factory.ConectionFactory;
import to.UsuarioTO;

public class UsuarioDAO {
	private Connection con = null;

	public UsuarioDAO() {
		this.con = new ConectionFactory().getConnection();
	}

	public UsuarioTO loginDAO(UsuarioTO u) {
		
		PreparedStatement ps = null;
		
		try {
			
			String sqlStr = "SELECT * FROM T_uncleplhil_usuario WHERE DS_LOGIN = ? AND DS_SENHA = ?";
			
			ps = con.prepareStatement(sqlStr);
			
			ps.setString(1, u.getLogin());
			ps.setString(2, u.getSenha());
			
			ResultSet rs =  ps.executeQuery();
			
			UsuarioTO ut = null;
			
			while (rs.next()) {
				ut = new UsuarioTO();
				ut.setLogin(rs.getNString(1));
				ut.setSenha(rs.getNString(2));
			}
			
			rs.close();
			ps.close();
			con.close();
			
			System.out.println("O USU�RIO : " + u.getLogin() + " LOGOU �S " + Calendar.getInstance().getTime());
			
			return u;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}