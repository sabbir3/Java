package zzseven;

public class arraysum {

	public static void main(String[] args){
		
		int sabbir[]={1,2,3,4,5,6,7,8,9,10};
		int sum=0,cas=1;
		
		for(int count=0; count<sabbir.length; count++){
			
			sum+=sabbir[count];
			System.out.println("cas "+cas+"="+sum);
			cas++;
		}
		System.out.println("the sum of those numbers is= "+sum);
	}
}
