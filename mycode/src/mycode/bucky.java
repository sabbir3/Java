package mycode;
import java.util.Random;
public class bucky {

	public static void main(String[] args){
		
	Random s=new Random();
	int number;
	for(int count=1; count<6; count++){
		
		number=1+s.nextInt(7);
		System.out.println(number+" ");
	}
	}
}
