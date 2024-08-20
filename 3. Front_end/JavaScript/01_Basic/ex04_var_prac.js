/*
변수 : 데이터를 담을 공간
let num = 3;
let => 변수 선언 키워드
num => 변수 이름
3 => 변수에 할당된 값

변수 선언 키워드
var : 재선언o 재할당o
let : 재선언x 재할당o
const : 재선언x 재할당x
재선언 : 같은 변수 이름으로 다시 벼수를 선언하는 것
재할당 : 선언된 변수에 다시 값을 할당하는것
*/




let answer = prompt("너 이름이 뭐냐");

console.log("어서와라");
console.log("반갑다 "+answer);


const userClass = 'Spring';

// console.log(userClass+"반의"+answer+"이다.");
answer = '사람아니야';
/*
Template Literals (템플릿 리터럴)
: 표현식/문자열 삽입, 여러 줄 문자열 등 다양한 기능을 제공 
    `(백틱) => 1 왼쪽 물결과 함께 있는 기호
*/

console.log(`환영한다.${userClass}반의 ${answer}이여..`);