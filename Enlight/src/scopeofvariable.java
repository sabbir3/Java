
public class scopeofvariable {

	
	    private int x=5;
	    public void setX(int x)
	    {
	    	x=10;
	        this.x = x;
	    }
	
	
	public static void main(String[] args){
		
		scopeofvariable ob=new scopeofvariable();
		System.out.println("ob.x= "+ob.x);
		//System.out.println(" x= "+ x);
		
	}
}
