/*The program must accept three integers N(represents a digit ),x and y as input.
The program must print the count of N in the digits of each integers from Xto y
(exclusive of x and y)

Input format:
The first line contains the integer value of N
The second line contains the integers X and Y seperated by space.

Output Format:
The first line contains the count of N in the digits of each integers from x to y

Example input/output:
input
5
50 55

output:
4

import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int N,x,y,i,j,k,count=0;
        N=sc.nextInt();
        x=sc.nextInt();
        y=sc.nextInt();
        for(i=x+1;i<y;i++){
           j=i;
            while(j>0)
            {
                k=j%10;
                j=j/10;
                if(k==N)
                    count++;
            }
        }
        System.out.println(count);
    }
}
