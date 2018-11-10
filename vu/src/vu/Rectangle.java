package vu;

public class Rectangle extends Shape {
    private String type;
    Rectangle(String ty, int len, int bdth) {
       super(len, bdth);
    System.out.println("Inside constructor of rectangle ");
    System.out.println("length : " + len);
    System.out.println("breadth : " + bdth);
    System.out.println("type : " + ty);
}}
