package Day1;

public class IntroToAlgo {

    public static void main(String[] args) {

//        Try to write an algorithm for finding the largest number among three given numbers.
//        Think about the steps you would take and how you would structure the algorithm.

        //Start
        // input three Numbers, A , B  and C
        //Assume One Number is Max A.
        //Check condition if Other Number is grater than A.
        //That Numer is Greater
        //Output

        int a =10;
        int b = 20;
        int c = 30;

        checkGreaterNumber(a,b,c);


    }

    private static void checkGreaterNumber(int a, int b, int c) {

        int max = a;

        if(b > max)
        {
            max = b;
        }
        if(c > max)
        {
            max = c;
        }

        System.out.println(max+ "is the greatest number");

    }
}
