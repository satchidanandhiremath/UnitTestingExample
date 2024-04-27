public int findMax(int[]numbers){
    int max = numbers[0];
    for(int i = 1;i<numbers.length;i++){
        if(number[i]>max){
            max = numbers[i];
        }
    }
    return max;
}
