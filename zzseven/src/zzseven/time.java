package zzseven;

public class time {

	public static void main(String[] args){
		
		calculate ob = new calculate();
		
		System.out.println("DEFAULT TIME:");
		System.out.println(ob.toMilitary());
		System.out.println(ob.toString());
		System.out.println();

		
		System.out.println("INPUTED MILITARY TIME:");
		ob.settime(13,30,15);

		System.out.println(ob.toMilitary());
		System.out.println();

		System.out.println("CALCULATED TIME:");
		System.out.println(ob.toString());

		
		
	}
}
