import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Choose the number of algorithm or enter zero to exit: ");
            int choice = sc.nextInt();
            if (choice == 0) break;
            switch (choice) {
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
                    System.out.println("Enter the number:");
                    number = sc.nextInt();
                    System.out.println("Enter the degree to which you want to raise the number:");
                    int degree = sc.nextInt();
                    startTime = System.nanoTime();
                    int answer = Power(number, degree);
                    estimatedTime = (System.nanoTime() - startTime) / 1000000 ;
                    System.out.println("The number " + number + " in " + degree+"-th degree is " + answer);
                    System.out.println("Time passed: " + estimatedTime + " milliseconds");
                    System.out.println();
                    break;
                case 7:
                    System.out.println("Enter the size of the array");
                    size = sc.nextInt();
                    array = new int[size];
                    System.out.println("Enter the elements of the array:");
                    for(int i = 0; i < size; i++){
                        array[i] = sc.nextInt();
                    }
                    System.out.println("The reversed array is:");
                    startTime = System.nanoTime();
                    ReverseArray(size, array, 0);
                    estimatedTime = (System.nanoTime() - startTime) / 1000000;
                    System.out.println();
                    System.out.println("Time passed: " + estimatedTime + " milliseconds");
                    System.out.println();
                    break;
                case 8:
                    System.out.println("Type the string:");
                    String s = sc.next();
                    startTime = System.nanoTime();
                    boolean ans = AllDigits(s, 0);
                    estimatedTime = (System.nanoTime() - startTime) / 1000000;
                    if(ans){
                        System.out.println("The string consist only with digits");
                    }else{
                        System.out.println("The string doesn't consist only with digits");
                    }
                    System.out.println("Time passed: " + estimatedTime + " milliseconds");
                    System.out.println();
                    break;
                case 9:
                    System.out.println("Enter the n:");
                    int n = sc.nextInt();
                    System.out.println("Enter the k:");
                    int k = sc.nextInt();
                    startTime = System.nanoTime();
                    int binomialCoefficient = BinomialCoeficient(k, n);
                    estimatedTime = (System.nanoTime() - startTime) / 1000000;
                    System.out.println("The binomial coefficient C("+ n +","+k+") is " + binomialCoefficient);
                    System.out.println("Time passed: " + estimatedTime + " milliseconds");
                    System.out.println();
                    break;
                case 10:
                    System.out.println("Enter the a:");
                    int a = sc.nextInt();
                    System.out.println("Enter the b:");
                    int b = sc.nextInt();
                    startTime = System.nanoTime();
                    int gcd = GCD(a, b);
                    estimatedTime = (System.nanoTime() - startTime) / 1000000;
                    System.out.println("The value of GCD(" + a + "," + b+ ") is " + gcd);
                    System.out.println("Time passed: " + estimatedTime + " milliseconds");
                    System.out.println();
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
     * The algorithm is recursive, iterates in the range between given number and 1
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

    /**
     * The function calculates the value of number a int n-th power
     * Time complexity: O(n), where n is the degree to which number is to be raised
     * The recursive algorithm iterates from n to 0, resulting in linear time complexity
     *
     * @param a The number which degree is to be found
     * @param n the degree in which the number needed to be raised
     * @return number a in n-th degree;
     */
    public static int Power(int a, int n){
        if(n == 0) return 1;
        return a * Power(a, n-1);
    }

    /**
     * The function prints the given array in reversed form
     * Time complexity: O(n), where n is the size of the array
     * The recursive algorithm iterates trough array elements from 0 to n-1,
     * resulting in linear time complexity
     *
     * @param n The size of the array
     * @param array The set of numbers, implemented by int[] data type
     * @param index The position of the array elements
     */
    public static void ReverseArray(int n, int[] array, int index){
        if(index == n-1){
            System.out.print(array[index] + " ");
            return;
        }
        ReverseArray(n, array, index + 1);
        System.out.print(array[index] + " ");
    }

    /**
     * The function determines whether the string consist only with digits
     * Time complexity: O(n), where n is the length of the given string
     * The recursive algorithm iterates through whole string, checking each character for digit,
     * resulting in linear complexity
     *
     * @param s The given string
     * @param index The index of the index-th char in the string
     * @return True or False. True - the string consist only with digits, false - not;
     */
    public static boolean AllDigits(String s,int index){
        if(index == s.length()-1){
            return '0' <= s.charAt(index) && s.charAt(index) <= '9';
        }
        return AllDigits(s,index+1) && '0' <= s.charAt(index) && s.charAt(index) <= '9';
    }

    /**
     * The function returns value of binomial coefficient C(n, k)
     * Time complexity: O(2^n), where n is the power of the expression (x+1)^n
     * The recursive algorithm calls itself twice in one iteration, resulting in
     * exponential time complexity
     *
     * @param k The power of x in the expression (x+1)^n which coefficient is to be found
     * @param n The power of the expression (x+1)^n
     * @return binomial coefficient C(n,k)
     */
    public static int BinomialCoeficient(int k, int n){
        if(k > n) return 0;
        if(k == n || k == 0) return 1;
        return BinomialCoeficient(k-1,n-1) + BinomialCoeficient(k, n-1);
    }

    /**
     * The function finds the greatest common divisor of numbers a and b
     * Time complexity: O( log(min(a,b)) )
     * The recursive algorithm implemented by Euclidean Algorithm,
     * resulting in logarithmic time complexity
     *
     * @param a First number
     * @param b Second number
     * @return The greatest common divisor of a and b
     */
    public static int GCD(int a, int b){
        if(a== 0) return b;
        return GCD(b%a,a);
    }

}