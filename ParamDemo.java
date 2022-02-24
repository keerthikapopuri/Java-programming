import java.awt.*;
import java.io.*;
/*<applet code="ParamDemo" width=300 height=250>
<param name="name" value="keerthi">
<param name="designation" value="professor">
<param name="department" value="cse">
<param name="college" value="rvr">
<param name="salary" value="70000">
</applet>*/
public class ParamDemo extends Applet
{
public void paint(Graphics g)
{
int d;
g.drawString("name :"+getParameter("name"),100,50);
g.drawString("designation :"+getParameter("designation"),60,60);
g.drawString("department :"+getParameter("department"),70,70);
g.drawString("college:"+getParameter("college"),80,80);
d=Integer.parseInt(getParameter("salary"));
g.drawString("salary :"+d,50,100);
}
}
