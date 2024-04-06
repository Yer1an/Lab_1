#Problem 1
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
     /n
#Problem 2
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
#Problem 3
    /**
     * The function determines is the number composite or prime
     * Time complexity: O(n), where n is the given number
     * The algorithm applies the loop which start from 2 till number/2 and if there exist
     * value i by which number can be divided without remainder, then the number is composite
     *
     * @param number The number that need to be checked
     */
#Problem 4
    /**
     * The function calculates the factorial of the number
     * Time complexity: O(n), where n is the given number
     * The algorithm is recursive, iterates in the range between given number and 1
     *
     *
     * @param number The number of the factorial to be found
     * @return The factorial of the given number
     */
#Problem 5
    /**
     * The function calculates the n-th value of fibonacci sequence
     * Time complexity: O(2^n), where n is n-th fibonacci number
     * The recursive algorithm, which calls itself twice in one iteration,
     * with exponential time complexity
     *
     * @param n The number of the fibonacci value to be found
     * @return The n-th fibonacci number
     */
#Problem 6
    /**
     * The function calculates the value of number a int n-th power
     * Time complexity: O(n), where n is the degree to which number is to be raised
     * The recursive algorithm iterates from n to 0, resulting in linear time complexity
     *
     * @param a The number which degree is to be found
     * @param n the degree in which the number needed to be raised
     * @return number a in n-th degree;
     */
#Problem 7
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
#Problem 8
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
#Problem 9
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
#Problem 10
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
