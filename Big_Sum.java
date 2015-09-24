/**
 *
 * @author Max Alkan
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
Input is of the following example:
5
10001 10002 10003 10004 10005
*/

public class Big_Sum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Takes user input and converts into a character array
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String input = sc.nextLine();
        String[] a = input.split(" ");
        
        BigInteger[] storage = new BigInteger[n];
        BigInteger sum = new BigInteger("0");
        
        //Converts and Stores Big Integers
        for(int i = 0; i < n; i++)
            storage[i] = new BigInteger(a[i]);
        
        //Sums the BigIntegers in storage
        for(int j = 0; j < n; j++) 
            sum = sum.add(storage[j]);

        //Outputs the sum of values in storage as a string
        System.out.println(sum);
    }   
}
