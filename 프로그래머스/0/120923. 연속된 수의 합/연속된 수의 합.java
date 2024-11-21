class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        boolean isOdd = (num % 2 == 1) ? true : false;
        
        if(isOdd) {
            int start_num = total / num - num / 2;
            for(int i = 0; i < num; i++) {
                answer[i] = start_num++;
            }
        }else {
            int start_num = total / num - (num / 2 - 1);
            for(int i = 0; i < num; i++) {
                answer[i] = start_num++;
            }
        }
        
        return answer;
    }
}