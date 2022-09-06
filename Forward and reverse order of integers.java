/*
The program must accept three integers x,y,z.Where Y is the largest number.
The program must print the integers from the smallest integers to second 
smallest integer and from Y to the second smalllest integers as the output.

Example:

Input:
10  25  20
Output:
10 11 12 13 14 15 16 17 18 19 20 25 24 23 22 21 20

Input:
20 25 10
10 11 12 13 14 15 16 17 18 19 20 25 24 23 22 21 20*/


import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,j,m;
        int x,y,z;
        x=sc.nextInt();
        y=sc.nextInt();
        z=sc.nextInt();
        if(x<y && x<z)
        {
            m=x;
            j=z;
        }
        else{
            m=z;
            j=x;
        }
        for(i=m;i<=j;i++)
        {
            System.out.print(i+" ");
        }
        for(i=y;i>=j;i--)
        {
            System.out.print(i+" ");
        }
    }
}
