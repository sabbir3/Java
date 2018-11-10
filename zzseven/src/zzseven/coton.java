package zzseven;

public class coton {

	private String name;
	private candy birthday;
	
	public coton(String n, candy d){
		
		name=n;
		birthday=d;
	}
	
	public String toString(){
		
		return String.format("my name is %s \nMy birth is in %s",name,birthday);
	}
	
	
}
