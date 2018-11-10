package vu;

class ColoredRectangle extends Rectangle {
	    private String color;
	    ColoredRectangle(String c, String ty, int len, int bdth) {
	    super(ty, len, bdth);
        System.out.println("Inside constructor of coloredRectangle ");
	    System.out.println("length : " + len);
        System.out.println("breadth : " + bdth);   System.out.println("type : " + ty);
	          } }
