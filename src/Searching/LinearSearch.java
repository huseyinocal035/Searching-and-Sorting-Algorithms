package Searching;

import java.util.Scanner;

public class LinearSearch {

    public int findNumber(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if ( array[i] == number ) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int number = scanner.nextInt();
        int[] array = new int[number];

        System.out.println("Enter the elements respectively");
        for (int i = 0; i < number; i++){
            array[i] = scanner.nextInt();
        }

        System.out.println("Enter number to find: ");
        int target = scanner.nextInt();

        LinearSearch linearSearch = new LinearSearch();
        int place = (linearSearch.findNumber(array, target) + 1);
        if (place == 0 ){
            throw new Exception("Target number is not in the array");
        }

        System.out.println(target + " is at " + place + ". place of the array");
    }

}
