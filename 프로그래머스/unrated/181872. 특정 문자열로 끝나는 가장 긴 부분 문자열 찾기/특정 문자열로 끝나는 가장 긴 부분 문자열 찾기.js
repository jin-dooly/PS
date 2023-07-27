function solution(myString, pat) {
    var idx = myString.lastIndexOf(pat);
    return myString.slice(0,idx+pat.length);
}