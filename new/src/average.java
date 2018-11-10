import java.util.Scanner;
public class average {
public static void main(String[] args){
		
		Scanner input=new Scanner(System.in);
		double count=0,number,total=0,average;
		int n;
		System.out.print("how many number you wanna input=");

		n=input.nextInt();
		while(count<n){
			
		   number=input.nextDouble();
		   total=total+number;
		   count++;
		}
		average=total/n;
		System.out.println("average is="+average);
	}	

}
