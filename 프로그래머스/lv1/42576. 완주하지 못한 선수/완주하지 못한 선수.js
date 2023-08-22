function solution(participant, completion) {
    var person = {};
    var comp = {};
    completion.forEach(name => {
        comp[name] = comp[name] ? comp[name]+1 : 1;
    })
    participant.forEach(name => {
        person[name] = person[name] ? person[name]+1 : 1;
    })
    for(p in person) {
        if(person[p] !== comp[p]) return  p;
    }
}