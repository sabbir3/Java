package vu;

public class a {

	private String girlname;
	
	public void setname(String name){
		
		girlname=name;
	}
	public String setname(){
		
		return girlname;
	}
	public void saying(){
		
		System.out.println("your frist gf was "+ setname());
		
	}
}
