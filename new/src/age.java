import java.util.Scanner;
public class age {

	public static void main(String[] args){
		
		
		Scanner a =new Scanner(System.in);
		System.out.println("Enter your age=");
		
		int age=a.nextInt();
		
		System.out.println( age<50? "you are young":"you are old");
		
	}	
}
