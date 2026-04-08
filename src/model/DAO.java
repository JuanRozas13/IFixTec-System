
package model;

import java.sql.Connection;
import java.sql.DriverManager;

public class DAO {
	private Connection con;
	private String driver = "com.mariadb.cj.jdbc.Driver";
	private String url = "jdbc:mysql://192.168.20.103:3306/assistencia";
	private String user = "root";
	private String password = "123@Senac";
	
	public Connection conectar() {
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			return con;
			
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
}
