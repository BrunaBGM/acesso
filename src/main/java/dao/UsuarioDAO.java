package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;

import factory.ConectionFactory;
import dto.UsuarioDTO;

public class UsuarioDAO {
	private Connection con = null;

	public UsuarioDAO() {
		this.con = new ConectionFactory().getConnection();
	}

	public UsuarioDTO Autenticar(String email, String senha) {		
		PreparedStatement ps = null;
		
		try {
			
			String sqlStr = "SELECT * FROM T_uncleplhil_usuario WHERE DS_LOGIN = '" + email + "'  AND DS_SENHA = '" + senha + "'";
			
			ps = con.prepareStatement(sqlStr);			
			ResultSet rs =  ps.executeQuery();
			
			UsuarioDTO usuarioDTO = null;
			
			while (rs.next()) {
				usuarioDTO = new UsuarioDTO();
				usuarioDTO.setLogin(rs.getNString(1));
				usuarioDTO.setSenha(rs.getNString(2));
			}
			
			rs.close();
			ps.close();
			con.close();
			
			System.out.println("O USU�RIO : " + usuarioDTO.getLogin() + " LOGOU �S " + Calendar.getInstance().getTime());
			
			return usuarioDTO;
			
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
}