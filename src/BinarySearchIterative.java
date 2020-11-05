public class BinarySearchIterative {

    public int findBinaryIterative(int[] array, int target, int low, int high) {
        while (high >= low ) {
            int middle = (high + low) / 2;
            if (array[middle] == target) {
                return middle;
            } else if (array[middle] < target) {
                low = middle + 1;
            } else {
                high = middle - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearchIterative binarySearch = new BinarySearchIterative();
        int[] array = { 5,7,9,15,23,53,77,89};
        int place = binarySearch.findBinaryIterative(array, 89, 0, array.length-1);
        System.out.println("Place of target is " + (place+1));
    }

}
