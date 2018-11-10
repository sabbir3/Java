package before_mid;
import java.util.Scanner;

public class average {
	public static void main(String[] args)
	{
		int a, b, c, avg;
		Scanner d = new Scanner(System.in);
		a = d.nextInt();
		b = d.nextInt();
		c = d.nextInt();
		avg = (a+b+c)/3;
		System.out.println("Average = " + avg);
	}

}
