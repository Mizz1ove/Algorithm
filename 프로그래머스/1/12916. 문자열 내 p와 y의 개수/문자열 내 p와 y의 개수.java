class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int p = 0;
        int y = 0;
        
        s = s.toUpperCase();
        
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'P') {
                p++;
            }
            else if(s.charAt(i) == 'Y') {
                y++;
            }
            
            if(p != y) answer = false;
            else answer = true;
        }
        

        return answer;
    }
}