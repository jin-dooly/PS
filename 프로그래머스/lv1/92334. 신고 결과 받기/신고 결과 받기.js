function solution(id_list, report, k) {
    var answer = new Array(id_list.length).fill(0);
    var idIndex = id_list.reduce((acc, cur, idx) => {
        acc[cur] = idx;
        return acc
    }, {});

    var reportId = {}
    report.forEach(str => {
        var [from, to] = str.split(" ");
        reportId[to] ? reportId[to].add(from) : reportId[to] = new Set().add(from)
    })
    // console.log(fromId);
    for(id in reportId) {
        if(reportId[id].size >= k) {
            // console.log(id)
            for(fromId of reportId[id]){
                answer[idIndex[fromId]]++;
            }
        }
    }
    return answer;
}