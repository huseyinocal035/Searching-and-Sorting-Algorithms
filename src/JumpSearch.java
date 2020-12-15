public class JumpSearch {

    public int findNumber(int[] array, int target) {
        int m = (int) Math.sqrt(array.length);
        int currentlastIndex = m -1;

        while (currentlastIndex < array.length && target > array[currentlastIndex] ) {
            currentlastIndex += m;
        }

        for (int i = currentlastIndex - m + 1; i <= currentlastIndex && i < array.length; i++) {
            if (target == array[i])
                return i;
        }

        return -1;
    }

    public static void main(String[] args) throws Exception {
        JumpSearch jumpSearch = new JumpSearch();

        int[] array = { 5,7,9,15,23,53,77,88,97};
        int place = jumpSearch.findNumber(array, 99);

        if (place == -1 ){
            throw new Exception("Target number is not in the array");
        }

        System.out.println("Place of target is " + (place+1));
    }

}
