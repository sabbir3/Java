package zzseven;

public class statc {

	public String frist;
	public String last;
	public static int members=0;
	
	public statc(String fn, String ln){
		
		frist=fn;
		last=ln;
		members++;
		System.out.printf("the member name=%s%s \t , the member number= %d\n",frist,last,members);

	}
	
	public String getfrist (){
		
		return frist;
	}
	public String getlast (){
		
		return last;
	}
	public static int getmembers (){
	
	    return members;
}
	
	
	
	
}
