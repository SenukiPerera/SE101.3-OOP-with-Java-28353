package com.mycompany.areaofshapes;
public class Triangle implements Shape
{
    private double length1;
    private double length2;
    private double length3;
    
    public Triangle(double length1, double length2, double length3)
    {
        this.length1=length1;
        this.length2=length2;
        this.length3=length3;
    }
    //Setter and getter methods
    public void setLength1(double l1)
    {
        length1=l1;
    }
    public void setLength2(double l2)
    {
        length2=l2;
    }
    public void setLength3(double l3)
    {
        length3=l3;
    }
    public double getLength1()
    {
        return length1;
    }
    public double getLength2()
    {
        return length2;
    }
    public double getLength3()
    {
        return length3;
    }
     @Override
    public double calculateArea()
    {
        double x = (length1 + length2 + length3) / 2;
        return Math.sqrt(x * (x - length1) * (x - length2) * (x - length3));
    }
     @Override
    public double calculatePerimeter()
    {
        return length1+length2+length3;
    }
}
