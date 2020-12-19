package Searching;

public class InterpolationSearch {

    public int findNumber(int[] array, int start, int end, int target) {

        while ((start <= end) && (target >= array[start]) && (target <= array[end])) {

            int position = start + (((end -  start) / (array[end]- array[start])) * (target - array[start]));

            if (array[position] == target)
                return position;
            else if ( array[position] < target)
                return findNumber(array, position + 1, end, target);
            else
                return findNumber(array, start, position - 1, target);
        }

        return -1;
    }

    public static void main(String[] args) throws Exception {
        InterpolationSearch interpolationSearch = new InterpolationSearch();
        int[] array = { 5,7,9,15,23,53,85};
        int place = interpolationSearch.findNumber(array, 0, array.length-1, 85);
        if (place == -1 ){
            throw new Exception("Target number is not in the array");
        }
        System.out.println("Place of target is " + (place+1));
    }
}
