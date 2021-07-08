package Mohammad;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Squre extends HttpServlet
{
public void doGet( HttpServletRequest req, HttpServletResponse res) throws IOException
{
    //Now this is the servlet which will be called by the Addition Servlet....
	//First we will create the object of HttpSession....
	
	//Below line of Code crates the object of HttpSession using the getSesion()method as it is an interface....
	HttpSession session= req.getSession();
	//Now we will get the attributes which were sent by Addition Servlet...
	int RD=(int)session.getAttribute("ans");
	
	System.out.println( RD );
	
    
	PrintWriter out= res.getWriter();//Creating the object of PrintWriter....
    out.println( RD );//Printing the value of RD on webpage...
    int ans= RD*RD;//Sqauring the value..
    out.println(ans);//Printing the value of RD on webpage....
	
}

}
