package com.mycompany.cylinder;
public class Cylindercontainer extends container
{
    private double height,radius;
    public Cylindercontainer(double height, double radius)
    {
        this.height=height;
        this.radius=radius;
    }
    
    public double volume()
    {
        return Math.PI*radius*radius*height;
    }
}
