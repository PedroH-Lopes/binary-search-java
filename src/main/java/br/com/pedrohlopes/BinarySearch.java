package br.com.pedrohlopes;

public class BinarySearch {
    public int doBinarySearch(int[] array, int searchedValue) {
        int first = 0;
        int last = array.length - 1;

        while (first <= last) {
            int mid = (first + last) / 2;

            if (searchedValue == array[mid]) {
                return mid;
            } else if (searchedValue > array[mid]) {
                first = mid + 1;
            } else {
                last = mid - 1;
            }
        }

        return -1;
    }
}
