import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        int myLiczba = Scanner.nextInt();


        if (myLiczba > 0){
        System.out.println("The number is positive");
        } else if (myLiczba <0) {
            System.out.println("The number is negative");
        }
        else {
            System.out.println("The value equals 0");
        }

    }
}