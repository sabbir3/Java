import java.util.Scanner;
public class compound_interest {

	public static void main(String[] args){
		
		Scanner input=new Scanner(System.in);
		double amount,rate,principal;
		int n;
		System.out.print("Enter Principal=");
		principal=input.nextDouble();

		System.out.print("Enter Rate=");
		rate=input.nextDouble();
		
		System.out.println("for how many days you wanna check=");
		
		n=input.nextInt();
			
		for(int day=1; day<=n; day++){
			amount=principal*Math.pow(1+rate,day);
			System.out.println(day+" = "+amount);
			
      	}
    }
}
