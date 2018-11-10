package vu;
import java.util.Scanner;
public class vur {

	static public void main(String[] args){
		
		Scanner input=new Scanner(System.in);
		
		ru object=new ru();
		System.out.println("Enter your name=");
		
		String name=input.nextLine();
		object.name(name);
		
	}
}
