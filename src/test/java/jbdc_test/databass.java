package jbdc_test;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Statement;
public class databass {

	public static void main(String[] args)  throws Exception {
		String url="jdbc:mysql://localhost:3306/mybd";
		String un="root";
		String pwd="password@123";
		
		Connection conn= DriverManager.getConnection(url,un,pwd);
		Statement st=conn.createStatement();
		int count= st.executeUpdate("create table school1(srn int(4),name varchar(10)");
		
	}

}
