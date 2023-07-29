package com.mycompany.q4;
public class rectangle extends Shape
{
    private double height,width;
    public rectangle(double height,double width)
    {
        this.height=height;
        this.width=width;
    }
    @Override
    public double calculateArea()
    {
        return height*width;
    }
}
