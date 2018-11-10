package zzseven;

public class test2 {

	public static void main(String[] args){
		
		int fristarray[][]={{45,56,7,89,77,45,85,45},{24,5,82,27,38}};
		int secondarray[][]={{1,2,3,4,5,6},{786,678,432},{56,87,90,86}};
		System.out.println("this is frist array=");
		display(fristarray);
		System.out.println("this is second array=");
		display(secondarray);

	}
	public static void display(int x[][]){
		
		for(int row=0; row<x.length; row++){
			
			for(int column=0; column<x[row].length; column++){
				
				System.out.print(x[row][column]+"\t");
			}
			System.out.println();
		}
		
		
	}
}
