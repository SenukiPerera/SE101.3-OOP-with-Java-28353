package com.mycompany.q4;
abstract class Shape 
{
    public abstract double calculateArea();
    public void display()
    {
        System.out.println("Area: "+calculateArea());
        
    }
}
