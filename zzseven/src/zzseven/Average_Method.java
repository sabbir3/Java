package zzseven;

public class Average_Method {
	
	public static void main(String[] args){
		
		System.out.println(average(56,67,78,90));
		
		
	}
	
	public static int average(int...numbers){
		
		int total=0;
		for(int x:numbers){
			total+=x;
			
		}
		System.out.println("average="+total/numbers.length);

		return total/numbers.length;
		
		
	}

}
