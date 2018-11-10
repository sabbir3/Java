package zzseven;

public class multidimentional_array {

	public static void main(String[] args){
		
		int firstarray[][]={{3,4,5,6,7},{12,23,34,56,67,}};
		int secondarray[][]={{9,8,7,6,},{90,80},{98,87,65,43}};
		
		
		System.out.println("this is my first array=");
		display(firstarray);
		System.out.println("this is my second array=");
		display(secondarray);
	}
	
	
	public static void display(int x[][]){
		
		for(int row=0; row<x.length; row++ ){	
			for(int column=0; column<x[row].length; column++){
				
				
				System.out.print(x[row][column]+"\t");
			}
			System.out.println();
			//System.out.println();
		}
	}
}
