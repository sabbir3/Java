package zzseven;

public class overloaded {
	
	public static void main(String[] args){
		
		constructor ob=new constructor();
		constructor ob2=new constructor(5);
		constructor ob3=new constructor(5,30);
		constructor ob4=new constructor(5,30,23);

		
		System.out.printf("%s\n",ob.toMilitary());
		System.out.printf("%s\n",ob2.toMilitary());
		System.out.printf("%s\n",ob3.toMilitary());
		System.out.printf("%s\n",ob4.toMilitary());
		
	}

}
