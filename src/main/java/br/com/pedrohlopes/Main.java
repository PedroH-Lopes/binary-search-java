package br.com.pedrohlopes;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.print("Type the value you wanna search: ");

        try {
            int value = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid. Type a integer");
        }

        int first = 0;
        int last = array.length - 1;
    }
}
