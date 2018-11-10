package vu;

public class tuna {

	private String girlname;
	public tuna(String name){
		
		girlname=name;
	}
	public String getname(){
		
		return girlname;
	}
	public void saying(){
		
		System.out.println("your last gf was "+getname());
	}
}

