package Homework;

class ThisOperator
{
String name;
int id;
double sal;
public ThisOperator(String name, int id, double sal)
{
// System.out.println("This is sample const...");
this.name=name;
this.id=id;
this.sal=sal;
return;
}
public void display()
{
System.out.println(" name is = " + name);;
System.out.println(" id is = " + id);;
System.out.println(" salary is = " + sal);;
}}
class StatementThis
{
public static void main(String[] args) 
{
	ThisOperator s = new ThisOperator("Ajay", 101, 2000);
s.display();
ThisOperator s2 = new ThisOperator("Rohit", 102, 2500);
s2.display();
}}