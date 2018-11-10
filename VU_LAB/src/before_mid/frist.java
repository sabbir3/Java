package before_mid;
//import java.util.Scanner;
public class frist {

	
		   static int count=0;
		   public void increment()
		   {
		       count++;
		   }
		   public static void main(String args[])
		   {
		       frist obj1=new frist();
		       frist  obj2=new  frist ();
		       obj1.increment();
		       obj2.increment();
		       System.out.println("Obj1: count is="+obj1.count);
		       System.out.println("Obj2: count is="+obj2.count);
		   }
		}

