package org.sindu.hibernate.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnectionApp {

	public static void main(String args[]) throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost/hb_05_ManyToMany_Hibernate?usessl=false";
		String user = "hb_05_ManyToMany_Hibernate";
		String password = "hb_05_ManyToMany_Hibernate";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,user,password);
		System.out.println(con);
		System.out.println("sql Connection successfully established..!");
	}
}
