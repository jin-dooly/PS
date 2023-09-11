function solution(survey, choices) {
    var result = {};
    choices.forEach((choice, idx) => {
        var type = '';
        var score = 0;
        if(choice < 4) {
            type = survey[idx][0];
            score = 4 - choice;
        }
        else if(choice > 4) {
            type = survey[idx][1];
            score = choice - 4;
        }
        result[type] ? result[type] += score : result[type] = score;
    })
    console.log(result)
     let answer = (result['R']|0) < (result['T']|0) ? 'T' : 'R';
    answer += (result['C']|0) < (result['F']|0) ? 'F' : 'C';
    answer += (result['J']|0) < (result['M']|0) ? 'M' : 'J';
    answer += (result['A']|0) < (result['N']|0) ? 'N' : 'A';
    return answer;
}