//  Write a program to accept a string input from user and print the characters at even indices.
import java.util.*;
public class App{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        calcSquare(n);
    }

    // Define the method
    public static void calcSquare(int num) {
        int final_output=0;
        for(int j=1;j<=num;j++){
            int temp_output=0;
            for (int i=1;i<=j;i++){
                temp_output+=i*i;
            }
            final_output+=temp_output;
    }
    System.out.print(final_output);

      
    }
}
