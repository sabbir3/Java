package zzseven;

public class candy {

	private int day;
	private int month;
	private int year;
	
	public candy( int m, int d, int y){
		
		day=d;
		month=m;
		year=y;
		
		System.out.printf("the constructr of this is= %s\n", this);
	}
	
	public String toString(){
		
		return String.format("%d-%d-%d",day,month,year);
	}
}
