package Introduction;

/*
 * In this challenge, we're going to use loops to help us do some simple math.
 * Task 
 * Given an integer, N, print its first 10 multiples. Each multiple N x i (where 1 <= i <= 10 )
 *  should be printed on a new line in the form: N x i = result.
 */

import java.io.*;
import java.util.*;



public class Solution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for (int i=1; i < 11; i++) {
            int sum = N * i; 
            System.out.println(N + " x " + i + " = " + sum);
        }
    }
}
