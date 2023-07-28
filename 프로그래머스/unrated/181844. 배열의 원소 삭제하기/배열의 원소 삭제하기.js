function solution(arr, delete_list) {
    var answer = arr;
    for(var i=0; i<arr.length; i++){
        delete_list.map((e)=> {
            if(arr[i]==e) answer[i] = 0;
        })
    }
    return answer.filter(e=>e);
}