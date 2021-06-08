package Mohammad;
import java.io.IOException;
import java.io.PrintWriter;

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
 public void service(HttpServletRequest req,HttpServletResponse res) throws IOException 
 {
   int i=Integer.parseInt(req.getParameter("num1"));
   int j= Integer.parseInt( req.getParameter("num2"));
   
   /*
    *  Now to print our answer on output screen what we do is create an object of class PrintWriter.
    *  This is done with the help getWriter method which is called using response object...
    *  Below is the demonstration for this
    */
   
   PrintWriter out=res.getWriter();
   out.println( i+j );
   System.out.println(i+j);
 }
	
}