/**
 *
 * @author Max Alkan
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Easy_Sum {


    //a is the value we are summing up to (1+2+3+...+a)
    public static BigInteger sum(BigInteger a){
        BigInteger sum = (a.multiply(a.add(new BigInteger("1")))).divide(new BigInteger("2"));
        return sum;
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int testCase = Integer.parseInt(sc.nextLine());
        
        for(int i = 0; i < testCase; i++) {
            //gathers the values for m,n for each case
            String input = sc.nextLine();
            String[] a = input.split(" ");
            BigInteger n = new BigInteger(a[0]);
            BigInteger m = new BigInteger(a[1]);
            BigInteger total = new BigInteger("0");

            //Split to make reading easier
             total = n.divide(m).multiply(sum(m.subtract(new BigInteger("1"))));
             total = Total.add(sum(n.remainder(m))); 
             System.out.println(total);
        }
    }   
}
