package model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import util.DBhelper;

public class Pg_details {
	DBhelper db=new DBhelper();
	Connection con=db.getConnection();
	Connection com=db.getConnection();

				PreparedStatement pt;
				ResultSet rt;
				PreparedStatement ps;

			
	public ArrayList<String> getlocation()
	{
		ArrayList<String> location= new ArrayList<String>();
		try {
			ps=con.prepareStatement("select distinct Location from pg_details");
			rt=ps.executeQuery();
			while(rt.next())
			{
				location.add(rt.getString("Location"));
				System.out.println(rt.getString("Location")+"********************");
			}
		
			
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return location;
		
	}
	
	public int getnumber()
	{
		
		int number=0;
		try {
			ps=con.prepareStatement("select number from pdf_generater");
			rt=ps.executeQuery();
			while(rt.next())
			{
				number=rt.getInt("number");
			}
		
			
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return number;
		
	}
	
	public int setnumber(int i,int j)
	{
		
		int k=0;
		try {
			ps=con.prepareStatement("update pdf_generater set number=? where number=?");
			ps.setInt(1, i);
			ps.setInt(2, j);
			k=ps.executeUpdate();
			
			
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return k;
		
	}
				
	public int insert(pojo.Pg_details pg,String Username,String latitude,String longitude,String path) {
		int i = 0;
		int id=0;
		try {
			ps=com.prepareStatement("select O_id from pg_owner where O_username=?");
			ps.setString(1, Username);
			rt=ps.executeQuery();
			while(rt.next())
			{
				id=rt.getInt("O_id");
			}
			/*File f = new File(saveFile);
			//PreparedStatement psmnt = con.prepareStatement("insert into image values(?)");
			FileInputStream fis=null;
			try {
				fis = new FileInputStream(f);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}*/
			
			
			pt = con.prepareStatement("insert into pg_details(P_name,Address,Location,O_id,Gender,Operating_since,P_count,Contact_Person,Email_id,Website,Phone,Licence_no,Food_availaible,Latitude,Longitude,pdf_path) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			pt.setString(1,pg.getP_name());
			
			pt.setString(2, pg.getAddress());
			pt.setString(3, pg.getLocation());
			pt.setInt(4, id);
			pt.setString(5, pg.getGender());
			pt.setInt(6, pg.getOperating_since());
			pt.setInt(7, 0);
			pt.setString(8, pg.getContact_person());
			pt.setString(9, pg.getEmail_id());
			pt.setString(10, pg.getWebsite());
			pt.setString(11, pg.getPhone());
			pt.setInt(12, pg.getLicence_no());
			pt.setString(13, pg.getFood_available());
			pt.setFloat(14, Float.valueOf(latitude));
			pt.setFloat(15, Float.valueOf(longitude));
			pt.setString(16, path);
			i = pt.executeUpdate();
			System.out.println(i);
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return i;
	}
	
	public int insertimage(String saveFile,int P_id )
	{
		int i=0;
		
		try {
	
			File f = new File(saveFile);
			FileInputStream fis;
			try {
				fis = new FileInputStream(f);
				pt=con.prepareStatement("update pg_details set Image=? where P_id=? ");
				pt.setBinaryStream(1, (InputStream) fis,(int) (f.length()));
				pt.setInt(2,P_id );
			 i=pt.executeUpdate();
			 System.out.println(i);
			
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}

			
			
		
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return i;
	}

	public	int getownerid(int P_id)
	{
		int i=0;
		try {
			pt=con.prepareStatement("select O_id from pg_details where P_id=?");
			pt.setInt(1, P_id);
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
	
public	int getid(String pname)
{
	int i=0;
	try {
		pt=con.prepareStatement("select P_id from pg_details where P_name=?");
		pt.setString(1, pname);
		rt=pt.executeQuery();
		
		while(rt.next())
		{
			i=rt.getInt("P_id");
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
	return i;
}
public int update(pojo.Pg_details pg,String Username,int P_id)
{
	
	int i = 0;
	int id=0;
	try {
		ps=com.prepareStatement("select O_id from pg_owner where O_username=?");
		ps.setString(1, Username);
		rt=ps.executeQuery();
		while(rt.next())
		{
			id=rt.getInt("O_id");
		}
		System.out.println("PG data*********************************");
		
		System.out.println(id);
		System.out.println(pg.getP_name());
		System.out.println(pg.getAddress());
		System.out.println(pg.getContact_person());
		System.out.println(pg.getEmail_id());
		System.out.println(pg.getFood_available());
		System.out.println(pg.getGender());
		System.out.println(pg.getImage());
		System.out.println(pg.getLicence_no());
		System.out.println(pg.getLocation());
		System.out.println(pg.getOperating_since());
		System.out.println(pg.getPhone());
		System.out.println(pg.getWebsite());
		System.out.println(P_id);
		System.out.println("****************************");
		
		
		pt = con.prepareStatement("update pg_details set P_name=?,Address=?,Location=?,Longitude=?,Latitude=?,Gender=?,Operating_since=?,Contact_person=?,Email_id=?,Website=?,Phone=?,Licence_no=? where P_id=? AND O_id=?");
		pt.setString(1,pg.getP_name());
		
		pt.setString(2, pg.getAddress());
		pt.setString(3, pg.getLocation());
		
		if(pg.getLongitude()!= null)
		pt.setFloat(4, pg.getLongitude());
		else
		pt.setFloat(4, 0);	
		if(pg.getLatitude()!= null)
		pt.setFloat(5, pg.getLatitude());
		pt.setFloat(5, 0);	
		
		
		pt.setString(6, pg.getGender());
		pt.setInt(7, pg.getOperating_since());
	
		pt.setString(8, pg.getContact_person());
		pt.setString(9, pg.getEmail_id());
		pt.setString(10, pg.getWebsite());
		pt.setString(11, pg.getPhone());
		pt.setInt(12, pg.getLicence_no());
		pt.setInt(13,P_id);
		pt.setInt(14, id);
		 i = pt.executeUpdate();
		System.out.println(i);
	
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return i;

}

public pojo.Pg_details update(String p_name)
{
	pojo.Pg_details pg=new pojo.Pg_details();
	try {
		pt=con.prepareStatement("select * from pg_details where P_name=?");
		pt.setString(1, p_name);
		rt=pt.executeQuery();
		
		while(rt.next())
		{
			pg.setAddress(rt.getString("Address"));
			pg.setContact_person(rt.getString("Contact_Person"));
			pg.setEmail_id(rt.getString("Email_id"));
			pg.setFood_available(rt.getString("Food_availaible"));
			pg.setGender(rt.getString("Gender"));
			pg.setLatitude(rt.getFloat("Latitude"));
			pg.setLongitude(rt.getFloat("Longitude"));
			pg.setLocation(rt.getString("Location"));
			pg.setOperating_since(rt.getInt("Operating_since"));
			pg.setP_name(rt.getString("P_name"));
			pg.setPhone(rt.getString("Phone"));
			pg.setWebsite(rt.getString("Website"));
			pg.setLicence_no(rt.getInt("Licence_no"));
			System.out.println("updated");
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return pg;
	
}

}


