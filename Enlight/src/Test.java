
public class Test {

	static int x = 11;
    public int y = 33;
    
    public void method1(int x)
    {
        Test t = new Test();
        this.x = 22;
        y = 44;
 
        System.out.println("Test.x: " + Test.x);
        System.out.println("t.x: " + t.x);
        System.out.println("t.y: " + t.y);
        System.out.println("y: " + y);
        System.out.println("x: " + x);
    }
 
    public static void main(String args[])
    {
        Test t = new Test();
        t.method1(5);
        System.out.println("t.y: " + t.y);
       
        
    }
}
