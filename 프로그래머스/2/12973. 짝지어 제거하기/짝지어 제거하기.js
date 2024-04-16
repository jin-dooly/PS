function solution(s)
{
    let len = s.length;
    if(len % 2 !== 0) return 0 
    var arr = [];
    
    for(let ch of s) {
        if(arr[arr.length-1] === ch) {
            arr.pop();
        }else {
            arr.push(ch)
        }
        
    }
    return arr.length === 0 ? 1 : 0;
}