package Mohammad;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Squre extends HttpServlet
{
public void doPost( HttpServletRequest req, HttpServletResponse res) throws IOException
{
/*Now this is the servlet which will be called
 * The first thing to do is to receive the attributes sent by the calling servlet..
 * This is how we do it......*/

	int RD=(int)req.getAttribute("ans"  ) ;  
	PrintWriter out= res.getWriter();
    out.println( RD );
    int ans= RD*RD;
    out.println( ans  );
	
}

}
