/* Flowchart logic */

import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        System.out.print(N);
        int m=N;
        for(int i=1;i<m;i++)
        {
            N--;
            if(N>0)
            {
                System.out.print(N+" ");
            }
        }
    }
}
