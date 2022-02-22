package Mohammad;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//In this example we are going to see the demonstration of servlet annotations..
	//Annotations are useful to avoid maitaining the xml file.
	//It makes the devolopment easy as we dont have to set up xml file file and annottions will handle every thing..
	//Given below is the demonstration of servlet annotations...


public class Squre extends HttpServlet
{
public void doPost( HttpServletRequest req, HttpServletResponse res) throws IOException
{    
	int s=Integer.parseInt((String)req.getAttribute("sum"));
    PrintWriter out=res.getWriter();	
    out.println("<h1>answer is "+s+"</h1>"); 	
}

}
