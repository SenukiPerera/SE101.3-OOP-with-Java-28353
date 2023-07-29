package com.mycompany.areaofshapes;
public class Rectangle implements Shape
{
    public double height,width;
    
    public Rectangle(double height, double width)
    {
        this.height=height;
        this.width=width;
    }
    //Setter and getter methods
    public void setHeight(double h)
    {
        height=h;
    }
    public void setWidth(double w)
    {
        width=w;
    }
    public double getHeight()
    {
        return height;
    }
    public double getWidth()
    {
        return width;
    }
     @Override
    public double calculateArea()
    {
        return height*width;
    }
     @Override
    public double calculatePerimeter()
    {
        return (height+width)*2;
    }
}
