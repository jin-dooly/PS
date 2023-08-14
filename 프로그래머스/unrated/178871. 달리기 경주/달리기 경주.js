function solution(players, callings) {
    var score = new Map();
    players.forEach((cur, idx) => score.set(cur, idx));
    for(var i=0; i<callings.length; i++) {
        var me = callings[i];
        var myIdx = score.get(me);
        var other = players[myIdx-1];
        
        players[myIdx]  = other;
        players[myIdx-1] = me;
        
        score.set(me, score.get(me)-1);
        score.set(other, score.get(other)+1);
    }
    return players;
}