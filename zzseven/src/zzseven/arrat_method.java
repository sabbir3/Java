package zzseven;

public class arrat_method {

	public static void main(String[] args){
		
		int sabbir[]={3,4,5,6,7,8,9};
		change(sabbir);
		
		for(int y:sabbir){
			
			System.out.println(y);
		}
	}
	public static void change(int x[]){
		
		for(int count=0; count<x.length; count++){
			
			x[count]+=7;
		}
	}
}
