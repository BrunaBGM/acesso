package factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

 
public class ConectionFactory {
 
    private Connection conexao = null;
 
    public Connection getConnection() {
    	
        try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
            conexao = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl", "rm96283", "030496");
            return conexao;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
           
           return null;
    }
}