function solution(arr) {
    var key = true;
    for(var n=1; ; n++){
        key = false;
        for(var i=0; i<arr.length; i++){
            if(arr[i]>=50&&arr[i]%2==0) {
                arr[i]/=2;
                key = true;
            }
            else if(arr[i]<50&&arr[i]%2==1) {
                arr[i] = arr[i]*2+1;
                key = true;
            }
        }
        if(!key) return n-1;
    }
}