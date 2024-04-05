import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Choose the number of algorithm or enter zero to exit: ");
            int n = sc.nextInt();
            if (n == 0) break;
            switch (n) {
                case 1:
                    System.out.println("Enter the size of array");
                    int size = sc.nextInt();
                    int[] array = new int[size];
                    System.out.println("Enter the elements of the array:");
                    for (int i = 0; i < size; i++) {
                        array[i] = sc.nextInt();
                    }
                    double startTime = System.currentTimeMillis();
                    int min = MinValOfArray(size, array);
                    double estimatedTime = System.currentTimeMillis() - startTime;
                    System.out.println("The minimum value of the array: " + min);
                    System.out.println("The time passed: " + estimatedTime + " milliseconds");
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Enter the size of array");
                    size = sc.nextInt();
                    array = new int[size];
                    System.out.println("Enter the elements of the array:");
                    for(int i = 0; i < size; i++){
                        array[i] = sc.nextInt();
                    }
                    startTime = System.currentTimeMillis();
                    double average = AverageOfArray(size, array);
                    estimatedTime = System.currentTimeMillis() - startTime;
                    System.out.println("The average of the array: " + average);
                    System.out.println("The time passed: " + estimatedTime + " milliseconds");
                    System.out.println();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                default:
                    break;
            }
        }
    }


    /**
     * This method finds the minimum value of the array
     * The function is implemented by loop
     * Time complexity: O(n), where n is size of the array (number of elements of the array)
     * The algorithm iterates through all elements of the array and if the element less than min
     * then the value of the element assigned to min, which represents the minimum element of the array
     *
     * @param size  The number elements of the array
     * @param array The set of numbers, implemented by int[] data type
     * @return The minimum element in the array
     */
    public static int MinValOfArray(int size, int[] array) { // Creating a public method to find the minimum value, which take size of array and array itself as parameters
        if (size == 0) { // edge case where size is 0
            System.out.println("Size of the array is 0");
            return -1;
        }
        int min = array[0]; // Declaring a min variable and assigning a value of first element of array
        for (int i = 0; i < size; i++) { // Iterating through massive
            if (min > array[i]) {
                min = array[i]; // If the element less than min, assigning the element to min
            }
        }
        return min; // returning the min value
    }

    /**
     * The method calculates average value of the array elements
     * The function is implemented by loop (for-each)
     * Time complexity: O(n), where n is size of the array
     * The algorithm iterates through whole array and calculates the sum of the elements
     * then return the average value by dividing the sum by number of elements
     *
     * @param size The number of elements of the array
     * @param array The set of numbers, implemented by int[] data type
     * @return The average value of the array
     */
    public static double AverageOfArray(int size, int[] array){
        if(size == 0){
            System.out.println("Size of the array is 0");
            return -1;
        }
        double sum = 0;
        for(int element : array){
            sum += element;
        }
        return sum/size;
    }
}