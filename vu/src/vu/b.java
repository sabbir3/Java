package vu;
import java.util.Scanner;
public class b {
	
	static public void main(String[] args){
		
		Scanner input =new Scanner(System.in);
		a object=new a();
		System.out.println("enter your gf name=");
		String temp=input.nextLine();
		object.setname(temp);
		object.saying();
	
	}

}
