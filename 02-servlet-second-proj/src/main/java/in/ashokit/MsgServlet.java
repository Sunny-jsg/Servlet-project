package in.ashokit;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/msg")
public class MsgServlet extends HttpServlet {
      
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    
	String name = req.getParameter("name");
	PrintWriter pw = resp.getWriter();
	pw.append(name +" Good Morning .....!!");
    	
    }
	
	}


