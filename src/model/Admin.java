package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import pojo.admin;
import util.DBhelper;

public class Admin 
{
	Connection con=DBhelper.getConnection();
	PreparedStatement pt;
public String getPassword(String username)
{
	String Password=null;
	try {
		pt = con.prepareStatement("select Password  from admin where A_username=? ");
		pt.setString(1, username);
		
		
		ResultSet rs = pt.executeQuery();
		if(rs.next())
		{
//			System.out.println("inside result set");
			Password=rs.getString("Password");
			
		}
		else
		{
			System.out.println("not");
		
		}
	} catch (SQLException e) {
				e.printStackTrace();
	}
	
	return Password;
	

}
	public int select ( String username, String password)
	{
		int i=0;
		try {
			
			pt = con.prepareStatement("select * from admin where A_username=? AND Password=?");
			pt.setString(1, username);
			pt.setString(2, password);
			
			ResultSet rs = pt.executeQuery();
			if(rs.next())
			{
//				System.out.println("inside result set");
				i=1;
				
			}
			else
			{
				System.out.println("not");
			i=0;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return i;
		
	}
	
	public int update(pojo.admin a,String username)
	{
		int i=0;
		try {
			pt = con.prepareStatement(
					"update admin set A_name= ? , A_username=?, Email=? ,Mobile=?  where A_username=? ");
			pt.setString(1, a.getA_name());
			pt.setString(2, a.getA_username());
			pt.setString(3, a.getEmail());
			pt.setString(4, a.getMobile());
			pt.setString(5, username);

			 i = pt.executeUpdate();
			 System.out.println("this is updation"+i);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}
	public int update(String Current_password,String New_password,String username)
	{
		int i=0;
		try {
			pt = con.prepareStatement("update admin set Password=? where Password=? AND A_username=?  ");
			pt.setString(1, New_password);
			pt.setString(2, Current_password);
			pt.setString(3, username);

			 i = pt.executeUpdate();
			System.out.print(i);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	return i;
	}

	
	public ArrayList<pojo.admin> update(String username)
	{
		ArrayList<admin> ad = new ArrayList<admin>();
		Connection con = DBhelper.getConnection();
		PreparedStatement ps;
		ResultSet rs;
		try {
			ps = con.prepareStatement("select * from admin where A_username=? ");
			ps.setString(1, username);
			rs = ps.executeQuery();

			while (rs.next()) {
				admin admin = new admin();
				admin.setA_name(rs.getString(2));
				admin.setA_username(rs.getString(3));
				admin.setEmail(rs.getString(5));
				admin.setMobile(rs.getString(6));
				admin.setGender(rs.getString(7));
				
				ad.add(admin);
			}
			} catch (SQLException e) {
			e.printStackTrace();
		}
 return ad;
	}
}
