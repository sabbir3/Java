
import java.util.Scanner;
public class ifelse1 {

	public static void main(String[] args){
		
	
		Scanner a =new Scanner(System.in);
		
		int age=a.nextInt();
		
		if(age<12)
			System.out.println("you are teen");
		else if(age < 50)
			System.out.println("you are young");
		else if(age<=50) 
			System.out.println("you are 50's");
		else if(age < 55)
				System.out.println("you are seniour cityzine");
		else if(age > 65)
			System.out.println("you are getting old");
		else 
			System.out.println("you pray for your sins");

	
	}
 }
