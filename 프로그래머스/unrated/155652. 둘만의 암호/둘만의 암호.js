function solution(s, skip, index) {
    let skipCode = [...skip].map(e => e.charCodeAt());
    return [...s].reduce((a,c) => {
        let code = c.charCodeAt(0);
        for(var i=0; i<index; i++){
            code++;
            if(code > 122) code = 97;
            if(skipCode.includes(code)) i--;
        }
        return a+=String.fromCharCode(code);
    },'');
}