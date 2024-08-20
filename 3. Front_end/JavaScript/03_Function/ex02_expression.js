/*
함수 표현식 : 익명 함수 형태로 함수 선언한 후 변수에 참조
function(){} => 이름이 없는 함수, 익명함수
*/
const intro = function () {
    console.log('뭘봐');
}

intro();

const intro2 = function (name) {
    console.log(`스프링반의 ${name}이다.`);
}

intro2('어쩔티비')

