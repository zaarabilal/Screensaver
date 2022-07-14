import java.awt.Color;

public class Ball {

private String flower;
private String flower2;
private String background;
private int height;
private int width;
private int height2;
private int width2;
private int x;
private int y;
private int x2;
private int y2;
private int dy;
private int dx;
private boolean reverse;
private boolean reversey;
private boolean reverse2;
private boolean reversey2;
public Ball() {

flower= "flower.png";
flower2="pinkflower.png";
background="grass.jpeg";
height=15;
width= 15;
height2=15;
width2=15;
x=400;
y=300;
x2=0;
y2=400;
dy=1;
dx=2;
reverse=false;
reversey=false;

}
public int getX() {
	return x;
}
public String getFlower()
{
	return flower;
}
public int getY() {
	return y;
}
public int getX2() {
	return x2;
}
public String getFlower2() {
	return flower2;
}
public int getY2() {
	return y2;
}
public String getBackground() {
	return background;
}
public void move()
{
	System.out.println("x="+x);
	if (x>540 || x<-130) {
		reverse=!reverse;
	}

	if (reverse)
	{
		x--;
	}
	else
	{
		x++;
	}
	System.out.println ("y="+y);
	if (y>410 || y<-30) {
		reversey=!reversey;
	}
	if (reversey) {
		y--;
	}
	else {
		y++;
	}
	//flower2 begins
	System.out.println("x2="+x2);
	if (x2>530 || x2<-120) {
		reverse2=!reverse2;
	}

	if (reverse2)
	{
		x2--;
	}
	else
	{
		x2++;
	}
	System.out.println ("y2="+y2);
	if (y2>405 || y2<-20) {
		reversey2=!reversey2;
	}
	if (reversey2) {
		y2--;
	}
	else {
		y2++;
	}

}

}


