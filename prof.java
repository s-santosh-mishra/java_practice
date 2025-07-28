import java.util.Scanner;

public class prof {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // for (int n = 1; n <= 5; n++) {
        // for (int i = 1; i <= (5 - n); i++) {
        // System.out.print(" ");
        // }
        // for (int k = 1; k <= n; k++) {
        // System.out.print("*");
        // }
        // System.out.println("");
        // }

        // for (int i = 0; i < 3; i += 1) {
        // for (int j = 0; j < i; j += 1) {
        // System.out.print(" ");
        // }
        // for (int k = 0; k < 5 - 2*i; k += 1) {
        // System.out.print("*");
        // }
        // System.out.println("");
        // }

        // pb2 -> print table
        // int n = input.nextInt();
        // int i = 1;
        // while (i<=10) {
        // System.out.println(n +" X " + i + " = " + n*i);
        // i++;
        // }

        // pb3 -> suym of odd nos
        // int n = input.nextInt();
        // int i = 1;
        // int sum = 0;
        // while (i<=n) {
        // if (i%2==0){
        // sum += i;
        // }
        // i++;
        // }
        // System.out.println("The sum is "+sum);

        // pb4 -> factorial
        // int n = input.nextInt();
        // int i = 1;
        // int fact = 1;
        // while (i<=n) {
        // fact*=i;
        // i++;
        // }
        // System.out.println("The fact is "+fact);

        // pb 5 -> FINDOUT LCM
        int m = input.nextInt();
        int n = input.nextInt();

        int i = 2;
        int lcm = 1;
        if (m == 1 && n == 1) {
            System.out.println("LCM is 1");
        } else if (m == 1 || n == 1) {
            if (m > n) {
                System.out.println("LCM is " + m);
            } else {
                System.out.println("LCM is " + n);
            }
        } else {
            while (m != 1 || n != 1) {
                if (m % i == 0 && n % i == 0) {
                     m = m / i;
                     n = n / i;
                     lcm = lcm * i;
                }
                else if (m % i == 0 || n % i == 0) {
                    // i = 2;
                    if (m % i == 0) {
                        lcm = lcm * i;
                        m = m / i;
                    }
                    if (n % i == 0) {
                        lcm = lcm * i;
                        n = n / i;
                    }
                    i++;
                }
                else{
                    i++;
                }
            }
        }
        lcm = lcm * m * n;
        System.out.println("LCM is "+lcm);

        input.close();
    }
}
