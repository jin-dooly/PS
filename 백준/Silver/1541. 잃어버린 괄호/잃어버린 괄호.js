let minus = require('fs').readFileSync("dev/stdin").toString().trim().split("-").map(cal=> cal.split("+").map(Number));

minus = minus.map(plus => plus.reduce((sum, n) => sum+n)).reduce((acc, n) => acc-n);

console.log(minus);