/**
 * Created by jashanjotsingh on 2/14/2017.
 * Inspired from Lecture Series on Data Structures and Algorithms by
 * Dr. Naveen Garg, Department of Computer Science & Engineering ,IIT Delhi.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Returns the max value of the input given in a non decreasing order
 * PseudoCode
 * Input: An array A storing n integers
 * Output: The maximum element in A
 *
 *  currentMax <- A[0]
 *  for i <- 1 to n-1 do
 *      if currentMax < A[i] then currentMax <- A[i]
 *  return currentMax
 */

public class ArrayMax {

    public static void main(String []args){

        int [] A = {1,3,3,1,5,4,4,2,7};
        int currentMax = A[0];

        for (int currentElement: A) {
            if (currentMax < currentElement)
                currentMax = currentElement;
        }

        System.out.println("Max: "+ currentMax);

    }

}
