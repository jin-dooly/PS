function solution(num_list) {
    var odd = 0;
    var even = 0;
    for(var i=0; i<num_list.length; i++){
        if(i%2==0){
            odd+=num_list[i];
        }else{
            even+=num_list[i];
        }
    }
    return Math.max(odd, even);
}