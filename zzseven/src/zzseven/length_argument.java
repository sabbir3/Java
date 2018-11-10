package zzseven;

public class length_argument {

	public static void main(String[] args){
		
	System.out.println(average(45,67,89,34,7));
	}
	
	public static int average(int...numbers){
		
		int total=0;
		for(int x:numbers){
			
			total+=x;
		}
		return total/numbers.length;
	}
}
