package Day4;

import java.util.Arrays;

public class IntroToArray {
    public static void main(String[] args) {

//        Write a function to find the minimum and maximum elements in an array

        int[] arr = {1,2,3,4,5};

        int[] result = findMinMax(arr);
        System.out.println(Arrays.toString(result));

        //Implement a function to reverse an array.

        int[] reverseArray  = reverseArray(arr);
        System.out.println(Arrays.toString(reverseArray));

        //Create a function to find the sum of all elements in an array.
        int findSum = sumOfElementsInArray(arr);
        System.out.println(findSum);



    }

    private static int sumOfElementsInArray(int[] arr) {
        int sum = 0 ;
        for(int nums: arr)
        {
            sum +=nums;
        }
        return sum;

    }

    private static int[] reverseArray(int[] arr) {

        int start = 0;
        int end = arr.length-1;
        while (start < end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        return arr;

    }

    private static int[] findMinMax(int[] arr) {


        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int nums: arr)
        {
            if(nums > max)
            {
                max = nums;
            }
            if(nums < min)
            {
                min = nums;
            }

        }

        return new int[]{max , min};
    }
}



