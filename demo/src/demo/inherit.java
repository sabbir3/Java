package demo;
import java.util.Scanner;
 class inherit {
		
		public void MyMethod(){
			
			int a,b,c;
			Scanner input=new Scanner(System.in);
			a=input.nextInt();
			b=input.nextInt();
			c=a+b;
			System.out.println(c);
		}
 }

	
class Sabbir extends inherit{
public void Bmethod(){
			
			System.out.println("i'm sabbir ahmed");
		}
	public static void main(String[] args){
		
		Sabbir obj=new Sabbir();
		obj.Bmethod();
		obj.MyMethod();
		
		
	}
		
	}
	

	

