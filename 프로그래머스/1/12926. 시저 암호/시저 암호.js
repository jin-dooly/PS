function solution(s, n) {
    var answer = '';
    return [...s]
        .map(ch => {
            let code = ch.charCodeAt(0);
            if(65 <= code && code <= 90) {
                code = code+n > 90 ? code+n-26 : code+n;
            }
            else if(97 <= code) {
                code = code+n > 122 ? code+n-26 : code+n;
            }
            return String.fromCharCode(code)
        })
        .join('');
}