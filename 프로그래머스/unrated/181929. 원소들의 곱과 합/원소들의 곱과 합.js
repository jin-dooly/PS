function solution(num_list) {
    var case1 = 1;
    var case2 = 0;
    for(var i=0; i<num_list.length; i++){
        case1 *= num_list[i];
        case2 += num_list[i];
    }
    return case1<case2**2 ? 1 : 0;
}