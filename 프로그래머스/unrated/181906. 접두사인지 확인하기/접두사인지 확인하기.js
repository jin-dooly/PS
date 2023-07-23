function solution(my_string, is_prefix) {
    return is_prefix == my_string.substr(0, is_prefix.length)? 1 : 0;
}