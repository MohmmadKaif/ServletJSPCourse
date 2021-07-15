package Mohammad;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/*
 * This class is a Servlet.
 * A class can be made Servlet by just extending the class HttpServlet.
 * We are supposed to override the method service which is present in HttpServlet class.
*/
public class Addition extends HttpServlet      
{
 public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException 
 {
     // This is a demonstration for ServletConfig
	 
	   
	 PrintWriter out= res.getWriter();
	 //Now to get the data which is set in web.xml we will use object of ServletConfig...
	 ServletConfig cnt= getServletConfig();
     out.println(cnt.getInitParameter("login-id")/*Here we are getting the parameter specified in web.xml*/);//And now we are printing the parmater...
	 //Note: While ising ServletContext the context specified in web.xml file will be avialable for each and every servlet...
	 
  }
	
}