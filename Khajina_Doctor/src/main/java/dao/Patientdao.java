package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import connection.Dbconnection;
import model.Doctordata;
import model.Patientdata;

public class Patientdao {

	public static void insertpatient(Patientdata p) {
		try {
			Connection conn = Dbconnection.getconnection();
			String sql="insert into Patientdata(name,email,password,address,contact) values(?,?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, p.getName());
			pst.setString(2, p.getEmail());
			pst.setString(3, p.getPassword());
			pst.setString(4, p.getAddress());
			pst.setLong(5,p.getContact());
			pst.executeUpdate();
			System.out.println("data inserted");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static Patientdata patientLogin(Patientdata p) {
		Patientdata p1 = null;
		try {
			Connection conn = Dbconnection.getconnection();
			String sql="select * from Patientdata where email=? and password=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, p.getEmail());
			pst.setString(2, p.getPassword());
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
				p1 = new Patientdata();
				p1.setId(rs.getInt("id"));
				p1.setName(rs.getString("name"));
				p1.setContact(rs.getLong("contact"));
				p1.setAddress(rs.getString("address"));
				p1.setEmail(rs.getString("email"));
				p1.setPassword(rs.getString("password"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return p1;
	
		
	}
	public static void updateProfile(Patientdata p) {
		try {
			Connection con = Dbconnection.getconnection();
			String sql="update Patientdata set name=?,email=?,address=?,contact=? where id=?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, p.getName());
			pst.setString(2, p.getEmail());
			pst.setString(3, p.getAddress());
			pst.setLong(4,p.getContact());
			pst.setInt(5, p.getId());
			pst.executeUpdate();
			System.out.println("profile updated");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public static boolean checkEmail(String email) {
		boolean flag = false;
		try {
			Connection conn = Dbconnection.getconnection();
			String sql = "select * from Patientdata where email=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setNString(1, email);
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
				flag = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
	public static boolean checkOldPassword(String op,int id) {
		boolean flag = false;
		try {
			Connection con = Dbconnection.getconnection();
			String sql="select * from Patientdata where password=? and id=?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, op);
			pst.setInt(2, id);
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
				flag = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
	public static void updatePassword(String np,int id) {
		try {
			Connection con = Dbconnection.getconnection();
			String sql="update Patientdata set password=? where id=?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, np);
			pst.setInt(2, id);
			pst.executeUpdate();
			System.out.println("password changed");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void updatePassword(String email,String np) {
		try {
			Connection con = Dbconnection.getconnection();
			String sql="update Patientdata set password=? where email=?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, np);
			pst.setString(2, email);
			pst.executeUpdate();
			System.out.println("data updated");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
//	now for all patient for Admin side to show all patient 😊😊😊
	public static List<Patientdata> getallpatient() {
		List<Patientdata> list = new ArrayList<Patientdata>();
		try {
			Connection con = Dbconnection.getconnection();
			String sql = "select * from Patientdata ";
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				Patientdata p = new Patientdata();
				p = new Patientdata();
				p = new Patientdata();
				p.setId(rs.getInt("id"));
				p.setName(rs.getString("name"));
				p.setContact(rs.getLong("contact"));
				p.setAddress(rs.getString("address"));
				p.setEmail(rs.getString("email"));
				p.setPassword(rs.getString("password"));
				list.add(p);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}
