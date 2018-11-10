package vu;
import java.util.Scanner;
public class labaftermid22 {
	public static void main(String[] args){
		
		int i,j,k,n,m;
		
		Scanner a=new Scanner(System.in);
		while(true){
			
			m=a.nextInt();
			n=a.nextInt();
			if(m%2==0){
			for(i=1; i<=n; i++){
				
			System.out.println(m);
			m=m+2;
			
				
			}
			
			}
			else{
				m++;
				for(i=1; i<=n; i++){
					
					System.out.println(m);	
					m=m+2;
				}
				
				
				
			}
			
		}
	}

}
