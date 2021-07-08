package Mohammad;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
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
   int i=Integer.parseInt(req.getParameter("num1"));
   int j= Integer.parseInt( req.getParameter("num2"));
   
   /*
    * Here instead of using objext of requestDispatche we are using a sendRedirectMethod to call the sqaure servlet....
    * This is done using URL rewirting that you can see below...*/
   
   int ans= i+j;
   //The line of code written below calls the servlet by passing the URL....
   res.sendRedirect("sq?ans="+ans);//Here if you look closely to the argument we are passing a new URL to the another servlet, this is called ad URL rewritting...  
   
   
    }
	
}