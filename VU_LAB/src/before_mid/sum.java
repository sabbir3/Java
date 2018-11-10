package before_mid;
import java.util.Scanner;
public class sum {
	
	public static void main(String[] args){
		
		int n,i,sum=0;
		
		Scanner sabbir=new Scanner(System.in);
		
		n=sabbir.nextInt();
		
		while(n>0){
			
			i=n%10;
			n=n/10;
			sum=sum+i;
		}
		
		System.out.println(sum);
		
	}

}
