package controller;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.Patientdao;
import model.Patientdata;
import service.Servicesss;

/**
 * Servlet implementation class PatientController
 */
@WebServlet("/PatientController")
public class PatientController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PatientController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		if (action.equalsIgnoreCase("register")) {
			Patientdata p = new Patientdata();
			p.setName(request.getParameter("name"));
			p.setEmail(request.getParameter("email"));
			p.setPassword(request.getParameter("password"));
			p.setAddress(request.getParameter("address"));
			p.setContact(Long.parseLong(request.getParameter("contact")));
			Patientdao.insertpatient(p);
			request.setAttribute("msg", "data registered successfully");
			request.getRequestDispatcher("Patient_Login.jsp").forward(request, response);
		}	else if(action.equalsIgnoreCase("login")) {
				Patientdata p = new Patientdata();
			p.setEmail(request.getParameter("email"));
			p.setPassword(request.getParameter("password"));
			String email = request.getParameter("email");
			boolean flag = Patientdao.checkEmail(email);
			if(flag == true) {
				Patientdata p1 = Patientdao.patientLogin(p);
				if(p1 == null) {
					request.setAttribute("msg1", "password is incorrect");
					request.getRequestDispatcher("Patient_Login.jsp").forward(request, response);
				}
				else {
					HttpSession session = request.getSession();
					session.setAttribute("data", p1);
					request.getRequestDispatcher("Patient-home.jsp").forward(request, response);
				}
			}
			else {
				request.setAttribute("msg", "email is not registerd");
				request.getRequestDispatcher("Patient_Login.jsp").forward(request, response);
			}
		}
	
		else if (action.equalsIgnoreCase("update")) {
			Patientdata p = new Patientdata();
			p.setId(Integer.parseInt(request.getParameter("id")));
			p.setName(request.getParameter("name"));
			p.setContact(Long.parseLong(request.getParameter("contact")));
			p.setAddress(request.getParameter("address"));
			p.setEmail(request.getParameter("email"));
			Patientdao.updateProfile(p);
			HttpSession session = request.getSession();
			session.setAttribute("data", p);
			request.getRequestDispatcher("Patient-home.jsp").forward(request, response);
		} 
		else if (action.equalsIgnoreCase("change password")) {
			int id = Integer.parseInt(request.getParameter("id"));
			String op = request.getParameter("op");
			String np = request.getParameter("np");
			String cnp = request.getParameter("cnp");
			boolean flag = Patientdao.checkOldPassword(op, id);
			if (flag == true) {
				if (np.equals(cnp)) {
					Patientdao.updatePassword(np, id);
					response.sendRedirect("Patient-home.jsp");
				} else {
					request.setAttribute("msg1", "New password and confirm new password not matched");
					request.getRequestDispatcher("Patient_changepassword.jsp").forward(request, response);
				}
			} else {
				request.setAttribute("msg", "old password not matched");
				request.getRequestDispatcher("Patient_changepassword.jsp").forward(request, response);
			}
		} 
		else if (action.equalsIgnoreCase("get otp")) {
			String email = request.getParameter("email");
			Random r = new Random();
			int num = r.nextInt(99999);
			Servicesss s = new Servicesss();
//			s.sendMail(email, num);
			s.sendMail(email, num);
			request.setAttribute("email", email);
			request.setAttribute("otp", num);
			request.getRequestDispatcher("Patient-verifyotp.jsp").forward(request, response);
		}
		else if(action.equalsIgnoreCase("verify")) {
			String email  = request.getParameter("email");
			int otp1 = Integer.parseInt(request.getParameter("otp1"));
			int otp2 = Integer.parseInt(request.getParameter("otp2"));
			if(otp1 == otp2) {
				request.setAttribute("email", email);
				request.getRequestDispatcher("Patient-newpassword.jsp").forward(request, response);
			}
			else {
				request.setAttribute("email", email);
				request.setAttribute("otp", otp1);
				request.setAttribute("msg", "OTP not metched");
				request.getRequestDispatcher("Patient-verifyotp.jsp").forward(request, response);
			}
		}
		else if(action.equalsIgnoreCase("New Password")) {
			String email = request.getParameter("email");
			String np = request.getParameter("np");
			String cnp = request.getParameter("cnp");
			if(np.equals(cnp)) {
				Patientdao.updatePassword(email, np);
				response.sendRedirect("Patient_Login.jsp");
			}
			else {
				request.setAttribute("email", email);
				request.setAttribute("msg", "New password and confirm new password not matched");
				request.getRequestDispatcher("Patient-newpassword.jsp").forward(request, response);
			}
		}
		
		
	}
}
