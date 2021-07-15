package Mohammad;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Squre extends HttpServlet
{
public void doGet( HttpServletRequest req, HttpServletResponse res) throws IOException
{
    //Here First of all we receive the cookie..
	
	long RD=-1000;
	Cookie cookie[] = req.getCookies();//This method will return all the cookies which we got from the servlet which called this servlet.. 
	
	for(Cookie c: cookie )
	{
		if(c.getName().equals("res"))
		{
			RD=(long)Integer.parseInt(c.getValue());
		    break;
		}
		
	}
	
	
	System.out.println( RD );
	
    
	PrintWriter out= res.getWriter();//Creating the object of PrintWriter....
    out.println( RD );//Printing the value of RD on webpage...
    long ans= RD*RD;//Sqauring the value..
    out.println(ans);//Printing the value of RD on webpage....
	
}

}
