package vu;
import java.util.Scanner;
public class nasim extends sabbir {

	public void AVE_AGE(double m, double n, double o, double p,double q){
		
		double average;
		average=(m+n+o+p+q)/5;
		System.out.println("average of fivr female="+average);
	}
	
	public static void main(String[] args){
		
		
		sabbir ob=new nasim();
		ob.AVG_AGE(4.4,5.5,6.6,8.8,9.9);
		ob.AVG_AGE(1, 2, 3, 4, 5);
		
	}
}
