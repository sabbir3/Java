package zzseven;

public class f9al {

	private int sum;
	private final int NUMBER;
	
	public f9al(int x){
		
		NUMBER=x;
	}
	
	public void add(){
		
		sum+=NUMBER;
	}
	
	public String toString(){
		
		return String.format("sum=%d",sum);
	}
	
}
 