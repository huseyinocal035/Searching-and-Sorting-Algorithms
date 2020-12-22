package Sorting.MergeSort;

public class MergeSort {

    private int[] numbers;

    private int[] tempArray;

    public MergeSort(int[] numbers) {
        this.numbers = numbers;
        tempArray = new int[numbers.length];
    }

    public void mergeSort(int low, int high) {
        if (low >= high)
            return;

        int middle = (low + high) / 2;

        mergeSort(low, middle);
        mergeSort(middle + 1, high);
        merge(low, middle, high);
    }

    public void showResult() {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] + " ");
        }
    }

    private void merge(int low, int middle, int high) {
        for (int i = low; i <= high; i++) {
            tempArray[i] = numbers[i];
        }

        int i = low;
        int j = middle + 1;
        int k = low;

        while ((i <= middle) && (j <= high)) {
            if (tempArray[i] <= tempArray[j]) {
                numbers[k] = tempArray[i];
                i++;
            } else {
                numbers[k] = tempArray[j];
                j++;
            }

            k++;
        }

        while (i <= middle) {
            numbers[k] = tempArray[i];
            k++;
            i++;
        }

        while (i <= middle) {
            numbers[k] = tempArray[j];
            k++;
            j++;
        }
    }

    public boolean isSorted() {
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i + 1])
                return false;
        }
        return true;
    }
}
