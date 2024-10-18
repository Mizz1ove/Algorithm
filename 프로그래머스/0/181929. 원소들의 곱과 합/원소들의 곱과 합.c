#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// num_list_len은 배열 num_list의 길이입니다.
int solution(int num_list[], size_t num_list_len) {
    int answer = 0;
    int multi = 1;
    int sum = 0;
    int sum_squared = 0;
    
    for(int i = 0; i < num_list_len; i++) {
        multi *= num_list[i];
        sum += num_list[i];
    }
        
    sum_squared = sum * sum;
    
    if(multi > sum_squared) {
        answer = 0;
    }
    else {
        answer = 1;
    }
    
    return answer;
}