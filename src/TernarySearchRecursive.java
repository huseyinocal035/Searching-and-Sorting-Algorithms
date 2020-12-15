public class TernarySearchRecursive {

    public int findNumber(int[] array, int start, int end, int target) {

        if (end >= start) {
            int mid1 = start + (end - start) / 3;
            int mid2 = end -  (end - start) / 3;

            if (target == array[mid1])
                return mid1;
            if (target == array[mid2])
                return mid2;
            if (target < array[mid1])
                return findNumber(array, start, mid1 - 1, target);
            else if (target > array[mid2])
                return findNumber(array, mid2 + 1, end, target);
            else
                return findNumber(array, mid1 + 1, mid2 - 1, target);

        }
        return -1;
    }

    public static void main(String[] args) throws Exception {
        TernarySearchRecursive ternarySearch = new TernarySearchRecursive();
        int[] array = { 5,7,9,15,23,53,77};
        int place = ternarySearch.findNumber(array, 0, 6, 68);

        if (place == -1 ){
            throw new Exception("Target number is not in the array");
        }

        System.out.println("Place of target is " + (place+1));
    }
}
