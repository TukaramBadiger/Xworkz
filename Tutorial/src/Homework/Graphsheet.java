package Homework;

public class Graphsheet
{
public void drawPoint() // return type is void
{
System.out.println("drawing poitn at 0,0");
}
public int drawPoint(int x, char cord) // return type is int
{
System.out.println("drawing point at "+cord + " , "+x);
return 10;
}
public static void main(String[] args) 
{
Graphsheet g=new Graphsheet();
g.drawPoint();
g.drawPoint(10, 'X');
}
}