function solution(s) {
    var answer = '';
    return s.split(' ').map(str => [...str].map((s, idx) => {
            if(idx%2) return s.toLowerCase()
            return s.toUpperCase()
        }).join('')
    ).join(' ')
}