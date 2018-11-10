package zzseven;

public class Ststic_variable {

	public static void main(String[] args){
		
		statc ob1=new statc("sabbir","ahmed");
		statc ob2=new statc("nasim","ahmed");
		statc ob3=new statc("shawon","ahmed");
		
		System.out.println();
		System.out.println(ob1.getfrist());
		System.out.println(ob1.getlast());
		System.out.println(ob1.getmembers());
		
		System.out.println();
		
		System.out.println("member variable er man change hobena...\nsob objest er jonno same and sudhu slass diau call kora jai");
		
		System.out.println(statc.getmembers());
	}	
	
	
}
