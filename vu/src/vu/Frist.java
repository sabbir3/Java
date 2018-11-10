package vu;
import java.awt.*;
public class Frist extends Frame {

	Frist(){
		
		Button b=new Button("click here");
		b.setBounds(30,80,100,30);
		add(b);
		setSize(300,200);
		setVisible(true);
		setLayout(null);
	}
	
	public static void main(String[] args){
		
		Frist f=new Frist();
	}
}
