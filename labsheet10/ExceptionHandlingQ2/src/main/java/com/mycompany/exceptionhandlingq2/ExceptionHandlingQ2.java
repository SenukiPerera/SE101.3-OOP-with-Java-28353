package com.mycompany.exceptionhandlingq2;
public class ExceptionHandlingQ2 
{
    public static void main(String[] args) 
    {
        int arr[]={1,2,3,4,5};
        
        try
        {
            int value=arr[10];
            System.out.println("Value: "+value);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Invalid index");
        }
        finally
        {
            for(int i=0;i<arr.length;i++)
            {
               System.out.println(arr[i]+" ");
            }
        }
    }
}
