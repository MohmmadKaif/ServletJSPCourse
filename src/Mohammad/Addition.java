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
 public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException 
 {
   int i=Integer.parseInt(req.getParameter("num1"));
   int j= Integer.parseInt( req.getParameter("num2"));
   
   /*
    *Here we are calling a different servlet in this servlet.....
    *The first thing to do is to set the attributes which we want to send to the another servlet....
    *To do so we use a method called setAttributes which is called using the object of HttpServletRequest object...
    *This is how we do it...see below.....*/
   
   int ans= i+j;
   
   req.setAttribute(  "ans",ans);
   
   /*
    * Now to call the servlet we will use the object of RequestDispatcher
   *This is how we create the object of RequestDispatcher...
    */
   RequestDispatcher rd= req.getRequestDispatcher("sq" );
   /*
    * Now we are done creating the RequestDispatcher object.
    * Now we will forward this to the servlet which we want to call..
    * And this is how we do it........*/
      rd.forward(req, res);
   
    }
	
}