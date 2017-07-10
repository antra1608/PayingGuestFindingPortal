package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import util.DBhelper;

public class lodger {
	Connection con = DBhelper.getConnection();
	PreparedStatement pt;
	ResultSet rt;

	public String getpassword(String email) {
		String password = null;
		try {
			pt = con.prepareStatement("select Password from lodger where Email=?");
			pt.setString(1, email);
			rt = pt.executeQuery();
			while (rt.next()) {
				password = rt.getString("Password");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return password;
	}

	public int book(String username)

	{
		int i = 0;

		try {
			pt = con.prepareStatement("update lodger set  Status=? where L_username=? ");

			pt.setString(1, "Enrolled");
			pt.setString(2, username);

			i = pt.executeUpdate();
			System.out.println("enrolled user" + i);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return i;
	}
	public int delete(int L_id)
	{
		int i = 0;

		try {
			pt = con.prepareStatement("delete from lodger_to_pg where L_id=? ");

			pt.setInt(1, L_id);

			i = pt.executeUpdate();
			System.out.println("lodger deleted" + i);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return i;
		
	}
	public int set_interest(int L_id,int P_id)

	{
		int i = 0;

		try {
			pt = con.prepareStatement("insert into lodgers_interest_in_pg (L_id,P_id) values(?,?) ");

			pt.setInt(1, L_id);
			pt.setInt(2, P_id);

			i = pt.executeUpdate();
			System.out.println("interest booked" + i);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return i;
	}


	public String getmail(String username) {
		String mail = null;
		try {
			pt = con.prepareStatement("select Email from lodger where L_username=?");
			pt.setString(1, username);
			rt = pt.executeQuery();
			while (rt.next()) {
				mail = rt.getString("Email");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return mail;

	}

	public int getid(String username) {
		int L_id = 0;
		try {
			pt = con.prepareStatement("select L_id from lodger where L_username=?");
			pt.setString(1, username);
			rt = pt.executeQuery();
			while (rt.next()) {
				L_id = rt.getInt("L_id");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return L_id;

	}
	public int getsharing(int L_id) {
		int Sharing = 0;
		try {
			pt = con.prepareStatement("select Sharing from lodger_to_pg where L_id=?");
			pt.setInt(1, L_id);
			rt = pt.executeQuery();
			while (rt.next()) {
				Sharing = rt.getInt("Sharing");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return Sharing;

	}

	public int getp_id(int L_id) {
		int P_id = 0;
		try {
			pt = con.prepareStatement("select P_id from lodger_to_pg where L_id=?");
			pt.setInt(1, L_id);
			rt = pt.executeQuery();
			while (rt.next()) {
				P_id = rt.getInt("P_id");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return P_id;

	}


	
	public String getstatus(int L_id) {
		String status=null;
		try {
			pt = con.prepareStatement("select Status from lodger where L_id=?");
			pt.setInt(1, L_id);
			rt = pt.executeQuery();
			while (rt.next()) {
				status = rt.getString("Status");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return status;

	}

	public int insert(pojo.Lodger u) {
		int i = 0;
		try {
			pt = con.prepareStatement("insert into lodger (L_name,L_username,Password,Mobile,Email) values(?,?,?,?,?)");
			pt.setString(1, u.getL_name());

			pt.setString(2, u.getL_username());
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

	public int set_meeting(java.sql.Date Date, java.sql.Time Time, int P_id, int L_id, int O_id) {
		int i = 0;
		try {
			pt = con.prepareStatement("insert into meeting (L_id,P_id,O_id,Date,Time,Status) values(?,?,?,?,?,?)");
			pt.setInt(1, L_id);
			pt.setInt(2, P_id);
			pt.setInt(3, O_id);
			pt.setDate(4, Date);
			pt.setTime(5, Time);
			pt.setString(6, "Not Confirm");

			i = pt.executeUpdate();
			System.out.println("meeting Fixed" + i);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return i;
	}

	public int book_interest(int L_id, int P_id) {
		int i = 0;
		try {
			pt = con.prepareStatement("insert into lodgers_interest_in_pg (L_id,P_id) values(?,?)");
			pt.setInt(1, L_id);
			pt.setInt(2, P_id);

			i = pt.executeUpdate();
			System.out.println("Interest noted" + i);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return i;
	}

	public int book_pg(pojo.Lodger u, int P_id, int L_id, int sharing) {
		int i = 0;
		try {
			pt = con.prepareStatement(
					"insert into lodger_to_pg (L_id,P_id,Sharing,Rent_paid,Native_address,Occupation,Guardian,Guardian_contact,Date_of_admission,Duration) values(?,?,?,?,?,?,?,?,?,?)");

			DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
			Date myDate = formatter.parse(u.getDate_of_admission());
			java.sql.Date sqlDate = new java.sql.Date(myDate.getTime());

			pt.setInt(1, L_id);

			pt.setInt(2, P_id);
			pt.setInt(3, sharing);
			pt.setString(4, "No");
			pt.setString(5, u.getNative_Address());
			pt.setString(6, u.getOccupation());

			pt.setString(7, u.getGuardian_Name());

			pt.setString(8, u.getGuardian_Contact());

			pt.setDate(9, sqlDate);

			pt.setString(10, u.getMonth());

			i = pt.executeUpdate();
			System.out.println("PG Booked" + i);

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}

	public int select(String username, String password) {
		int i = 0;
		try {

			pt = con.prepareStatement("select * from lodger where L_username=? AND Password=?");
			pt.setString(1, username);
			pt.setString(2, password);

			ResultSet rs = pt.executeQuery();
			if (rs.next()) {
				i = 1;
				System.out.println("inside");
			} else {
				i = 0;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return i;

	}

	public ArrayList<pojo.Lodger> update(String username) {
		ArrayList<pojo.Lodger> ad = new ArrayList<pojo.Lodger>();
		Connection con = DBhelper.getConnection();
		PreparedStatement ps;
		ResultSet rs;
		try {
			ps = con.prepareStatement("select * from lodger where L_username=? ");
			ps.setString(1, username);
			rs = ps.executeQuery();

			while (rs.next()) {
				pojo.Lodger l = new pojo.Lodger();
				l.setL_name(rs.getString(2));
				l.setL_username(rs.getString(3));
				l.setMobile(rs.getInt(5));
				l.setEmail(rs.getString(6));
				l.setPassword(rs.getString(4));
				l.setGender(rs.getString(8));
				ad.add(l);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ad;
	}

	public int update(pojo.Lodger l, String username) {
		int i = 0;
		try {
			pt = con.prepareStatement("update lodger set  L_username=?, Email=? ,Mobile=? where L_username=? ");

			pt.setString(1, l.getL_username());
			pt.setString(2, l.getEmail());
			pt.setInt(3, l.getMobile());
			pt.setString(4, username);

			i = pt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}

	public int update(String Current_password, String New_password, String username) {
		int i = 0;
		try {
			pt = con.prepareStatement("update lodger set Password=? where Password=? AND L_username=?  ");
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

}
