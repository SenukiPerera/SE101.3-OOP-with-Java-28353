package com.mycompany.q4;
public class circle extends Shape
{
    private double radius;
    public circle(double radius)
    {
        this.radius=radius;
    }
    @Override
    public double calculateArea()
    {
        return 3.1459f*radius*radius;
    }
}
