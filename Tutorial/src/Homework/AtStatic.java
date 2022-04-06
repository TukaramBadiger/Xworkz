package Homework;
class nonStatic
{
	
int d=150;
void demo()
{
System.out.println("java");
}
}

 class AtStatic{
	public static void main(String[] args) {
	new nonStatic().demo();
	{
		System.out.println(new nonStatic().d);
		}
	}
		
	}

 
 