package Mohammad;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Squre extends HttpServlet
{
public void doGet( HttpServletRequest req, HttpServletResponse res) throws IOException
{
  /*
   * The Addition Servlet will redirect us to this servlet.
   * Thus here we will extract the data sent by Addition Servlet using the getParameter()method
   * Below is the demonstration given for the same....*/

	
	
	
	int RD=Integer.parseInt(req.getParameter("ans"));//Here we are extracting the data which was sent by addition servlet in the form of url....  
	PrintWriter out= res.getWriter();//Creating the object of PrintWriter....
    out.println( RD );//Printing the value of RD on webpage...
    int ans= RD*RD;//Sqauring the value..
    out.println(ans);//Printing the value of RD on webpage....
	
}

}
