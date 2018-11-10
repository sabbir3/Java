import java.util.Scanner;
public class nested {

	public static void main(String[] args){
	Scanner a =new Scanner(System.in);
	
	int age=a.nextInt();
	
	if(age < 50){
		System.out.println("you are young");
	}else{
		System.out.println("you are not young");
		if(age > 75){
			System.out.println("you are too old");
		}else{
			System.out.println("dont worry you are not too old ");
		}
	}
 }
}
