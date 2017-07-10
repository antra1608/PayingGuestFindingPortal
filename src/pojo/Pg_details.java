package pojo;

import java.io.File;

public class Pg_details {
	
	String P_name;
	String Address;
	String Location;
	String Gender;
	int Operating_since;
	String Contact_person;
	String Email_id;
	String Website;
	Float Longitude;
	Float Latitude;
	int O_id;
	public int getO_id() {
		return O_id;
	}
	public void setO_id(int o_id) {
		O_id = o_id;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	int Licence_no;
	String Food_available;
	String image;
	public String getFood_available() {
		return Food_available;
	}
	public void setFood_available(String food_available) {
		Food_available = food_available;
	}
	public int getLicence_no() {
		return Licence_no;
	}
	public void setLicence_no(int licence_no) {
		Licence_no = licence_no;
	}
	public Float getLongitude() {
		return Longitude;
	}
	public void setLongitude(Float longitude) {
		Longitude = longitude;
	}
	public Float getLatitude() {
		return Latitude;
	}
	public void setLatitude(Float latitude) {
		Latitude = latitude;
	}
	public String getP_name() {
		return P_name;
	}
	public void setP_name(String p_name) {
		P_name = p_name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public int getOperating_since() {
		return Operating_since;
	}
	public void setOperating_since(int operating_since) {
		Operating_since = operating_since;
	}
	public String getContact_person() {
		return Contact_person;
	}
	public void setContact_person(String contact_person) {
		Contact_person = contact_person;
	}
	public String getEmail_id() {
		return Email_id;
	}
	public void setEmail_id(String email_id) {
		Email_id = email_id;
	}
	public String getWebsite() {
		return Website;
	}
	public void setWebsite(String website) {
		Website = website;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	String phone;

}
