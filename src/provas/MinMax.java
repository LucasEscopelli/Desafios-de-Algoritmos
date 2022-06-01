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

class Alow {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
    	long min = arr.get(0);
    	int minPlace = 0;
    	long max = 1;
    	int maxPlace = 0;
    	
    	for(int i = 0 ; i < arr.size() ; i++) {
    		if(arr.get(i) > max) {
    			max = arr.get(i);
    			maxPlace = i;
    		}
    		if(arr.get(i) < min) {
    			min = arr.get(i);
    			minPlace = i;
    		}
    	}
    	long somaMaior = 0 - min;
    	for(int i = 0 ; i < arr.size() ; i++) {
    		somaMaior += arr.get(i);
    	}
    	long somaMenor = 0 - max;
    	for(int i = 0 ; i < arr.size() ; i++) {
    		somaMenor += arr.get(i);
    	}
    	

    	
    	System.out.println(somaMenor + " " + somaMaior);

    }

}

public class MinMax {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Alow.miniMaxSum(arr);

        bufferedReader.close();
    }
}

