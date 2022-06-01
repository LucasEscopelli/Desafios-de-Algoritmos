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

class Epa {

    /*
     * Complete the 'simpleArraySum' function below.
     *
     * The function is expected to return an INTEGER. The function accepts
     * INTEGER_ARRAY ar as parameter.
     */

    public static int simpleArraySum(List<Integer> ar) {
        // Write your code here
        int sum = 0;
        for(int i = 0 ; i < ar.size() ; i++) {
            sum += ar.get(i);
        }
        
        return sum;
    }

}

public class SomaInferno {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


        int arCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt).collect(toList());

        int result = Epa.simpleArraySum(ar);

        System.out.println(result);

        bufferedReader.close();
    }
}
