package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import util.DBhelper;

public class Pg_search {

	Connection con = DBhelper.getConnection();

	PreparedStatement pt;
	ResultSet rt;
	public ArrayList<String> query0(String Location,int Max_budget,int Min_budget,String Food_available,String Gender)
	{
		ArrayList<String> pg=new ArrayList<String>();
	pojo.Pg_details PG = new pojo.Pg_details();
		try {
			pt=con.prepareStatement("SELECT * FROM pg_details WHERE Food_availaible=? AND Gender=? AND Location=? AND P_id IN(SELECT DISTINCT Q.`P_id` FROM((SELECT S.P_id FROM 1sharing_info AS S WHERE S.Rent<=?)UNION(SELECT T.`P_id` FROM 6sharing_info AS T WHERE T.`Rent`>=?) UNION(SELECT U.P_id FROM 2sharing_info AS U)UNION	(SELECT V.P_id FROM 3sharing_info AS V)UNION	(SELECT W.P_id FROM 4sharing_info AS W)UNION	(SELECT B.P_id FROM 5sharing_info AS B)	) AS Q);");
			pt.setString(1, Food_available);
			pt.setString(2, Gender);
			pt.setString(3, Location);
			pt.setInt(4, Max_budget);
			pt.setInt(5, Min_budget);
			rt=pt.executeQuery();
			while(rt.next())
			{
				System.out.println(rt.getString("P_name"));
				PG.setO_id(rt.getInt("O_id"));
				PG.setImage(rt.getString("Image"));
				PG.setAddress(rt.getString("Address"));
				PG.setContact_person(rt.getString("Contact_Person"));
				PG.setEmail_id(rt.getString("Email_id"));
				PG.setFood_available(rt.getString("Food_availaible"));
				PG.setGender(rt.getString("Gender"));
				PG.setLatitude(rt.getFloat("Latitude"));
				PG.setLicence_no(rt.getInt("Licence_no"));
				PG.setLocation(rt.getString("Location"));
				PG.setLongitude(rt.getFloat("Longitude"));
				PG.setOperating_since(rt.getInt("Operating_since"));
				PG.setP_name(rt.getString("P_name"));
				PG.setPhone(rt.getString("Phone"));
				PG.setWebsite(rt.getString("Website"));
				pg.add(rt.getString("P_name"));
				
			}
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return pg;
		
	}

			
public ArrayList<String> query1(int Max_budget,int Min_budget,String Food_available,String Gender)
{
	ArrayList<String> pg=new ArrayList<String>();
pojo.Pg_details PG = new pojo.Pg_details();
	try {
		pt=con.prepareStatement("SELECT * FROM pg_details WHERE Food_availaible=? AND Gender=? AND P_id IN(SELECT DISTINCT Q.`P_id` FROM((SELECT S.P_id FROM 1sharing_info AS S WHERE S.Rent<=?)UNION(SELECT T.`P_id` FROM 6sharing_info AS T WHERE T.`Rent`>=?) UNION(SELECT U.P_id FROM 2sharing_info AS U)UNION	(SELECT V.P_id FROM 3sharing_info AS V)UNION	(SELECT W.P_id FROM 4sharing_info AS W)UNION	(SELECT B.P_id FROM 5sharing_info AS B)	) AS Q);");
		pt.setString(1, Food_available);
		pt.setString(2, Gender);
		pt.setInt(3, Max_budget);
		pt.setInt(4, Min_budget);
		rt=pt.executeQuery();
		while(rt.next())
		{
			System.out.println(rt.getString("P_name"));
			PG.setO_id(rt.getInt("O_id"));
			PG.setImage(rt.getString("Image"));
			PG.setAddress(rt.getString("Address"));
			PG.setContact_person(rt.getString("Contact_Person"));
			PG.setEmail_id(rt.getString("Email_id"));
			PG.setFood_available(rt.getString("Food_availaible"));
			PG.setGender(rt.getString("Gender"));
			PG.setLatitude(rt.getFloat("Latitude"));
			PG.setLicence_no(rt.getInt("Licence_no"));
			PG.setLocation(rt.getString("Location"));
			PG.setLongitude(rt.getFloat("Longitude"));
			PG.setOperating_since(rt.getInt("Operating_since"));
			PG.setP_name(rt.getString("P_name"));
			PG.setPhone(rt.getString("Phone"));
			PG.setWebsite(rt.getString("Website"));
			pg.add(rt.getString("P_name"));
			
		}
	
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
	
	return pg;
	
}

public ArrayList<String> query2(String Location,int Min_budget ,String Food_available,String Gender)
{
	ArrayList<String> pg=new ArrayList<String>();
pojo.Pg_details PG = new pojo.Pg_details();
	try {
		pt=con.prepareStatement("SELECT * FROM pg_details WHERE Food_availaible=? AND Gender=? AND Location=? AND P_id IN(SELECT DISTINCT Q.`P_id` FROM((SELECT S.P_id FROM 1sharing_info AS S)UNION(SELECT T.`P_id` FROM 6sharing_info AS T WHERE T.`Rent`>=?) UNION(SELECT U.P_id FROM 2sharing_info AS U)UNION	(SELECT V.P_id FROM 3sharing_info AS V)UNION	(SELECT W.P_id FROM 4sharing_info AS W)UNION	(SELECT B.P_id FROM 5sharing_info AS B)	) AS Q);");
		pt.setString(1, Food_available);
		pt.setString(2, Gender);
		pt.setString(3, Location);
		pt.setInt(4, Min_budget);
		rt=pt.executeQuery();
		while(rt.next())
		{
			System.out.println(rt.getString("P_name"));
			PG.setO_id(rt.getInt("O_id"));
			PG.setImage(rt.getString("Image"));
			PG.setAddress(rt.getString("Address"));
			PG.setContact_person(rt.getString("Contact_Person"));
			PG.setEmail_id(rt.getString("Email_id"));
			PG.setFood_available(rt.getString("Food_availaible"));
			PG.setGender(rt.getString("Gender"));
			PG.setLatitude(rt.getFloat("Latitude"));
			PG.setLicence_no(rt.getInt("Licence_no"));
			PG.setLocation(rt.getString("Location"));
			PG.setLongitude(rt.getFloat("Longitude"));
			PG.setOperating_since(rt.getInt("Operating_since"));
			PG.setP_name(rt.getString("P_name"));
			PG.setPhone(rt.getString("Phone"));
			PG.setWebsite(rt.getString("Website"));
			pg.add(rt.getString("P_name"));
			
		}
	
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
	
	return pg;
	
}
public ArrayList<String> query3(String Location,int Max_budget,String Food_available,String Gender)
{
	ArrayList<String> pg=new ArrayList<String>();
pojo.Pg_details PG = new pojo.Pg_details();
	try {
		pt=con.prepareStatement("SELECT * FROM pg_details WHERE Food_availaible=? AND Gender=? AND Location=? AND P_id IN(SELECT DISTINCT Q.`P_id` FROM((SELECT S.P_id FROM 1sharing_info AS S WHERE S.Rent<=?)UNION(SELECT T.`P_id` FROM 6sharing_info AS T ) UNION(SELECT U.P_id FROM 2sharing_info AS U)UNION	(SELECT V.P_id FROM 3sharing_info AS V)UNION	(SELECT W.P_id FROM 4sharing_info AS W)UNION	(SELECT B.P_id FROM 5sharing_info AS B)	) AS Q);");
		pt.setString(1, Food_available);
		pt.setString(2, Gender);
		pt.setString(3, Location);
		pt.setInt(4, Max_budget);
		rt=pt.executeQuery();
		while(rt.next())
		{
			System.out.println(rt.getString("P_name"));
			PG.setO_id(rt.getInt("O_id"));
			PG.setImage(rt.getString("Image"));
			PG.setAddress(rt.getString("Address"));
			PG.setContact_person(rt.getString("Contact_Person"));
			PG.setEmail_id(rt.getString("Email_id"));
			PG.setFood_available(rt.getString("Food_availaible"));
			PG.setGender(rt.getString("Gender"));
			PG.setLatitude(rt.getFloat("Latitude"));
			PG.setLicence_no(rt.getInt("Licence_no"));
			PG.setLocation(rt.getString("Location"));
			PG.setLongitude(rt.getFloat("Longitude"));
			PG.setOperating_since(rt.getInt("Operating_since"));
			PG.setP_name(rt.getString("P_name"));
			PG.setPhone(rt.getString("Phone"));
			PG.setWebsite(rt.getString("Website"));
			pg.add(rt.getString("P_name"));
			
		}
	
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
	
	return pg;
	
}
public ArrayList<String> query4(String Location,int Max_budget,int Min_budget,String Gender)
{
	ArrayList<String> pg=new ArrayList<String>();
pojo.Pg_details PG = new pojo.Pg_details();
	try {
		pt=con.prepareStatement("SELECT * FROM pg_details WHERE Gender=? AND Location=? AND P_id IN(SELECT DISTINCT Q.`P_id` FROM((SELECT S.P_id FROM 1sharing_info AS S WHERE S.Rent<=?)UNION(SELECT T.`P_id` FROM 6sharing_info AS T WHERE T.`Rent`>=?) UNION(SELECT U.P_id FROM 2sharing_info AS U)UNION	(SELECT V.P_id FROM 3sharing_info AS V)UNION	(SELECT W.P_id FROM 4sharing_info AS W)UNION	(SELECT B.P_id FROM 5sharing_info AS B)	) AS Q);");
		pt.setString(1, Gender);
		pt.setString(2, Location);
		pt.setInt(3, Max_budget);
		pt.setInt(4, Min_budget);
		rt=pt.executeQuery();
		while(rt.next())
		{
			System.out.println(rt.getString("P_name"));
			PG.setO_id(rt.getInt("O_id"));
			PG.setImage(rt.getString("Image"));
			PG.setAddress(rt.getString("Address"));
			PG.setContact_person(rt.getString("Contact_Person"));
			PG.setEmail_id(rt.getString("Email_id"));
			PG.setFood_available(rt.getString("Food_availaible"));
			PG.setGender(rt.getString("Gender"));
			PG.setLatitude(rt.getFloat("Latitude"));
			PG.setLicence_no(rt.getInt("Licence_no"));
			PG.setLocation(rt.getString("Location"));
			PG.setLongitude(rt.getFloat("Longitude"));
			PG.setOperating_since(rt.getInt("Operating_since"));
			PG.setP_name(rt.getString("P_name"));
			PG.setPhone(rt.getString("Phone"));
			PG.setWebsite(rt.getString("Website"));
			pg.add(rt.getString("P_name"));
			
		}
	
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
	
	return pg;
	
}
public ArrayList<String> query5(int Min_budget,String Food_available,String Gender)
{
	ArrayList<String> pg=new ArrayList<String>();
pojo.Pg_details PG = new pojo.Pg_details();
	try {
		pt=con.prepareStatement("SELECT * FROM pg_details WHERE Food_availaible=? AND Gender=? AND P_id IN(SELECT DISTINCT Q.`P_id` FROM((SELECT S.P_id FROM 1sharing_info AS S )UNION(SELECT T.`P_id` FROM 6sharing_info AS T WHERE T.`Rent`>=?) UNION(SELECT U.P_id FROM 2sharing_info AS U)UNION	(SELECT V.P_id FROM 3sharing_info AS V)UNION	(SELECT W.P_id FROM 4sharing_info AS W)UNION	(SELECT B.P_id FROM 5sharing_info AS B)	) AS Q);");
		pt.setString(1, Food_available);
		pt.setString(2, Gender);

		pt.setInt(3, Min_budget);
		rt=pt.executeQuery();
		while(rt.next())
		{
			System.out.println(rt.getString("P_name"));
			PG.setO_id(rt.getInt("O_id"));
			PG.setImage(rt.getString("Image"));
			PG.setAddress(rt.getString("Address"));
			PG.setContact_person(rt.getString("Contact_Person"));
			PG.setEmail_id(rt.getString("Email_id"));
			PG.setFood_available(rt.getString("Food_availaible"));
			PG.setGender(rt.getString("Gender"));
			PG.setLatitude(rt.getFloat("Latitude"));
			PG.setLicence_no(rt.getInt("Licence_no"));
			PG.setLocation(rt.getString("Location"));
			PG.setLongitude(rt.getFloat("Longitude"));
			PG.setOperating_since(rt.getInt("Operating_since"));
			PG.setP_name(rt.getString("P_name"));
			PG.setPhone(rt.getString("Phone"));
			PG.setWebsite(rt.getString("Website"));
			pg.add(rt.getString("P_name"));
			
		}
	
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
	
	return pg;
	
}
public ArrayList<String> query6(String Location,String Food_available,String Gender)
{
	ArrayList<String> pg=new ArrayList<String>();
pojo.Pg_details PG = new pojo.Pg_details();
	try {
		pt=con.prepareStatement("SELECT * FROM pg_details WHERE Food_availaible=? AND Gender=? AND Location=? AND P_id IN(SELECT DISTINCT Q.`P_id` FROM((SELECT S.P_id FROM 1sharing_info AS S )UNION(SELECT T.`P_id` FROM 6sharing_info AS T) UNION(SELECT U.P_id FROM 2sharing_info AS U)UNION	(SELECT V.P_id FROM 3sharing_info AS V)UNION	(SELECT W.P_id FROM 4sharing_info AS W)UNION	(SELECT B.P_id FROM 5sharing_info AS B)	) AS Q);");
		pt.setString(1, Food_available);
		pt.setString(2, Gender);
		pt.setString(3, Location);
		rt=pt.executeQuery();
		while(rt.next())
		{
			System.out.println(rt.getString("P_name"));
			PG.setO_id(rt.getInt("O_id"));
			PG.setImage(rt.getString("Image"));
			PG.setAddress(rt.getString("Address"));
			PG.setContact_person(rt.getString("Contact_Person"));
			PG.setEmail_id(rt.getString("Email_id"));
			PG.setFood_available(rt.getString("Food_availaible"));
			PG.setGender(rt.getString("Gender"));
			PG.setLatitude(rt.getFloat("Latitude"));
			PG.setLicence_no(rt.getInt("Licence_no"));
			PG.setLocation(rt.getString("Location"));
			PG.setLongitude(rt.getFloat("Longitude"));
			PG.setOperating_since(rt.getInt("Operating_since"));
			PG.setP_name(rt.getString("P_name"));
			PG.setPhone(rt.getString("Phone"));
			PG.setWebsite(rt.getString("Website"));
			pg.add(rt.getString("P_name"));
			
		}
	
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
	
	return pg;
	
}
public ArrayList<String> query7(String Location,int Max_budget ,String Gender)
{
	ArrayList<String> pg=new ArrayList<String>();
pojo.Pg_details PG = new pojo.Pg_details();
	try {
		pt=con.prepareStatement("SELECT * FROM pg_details WHERE  Gender=? AND Location=? AND P_id IN(SELECT DISTINCT Q.`P_id` FROM((SELECT S.P_id FROM 1sharing_info AS S WHERE S.Rent<=?)UNION(SELECT T.`P_id` FROM 6sharing_info AS T WHERE) UNION(SELECT U.P_id FROM 2sharing_info AS U)UNION	(SELECT V.P_id FROM 3sharing_info AS V)UNION	(SELECT W.P_id FROM 4sharing_info AS W)UNION	(SELECT B.P_id FROM 5sharing_info AS B)	) AS Q);");
		pt.setString(1, Gender);
		pt.setString(2,Location);
		pt.setInt(3, Max_budget);
		rt=pt.executeQuery();
		while(rt.next())
		{
			System.out.println(rt.getString("P_name"));
			PG.setO_id(rt.getInt("O_id"));
			PG.setImage(rt.getString("Image"));
			PG.setAddress(rt.getString("Address"));
			PG.setContact_person(rt.getString("Contact_Person"));
			PG.setEmail_id(rt.getString("Email_id"));
			PG.setFood_available(rt.getString("Food_availaible"));
			PG.setGender(rt.getString("Gender"));
			PG.setLatitude(rt.getFloat("Latitude"));
			PG.setLicence_no(rt.getInt("Licence_no"));
			PG.setLocation(rt.getString("Location"));
			PG.setLongitude(rt.getFloat("Longitude"));
			PG.setOperating_since(rt.getInt("Operating_since"));
			PG.setP_name(rt.getString("P_name"));
			PG.setPhone(rt.getString("Phone"));
			PG.setWebsite(rt.getString("Website"));
			pg.add(rt.getString("P_name"));
			
		}
	
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
	
	return pg;
	
}
public ArrayList<String> query8(int Max_budget,String Food_available,String Gender)
{
	ArrayList<String> pg=new ArrayList<String>();
pojo.Pg_details PG = new pojo.Pg_details();
	try {
		pt=con.prepareStatement("SELECT * FROM pg_details WHERE Food_availaible=? AND Gender=? AND P_id IN(SELECT DISTINCT Q.`P_id` FROM((SELECT S.P_id FROM 1sharing_info AS S WHERE S.Rent<=?)UNION(SELECT T.`P_id` FROM 6sharing_info AS T) UNION(SELECT U.P_id FROM 2sharing_info AS U)UNION	(SELECT V.P_id FROM 3sharing_info AS V)UNION	(SELECT W.P_id FROM 4sharing_info AS W)UNION	(SELECT B.P_id FROM 5sharing_info AS B)	) AS Q);");
		pt.setString(1, Food_available);
		pt.setString(2, Gender);
		pt.setInt(3, Max_budget);
		rt=pt.executeQuery();
		while(rt.next())
		{
			System.out.println(rt.getString("P_name"));
			PG.setO_id(rt.getInt("O_id"));
			PG.setImage(rt.getString("Image"));
			PG.setAddress(rt.getString("Address"));
			PG.setContact_person(rt.getString("Contact_Person"));
			PG.setEmail_id(rt.getString("Email_id"));
			PG.setFood_available(rt.getString("Food_availaible"));
			PG.setGender(rt.getString("Gender"));
			PG.setLatitude(rt.getFloat("Latitude"));
			PG.setLicence_no(rt.getInt("Licence_no"));
			PG.setLocation(rt.getString("Location"));
			PG.setLongitude(rt.getFloat("Longitude"));
			PG.setOperating_since(rt.getInt("Operating_since"));
			PG.setP_name(rt.getString("P_name"));
			PG.setPhone(rt.getString("Phone"));
			PG.setWebsite(rt.getString("Website"));
			pg.add(rt.getString("P_name"));
			
		}
	
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
	
	return pg;
	
}
public ArrayList<String> query9(int Max_budget,int Min_budget,String Gender)
{
	ArrayList<String> pg=new ArrayList<String>();
pojo.Pg_details PG = new pojo.Pg_details();
	try {
		pt=con.prepareStatement("SELECT * FROM pg_details WHERE  Gender=? AND P_id IN(SELECT DISTINCT Q.`P_id` FROM((SELECT S.P_id FROM 1sharing_info AS S WHERE S.Rent<=?)UNION(SELECT T.`P_id` FROM 6sharing_info AS T WHERE T.`Rent`>=?) UNION(SELECT U.P_id FROM 2sharing_info AS U)UNION	(SELECT V.P_id FROM 3sharing_info AS V)UNION	(SELECT W.P_id FROM 4sharing_info AS W)UNION	(SELECT B.P_id FROM 5sharing_info AS B)	) AS Q);");
		pt.setString(1, Gender);
		pt.setInt(2, Max_budget);
		pt.setInt(3, Min_budget);
		rt=pt.executeQuery();
		while(rt.next())
		{
			System.out.println(rt.getString("P_name"));
			PG.setO_id(rt.getInt("O_id"));
			PG.setImage(rt.getString("Image"));
			PG.setAddress(rt.getString("Address"));
			PG.setContact_person(rt.getString("Contact_Person"));
			PG.setEmail_id(rt.getString("Email_id"));
			PG.setFood_available(rt.getString("Food_availaible"));
			PG.setGender(rt.getString("Gender"));
			PG.setLatitude(rt.getFloat("Latitude"));
			PG.setLicence_no(rt.getInt("Licence_no"));
			PG.setLocation(rt.getString("Location"));
			PG.setLongitude(rt.getFloat("Longitude"));
			PG.setOperating_since(rt.getInt("Operating_since"));
			PG.setP_name(rt.getString("P_name"));
			PG.setPhone(rt.getString("Phone"));
			PG.setWebsite(rt.getString("Website"));
			pg.add(rt.getString("P_name"));
			
		}
	
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
	
	return pg;
	
}
public ArrayList<String> query10(String Location,int Min_budget ,String Gender)
{
	ArrayList<String> pg=new ArrayList<String>();
pojo.Pg_details PG = new pojo.Pg_details();
	try {
		pt=con.prepareStatement("SELECT * FROM pg_details WHERE Location=? AND Gender=? AND P_id IN(SELECT DISTINCT Q.`P_id` FROM((SELECT S.P_id FROM 1sharing_info AS S)UNION(SELECT T.`P_id` FROM 6sharing_info AS T WHERE T.`Rent`>=?) UNION(SELECT U.P_id FROM 2sharing_info AS U)UNION	(SELECT V.P_id FROM 3sharing_info AS V)UNION	(SELECT W.P_id FROM 4sharing_info AS W)UNION	(SELECT B.P_id FROM 5sharing_info AS B)	) AS Q);");
		pt.setString(1, Location);
		pt.setString(2, Gender);
		pt.setInt(3, Min_budget);
		rt=pt.executeQuery();
		while(rt.next())
		{
			System.out.println(rt.getString("P_name"));
			PG.setO_id(rt.getInt("O_id"));
			PG.setImage(rt.getString("Image"));
			PG.setAddress(rt.getString("Address"));
			PG.setContact_person(rt.getString("Contact_Person"));
			PG.setEmail_id(rt.getString("Email_id"));
			PG.setFood_available(rt.getString("Food_availaible"));
			PG.setGender(rt.getString("Gender"));
			PG.setLatitude(rt.getFloat("Latitude"));
			PG.setLicence_no(rt.getInt("Licence_no"));
			PG.setLocation(rt.getString("Location"));
			PG.setLongitude(rt.getFloat("Longitude"));
			PG.setOperating_since(rt.getInt("Operating_since"));
			PG.setP_name(rt.getString("P_name"));
			PG.setPhone(rt.getString("Phone"));
			PG.setWebsite(rt.getString("Website"));
			pg.add(rt.getString("P_name"));
			
		}
	
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
	
	return pg;
	
}
public ArrayList<String> query11(String Food_available,String Gender)
{
	ArrayList<String> pg=new ArrayList<String>();
pojo.Pg_details PG = new pojo.Pg_details();
	try {
		pt=con.prepareStatement("SELECT * FROM pg_details WHERE Food_availaible=? AND Gender=? AND P_id IN(SELECT DISTINCT Q.`P_id` FROM((SELECT S.P_id FROM 1sharing_info AS S)UNION(SELECT T.`P_id` FROM 6sharing_info AS T ) UNION(SELECT U.P_id FROM 2sharing_info AS U)UNION	(SELECT V.P_id FROM 3sharing_info AS V)UNION	(SELECT W.P_id FROM 4sharing_info AS W)UNION	(SELECT B.P_id FROM 5sharing_info AS B)	) AS Q);");
		pt.setString(1, Food_available);
		pt.setString(2, Gender);
		rt=pt.executeQuery();
		while(rt.next())
		{
			System.out.println(rt.getString("P_name"));
			PG.setO_id(rt.getInt("O_id"));
			PG.setImage(rt.getString("Image"));
			PG.setAddress(rt.getString("Address"));
			PG.setContact_person(rt.getString("Contact_Person"));
			PG.setEmail_id(rt.getString("Email_id"));
			PG.setFood_available(rt.getString("Food_availaible"));
			PG.setGender(rt.getString("Gender"));
			PG.setLatitude(rt.getFloat("Latitude"));
			PG.setLicence_no(rt.getInt("Licence_no"));
			PG.setLocation(rt.getString("Location"));
			PG.setLongitude(rt.getFloat("Longitude"));
			PG.setOperating_since(rt.getInt("Operating_since"));
			PG.setP_name(rt.getString("P_name"));
			PG.setPhone(rt.getString("Phone"));
			PG.setWebsite(rt.getString("Website"));
			pg.add(rt.getString("P_name"));
			
		}
	
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
	
	return pg;
	
}
public ArrayList<String> query12(String Location,String Gender)
{
	ArrayList<String> pg=new ArrayList<String>();
pojo.Pg_details PG = new pojo.Pg_details();
	try {
		pt=con.prepareStatement("SELECT * FROM pg_details WHERE Location=? AND Gender=? AND P_id IN(SELECT DISTINCT Q.`P_id` FROM((SELECT S.P_id FROM 1sharing_info AS S)UNION(SELECT T.`P_id` FROM 6sharing_info AS T ) UNION(SELECT U.P_id FROM 2sharing_info AS U)UNION	(SELECT V.P_id FROM 3sharing_info AS V)UNION	(SELECT W.P_id FROM 4sharing_info AS W)UNION	(SELECT B.P_id FROM 5sharing_info AS B)	) AS Q);");
		pt.setString(1, Location);
		pt.setString(2, Gender);
		rt=pt.executeQuery();
		while(rt.next())
		{
			System.out.println(rt.getString("P_name"));
			PG.setO_id(rt.getInt("O_id"));
			PG.setImage(rt.getString("Image"));
			PG.setAddress(rt.getString("Address"));
			PG.setContact_person(rt.getString("Contact_Person"));
			PG.setEmail_id(rt.getString("Email_id"));
			PG.setFood_available(rt.getString("Food_availaible"));
			PG.setGender(rt.getString("Gender"));
			PG.setLatitude(rt.getFloat("Latitude"));
			PG.setLicence_no(rt.getInt("Licence_no"));
			PG.setLocation(rt.getString("Location"));
			PG.setLongitude(rt.getFloat("Longitude"));
			PG.setOperating_since(rt.getInt("Operating_since"));
			PG.setP_name(rt.getString("P_name"));
			PG.setPhone(rt.getString("Phone"));
			PG.setWebsite(rt.getString("Website"));
			pg.add(rt.getString("P_name"));
			
		}
	
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
	
	return pg;
	
}
public ArrayList<String> query13(int Max_budget,String Gender)
{
	ArrayList<String> pg=new ArrayList<String>();
pojo.Pg_details PG = new pojo.Pg_details();
	try {
		pt=con.prepareStatement("SELECT * FROM pg_details WHERE  Gender=? AND P_id IN(SELECT DISTINCT Q.`P_id` FROM((SELECT S.P_id FROM 1sharing_info AS S WHERE S.Rent<=?)UNION(SELECT T.`P_id` FROM 6sharing_info AS T ) UNION(SELECT U.P_id FROM 2sharing_info AS U)UNION	(SELECT V.P_id FROM 3sharing_info AS V)UNION	(SELECT W.P_id FROM 4sharing_info AS W)UNION	(SELECT B.P_id FROM 5sharing_info AS B)	) AS Q);");
		pt.setString(1, Gender);
		pt.setInt(2, Max_budget);
		rt=pt.executeQuery();
		while(rt.next())
		{
			System.out.println(rt.getString("P_name"));
			PG.setO_id(rt.getInt("O_id"));
			PG.setImage(rt.getString("Image"));
			PG.setAddress(rt.getString("Address"));
			PG.setContact_person(rt.getString("Contact_Person"));
			PG.setEmail_id(rt.getString("Email_id"));
			PG.setFood_available(rt.getString("Food_availaible"));
			PG.setGender(rt.getString("Gender"));
			PG.setLatitude(rt.getFloat("Latitude"));
			PG.setLicence_no(rt.getInt("Licence_no"));
			PG.setLocation(rt.getString("Location"));
			PG.setLongitude(rt.getFloat("Longitude"));
			PG.setOperating_since(rt.getInt("Operating_since"));
			PG.setP_name(rt.getString("P_name"));
			PG.setPhone(rt.getString("Phone"));
			PG.setWebsite(rt.getString("Website"));
			pg.add(rt.getString("P_name"));
			
		}
	
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
	
	return pg;
	
}
public ArrayList<String> query14(int Min_budget,String Gender)
{
	ArrayList<String> pg=new ArrayList<String>();
pojo.Pg_details PG = new pojo.Pg_details();
	try {
		pt=con.prepareStatement("SELECT * FROM pg_details WHERE  Gender=? AND P_id IN(SELECT DISTINCT Q.`P_id` FROM((SELECT S.P_id FROM 1sharing_info AS S )UNION(SELECT T.`P_id` FROM 6sharing_info AS T WHERE T.`Rent`>=?) UNION(SELECT U.P_id FROM 2sharing_info AS U)UNION	(SELECT V.P_id FROM 3sharing_info AS V)UNION	(SELECT W.P_id FROM 4sharing_info AS W)UNION	(SELECT B.P_id FROM 5sharing_info AS B)	) AS Q);");
		pt.setString(1, Gender);
		pt.setInt(2, Min_budget);
		rt=pt.executeQuery();
		while(rt.next())
		{
			System.out.println(rt.getString("P_name"));
			PG.setO_id(rt.getInt("O_id"));
			PG.setImage(rt.getString("Image"));
			PG.setAddress(rt.getString("Address"));
			PG.setContact_person(rt.getString("Contact_Person"));
			PG.setEmail_id(rt.getString("Email_id"));
			PG.setFood_available(rt.getString("Food_availaible"));
			PG.setGender(rt.getString("Gender"));
			PG.setLatitude(rt.getFloat("Latitude"));
			PG.setLicence_no(rt.getInt("Licence_no"));
			PG.setLocation(rt.getString("Location"));
			PG.setLongitude(rt.getFloat("Longitude"));
			PG.setOperating_since(rt.getInt("Operating_since"));
			PG.setP_name(rt.getString("P_name"));
			PG.setPhone(rt.getString("Phone"));
			PG.setWebsite(rt.getString("Website"));
			pg.add(rt.getString("P_name"));
			
		}
	
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
	
	return pg;
	
}
public ArrayList<String> query15(String Gender)
{
	ArrayList<pojo.Pg_details> pg=new ArrayList<pojo.Pg_details>();
	ArrayList<String> pgs=new ArrayList<String>();

	pojo.Pg_details PG = new pojo.Pg_details();
	try {
		pt=con.prepareStatement("SELECT * FROM pg_details WHERE Gender=? AND P_id IN(SELECT DISTINCT Q.`P_id` FROM((SELECT S.P_id FROM 1sharing_info AS S)UNION(SELECT T.`P_id` FROM 6sharing_info AS T ) UNION(SELECT U.P_id FROM 2sharing_info AS U)UNION	(SELECT V.P_id FROM 3sharing_info AS V)UNION	(SELECT W.P_id FROM 4sharing_info AS W)UNION	(SELECT B.P_id FROM 5sharing_info AS B)	) AS Q);");
		pt.setString(1, Gender);
		rt=pt.executeQuery();
		while(rt.next())
		{
			System.out.println(rt.getString("P_name"));
			PG.setO_id(rt.getInt("O_id"));
			PG.setImage(rt.getString("Image"));
			PG.setAddress(rt.getString("Address"));
			PG.setContact_person(rt.getString("Contact_Person"));
			PG.setEmail_id(rt.getString("Email_id"));
			PG.setFood_available(rt.getString("Food_availaible"));
			PG.setGender(rt.getString("Gender"));
			PG.setLatitude(rt.getFloat("Latitude"));
			PG.setLicence_no(rt.getInt("Licence_no"));
			PG.setLocation(rt.getString("Location"));
			PG.setLongitude(rt.getFloat("Longitude"));
			PG.setOperating_since(rt.getInt("Operating_since"));
			PG.setP_name(rt.getString("P_name"));
			PG.setPhone(rt.getString("Phone"));
			PG.setWebsite(rt.getString("Website"));
			//pg.add(PG);
			pgs.add(rt.getString("P_name"));
		}
	
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
	
	return pgs;
	
}

}
