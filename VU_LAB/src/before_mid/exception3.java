package before_mid;
import java.util.Scanner;
public class exception3 {
	
	public static void main(String[] args){
		
		int a,b,c,n;
		int arr[]=new int[5];
		 Scanner input=new Scanner(System.in);
			System.out.println("enter frist number=");
			 a =input.nextInt();
			 System.out.println("enter second number=");
			 b =input.nextInt();
	
    try {
    	System.out.println("enter frist number=");
		 a =input.nextInt();
		 System.out.println("enter second number=");
		 b =input.nextInt();
    	
    	
    	arr[5]=a/b;
        } 
     catch (ArithmeticException e) {
        System.out.println("Arithmetic error");        } 
     catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Array error");  
        } 
    catch (Exception e) {
        System.out.println("common task completed");        }
    
}
   

}
