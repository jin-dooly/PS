function solution(bandage, health, attacks) {
    let answer = 0;
    let hp = health;
    let time = 0;
    for([atc_time, atc_hp] of attacks){
        var duration = atc_time - time - 1;
        hp += (Math.floor(duration/bandage[0]) * (bandage[0]*bandage[1]+bandage[2])) + (duration%bandage[0])*bandage[1]
        hp = Math.min(hp, health);
        hp -= atc_hp;
        time = atc_time;
        if(hp <= 0) return -1
    }
    return hp;
}