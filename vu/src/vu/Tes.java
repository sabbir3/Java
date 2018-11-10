package vu;

public class Tes {

	public void finalize(){
		
		System.out.println("object is gaarbaze collection");
	}
	
	public static void main(String[] args){
		Tes s1=new Tes();
		Tes s2=new Tes();
		s2=null;
		System.gc();
	}
}
