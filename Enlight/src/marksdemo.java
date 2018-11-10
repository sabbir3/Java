
class marksdemo{
public static void main(String[] args){
	
	marks ob1=new marks();
	
	ob1.engmarks=50;
	ob1.mathmarks=60;
	ob1.phymarks=70;
	
	marks ob2= new marks();
	
	ob2.engmarks=80;
	ob2.mathmarks=90;
	ob2.phymarks=100;
	
	//displaying marks for first object
    System.out.println("Marks for first object:");
    System.out.println(ob1.engmarks);
    System.out.println(ob1.mathmarks);
    System.out.println(ob1.phymarks);
 
    //displaying marks for second object
    System.out.println("Marks for second object:");
    System.out.println(ob2.engmarks);
    System.out.println(ob2.mathmarks);
    System.out.println(ob2.phymarks);
}
}