package Sorting.MergeSort;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();

        int[] numbers = new int[30];

        for (int j = 0; j < numbers.length; j++) {
            numbers[j] = random.nextInt(100) - 50;
        }

        MergeSort mergeSort = new MergeSort(numbers);
        mergeSort.mergeSort(0, numbers.length - 1);
        mergeSort.showResult();
    }

}
