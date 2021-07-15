package Mohammad;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
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
   long i=Integer.parseInt(req.getParameter("num1"));
   long j= Integer.parseInt( req.getParameter("num2"));
   
   long r= i+j;
   
   /*
    * Here in this example we will be demonstrating the concept of Cookie...
    * Whenever a Servlets wants to call a Servlet we can use Cookie to send the data to client and then client will make the request to the   another aervlet..*/
   
   Cookie cookie = new Cookie( "res", r + "" );//Here we are making the Cookie Object...
                                               //The Constructor of Cookie class takes two arguments one being the data name and other being the data.You can give any name to your data.....
   
   res.addCookie(cookie);//Adding cookie to the response object so that we can send it to client...
   
   res.sendRedirect("sq");//Here we are sending a redirect request to square servlet...
  }
	
}