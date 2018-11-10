package before_mid;
import java.util.Scanner;
public class exception2 {

	public static void main(String[] args){
		
		int arr[]=new int[5];
		
		int a,b,c,n;
		Scanner input=new Scanner(System.in);
		System.out.println("enter frist number=");
		 a =input.nextInt();
		 System.out.println("enter second number=");
		 b =input.nextInt();
        try {
           
            arr[5] =30/b; 
            } 

           catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("there is some error!");
            } 

	}
}
