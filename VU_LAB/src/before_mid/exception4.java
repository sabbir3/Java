package before_mid;
import java.util.Scanner;
public class exception4 {
	public static void main(String[] args){
		
		int a,b,c,d;
		int arr[]=new int[5];
		 Scanner input=new Scanner(System.in);
			System.out.println("enter frist number=");
			 a =input.nextInt();
			 System.out.println("enter second number=");
			 b =input.nextInt();
	
	 try {
	    	
	    	c=(a/b);
	        arr[5] = 30 / 0;        } 
	     catch (ArithmeticException e) {
	        System.out.println("");        } 
	     catch (ArrayIndexOutOfBoundsException e) {
	        System.out.println("");        } 
	    catch (Exception e) {
	        System.out.println("common task completed");        }
	    System.out.println("rest of the code...");

	}
}
