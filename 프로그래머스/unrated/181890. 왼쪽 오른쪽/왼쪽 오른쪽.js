function solution(str_list) {
    var l = str_list.indexOf("l");
    var r = str_list.indexOf("r");
    console.log(l, r);
    if(l==r) return [];
    if(r<0 || (l>=0 && l<r)){
        return str_list.slice(0, l);
    }
    if(l<0 || (r>=0 && r<l)){
        return str_list.slice(r+1);
    }
}