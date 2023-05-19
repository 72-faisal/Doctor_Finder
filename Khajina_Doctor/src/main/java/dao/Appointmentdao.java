package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import connection.Dbconnection;
import model.Appointmentdata;
import model.Patientdata;

public class Appointmentdao {

	public static void makeappointment(Appointmentdata a) {
		try {
			Connection conn = Dbconnection.getconnection();
			String sql="insert into Appointmentdata(Appointment_name,Appointment_number,Appointment_email,Appointment_symptoms,Appointment_date,Appointment_department,Appointment_gender,Appointment_time) values(?,?,?,?,?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, a.getAppointment_name());
			pst.setLong(2, a.getAppointment_number());
			pst.setString(3, a.getAppointment_email());
			pst.setString(4, a.getAppointment_symptoms());
			pst.setString(5, a.getAppointment_date());
			pst.setString(6, a.getAppointment_department());
			pst.setString(7, a.getAppointment_gender());
			pst.setString(8, a.getAppointment_time());
			pst.executeUpdate();
			System.out.println("data inserted");
		} catch (Exception e) {
			e.printStackTrace();
		}
}

	public static void updateProfile(Appointmentdata a) {
		try {
			Connection con = Dbconnection.getconnection();
			String sql="update Appointmentdata set Appointment_name=?,Appointment_number=?,Appointment_email=?,Appointment_symptoms=?,Appointment_date=?,Appointment_department=?,Appointment_gender=?,Appointment_time=? where Appointment_id=? ";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, a.getAppointment_name());
			pst.setLong(2, a.getAppointment_number());
			pst.setString(3, a.getAppointment_email());
			pst.setString(4, a.getAppointment_symptoms());
			pst.setString(5, a.getAppointment_date());
			pst.setString(6, a.getAppointment_department());
			pst.setString(7, a.getAppointment_gender());
			pst.setString(8, a.getAppointment_time());
			pst.setInt(9,a.getAppointment_id());
			
			pst.executeUpdate();
			System.out.println("profile updated");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public static List<Appointmentdata> getallappoitment() {
		List<Appointmentdata> list = new ArrayList<Appointmentdata>();
		try {
			Connection con = Dbconnection.getconnection();
			String sql = "select * from Appointmentdata";
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
//				Appointmentdata a = new Appointmentdata();
				Appointmentdata	a = new Appointmentdata();
				a.setAppointment_id(rs.getInt("Appointment_id"));
				a.setAppointment_name(rs.getString("Appointment_name"));
				a.setAppointment_number(rs.getLong("Appointment_number"));
				a.setAppointment_email(rs.getString("Appointment_email"));
				a.setAppointment_symptoms(rs.getString("Appointment_symptoms"));
				a.setAppointment_date(rs.getString("Appointment_date"));
				a.setAppointment_department(rs.getString("Appointment_department"));
				a.setAppointment_gender(rs.getString("Appointment_gender"));
				a.setAppointment_time(rs.getString("Appointment_time"));
				list.add(a);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

}
