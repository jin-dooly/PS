function solution(id_list, report, k) {
    var answer = new Array(id_list.length).fill(0);
    var idIndex = id_list.reduce((acc, cur, idx) => {
        acc[cur] = idx;
        return acc
    }, {});

    var reportId = {}
    report.forEach(str => {
        var [from, to] = str.split(" ");
        if(!reportId[to]) reportId[to] = new Set();
        reportId[to].add(from);
    })
    // console.log(fromId);
    
    for(id in reportId) {
        if(reportId[id].size < k) continue;
        reportId[id].forEach(fromId => answer[idIndex[fromId]]++);
    }
    return answer;
}