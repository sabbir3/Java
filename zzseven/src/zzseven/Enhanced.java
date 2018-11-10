package zzseven;

public class Enhanced {

	public static void main(String[] args){
		
	int sabbir[]={45,67,34,54,34,23};
	int sum=0;
	int cas=0;
	
	for(int x:sabbir){
		
		sum+=x;
		cas++;
		System.out.println("case"+cas+"="+sum);
	}
	System.out.println("TOTSL="+sum);
	}
}
