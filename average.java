import java.util.Scanner;

public class Average {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        int sum = 0;
        int count = 0;

        do {
            System.out.println("Enter a number (0 to exit): ");
            number = scanner.nextInt();

            if (number != 0) {
                sum += number;
                count++;
            }
        } while (number != 0);

        double average = (double) sum / count;
        System.out.println("The average is " + average);
    }