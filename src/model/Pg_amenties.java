package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import util.DBhelper;

public class Pg_amenties {
	Connection con=DBhelper.getConnection();
	PreparedStatement pt;
	Connection com=DBhelper.getConnection();
	PreparedStatement ps;
	
	
	ResultSet rt;

	public int update(pojo.Pg_amenties pg,String username,int P_id) 
	{
		
		int id=0;
		try {
			ps=com.prepareStatement("select O_id from pg_owner where O_username=?");
			ps.setString(1, username);
			rt=ps.executeQuery();
			while(rt.next())
			{
				id=rt.getInt("O_id");
			}
		
		
		
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
			int i=0;
		try {
			pt=con.prepareStatement("update amenities set Television=?,Wifi=?,UPSBackedpower=?,Laundry=?,AirConditioner=?,DrinkingWater=?,HotWater=?,RoomService=?,Security=?,Parking=?,Microwave=?,Kitchen=?,Heater=?,Washing Machine=?,Gesyer=?,Furniture=? where P_id=? AND O_id=? ");
			pt.setString(1,pg.getTelevision() );
			pt.setString(2, pg.getWifi());
			pt.setString(3, pg.getUPSBackedpower());
			pt.setString(4, pg.getLaundry());
			pt.setString(5, pg.getAirConditioner());
			pt.setString(6, pg.getDrinkingWater());
			pt.setString(7, pg.getHotWater());
			pt.setString(8, pg.getRoomService());
			pt.setString(9, pg.getSecurity());
			pt.setString(10, pg.getParking());
			pt.setString(11, pg.getMicrowave());
			pt.setString(12, pg.getKitchen());
			pt.setString(13, pg.getHeater());
			pt.setString(14, pg.getWashingMachine());
			pt.setString(15, pg.getGesyer());
			pt.setString(16, pg.getFurniture());
			pt.setInt(17, P_id);
			pt.setInt(18, id);
			
			i=pt.executeUpdate();
			System.out.println(i);
			
			
		
		
		} catch (SQLException e) {
		e.printStackTrace();
		}
		
		return i;
	}
	
	public int insert(pojo.Pg_amenties a,int O_id,int P_id) 
	{
		int i=0;
try {
	pt=con.prepareStatement("insert into amenities values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
	pt.setInt(1, P_id);		
	pt.setInt(2, O_id);
	pt.setString(3,a.getTelevision() );
	pt.setString(4, a.getWifi());
	pt.setString(5, a.getUPSBackedpower());
	pt.setString(6, a.getLaundry());
	pt.setString(7, a.getAirConditioner());
	pt.setString(8, a.getDrinkingWater());
	pt.setString(9, a.getHotWater());
	pt.setString(10, a.getRoomService());
	pt.setString(11, a.getSecurity());
	pt.setString(12, a.getParking());
	pt.setString(13, a.getMicrowave());
	pt.setString(14, a.getKitchen());
	pt.setString(15, a.getHeater());
	pt.setString(16, a.getWashingMachine());
	pt.setString(17, a.getGesyer());
	pt.setString(18, a.getFurniture());
	i=pt.executeUpdate();
	
} catch (SQLException e) {
	e.printStackTrace();
}	return i;
	
	}
	
	public pojo.Pg_amenties getamenties(int P_id)
	{
		pojo.Pg_amenties a=new pojo.Pg_amenties();
		
		try {
			pt=con.prepareStatement("select * from amenities where P_id=?");
		pt.setInt(1, P_id);
		rt=pt.executeQuery();
		
		while(rt.next())
		{
			a.setAirConditioner(rt.getString("AirConditioner"));
			a.setDrinkingWater(rt.getString("DrinkingWater"));
			a.setFurniture(rt.getString("Furniture"));
			a.setGesyer(rt.getString("Gesyer"));
			a.setHeater(rt.getString("Heater"));
			a.setHotWater(rt.getString("HotWater"));
			a.setKitchen(rt.getString("Kitchen"));
			a.setLaundry(rt.getString("Laundry"));
			a.setMicrowave(rt.getString("Microwave"));
			a.setParking(rt.getString("Parking"));
			a.setRoomService(rt.getString("RoomService"));
			a.setSecurity(rt.getString("Security"));
			a.setTelevision(rt.getString("Television"));
			a.setUPSBackedpower(rt.getString("UPSBackedpower"));
			a.setWashingMachine(rt.getString("Washing Machine"));
			a.setWifi(rt.getString("Wifi"));
		}
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return a;
		
	}
}
