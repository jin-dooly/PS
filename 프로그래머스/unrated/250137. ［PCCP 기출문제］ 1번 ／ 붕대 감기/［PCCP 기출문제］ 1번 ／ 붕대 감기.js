function solution(bandage, health, attacks) {
    let [t, x, y] = bandage;
    let hp = health;
    let time = 0;
    for([atc_time, atc_hp] of attacks){
        var duration = atc_time - time - 1;
        hp += (Math.floor(duration/t) * (t*x+y)) + (duration%t)*x
        hp = Math.min(hp, health) - atc_hp;
        time = atc_time;
        if(hp <= 0) return -1
    }
    return hp;
}