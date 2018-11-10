package vu;



public class AA {
	
	public static void main(String[] args){
		
		try{
			int a[]=new int[5];
			a[3]=(int) (30/3.50);
			
		}
		catch(ArithmeticException e){
			
			System.out.println("float not possible");
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("index number is not valid ArrayIndexOutOfBoundsException exicuted");
		}
		catch(Exception e){
			System.out.println("Exception exicuted");
		}
		finally{
			System.out.println("fina block exicuted");
		}
		System.out.println("rest of the code");
	}

}
