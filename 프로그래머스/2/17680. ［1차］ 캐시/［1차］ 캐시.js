function solution(cacheSize, cities) {
    var answer = 0;
    let arr = []
    cities.forEach(city => {
        city = city.toLowerCase();
        if(arr.indexOf(city) < 0){
            answer+=5;
            if(arr.length === cacheSize) arr.shift();
        }else{
            answer++;
            if(arr.length === cacheSize) arr.splice(arr.indexOf(city), 1);
        }
        if(cacheSize) arr.push(city)
    })
    return answer;
}