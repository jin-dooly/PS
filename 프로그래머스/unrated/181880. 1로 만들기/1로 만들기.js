function solution(num_list) {
    var answer = 0;
    num_list.map((e)=> {
        while(e!==1){
            if(e%2==0){
                e/=2;
                answer++;
            }else{
                e = (e-1)/2;
                answer++;
            }
        }
    })
    return answer;
}