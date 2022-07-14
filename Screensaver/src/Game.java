
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.event.*;

public class Game extends JPanel  implements Runnable{
private BufferedImage back; 
private Ball ball1;
private ImageIcon flower;
private ImageIcon flower2;
private ImageIcon background;

public Game() {

	   back=null;
ball1=new Ball();
flower=new ImageIcon(ball1.getFlower());
flower2= new ImageIcon(ball1.getFlower2());
background= new ImageIcon(ball1.getBackground());
	    
new Thread(this).start();

}



 public void run()
  {
  try
  {
  while(true)
  {
    Thread.currentThread().sleep(5);
           repaint();
        }
     }catch(Exception e)
     {
     }
  }
 
 public  void paint(Graphics g){
 
 Graphics2D  twoDgraph= (Graphics2D)g;
if(back==null)
  back = (BufferedImage)(createImage(getWidth(),getHeight()));

Graphics g2d = back.createGraphics();
g2d.clearRect(0,0,getSize().width, getSize().height);
g2d.drawImage(background.getImage(), 0, 0, getWidth(), getHeight(),this);

Color newcolor = new Color(18,224,214);
g2d.setColor(newcolor);
g2d.setFont(new Font("Calligraphy",Font.BOLD, 50));
g2d.drawString("Zaara's screensaver",150 , 70);
g2d.drawImage(flower.getImage(), ball1.getX(),  ball1.getY(), 300, 200, this);
g2d.drawImage(flower2.getImage(), ball1.getX2(),  ball1.getY2(), 300, 200, this);
ball1.move();
	




twoDgraph.drawImage(back, null, 0, 0);
}
}