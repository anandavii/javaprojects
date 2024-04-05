/*
 * This class implements the functions
 * for getting sum, average ,
 * highest and lowest
 */

public class NumberOperation {

    /**
     * getTotal method returns the
     * sum total of numbers in array
     * 
     * @param numArray contains the list of numbers
     * @return returns sum of numbers
     */
    public int getTotal(int[] numArray) {
        int total = 0;
        for (int i = 0; i < numArray.length; i++) {
            total = total + numArray[i];
        }
        return total;
    }

    /**
     * getAverage returns average
     * of numbers in array
     * 
     * @param numArray contains the list of numbers
     * @return returns average of numbers
     */
    public double getAverage(int[] numArray) {
        double avg = 0.0, sum = 0.0;
        for (int i = 0; i < numArray.length; i++)
            sum = sum + numArray[i];
        avg = sum / numArray.length;
        return avg;

    }

    /**
     * getHighest returns highest
     * number in the array
     * 
     * @param numArray contains the list of numbers
     * @return returns highest number
     */
    public int getHighest(int[] numArray) {
        int getHighest = numArray[0];
        for (int i = 0; i < numArray.length; i++) {
            if (numArray[i] > getHighest)
                getHighest = numArray[i];
        }
        return getHighest;
    }

    /**
     * getLowest returns lowest
     * number in the array
     * 
     * @param numArray contains the list of numbers
     * @return returns lowest number
     */
    public int getLowest(int[] numArray) {
        int getLowest = numArray[0];
        for (int i = 0; i < numArray.length; i++) {
            if (numArray[i] < getLowest)
                getLowest = numArray[i];
        }
        return getLowest;
    }
}
