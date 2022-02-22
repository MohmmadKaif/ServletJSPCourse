package Mohammad;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/*
 * This class is a Servlet.
 * A class can be made Servlet by just extending the class HttpServlet.
 * We are supposed to override the method service which is present in HttpServlet class.
*/


//In this example we are going to see the demonstration of servlet annotations..
	//Annotations are useful to avoid maitaining the xml file.
	//It makes the devolopment easy as we dont have to set up xml file file and annottions will handle every thing..
	//Given below is the demonstration of servlet annotations...

//@WebServlet("/add")
public class Addition extends HttpServlet      
{
 public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException 
 {
     int i=Integer.parseInt(req.getParameter("num1"));
     int j=Integer.parseInt(req.getParameter( "num2" ));
     int sum=i+j;
     String s=sum+"";
     req.setAttribute("sum", s);
     PrintWriter out= res.getWriter();
     RequestDispatcher rd = req.getRequestDispatcher("sq");
     rd.forward(req, res);
     //out.println("<a href=sq?sum="+s+">kfkdsgfkagf</a>");
     
 }
	
}