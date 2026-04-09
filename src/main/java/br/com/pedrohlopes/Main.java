package br.com.pedrohlopes;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinarySearch binarySearch = new BinarySearch();
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int searchedValue;

        while (true) {
            System.out.print("Type the value you wanna search or type 'end' to quit: ");
            String input = scanner.nextLine();

            if (input.equals("end")) {
                System.out.println("Finishing...");
                break;
            }

            try {
                searchedValue = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid. Type an integer");
                continue;
            }

            int result = binarySearch.doBinarySearch(array, searchedValue);

            if (result >= 0) {
                System.out.println("The searched value: " + searchedValue + " was found on index: " + result);
            } else {
                System.out.println("Value not found");
            }
        }
    }
}
