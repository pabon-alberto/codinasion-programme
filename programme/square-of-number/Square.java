import java.util.*;

public class Square {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in); //scanner class to take input
        System.out.print("Input: ");
        int n = sc.nextInt();
        int squareOfn = n*n; //squaring n
        System.out.print("Output: " + squareOfn); //printing output
    }
}
