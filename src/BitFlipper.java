import java.util.Scanner;

public class BitFlipper {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 0 or 1:");
        int number = input.nextInt();
        if (number == 1) System.out.print(0);

        if (number == 0) System.out.print(1);

    }

}
