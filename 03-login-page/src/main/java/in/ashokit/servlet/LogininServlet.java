package in.ashokit.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.ashokit.dao.RegisterDAO;
import in.ashokit.dto.RegisterDTO;
@WebServlet("/registration_process.php")
public class LogininServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			String fname = req.getParameter("First_Name");
			String lname = req.getParameter("Last_Name");
			String email = req.getParameter("Email");
			String pwd = req.getParameter("Password");
			String gender = req.getParameter("Gender");
			//call dto
			
			RegisterDTO dto = new RegisterDTO();
			dto.setFirst_Name(fname );
			dto.setLast_Name(lname);
			dto.setEmail(email);
			dto.setPassword(pwd);
			dto.setGender(gender);
			// call dao method by giving from data
			RegisterDAO dao = new RegisterDAO();
		       boolean status =dao.saveRegister(dto);
			String response = null;
			if (status) {
				response = "Record inserted";
			} else {
				response = "Insertion failed";
			}
			PrintWriter pw = resp.getWriter();
			pw.append(response);

		} catch (Exception e) {
			e.printStackTrace();

		}

	}

}
