package before_mid;
import java.util.Scanner;
public class exception1 {
	
	public static void main(String[] args){
		
		int a,b,c,n;
		
		 Scanner input=new Scanner(System.in);
			System.out.println("enter frist number=");
			 a =input.nextInt();
			 System.out.println("enter second number=");
			 b =input.nextInt();
		
		
		 try{
			
	            c=(a/b);
	        System.out.println(c);
	        }
	        catch(ArithmeticException obj1){
	            System.out.println("there is some Arithmatic error!");
	            System.out.println("second sumber cnn't be 0 so enter again ");
	            System.out.println("enter frist number=");
				 a =input.nextInt();
				 System.out.println("enter second number=");
				 b =input.nextInt();
	            
	        }
	       
	}

}
