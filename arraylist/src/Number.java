/*
 * This program will help us understand
 * how to work with Array
 * and Array List
 */

import java.util.ArrayList;
import java.util.Random;

public class Number {
    public static void main(String[] args) throws Exception {
        // Initialize array, size and arrayList
        int arraySize = 200;
        ArrayList<Integer> numList = new ArrayList<>(arraySize);
        int[] numArray = new int[200];

        Random randomNum = new Random();

        // Store random numbers in arrayList
        for (int i = 0; i < arraySize; i++)
            numList.add(i, randomNum.nextInt(-50, 150));

        // Store numbers from array list to array
        for (int j = 0; j < numList.size(); j++)
            numArray[j] = numList.get(j);

        NumberOperation numberOp1 = new NumberOperation();

        System.out.println("The total of values in array is : "
                + numberOp1.getTotal(numArray));
        System.out.println("The average of values in array is : "
                + numberOp1.getAverage(numArray));
        System.out.println("The highest values in array is : "
                + numberOp1.getHighest(numArray));
        System.out.println("The lowest values in array is : "
                + numberOp1.getLowest(numArray));

    }
}
