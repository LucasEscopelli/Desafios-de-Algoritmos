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

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    // Write your code here
    	double pos = 0;
    	double neg = 0;
    	double zero = 0;
    	for(int val : arr) {
    		if(val > 0){
    			pos++;
    		}else if(val < 0) {
    			neg++;
    		}else {
    			zero++;
    		}
    	}
    	List<Double> ratios = new ArrayList();
    	ratios.add(pos/arr.size());
    	ratios.add(neg/arr.size());
    	ratios.add(zero/arr.size());
    	
    	
    	for(Double valores : ratios) {
    		System.out.println(valores);
    	}
    }

}

public class RatioNegPosZero {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
