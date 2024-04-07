package in.ashokit.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.ashokit.dao.BookDAO;
@WebServlet("/Book")
public class BookServlet {
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			String id = req.getParameter("bookId");
			String name = req.getParameter("bookName");
			String price = req.getParameter("bookPrice");
			int bookid = Integer.parseInt(id);
			double bookPrice = Double.parseDouble(price);
			// call dao method by giving from data
			BookDAO dao = new BookDAO();
			boolean status = dao.SaveBook(bookid, name, bookPrice);
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
