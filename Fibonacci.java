package onpu;
import java.util.*;



public class Fibonacci {
    static Scanner scan=new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter size: ");
        int n=scan.nextInt();
        System.out.println("Choose method: Recursion - 1 or Iteration - 2");
        int method=scan.nextInt();

        if (method == 1)
            for(int i = 0; i < n; i++)
                System.out.print(recursion(i) + " ");

        else if(method == 2)
            iteration(n);
    }

    private static int iteration(int n){
        int a = -1,
            b = 0,
            sum = 0;
        for (int i=0; i < n; i++){
            sum = a + b;
            a = b;
            b=sum;
            System.out.print(Math.abs((sum)) + " ");
        }
        return Math.abs((sum));

    }
    private static int recursion(int i){
        if (i <= 0) return 0;
        else if (i == 1) return 1;
        else if (i == 2) return 2;
        else {
            return recursion(i - 1) + recursion(i - 2);
        }
    }
}