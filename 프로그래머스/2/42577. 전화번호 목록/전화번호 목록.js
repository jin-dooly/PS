function solution(phone_book) {
    return !phone_book.sort().some((cur, idx, arr) => arr[idx+1]?.indexOf(cur) === 0)
}