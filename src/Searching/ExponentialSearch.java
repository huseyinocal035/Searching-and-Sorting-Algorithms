package Searching;


import static java.lang.Math.min;

// For this implementation, BinarySearchRecursive class in the same package has been used.
public class ExponentialSearch {

    public int findNumber(int[] array, int low, int high, int target) {
        if (array[0] == target)
            return 0;

        int i = 1;
        while (i < array.length && array[i] <= target) {
            i = i * 2;
        }

        BinarySearchRecursive binarySearchRecursive = new BinarySearchRecursive();
        return  binarySearchRecursive.findBinaryRecursive(array, target, i/2, min(i, array.length - 1));
    }

    public static void main(String[] args) throws Exception {
        ExponentialSearch exponentialSearch = new ExponentialSearch();
        int[] array = { 5,7,9,15,23,53,77};
        int place = exponentialSearch.findNumber(array, 0, array.length-1, 19);
        if (place == -1 ){
            throw new Exception("Target number is not in the array");
        }
        System.out.println("Place of target is " + (place+1));
    }
}
