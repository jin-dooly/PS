function solution(my_string) {
    var answer = new Array(52).fill(0);
    for(var i=0; i<my_string.length; i++){
        var charCode = my_string.charCodeAt(i);
        if(charCode < 97){
            charCode -= 65;
        }else {
            charCode -= 65+6;
        }
        answer[charCode]++;
    }
    return answer;
}