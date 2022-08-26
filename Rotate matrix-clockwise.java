/* An integer matrix of size N*N is given as input.The program must rotate the matrix in the clockwise
direction and print the rotated matrix a s the out put.
Example 1:
input:
5
1 2 3 4 5
 6 7 8 9 10
 23 45 67 89 45
 12 23 45 67 78
 11 12 13 14 15
 
 output:
 11 12 23 6 1
 12 23 45 7 2
 13 45 67 8 3
 14 67 89 9 4
 15 78 45 10 5
 



import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,j;
        int N=sc.nextInt();
        int row=N-1;
        int col=0;
        int[][] a=new int[N][N];
        int[][] b=new int[N][N];
        for(i=0;i<N;i++)
        {
            for(j=0;j<N;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<N;i++)
        {
            for(j=0;j<N;j++)
            {
                b[i][j]=a[row][col];
                System.out.print(b[i][j]+" ");
                row--;
                
            }
            System.out.println();
            col++;
            row=N-1;
            
        }
    }
}
