package zzseven;
import java.util.Scanner;
public class main {

public static void main(String[] args){
	
	Scanner input=new Scanner(System.in);
	derived1 ob1=new derived1();
	derived2 ob2=new derived2();
	baseclass b=new baseclass();
	System.out.println("take inputs=");
	int d,e,f;
	d=input.nextInt();
	e=input.nextInt();
	f=input.nextInt();
	
	
	ob1.add(d,e,f);
	ob2.add(d,e,f);
	b.add(d,e,f);
	
	
	
}
		
	}

