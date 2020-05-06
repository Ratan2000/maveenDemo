package maveen;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/getServlet")
public class getServlet extends HttpServlet 
{
  public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
  {
	  int id = Integer.parseInt(request.getParameter("id"));
	  
	  Database db = new Database();
	  Student stud = db.getInformation(id);
	  request.setAttribute("Student", stud);
	  RequestDispatcher rd = request.getRequestDispatcher("view.jsp");
	  rd.forward(request, response);
  }
}
