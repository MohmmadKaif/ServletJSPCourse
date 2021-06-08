package Mohammad;
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
 public void service(HttpServletRequest req,HttpServletResponse res) 
 {
   int i=Integer.parseInt(req.getParameter("num1"));
   int j= Integer.parseInt( req.getParameter("num2"));
   System.out.println(i+j);
 }
	
}