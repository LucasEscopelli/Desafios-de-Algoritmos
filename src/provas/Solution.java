package provas;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Alo {

	/*
	 * Complete the 'staircase' function below.
	 *
	 * The function accepts INTEGER n as parameter.
	 */

	public static void staircase(int n) {
    // Write your code here
		int k = 0;
		
    	for(int i = 1 ; i < n ; i++) {
    		if(i < n) {
    		for(int j = 1 ; j <= (n - i) ; j++) {
    			System.out.print(" ");
    			k = j;
    		}
    		for(int p = k  ; p <= n ; p++) {
    			System.out.print("#");
    		}
    		System.out.println();
    	}else {
    		for(int a = 0 ; a <= n ; a++) {
    			System.out.println("#");
    		}
    	}
    	}
    }

}

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		Alo.staircase(n);

		bufferedReader.close();
	}
}
