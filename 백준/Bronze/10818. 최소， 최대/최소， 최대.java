import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int length = sc.nextInt();
        int[] arr = new int[length];
        
        for(int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }
        
        int min = arr[0];
        int max = arr[0];
        
        for(int i = 0; i < arr.length; i++) {
            if(min > arr[i]) {
                min = arr[i];
            }
            else if(max < arr[i]) {
                max = arr[i];
            }
        }
        
        System.out.println(min + " " + max);
    }
}