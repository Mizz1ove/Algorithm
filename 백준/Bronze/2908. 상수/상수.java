import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] strArray = br.readLine().split(" ");

        for(int i = 0; i < strArray.length; i++) {
            StringBuffer sb = new StringBuffer(strArray[i]);
            strArray[i] = sb.reverse().toString();
        }

        int[] intArray = new int[strArray.length];
        for(int i = 0; i < strArray.length; i++) {
            intArray[i] = Integer.parseInt(strArray[i]);
        }

        if(intArray[0] > intArray[1]) {
            System.out.println(intArray[0]);
        } else if (intArray[0] < intArray[1]) {
            System.out.println(intArray[1]);
        }
    }
}
