import java.io.*;
import java.util.*;

class Result {

    /*
     * Complete the 'viralAdvertising' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */

    public static int viralAdvertising(int n) {
        int shared = 5;
        int liked = 0;
        int cumulativeLiked = 0;

        for (int day = 1; day <= n; day++) {
            liked = shared / 2;
            cumulativeLiked += liked;
            shared = liked * 3;
        }

        return cumulativeLiked;
    }
}

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result.viralAdvertising(n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
