package Mohammad;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/*
 * This class is a Servlet.
 * A class can be made Servlet by just extending the class HttpServlet.
 * We are supposed to override the method service which is present in HttpServlet class.
*/
public class Addition extends HttpServlet      
{
 public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException 
 {
   int i=Integer.parseInt(req.getParameter("num1"));
   int j= Integer.parseInt( req.getParameter("num2"));
   int ans= i+j;
   
   /*
    * In this is example we will be demonstrating the concept of HttpSession...
    * Using HttpSession we can navigate to a another Servlet...
    * Below is given the demonstration for the same..*/
   
   //Here we are creating the object of HttpSession using getSession() method as it is an interface....
   HttpSession session= req.getSession();
   //Now we will set the attribute of HttpSession object....
   session.setAttribute("ans",ans);    
   res.sendRedirect("sq");//Here we are calling the square servlet.....
    
 }
	
}