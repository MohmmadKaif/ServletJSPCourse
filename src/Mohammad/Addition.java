package Mohammad;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
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

@WebServlet("/add")
public class Addition extends HttpServlet      
{
 public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException 
 {
     String S=(req.getParameter("num1"));
//     int j=Integer.parseInt(req.getParameter( "num2" ));
     Student s1=new Student();
//     s1.setName("Mohammad Kaif Altaf Sayyed hasdhasdh sadashdash sadhash");
//     s1.setMarks(i);
//     
//     Student s2=new Student();
//     s2.setName("Saurabh");
//     s2.setMarks(j);
//     
//     ArrayList<Student> students=new ArrayList<Student>(); 
//     
//     students.add(s1);
//     students.add(s2);
//    
     PrintWriter out= res.getWriter();
     boolean flag=false; 
     ArrayList<String>  strings= new ArrayList<>();
     String temp="";
     for( int i=0;i<S.length();i++)
      { 
    	  if(S.charAt(i)=='\n')
    	  {
    		  strings.add(temp);
    		  temp="";
    	  }
    	  else {
    		  temp+=S.charAt(i);
    	  }
      }
       if (temp.length()!=0)
    	     strings.add(temp);
//     for( String tem:strings)
//    	  {
//    	   out.println(tem);  
//    	   out.print("<br>");
//    	  }
    
			/*
			 * for( String tem:strings) out.println(tem);
			 */
       
    req.setAttribute("strings",strings);
    RequestDispatcher rd = req.getRequestDispatcher("Addition.jsp");
rd.forward(req, res);
   
     
     
     
 }
	
}