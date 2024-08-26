package Day2;

import java.util.ArrayList;
import java.util.List;

public class Pseudocode {
    public static void main(String[] args) {
        //Calculate the average of a list of numbers. Consider how you would handle an empty list.

        List<Integer> list = new ArrayList<>();


        int result =  averageOfList(list);
        System.out.println(result);


    }
    private static int averageOfList(List<Integer> list)
    {
        int sum = 0;
        int avg = 0;

        if(list.size() == 0)
        {
            return 0;
        }

        for(int nums: list )
        {
            sum += nums;
        }

        avg = sum / list.size();

        return avg;
    }
}
