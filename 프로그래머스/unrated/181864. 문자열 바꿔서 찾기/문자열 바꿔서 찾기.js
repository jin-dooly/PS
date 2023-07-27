function solution(myString, pat) {
    var reversePat = '';
    for(var i=0; i<pat.length; i++){
        if(pat[i]=='A') reversePat += 'B';
        else reversePat += 'A';
    }
    return myString.includes(reversePat) ? 1 : 0;
}