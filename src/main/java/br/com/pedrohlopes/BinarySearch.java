import java.util.ArrayList;
import java.util.Scanner;

public class BinarySearch {
    public String doBynarySearch(int[] array) {
        Scanner scanner = new Scanner(System.in);
        int value = 0;
        String input = "";

        while (true) {
            System.out.print("Type the value you wanna search or type 'end' to quit: ");
            input = scanner.nextLine();

            if (input.equals("end")) {
                System.out.println("Finishing...");
                break;
            }

            try {
                value = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid. Type a integer");
                continue;
            }

            int first = 0;
            int last = array.length - 1;

            while (first <= last) {
                int mid = (first + last) / 2;

                if (value == array[mid]) {
                    System.out.println("Value " + value + " found on position: " + mid);
                    break;
                } else if (value > array[mid]) {
                    first = mid + 1;
                } else if (value < array[mid]) {
                    last = mid;
                }
            }

            if (first > last) {
                System.out.println("The value " + value + " is not on the list");
            }
        }
    }
}
