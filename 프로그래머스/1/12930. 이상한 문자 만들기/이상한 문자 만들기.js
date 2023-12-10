function solution(s) {
    var answer = '';
    return s.split(' ')
        .map(str => [...str].map((s, idx) => idx%2 ? s.toLowerCase(): s.toUpperCase()).join(''))
        .join(' ')
}