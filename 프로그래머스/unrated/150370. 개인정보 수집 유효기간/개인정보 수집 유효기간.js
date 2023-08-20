function solution(today, terms, privacies) {
    var answer = [];
    
    const dayToInt = function(day){
        let [y, m, d] = day.split(".").map(Number);
        y = (y-2000)*12*28;
        m = m*28;
        return y+m+d;
    }
    
    today = dayToInt(today);
    
    const term = {};
    terms.forEach(e => {
        var [k, v] = e.split(" ");
        term[k] = Number(v)*28;
    })
    
    privacies.forEach((priv, idx) => {
        var [date, type] = priv.split(" ");
        
        privDate = dayToInt(date) + term[type];
        
        if(today >= privDate) answer.push(idx+1);
    })
    return answer;
}