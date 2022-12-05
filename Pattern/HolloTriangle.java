import java.util.Scanner;

public class HolloTriangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);// make a obj for take input
        System.out.println("Enter a Number");// put a line on console screen
        int n = sc.nextInt();// take a input from user
        for (int i = 1; i <= n; i++) {
            for (int k = n-i; k > 0; k--) {
                System.out.print(" ");
            }// end of k loop
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (i == 1 || i == n || j == 1 || j == 2*i-1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }// end of if else
            }// end of j loop
            System.out.println();
        }// end of i loop
        sc.close();
    }//end of main
}//end of class