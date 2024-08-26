package Day3;

public class IntroToComplexity {
    public static void main(String[] args) {


//        Big O notation is the standard way to express time complexity.
//        It describes the upper bound of the algorithm’s growth rate,
//        focusing on the worst-case scenario to provide a guarantee on the algorithm’s performance.
//
//        Common Big O Notations: #
//        O(1) - Constant Time: The runtime is constant, regardless of input size.
//                O(log n) - Logarithmic Time: The runtime grows logarithmically,
//                making it very efficient for large inputs.
//        O(n) - Linear Time: The runtime grows linearly with the input size.
//        O(n log n) - Linearithmic Time: A common complexity for efficient sorting algorithms.
//                O(n^2) - Quadratic Time: The runtime grows quadratically, making the algorithm inefficient for large inputs.
//        O(2^n) - Exponential Time: The runtime doubles with each additional element, leading to very poor scalability.


//        Examples of Time Complexities #
//        1. O(1) - Constant Time #
//        def get_first_element(arr):
//        return arr[0]
//        Explanation: This function retrieves the first element of the array, which requires a single operation regardless of the array’s size.
//        2. O(n) - Linear Time #
//        def find_max(arr):
//        max_val = arr[0]
//        for num in arr:
//        if num > max_val:
//        max_val = num
//        return max_val
//        Explanation: This function iterates through the array to find the maximum value. The number of operations grows linearly with the input size.
//        3. O(n^2) - Quadratic Time #
//        def bubble_sort(arr):
//        n = len(arr)
//        for i in range(n):
//        for j in range(0, n-i-1):
//        if arr[j] > arr[j+1]:
//        arr[j], arr[j+1] = arr[j+1], arr[j]
//        return arr
//        Explanation: Bubble Sort involves nested loops, where each element is compared multiple times. The number of operations grows quadratically with the input size.

    }
}
