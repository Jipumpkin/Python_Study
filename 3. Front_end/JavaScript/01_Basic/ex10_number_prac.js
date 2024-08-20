/*
(1) 랜덤한 수를 하나 뽑아준다
(2) 사용자로부터 숫자를 입력받아서
    입력 > 랜덤 => '입력한 수보다 작은 수입니다'
    입력 < 랜덤 => '입력한 수보다 큰 수입니다'
    입력 = 랜덤 => '정답입니다. 축하합니다.'



*/

let random = parseInt(Math.random()*100)+1; 

while(true) {
    var answer = prompt();
    if(answer < random) {
        console.log('작음');
    }else if(answer > radom) {
        console.log('큼');
    }else {
        console.log('성공임 ㅊㅋ');
    }
}