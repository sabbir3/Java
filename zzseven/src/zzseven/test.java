package zzseven;
import java.util.Scanner;
public class test {

	public static void main(String[] args){
	
	Scanner input=new Scanner(System.in);
		
	double average,total=0,number;
	int count=0;
	int n;
	System.out.println("how many numbers average you wanna calculate=");
	n=input.nextInt();
	
	System.out.println("the numbers are=");
	while(count<n){
		
	  number=input.nextDouble(); 
	  total+=number;
	  count++;		
	}
	
	average=total/10;
	System.out.println("AVERAGE="+average);
	
	}
}
