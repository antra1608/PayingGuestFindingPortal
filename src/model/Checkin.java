package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import util.DBhelper;

public class Checkin {
	public static int check(String username) {
		int flag = 0;
		Connection con = DBhelper.getConnection();
		PreparedStatement pt = null;
		ResultSet rs = null;
		try {
			pt = con.prepareStatement("SELECT * FROM ? WHERE ? IN(?); ");
			pt.setString(1, "pg_owner");
			pt.setString(2, "O_username");
			pt.setString(3, username);
			rs = pt.executeQuery();
			
			while(rs.next())
			{
				flag=1;
				
			}
			if(flag==0)
			{
				pt.setString(1, "lodger");
				pt.setString(2, "L_username");
				pt.setString(3, username);
				rs = pt.executeQuery();				
			}
			while(rs.next())
			{
				flag=2;
			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
System.out.println(flag);
		return flag;
	}
}
