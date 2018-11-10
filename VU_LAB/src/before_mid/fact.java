package before_mid;
import java.util.Scanner;
public class fact {
	public void sabbir(int a,int b){
		
		int sum;
		sum=a+b;
		System.out.println("integer type method sum="+sum);
	}
	public void sabbir(double a,double b){
		
		double sum;
		sum=a+b;
		System.out.println("float type method sum="+sum);
	}
	public static void main(String[] args){
		int x,y;
		float i,j;
		Scanner sab=new Scanner(System.in);	
		
		fact ob=new fact();
		ob.sabbir(4, 4);
		ob.sabbir(4.5,5.5);
					
		}	
	}

