import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

*/
Input is as follows:
3 (# of test cases)
54245238
213951235
12311490051
*/

public class Is_Fibo {

//Custom method for finding the sqrt of a BigInteger
	public static BigInteger sqrt(BigInteger x) {
		
		BigInteger div = BigInteger.ZERO.setBit(x.bitLength()/2);
		BigInteger div2 = div;
		// Loop until we hit the same value twice in a row, or wind
		// up alternating.
		for(;;) {
			BigInteger y = div.add(x.divide(div)).shiftRight(1);
			if (y.equals(div) || y.equals(div2))
				return y;
			div2 = div;
			div = y;
		}
}

//Returns True if BigInteger a is a square
	public static boolean isSquare(BigInteger a) {
		return (sqrt(a).multiply(sqrt(a)).equals(a));
	}
	
    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//Is the number of tests to be conducted
		int testCase = sc.nextInt();
		BigInteger n;
		BigInteger x = new BigInteger("5");
		
		for(int i = 0; i < testCase; i++) {
		  //The value to be tested
			n = sc.nextBigInteger();
			if(isSquare(x.multiply(n).multiply(n).add(new BigInteger("4"))) || isSquare(x.multiply(n).multiply(n).add(new BigInteger("-4"))))
				System.out.println("IsFibo");
			else System.out.println("IsNotFibo");
		}		
    }
}
