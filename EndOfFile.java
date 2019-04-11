package Introduction;

/*
 * The challenge here is to read n lines of input until you reach EOF, then number and print all n lines of content.
 */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        int count = 0;
        String s = null;
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            s = sc.nextLine();
            count++;
            System.out.println(count + " " + s);
        }
  
        
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}