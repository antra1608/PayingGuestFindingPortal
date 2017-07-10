package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import util.DBhelper;

public class Sharing_info {
	Connection con=DBhelper.getConnection();
	PreparedStatement pt;
	ResultSet rs;
	Connection com=DBhelper.getConnection();
	PreparedStatement ps;
	ResultSet rt;
/*	Connection coo=DBhelper.getConnection();
	PreparedStatement pv;
	ResultSet ru;
	Connection cop=DBhelper.getConnection();
	PreparedStatement pw;
	ResultSet rv;
	Connection coq=DBhelper.getConnection();
	PreparedStatement px;
	ResultSet rw;
	Connection cor=DBhelper.getConnection();
	PreparedStatement py;
	ResultSet rx;
	
	
	
*/
	public ArrayList<String> getsharing(int P_id)
	{
		ArrayList<String> sh=new ArrayList<String>();
		int sharing1=0;
		int sharing2=0;
		int sharing3=0;
		int sharing4=0;
		int sharing5=0;
		int sharing6=0;
		
		try {
	ps=com.prepareStatement("select * from vacancy where P_id=? ");
	ps.setInt(1, P_id);
	rt=ps.executeQuery();
while(rt.next())
{
	 sharing1=rt.getInt("1sharing_vac");
	 sharing2=rt.getInt("2sharing_vac");
	 sharing3=rt.getInt("3sharing_vac");
	 sharing4=	rt.getInt("4sharing_vac");
	 sharing5=rt.getInt("5sharing_vac");
	 sharing6=rt.getInt("6sharing_vac");
}

} catch (SQLException e1) {
	e1.printStackTrace();
}		
		
		try {
			
			
			pt=con.prepareStatement("select * from 1sharing_info where P_id=?");
			pt.setInt(1, P_id);
			rs=pt.executeQuery();
			while(rs.next())
			{
				if(sharing1!=0)
				sh.add(1+"Sharing");
			}
			pt=con.prepareStatement("select * from 2sharing_info where P_id=?");
			pt.setInt(1, P_id);
			rs=pt.executeQuery();
			while(rs.next())
			{
				if(sharing2!=0)
					
				sh.add(2+"Sharing");
			}
			pt=con.prepareStatement("select * from 3sharing_info where P_id=?");
			pt.setInt(1, P_id);
			rs=pt.executeQuery();
			while(rs.next())
			{
				if(sharing3!=0)
					
				sh.add(3+"Sharing");
			}
			pt=con.prepareStatement("select * from 4sharing_info where P_id=?");
			pt.setInt(1, P_id);
			rs=pt.executeQuery();
			while(rs.next())
			{
				if(sharing4!=0)
					
				sh.add(4+"Sharing");
			}
			pt=con.prepareStatement("select * from 5sharing_info where P_id=?");
			pt.setInt(1, P_id);
			rs=pt.executeQuery();
			while(rs.next())
			{
				if(sharing5!=0)
					
				sh.add(5+"Sharing");
			}
			pt=con.prepareStatement("select * from 6sharing_info where P_id=?");
			pt.setInt(1, P_id);
			rs=pt.executeQuery();
			while(rs.next())
			{
				if(sharing6!=0)
					
				sh.add(6+"Sharing");
			}
			
			
		
		
		
		} catch (SQLException e) {
		e.printStackTrace();
		}
		
		return sh;
		
	}
	public ArrayList<Integer> getsharingrent(int P_id)
	{
		ArrayList<Integer> sh=new ArrayList<Integer>();
		
		
		try {
			
			for(int i=1;i<=6;i++)
			{
			pt=con.prepareStatement("select * from "+i+"sharing_info where P_id=?");
			pt.setInt(1, P_id);
			rs=pt.executeQuery();
			while(rs.next())
			{
				sh.add(rs.getInt("Rent"));
			}
			
			}
		
		
		
		} catch (SQLException e) {
		e.printStackTrace();
		}
		
		return sh;
		
	}
	
	
	public int update1sharing(pojo.Sharing_info s1,int P_id , String username)
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
			pt=con.prepareStatement("update 1sharing_info set No_of_1sharing=?,Rent=?,Deposit=? where O_id=? AND P_id=? ");
			pt.setInt(1,s1.getNo_of_sharing() );
			pt.setInt(2, s1.getRent());
			pt.setInt(3, s1.getDeposit());
			pt.setInt(4, id);
			pt.setInt(5, P_id);
			i=pt.executeUpdate();
			System.out.println(i);
		
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return i;
		
	}
	
	public int update2sharing(pojo.Sharing_info s2,int P_id , String username)
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
			pt=con.prepareStatement("update 2sharing_info set No_of_2sharing=?,Rent=?,Deposit=? where O_id=? AND P_id=? ");
			pt.setInt(1,s2.getNo_of_sharing() );
			pt.setInt(2, s2.getRent());
			pt.setInt(3, s2.getDeposit());
			pt.setInt(4, id);
			pt.setInt(5, P_id);
			i=pt.executeUpdate();
			System.out.println(i);
		
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return i;
		
	}
	public int update3sharing(pojo.Sharing_info s3,int P_id , String username)
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
			pt=con.prepareStatement("update 3sharing_info set No_of_3sharing=?,Rent=?,Deposit=? where O_id=? AND P_id=? ");
			pt.setInt(1,s3.getNo_of_sharing() );
			pt.setInt(2, s3.getRent());
			pt.setInt(3, s3.getDeposit());
			pt.setInt(4, id);
			pt.setInt(5, P_id);
			i=pt.executeUpdate();
			System.out.println(i);
		
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return i;
		
	}
	public int update4sharing(pojo.Sharing_info s4,int P_id , String username)
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
			pt=con.prepareStatement("update 4sharing_info set No_of_4sharing=?,Rent=?,Deposit=? where O_id=? AND P_id=? ");
			pt.setInt(1,s4.getNo_of_sharing() );
			pt.setInt(2, s4.getRent());
			pt.setInt(3, s4.getDeposit());
			pt.setInt(4, id);
			pt.setInt(5, P_id);
			i=pt.executeUpdate();
			System.out.println(i);
		
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return i;
		
	}
	public int update5sharing(pojo.Sharing_info s5,int P_id , String username)
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
			pt=con.prepareStatement("update 5sharing_info set No_of_5sharing=?,Rent=?,Deposit=? where O_id=? AND P_id=? ");
			pt.setInt(1,s5.getNo_of_sharing() );
			pt.setInt(2, s5.getRent());
			pt.setInt(3, s5.getDeposit());
			pt.setInt(4, id);
			pt.setInt(5, P_id);
			i=pt.executeUpdate();
			System.out.println(i);
		
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return i;
		
	}
	public int update6sharing(pojo.Sharing_info s6,int P_id , String username)
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
			pt=con.prepareStatement("update 6sharing_info set No_of_6sharing=?,Rent=?,Deposit=? where O_id=? AND P_id=? ");
			pt.setInt(1,s6.getNo_of_sharing() );
			pt.setInt(2, s6.getRent());
			pt.setInt(3, s6.getDeposit());
			pt.setInt(4, id);
			pt.setInt(5, P_id);
			i=pt.executeUpdate();
			System.out.println(i);
		
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return i;
		
	}
	
	public int set_vacancy(pojo.Sharing_info a,int O_id,int P_id)
	{
		int i = 0;
		try {
			pt=con.prepareStatement("insert into vacancy (O_id,P_id,1sharing_vac,2sharing_vac,3sharing_vac,4sharing_vac,5sharing_vac,6sharing_vac) values(?,?,?,?,?,?,?,?)  ");
			pt.setInt(1, O_id);
			pt.setInt(2, P_id);
			pt.setInt(3, a.getSharing1_vac());
			pt.setInt(4,  a.getSharing2_vac());
			pt.setInt(5,  a.getSharing3_vac());
			pt.setInt(6,  a.getSharing4_vac());
			pt.setInt(7,  a.getSharing5_vac());
			pt.setInt(8,  a.getSharing6_vac());
			
			i=pt.executeUpdate();
			System.out.println("vacancy updated"+i);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return i;
		
		
	}
	
	public int update_vacancy_on_insert(int P_id,int sharing)
	{
int i=0;
int vacancy=0;
		try {
			if(sharing==1){
			pt=con.prepareStatement("select 1sharing_vac from vacancy where P_id=?  ");
			pt.setInt(1, P_id);
			rt=pt.executeQuery();
			while(rt.next())
			{
				vacancy=rt.getInt("1sharing_vac");
			}
			vacancy=vacancy-1;
			pt=con.prepareStatement("update vacancy set 1sharing_vac=? where P_id=?");
			pt.setInt(1, vacancy);
			pt.setInt(2,P_id);
			i=pt.executeUpdate();
			System.out.println(" sharing vacancy updated"+i);
			}
			else if(sharing==2)
			{
				pt=con.prepareStatement("select 2sharing_vac from vacancy where P_id=?  ");
				pt.setInt(1, P_id);
				rt=pt.executeQuery();
				while(rt.next())
				{
					vacancy=rt.getInt("2sharing_vac");
				}
				vacancy=vacancy-1;
				pt=con.prepareStatement("update vacancy set 2sharing_vac=? where P_id=?");
				pt.setInt(1, vacancy);
				pt.setInt(2,P_id);
				i=pt.executeUpdate();
				System.out.println(" sharing vacancy updated"+i);
				
					
			}
			else if(sharing==3)
			{
				pt=con.prepareStatement("select 3sharing_vac from vacancy where P_id=?  ");
				pt.setInt(1, P_id);
				rt=pt.executeQuery();
				while(rt.next())
				{
					vacancy=rt.getInt("3sharing_vac");
				}
				vacancy=vacancy-1;
				pt=con.prepareStatement("update vacancy set 3sharing_vac=? where P_id=?");
				pt.setInt(1, vacancy);
				pt.setInt(2,P_id);
				i=pt.executeUpdate();
				System.out.println(" sharing vacancy updated"+i);
				
				
			}
			else if(sharing==4)
			{
				pt=con.prepareStatement("select 4sharing_vac from vacancy where P_id=?  ");
				pt.setInt(1, P_id);
				rt=pt.executeQuery();
				while(rt.next())
				{
					vacancy=rt.getInt("4sharing_vac");
				}
				vacancy=vacancy-1;
				pt=con.prepareStatement("update vacancy set 4sharing_vac=? where P_id=?");
				pt.setInt(1, vacancy);
				pt.setInt(2,P_id);
				i=pt.executeUpdate();
				System.out.println(" sharing vacancy updated"+i);
				
				
			}
			else if(sharing==5)
			{
				pt=con.prepareStatement("select 5sharing_vac from vacancy where P_id=?  ");
				pt.setInt(1, P_id);
				rt=pt.executeQuery();
				while(rt.next())
				{
					vacancy=rt.getInt("5sharing_vac");
				}
				vacancy=vacancy-1;
				pt=con.prepareStatement("update vacancy set 5sharing_vac=? where P_id=?");
				pt.setInt(1, vacancy);
				pt.setInt(2,P_id);
				i=pt.executeUpdate();
				System.out.println(" sharing vacancy updated"+i);
				}
				
			
			else if(sharing==6)
			{
				pt=con.prepareStatement("select 6sharing_vac from vacancy where P_id=?  ");
				pt.setInt(1, P_id);
				rt=pt.executeQuery();
				while(rt.next())
				{
					vacancy=rt.getInt("6sharing_vac");
				}
				vacancy=vacancy-1;
				pt=con.prepareStatement("update vacancy set 6sharing_vac=? where P_id=?");
				pt.setInt(1, vacancy);
				pt.setInt(2,P_id);
				i=pt.executeUpdate();
				System.out.println(" sharing vacancy updated"+i);
				
					
			}
			
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return i;
		
		
	}

	public int update_vacancy_on_delete(int P_id,int sharing)
	{
int i=0;
int vacancy=0;
		try {
			if(sharing==1){
			pt=con.prepareStatement("select 1sharing_vac from vacancy where P_id=?  ");
			pt.setInt(1, P_id);
			rt=pt.executeQuery();
			while(rt.next())
			{
				vacancy=rt.getInt("1sharing_vac");
			}
			vacancy=vacancy+1;
			pt=con.prepareStatement("update vacancy set 1sharing_vac=? where P_id=?");
			pt.setInt(1, vacancy);
			pt.setInt(2,P_id);
			i=pt.executeUpdate();
			System.out.println(" sharing vacancy updated"+i);
			}
			else if(sharing==2)
			{
				pt=con.prepareStatement("select 2sharing_vac from vacancy where P_id=?  ");
				pt.setInt(1, P_id);
				rt=pt.executeQuery();
				while(rt.next())
				{
					vacancy=rt.getInt("2sharing_vac");
				}
				vacancy=vacancy+1;
				pt=con.prepareStatement("update vacancy set 2sharing_vac=? where P_id=?");
				pt.setInt(1, vacancy);
				pt.setInt(2,P_id);
				i=pt.executeUpdate();
				System.out.println(" sharing vacancy updated"+i);
				
					
			}
			else if(sharing==3)
			{
				pt=con.prepareStatement("select 3sharing_vac from vacancy where P_id=?  ");
				pt.setInt(1, P_id);
				rt=pt.executeQuery();
				while(rt.next())
				{
					vacancy=rt.getInt("3sharing_vac");
				}
				vacancy=vacancy+1;
				pt=con.prepareStatement("update vacancy set 3sharing_vac=? where P_id=?");
				pt.setInt(1, vacancy);
				pt.setInt(2,P_id);
				i=pt.executeUpdate();
				System.out.println(" sharing vacancy updated"+i);
				
				
			}
			else if(sharing==4)
			{
				pt=con.prepareStatement("select 4sharing_vac from vacancy where P_id=?  ");
				pt.setInt(1, P_id);
				rt=pt.executeQuery();
				while(rt.next())
				{
					vacancy=rt.getInt("4sharing_vac");
				}
				vacancy=vacancy+1;
				pt=con.prepareStatement("update vacancy set 4sharing_vac=? where P_id=?");
				pt.setInt(1, vacancy);
				pt.setInt(2,P_id);
				i=pt.executeUpdate();
				System.out.println(" sharing vacancy updated"+i);
				
				
			}
			else if(sharing==5)
			{
				pt=con.prepareStatement("select 5sharing_vac from vacancy where P_id=?  ");
				pt.setInt(1, P_id);
				rt=pt.executeQuery();
				while(rt.next())
				{
					vacancy=rt.getInt("5sharing_vac");
				}
				vacancy=vacancy+1;
				pt=con.prepareStatement("update vacancy set 5sharing_vac=? where P_id=?");
				pt.setInt(1, vacancy);
				pt.setInt(2,P_id);
				i=pt.executeUpdate();
				System.out.println(" sharing vacancy updated"+i);
				}
				
			
			else if(sharing==6)
			{
				pt=con.prepareStatement("select 6sharing_vac from vacancy where P_id=?  ");
				pt.setInt(1, P_id);
				rt=pt.executeQuery();
				while(rt.next())
				{
					vacancy=rt.getInt("6sharing_vac");
				}
				vacancy=vacancy+1;
				pt=con.prepareStatement("update vacancy set 6sharing_vac=? where P_id=?");
				pt.setInt(1, vacancy);
				pt.setInt(2,P_id);
				i=pt.executeUpdate();
				System.out.println(" sharing vacancy updated"+i);
				
					
			}
			
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return i;
		
		
	}
public ArrayList<String> getmail_of_interested_lodger(int P_id)
{
	ArrayList<String> mail=new ArrayList<String>();
	try {
		System.out.println("inside here");
		pt=con.prepareStatement("select i.Email from lodgers_interest_in_pg as l, lodger as i where l.L_id=i.L_id and l.P_id=?");
		pt.setInt(1, P_id);
		rt=pt.executeQuery();
		while(rt.next())
		{
			System.out.println("mail id is"+rt.getString("Email"));
			mail.add(rt.getString("Email"));
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
	return mail;
}
	
	public pojo.Sharing_info get_vacancy(int P_id)
	{

		pojo.Sharing_info sh=new pojo.Sharing_info();
		try {
			pt=con.prepareStatement("select * from vacancy where P_id=?  ");
			pt.setInt(1, P_id);
			rt=pt.executeQuery();
			while(rt.next())
			{
				sh.setSharing1_vac(rt.getInt("1sharing_vac"));
				sh.setSharing2_vac(rt.getInt("2sharing_vac"));
				sh.setSharing3_vac(rt.getInt("3sharing_vac"));
				sh.setSharing4_vac(rt.getInt("4sharing_vac"));
				sh.setSharing5_vac(rt.getInt("5sharing_vac"));
				sh.setSharing6_vac(rt.getInt("6sharing_vac"));
				
			}
	} catch (SQLException e) {
				e.printStackTrace();
			}
			return sh;
		
		
	}

	public int insert(pojo.Sharing_info a,int O_id,int P_id) {
		int i = 0;
		try {
			if(a.getSharing()==1)
			{
			pt=con.prepareStatement("insert into 1sharing_info(O_id,P_id,No_of_1sharing,Rent,Deposit) values(?,?,?,?,?)  ");
			pt.setInt(1, O_id);
			pt.setInt(2, P_id);
			pt.setInt(3, a.getNo_of_sharing());
			pt.setInt(4, a.getRent());
			pt.setInt(5, a.getDeposit());
			 i=pt.executeUpdate();
			System.out.println(i);
			}
			if(a.getSharing()==2)
			{
				pt=con.prepareStatement("insert into 2sharing_info(O_id,P_id,No_of_2sharing,Rent,Deposit) values(?,?,?,?,?)  ");
				pt.setInt(1, O_id);
				pt.setInt(2, P_id);
				pt.setInt(3, a.getNo_of_sharing());
				pt.setInt(4, a.getRent());
				pt.setInt(5, a.getDeposit());
				 i=pt.executeUpdate();
				System.out.println(i);
				
			}
			if(a.getSharing()==3)
			{
				pt=con.prepareStatement("insert into 3sharing_info(O_id,P_id,No_of_3sharing,Rent,Deposit) values(?,?,?,?,?)  ");
				pt.setInt(1, O_id);
				pt.setInt(2, P_id);
				pt.setInt(3, a.getNo_of_sharing());
				pt.setInt(4, a.getRent());
				pt.setInt(5, a.getDeposit());
				 i=pt.executeUpdate();
				System.out.println(i);
				
			}
			if(a.getSharing()==4)
			{
				pt=con.prepareStatement("insert into 4sharing_info(O_id,P_id,No_of_4sharing,Rent,Deposit) values(?,?,?,?,?)  ");
				pt.setInt(1, O_id);
				pt.setInt(2, P_id);
				pt.setInt(3, a.getNo_of_sharing());
				pt.setInt(4, a.getRent());
				pt.setInt(5, a.getDeposit());
				 i=pt.executeUpdate();
				System.out.println(i);
				
			}
			if(a.getSharing()==5)
			{
				pt=con.prepareStatement("insert into 5sharing_info(O_id,P_id,No_of_5sharing,Rent,Deposit) values(?,?,?,?,?)  ");
				pt.setInt(1, O_id);
				pt.setInt(2, P_id);
				pt.setInt(3, a.getNo_of_sharing());
				pt.setInt(4, a.getRent());
				pt.setInt(5, a.getDeposit());
				 i=pt.executeUpdate();
				System.out.println(i);
				
			}
			if(a.getSharing()==6)
			{
				pt=con.prepareStatement("insert into 6sharing_info(O_id,P_id,No_of_6sharing,Rent,Deposit) values(?,?,?,?,?)  ");
				pt.setInt(1, O_id);
				pt.setInt(2, P_id);
				pt.setInt(3, a.getNo_of_sharing());
				pt.setInt(4, a.getRent());
				pt.setInt(5, a.getDeposit());
				 i=pt.executeUpdate();
				System.out.println(i);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return i;
	}
	
/*	public ArrayList<pojo.Sharing_info> get2sharinginfo(int P_id)
	{
		pojo.Sharing_info sh = new pojo.Sharing_info();
		int i=0;
		ArrayList<pojo.Sharing_info> a = new ArrayList<pojo.Sharing_info>();
		try {
			
			pt=con.prepareStatement("select * from 2sharing_info where P_id=?");
			pt.setInt(1, P_id);
			rs=pt.executeQuery();
			if(rs.next())
			{
				System.out.println("---------------data of 2 sharing info----------");
				System.out.println(rt.getInt("No_of_2sharing"));
				System.out.println(rt.getInt("Deposit"));
				System.out.println(rt.getInt("Rent"));
				System.out.println("*******************************");
			
				sh.setNo_of_sharing(rs.getInt("No_of_2sharing"));
				sh.setDeposit(rs.getInt("Deposit"));
				sh.setSharing(new Integer(2));
				sh.setRent(rs.getInt("Rent"));
				a.add(sh);
				//i++;
			
			
			}}
			 catch (SQLException e) {
					e.printStackTrace();
				}
		return a;
	}
	*/
	public ArrayList<pojo.Sharing_info> get1sharinginfo(int P_id)
	{
		
		pojo.Sharing_info sh = new pojo.Sharing_info();

		int i=0;
		ArrayList<pojo.Sharing_info> a = new ArrayList<pojo.Sharing_info>();
		try {
		
			pt=con.prepareStatement("select * from 1sharing_info where P_id=?");
			pt.setInt(1, P_id);
			rs=pt.executeQuery();
			System.out.println(" 1 sharing executed");
		if(rs==null  )
		{System.out.println("---------------result set 1 empty----------");
		}
		else{
			System.out.println("---------------else part----------");
				
				while(rs.next())
				{
				System.out.println("---------------data of 1 sharing info----------");
				System.out.println(rs.getInt("No_of_1sharing"));
				System.out.println(rs.getInt("Deposit"));
				System.out.println(rs.getInt("Rent"));
				System.out.println("*******************************");
			
				sh.setNo_of_sharing(rs.getInt("No_of_1sharing"));
				sh.setDeposit(rs.getInt("Deposit"));
				sh.setSharing(new Integer(1));
				sh.setRent(rs.getInt("Rent"));
				a.add(sh);
				//i++;
				}		
			
			}
		
				} catch (SQLException e) {
			e.printStackTrace();
		}
		return a;
		
		
	}
	
	
	
	public ArrayList<pojo.Sharing_info> get2sharinginfo(int P_id)
	{
		pojo.Sharing_info sh = new pojo.Sharing_info();

		int i=0;
		ArrayList<pojo.Sharing_info> a = new ArrayList<pojo.Sharing_info>();
		try {
		
			pt=con.prepareStatement("select * from 2sharing_info where P_id=?");
			pt.setInt(1, P_id);
			rs=pt.executeQuery();
			System.out.println(" 2 sharing executed");
			
			if(rs==null )
		{System.out.println("---------------result set 2 empty----------");
		}
		else{
			
			while(rs.next())
			{
				System.out.println("---------------data of 2 sharing info----------");
				System.out.println(rs.getInt("O_id"));
				System.out.println(rs.getInt("P_id"));
				
				System.out.println(rs.getInt("No_of_2sharing"));
				System.out.println(rs.getInt("Rent"));
				System.out.println(rs.getInt("Deposit"));
				System.out.println("*******************************");
			
				sh.setNo_of_sharing(rs.getInt("No_of_2sharing"));
				sh.setDeposit(rs.getInt("Deposit"));
				sh.setSharing(new Integer(2));
				sh.setRent(rs.getInt("Rent"));
				a.add(sh);
				//i++;
			
			}
			}
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		return a;

		
	}
	public ArrayList<pojo.Sharing_info> get3sharinginfo(int P_id)
	{

		pojo.Sharing_info sh = new pojo.Sharing_info();

		int i=0;
		ArrayList<pojo.Sharing_info> a = new ArrayList<pojo.Sharing_info>();
		try {
		
			pt=con.prepareStatement("select * from 3sharing_info where P_id=?");
			pt.setInt(1, P_id);
			rs=pt.executeQuery();
			System.out.println(" 3 sharing executed");
			
		if(rs==null )
		{System.out.println("---------------result set 3 empty----------");
		}
		else{
			
			while(rs.next())
			{
				System.out.println("---------------data of 3 sharing info----------");
				System.out.println(rs.getInt("No_of_3sharing"));
				System.out.println(rs.getInt("Deposit"));
				System.out.println(rs.getInt("Rent"));
				System.out.println("*******************************");
			
				sh.setNo_of_sharing(rs.getInt("No_of_3sharing"));
				sh.setDeposit(rs.getInt("Deposit"));
				sh.setSharing(new Integer(3));
				sh.setRent(rs.getInt("Rent"));
				a.add(sh);
				//i++;
			
			}
			}
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		return a;

		

	}
	public ArrayList<pojo.Sharing_info> get4sharinginfo(int P_id)
	{
		pojo.Sharing_info sh = new pojo.Sharing_info();

		int i=0;
		ArrayList<pojo.Sharing_info> a = new ArrayList<pojo.Sharing_info>();
		try {
		
			pt=con.prepareStatement("select * from 4sharing_info where P_id=?");
			pt.setInt(1, P_id);
			rs=pt.executeQuery();
			System.out.println(" 4 sharing executed");
			
		if(rs==null)
		{System.out.println("---------------result set 4 empty----------");
		}
		else{
			
			while(rs.next())
			{
				System.out.println("---------------data of 4 sharing info----------");
				System.out.println(rs.getInt("No_of_4sharing"));
				System.out.println(rs.getInt("Deposit"));
				System.out.println(rs.getInt("Rent"));
				System.out.println("*******************************");
			
				sh.setNo_of_sharing(rs.getInt("No_of_4sharing"));
				sh.setDeposit(rs.getInt("Deposit"));
				sh.setSharing(new Integer(4));
				sh.setRent(rs.getInt("Rent"));
				a.add(sh);
				//i++;
			
			}
			}
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		return a;

		

		
	}
	public ArrayList<pojo.Sharing_info> get5sharinginfo(int P_id)
	{
		pojo.Sharing_info sh = new pojo.Sharing_info();

		int i=0;
		ArrayList<pojo.Sharing_info> a = new ArrayList<pojo.Sharing_info>();
		try {
		
			pt=con.prepareStatement("select * from 5sharing_info where P_id=?");
			pt.setInt(1, P_id);
			rs=pt.executeQuery();
			System.out.println(" 5 sharing executed");
			
		if(rs==null)
		{System.out.println("---------------result set 5 empty----------");
		}
		else{
			
			while(rs.next())
			{
				System.out.println("---------------data of 5 sharing info----------");
				System.out.println(rs.getInt("No_of_5sharing"));
				System.out.println(rs.getInt("Deposit"));
				System.out.println(rs.getInt("Rent"));
				System.out.println("*******************************");
			
				sh.setNo_of_sharing(rs.getInt("No_of_5sharing"));
				sh.setDeposit(rs.getInt("Deposit"));
				sh.setSharing(new Integer(5));
				sh.setRent(rs.getInt("Rent"));
				a.add(sh);
				//i++;
			
			}
			}
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		return a;

		

		
	}
	public ArrayList<pojo.Sharing_info> get6sharinginfo(int P_id)
	{
		pojo.Sharing_info sh = new pojo.Sharing_info();

		int i=0;
		ArrayList<pojo.Sharing_info> a = new ArrayList<pojo.Sharing_info>();
		try {
		
			pt=con.prepareStatement("select * from 6sharing_info where P_id=?");
			pt.setInt(1, P_id);
			rs=pt.executeQuery();
			System.out.println(" 6 sharing executed");
			
		if(rs==null )
		{	System.out.println("---------------result set 6 empty----------");
		}
		else{
			
			while(rs.next())
			{
				System.out.println("---------------data of 6 sharing info----------");
				System.out.println(rs.getInt("No_of_6sharing"));
				System.out.println(rs.getInt("Deposit"));
				System.out.println(rs.getInt("Rent"));
				System.out.println("*******************************");
			
				sh.setNo_of_sharing(rs.getInt("No_of_6sharing"));
				sh.setDeposit(rs.getInt("Deposit"));
				sh.setSharing(new Integer(6));
				sh.setRent(rs.getInt("Rent"));
				a.add(sh);
				//i++;
			
			}
			}
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		return a;

		

	}
}
