import java.util.Scanner;

public class HolloSquare{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in); // make a obj for take input
        System.out.println("Enter a Number"); // send a message
        int n = sc.nextInt(); // take input
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= n ; j++){
                if(i == 1 || j == 1 || i == n || j == n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                } // end of if else
            } // end of j loop
            System.out.println();
        } // end of i loop
        sc.close();
    } // end of main
} // end of class