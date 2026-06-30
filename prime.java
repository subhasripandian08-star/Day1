import java.util.Scanner;

public class prime {

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        boolean isPrime = true;
        
        if(N <= 1)
        {
            isPrime = false;
        }
        
        for(int i = 2; i < N; i++)
        {
            if(N % i == 0)
            {
                isPrime = false;
            }
        }
        
        if(isPrime == true)
        {
            System.out.println("Prime Number");
        }
        
        else
        {
            System.out.println("Not a Prime Number");
        }
    }
}