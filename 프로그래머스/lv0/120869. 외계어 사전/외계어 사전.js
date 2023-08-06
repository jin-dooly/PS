function solution(spell, dic) {
    var str = spell.sort().join("");
    for(e of dic){
        if(e.split("").sort().join("") === str) return 1;
    }
    return 2;
}