
public class datatype {
		
	public static void main(String[] args){
		
		byte a = 126;
		 
        // byte is 8 bit value
        System.out.println(a);
        
        a++;
        System.out.println(a);
         
        // It overflows here because
        // byte can hold values from -128 to 127
        a++;
        System.out.println(a);
         
        // Looping back within the range
        a++;
        System.out.println(a);
        
        char aa = 'G';
        
        // Integer data type is generally 
        // used for numeric values
        int i=89;
         
        // use byte and short if memory is a constraint 
        byte b = 4;
         
        // this will give error as number is 
        // larger than byte range
        // byte b1 = 7888888955;
         
        short s = 56;
         
        // this will give error as number is 
        // larger than short range
        // short s1 = 87878787878;
         
         
        // by default fraction value is double in java
        double d = 4.355453532;
         
        // for float use 'f' as suffix
        float f = 4.7333434f;
        
        System.out.println("char: " + aa); 
        System.out.println("integer: " + i); 
        System.out.println("byte: " + b); 
        System.out.println("short: " + s); 
        System.out.println("float: " + f); 
        System.out.println("double: " + d); 
	}
}
