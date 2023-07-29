package com.mycompany.areaofshapes;
public class AreaofShapes 
{
    public static void main(String[] args) 
    {
        //call child class constructors
        Circle c=new Circle(5);
        System.out.println("Area of circle : "+c.calculateArea());
        System.out.println("Perimeter of circle : "+c.calculatePerimeter());
        
        Rectangle rec=new Rectangle(3,6);
        System.out.println("Area of rectangle : "+rec.calculateArea());
        System.out.println("Perimeter of rectangle : "+rec.calculatePerimeter());
        
        Triangle t=new Triangle(3,4,5);
        System.out.println("Area of triangle : "+t.calculateArea());
        System.out.println("Perimeter of triangle : "+t.calculatePerimeter());
    }
}
