import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner M = new Scanner(System.in);
        System.out.println("Please Enter The Number");


        int[] Number = {19, 18, 91, 76, 91, 7, 43};
        int Check = M.nextInt();


        for (int n : Number) {
            if (n == Check) {

                System.out.println("Yes, The Number is Here" + n);
            }else {
                System.out.println("The Number Not Here");
                break;
            }
        }
    }
}