import java.awt.*;
public class first2 {

	first2(){
	
		Frame f=new Frame();
		Button b=new Button("click here");
		b.setBounds(30,100, 80,30);
	    f.add(b);
	    f.setSize(100,100);
	    f.setVisible(true);
	    f.setLayout(null);
	}
	
	public static void main(String[] args){
		
		first2 ob=new first2();
	}
}
