import java.util.Scanner;

public class binary_search {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Type the value you wanna search");
        int value = Integer.valueOf(scanner.nextLine());

        int first = 0;
        int last = vetor.length - 1;

        while (first <= last) {

            int mid = (first + last) / 2;
            
            if (vetor[mid] == value) {
                System.out.println("Value " + value + " founded on position " + mid);
                break;
            } else if (vetor[mid] < value) {
                first = mid + 1;
            } else  {
                last = mid;
            }
        }

        if (first > last) {
            System.out.println("The value " + value + " is not on the list");
        }
    }
}
