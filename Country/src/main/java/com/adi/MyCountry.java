
package com.adi;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import java.util.GregorianCalendar;
import java.util.TimeZone;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet("/first")
public class MyCountry extends HttpServlet{
    
    public void doPost(HttpServletRequest req, HttpServletResponse res)throws IOException, ServletException{
        
        res.setContentType("text/html");
        String v=req.getParameter("region");
        PrintWriter o = res.getWriter();
    
    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss a");
    Date d = new Date();
    TimeZone tz= TimeZone.getTimeZone(v);
    Calendar c = new GregorianCalendar(tz);
    c.setTimeZone(tz);
    sdf.setTimeZone(tz);
    String time = sdf.format(d);
    o.println("<h3>Region Name : "+c.getTimeZone().getID()+"<br></h3>");
    o.println("<h3>Local Name : "+c.getTimeZone().getDisplayName()+"<br></h3>");
    o.println("<h3>Time : "+time+"</h3>");
    }
}
