import java.util.Scanner;

public class add2D {
    public static void main(String[] args)
    {
        int i,j;
        Scanner sc=new Scanner(System.in);
        int row,coln;
        System.out.println("Enter rows and columns");
        row=sc.nextInt();
        coln=sc.nextInt();
        int A[][]=new int[row][coln];
        System.out.println("Enter matrix element");
        for( i=0;i<A.length;i++)
        {
            for( j=0;j<A[i].length;j++)
            {
                A[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter second matrix row and column");
        int b[][]=new int[row][coln];
        System.out.println("Enter second matrix Element");
        for(i=0;i<A.length;i++)
        {
            for(j=0;j<A[i].length;j++)
            {
                b[i][j]=sc.nextInt();
            }
        }
        int c[][]=new int[row][coln];
        for(i=0;i<A.length;i++)
        {
            for(j=0;j<A[i].length;j++)
            {
                c[i][j]=A[i][j]+b[i][j];
            }
        }
        for(i=0;i<A.length;i++)
        {
            for(j=0;j<A[i].length;j++)
            {
                System.out.print(c[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
