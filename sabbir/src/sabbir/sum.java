package sabbir;
import java.util.Scanner;
public class sum {

	public static void main(String[] args){
		
		
		Scanner input=new Scanner(System.in);
		int a,b,c,sum;
		
		a=input.nextInt();
		b=input.nextInt();
		c=input.nextInt();
		
		sum=a+b+c;
		
		System.out.println("sum="+sum);
	}
}
