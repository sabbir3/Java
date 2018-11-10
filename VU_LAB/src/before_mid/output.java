package before_mid;

public class output {
	public static void main(String[] args)
	{
		StringBuffer strObj = new StringBuffer("Learing Java is very Easy");
		System.out.println(strObj.length());
		System.out.println(strObj.delete(16, 20));
		System.out.println(strObj.capacity());
		System.out.println(strObj.charAt(17));
		strObj.setCharAt(9, 'j');
		System.out.println(strObj);
		strObj.setLength(2);
		System.out.println(strObj);
		strObj.append("!").append("!");
		System.out.println(strObj);
		strObj.insert(2,"gend");
		System.out.println(strObj);
		strObj.replace(1,4,"a");
		System.out.println(strObj);
		strObj.reverse();
		System.out.println(strObj);
		
		
		
		
	}

}
