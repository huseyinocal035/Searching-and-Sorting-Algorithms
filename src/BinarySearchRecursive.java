public class BinarySearchRecursive {

    public int findBinaryRecursive(int[] array, int target, int low, int high) {
        if (high >= low ) {
            int middle = (low + high) / 2;
            if (target == array[middle] ) {
                return middle;
            } else if (target < array[middle] ) {
                return findBinaryRecursive(array, target, low, middle-1);
            }
            return findBinaryRecursive(array, target, middle+1, high);
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearchRecursive binarySearch = new BinarySearchRecursive();
        int[] array = { 5,7,9,15,23,53,77};
        int place = binarySearch.findBinaryRecursive(array, 23, 0, array.length-1);
        System.out.println("Place of target is " + (place+1));
    }
}
