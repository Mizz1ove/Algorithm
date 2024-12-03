import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        int count = 0;
        int[] arr = new int[t];
        
        for(int i = 0; i < t; i++) {
            arr[i] = sc.nextInt();
        }
        
        int target = sc.nextInt();
        
        for(int i = 0; i < t; i++) {
            if(arr[i] == target) {
                count++;
            }
        }
        
        System.out.println(count);
    }
}