import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        String newStr = "";

        for(int i = str.length()-1; i >= 0; i--) {
            newStr += str.charAt(i);
        }

        if(str.equals(newStr)) {
            System.out.println(1);
        }else {
            System.out.println(0);
        }
    }
}