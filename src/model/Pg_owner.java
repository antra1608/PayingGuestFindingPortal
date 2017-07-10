package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import pojo.admin;
import util.DBhelper;

public class Pg_owner {
Connection con=DBhelper.getConnection();
Connection com=DBhelper.getConnection();

PreparedStatement pt;
ResultSet rt;
PreparedStatement ps;

public String getmail(int O_id)
{
	String mail=null;
	try {
		pt=con.prepareStatement("select Email from pg_owner where O_id=?");
		pt.setInt(1, O_id);
		rt=pt.executeQuery();
		while(rt.next())
		{
			mail=rt.getString("Email");
		}
		
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return mail;

	
}


public String getpassword(String email)
{
	String password=null;
	try {
		pt=con.prepareStatement("select Password from pg_owner where Email=?");
		pt.setString(1, email);
		rt=pt.executeQuery();
		while(rt.next())
		{
			password=rt.getString("Password");
		}
		
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return password;
}

public ArrayList<String> selectpost()
{

	ArrayList<String> a =new ArrayList<String>();
	
	
	try {
	
		pt=con.prepareStatement("select post from post ");
		rt=pt.executeQuery();
		while(rt.next())
		{
			a.add(rt.getString("post"));
		}

	} catch (SQLException e) {
		e.printStackTrace();
	}
		return a;

}


public ArrayList<String> getpost(String username)
{

	ArrayList<String> a =new ArrayList<String>();
	
	int id=0;
	try {
		ps=com.prepareStatement("select O_id from pg_owner where O_username=?");
		ps.setString(1, username);
		rt=ps.executeQuery();
		while(rt.next())
		{
			id=rt.getInt("O_id");
		}

		pt=con.prepareStatement("select post from post where O_id=? ");
		pt.setInt(1, id);
		rt=pt.executeQuery();
		while(rt.next())
		{
			a.add(rt.getString("post"));
		}

	} catch (SQLException e) {
		e.printStackTrace();
	}
		return a;

}
public int insert(pojo.Pg_owner u) {
	int i = 0;
	try {
		pt = con.prepareStatement("insert into pg_owner(O_name,O_username,Password,Mobile,Email) values(?,?,?,?,?)");
		pt.setString(1,u.getO_name());
		
		pt.setString(2, u.getO_username());
		pt.setString(3, u.getPassword());
		pt.setInt(4, u.getMobile());
		pt.setString(5, u.getEmail());
		
		 i = pt.executeUpdate();
		System.out.println(i);
	
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return i;
}
public int select ( String username, String password)
{
	int i=0;
	try {
		
		pt = con.prepareStatement("select * from pg_owner where O_username=? AND Password=?");
		pt.setString(1, username);
		pt.setString(2, password);
		
		ResultSet rs = pt.executeQuery();
		if(rs.next())
		{
			i=1;
		}
		else
		{
		i=0;
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return i;
	
}
public ArrayList<pojo.Pg_owner> update(String username)
{
	ArrayList<pojo.Pg_owner> ad = new ArrayList<pojo.Pg_owner>();
	Connection con = DBhelper.getConnection();
	PreparedStatement ps;
	ResultSet rs;
	try {
		ps = con.prepareStatement("select * from pg_owner where O_username=? ");
		ps.setString(1, username);
		rs = ps.executeQuery();

		while (rs.next()) {
			pojo.Pg_owner o = new pojo.Pg_owner();
			o.setO_name(rs.getString(2));
			o.setO_username(rs.getString(3));
			o.setEmail(rs.getString(6));
			o.setMobile(rs.getInt(5));
			o.setResidential_address(rs.getString(7));
			o.setOne_time_password(rs.getString(8));
			o.setNo_of_pg_owns(Integer.parseInt(rs.getString(9)));
			o.setGender(rs.getString(10));
			
			ad.add(o);
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}
return ad;
}
public int update(pojo.Pg_owner o,String username)
{
	int i=0;
	try {
		pt = con.prepareStatement(
				"update pg_owner set O_name= ? , O_username=?, Email=? ,Mobile=? where O_username=? ");
		pt.setString(1, o.getO_name());
		pt.setString(2, o.getO_username());
		pt.setString(3, o.getEmail());
		pt.setInt(4, o.getMobile());
		pt.setString(5, username);

		 i = pt.executeUpdate();

	} catch (SQLException e) {
		e.printStackTrace();
	}
	return i;
}
public int update(String Current_password,String New_password,String username)
{
	int i=0;
	try {
		pt = con.prepareStatement("update pg_owner set Password=? where Password=? AND O_username=? ");
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
public 	int getid(String username)
{
	int i=0;
	try {
		pt=con.prepareStatement("select O_id from pg_owner where O_username=?");
		pt.setString(1, username);
		rt=pt.executeQuery();
		while(rt.next())
		{
			i=rt.getInt("O_id");
		}
	
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
	return i;
}
public int createpost(pojo.Pg_owner o,String username)
{
int i=0;
int id=0;
try {
	ps=com.prepareStatement("select O_id from pg_owner where O_username=?");
	ps.setString(1, username);
	rt=ps.executeQuery();
	while(rt.next())
	{
		id=rt.getInt("O_id");
	}

	pt=con.prepareStatement("insert into post values(?,?) ");
	pt.setInt(1, id);
	pt.setString(2, o.getPost());
 i=pt.executeUpdate();
System.out.println(i);

} catch (SQLException e) {
	e.printStackTrace();
}
	return i;
}

public ArrayList<String> getpgs(int O_id)
{
	ArrayList<String> p_name = new ArrayList<String>();
	Connection con = DBhelper.getConnection();
	PreparedStatement ps;
	ResultSet rs;
	try {
		pt=con.prepareStatement("select P_name from pg_details where O_id=?");
		pt.setInt(1, O_id);
		rs=pt.executeQuery();
		while(rs.next())
		{
			p_name.add(rs.getString("P_name"));
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return p_name;
	
}

}