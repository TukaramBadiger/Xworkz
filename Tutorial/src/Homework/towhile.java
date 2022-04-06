package Homework;

public class towhile {



public void drawPoint()
{
System.out.println("drawing poitn at 0,0");
}
public void drawPoint(int x, char cord)
{
System.out.println("drawing point at "+cord + " , "+x);
}
public static void drawPoint(int x, int y)
{
System.out.println("drawing point at " +x + " , " + y);
}
public static void main(String[] args) 
{
	towhile g=new towhile();
g.drawPoint();
g.drawPoint(10, 'X');
g.drawPoint(10,20);
}
}
