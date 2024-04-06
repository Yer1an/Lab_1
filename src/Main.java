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
                    double startTime = System.nanoTime();
                    int min = MinValOfArray(size, array);
                    double estimatedTime = (System.nanoTime() - startTime) / 1000000 ;
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
                    startTime = System.nanoTime();
                    double average = AverageOfArray(size, array);
                    estimatedTime = (System.nanoTime() - startTime) / 1000000 ;
                    System.out.println("The average of the array: " + average);
                    System.out.println("The time passed: " + estimatedTime + " milliseconds");
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Enter the number:");
                    int number = sc.nextInt();
                    startTime = System.nanoTime();
                    IsPrime(number);
                    estimatedTime = (System.nanoTime() - startTime) / 1000000 ;
                    System.out.println("Time passed: " + estimatedTime + " milliseconds");
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Enter the number:");
                    number = sc.nextInt();
                    startTime = System.nanoTime();
                    int factorial = Factorial(number);
                    estimatedTime = (System.nanoTime() - startTime) / 1000000 ;
                    System.out.println("The factorial of the number " + number + " is " + factorial);
                    System.out.println("Time passed: " + estimatedTime + " milliseconds");
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Enter the number:");
                    number = sc.nextInt();
                    startTime = System.nanoTime();
                    int fibonacci = Fibonacci(number);
                    estimatedTime = (System.nanoTime() - startTime) / 1000000 ;
                    System.out.println("The " + number+"-th Fibonacci number is: " + fibonacci);
                    System.out.println("Time passed: " + estimatedTime + " milliseconds");
                    System.out.println();
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

    /**
     * The function determines is the number composite or prime
     * Time complexity: O(n), where n is the given number
     * The algorithm applies the loop which start from 2 till number/2 and if there exist
     * value i by which number can be divided without remainder, then the number is composite
     *
     * @param number The number that need to be checked
     */
    public static void IsPrime(int number){
        boolean answer = true;
        for(int i = 2; i <= number/2; i++){
            if(number % i == 0){
                System.out.println("The number is composite");
                return;
            }
        }
        System.out.println("The number is prime");
    }

    /**
     * The function calculates the factorial of the number
     * Time complexity: O(n), where n is the given number
     * The algorithm is recursive, iterates in the range between number and 1
     *
     *
     * @param number The number of the factorial to be found
     * @return The factorial of the given number
     */
    public static int Factorial(int number){
        if(number == 0 || number == 1) return 1;
        return number * Factorial(number-1);
    }

    /**
     * The function calculates the n-th value of fibonacci sequence
     * Time complexity: O(2^n), where n is n-th fibonacci number
     * The recursive algorithm, which calls itself twice in one iteration,
     * with exponential time complexity
     *
     * @param n The number of the fibonacci value to be found
     * @return The n-th fibonacci number
     */
    public static int Fibonacci(int n){
        if(n <= 1) return n;
        return Fibonacci(n-1) + Fibonacci(n - 2);
    }
}