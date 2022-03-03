import java.awt.*;
import java.applet.*;
/*
<applet code = "week11b" width=500 height=500>
</applet>
*/
public class week11b extends Applet{
public void paint(Graphics g)
{
setBackground(Color.black);
setForeground(Color.yellow);
g.drawLine(150,200,150,0);
g.fillRect(10,20,50,50);
g.drawOval(75,75,50,50);
g.fillArc(90,90,100,100,0,75);
Color c1 = new Color(150,200,235);
g.setColor(c1);
int xpoints[]={300,150,300,150,300};
int ypoints[]={300,300,150,150,300};
int num=5;
g.drawPolygon(xpoints,ypoints,num);
}
}

