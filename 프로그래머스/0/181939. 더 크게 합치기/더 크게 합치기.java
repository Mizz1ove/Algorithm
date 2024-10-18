class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String a_b_str = Integer.toString(a) + Integer.toString(b);
        String b_a_str = Integer.toString(b) + Integer.toString(a);
        
        int a_b = Integer.valueOf(a_b_str);
        int b_a = Integer.valueOf(b_a_str);
        
        if(a_b > b_a){
            answer = a_b;
        }
        else {
            answer = b_a;
        }
        return answer;
    }
}