import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split("");
        
        StringBuilder sb = new StringBuilder();
        
        Arrays.sort(arr);
        
        for(int i = arr.length-1; i >= 0; i--) {
            sb.append(arr[i]);
        }
        answer = sb.toString();
        
        return answer;
    }
}