package test;

import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.Statement;

public class DBCon01 {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:xe", "system", "oracle");
			Statement stmt=con.createStatement();
			stmt.executeUpdate
			("create table Employee123(eId number(5),eName varchar2(12))");
			System.out.println("Table Created Successfully.....");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
