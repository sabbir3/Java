package vu;
import java.util.Scanner;
public class labaftermid1 {
	
	public static void main(String[] args){
		
		
		Scanner input=new Scanner(System.in);
		int m,n,i,j,sum,temp;
		
		while(true){
		m=input.nextInt();
		n=input.nextInt();
		sum=0;
		
		if(m<=0 || n<=0){
			break;
		}
		
		if(m>n){
			
			temp=m;
			m=n;
			n=temp;
		}
		
		
		for(i=m; i<=n;i++){
			
			
		System.out.print(i+" ");
		sum=sum+i;
			
						
		}	
		System.out.println("sum="+sum);
	}
	}
	

}
