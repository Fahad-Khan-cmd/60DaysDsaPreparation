package Day5;

import java.util.Arrays;

public class MultiDimensional {

    public static void main(String[] args) {
        //Write a function to multiply two matrices.
        // Ensure that the number of columns in the
        // first matrix equals the number of rows in the second matrix

        int[][] arr1 = {{1,2,3},
                       {4,5,6},
                       {7,8,9},};

        int[][] arr2 = {{10,11,12},
                {13,14,15},
                {16,17,18},};

        int[][] multiplicationOfMatrixes = multiplyMatrices(arr1, arr2);


        printMatrix(multiplicationOfMatrixes);

        //Implement an optimized version of Bubble Sort that stops early
        // if the array is already sorted (as shown above).

        int[] arr  = {1,4,5,3,2};
        int[] result = optimizedBubbleSort(arr);
        System.out.println(Arrays.toString(result));




    }

    private static int[] optimizedBubbleSort(int[] arr) {

        int arrLenght = arr.length;

        while (arrLenght > 0)
        {
            int newArrLength = 0;

            for(int i = 1 ; i < arrLenght ; i++)
            {
                if(arr[i-1] > arr[i])
                {
                    int temp = arr[i-1];
                    arr[i-1] = arr[i];
                    arr[i] = temp;
                    newArrLength = i;
                }
            }

            //if there would be no unsorted element left, It would be nt updated and we will know
            //that there is no unsorted Element left
            arrLenght = newArrLength;


        }
        return arr;
    }

    private static int[][] multiplyMatrices(int[][] firstMatrix, int[][] secondMatrix) {
        int rowsFirstMatrix = firstMatrix.length;
        int colsFirstMatrix = firstMatrix[0].length;
        int rowsSecondMatrix = secondMatrix.length;
        int colsSecondMatrix = secondMatrix[0].length;

        // Check if multiplication is possible
        if (colsFirstMatrix != rowsSecondMatrix) {
            System.out.println("Number of columns in the first matrix must equal the number of rows in the second matrix.");
        }

        //  The result matrix
        int[][] resultMatrix = new int[rowsFirstMatrix][colsSecondMatrix];

        // Multiply matrices
        for (int i = 0; i < rowsFirstMatrix; i++) {
            for (int j = 0; j < colsSecondMatrix; j++) {
                for (int k = 0; k < colsFirstMatrix; k++) {
                    resultMatrix[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                }
            }
        }

        return resultMatrix;
    }
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
