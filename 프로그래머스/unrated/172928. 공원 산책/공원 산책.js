function solution(park, routes) {
    var answer = [];
    const len = park.length;
    var me;
    var map = [];
    park.forEach((str, row) => {
        var tmp = [];
        for(let col=0; col<str.length; col++){
            if(str[col] === "S") me = [row, col];
            if(str[col] === "X") tmp.push(false);
            else tmp.push(true);
        }
        map.push(tmp);
    });
    
    const op_key = {
        "N" : [0, -1, map.length],
        "S" : [0, 1, map.length],
        "W" : [1, -1, map[0].length],
        "E" : [1, 1, map[0].length],
    };
    
    function order(k, v, l, n) {
        let tmp = [...me];
        for(let i=1; i<=Number(n); i++){
            if((tmp[k] + v < 0) || tmp[k] + v >= l) {
                return;
            }
            tmp[k] += v;
            if(!map[tmp[0]][tmp[1]]){
                return;
            }
        }
        me = tmp;
        console.log("order clear "+me);
    }

    console.log(map);
    routes.forEach(route => {
        console.log(route);
        let [op, n] = route.split(" ");
        let [k, v, l] = op_key[op];
        order(k, v, l, n);
        console.log("me" + me);
    });
    
    
    
    return me;
}