function solution(arr1, arr2) {
    if(arr1.length != arr2.length) return arr1.length > arr2.length ? 1 : -1;
    var sum1=0, sum2=0;
    for(var i=0; i<arr1.length; i++){
        sum1 += arr1[i];
        sum2 += arr2[i];
    }
    if(sum1 == sum2) return 0;
    return sum1 > sum2 ? 1 : -1;
}