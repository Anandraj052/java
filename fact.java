import java.util.Scanner;

public class factorial {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,fact;
        System.out.println("Enter any number");
        n=sc.nextInt();
        for(i=1;i<n;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial of N:"+fact);
    }
}
