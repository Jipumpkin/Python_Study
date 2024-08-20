/*
화살표 함수 : 함수 표현식 형태
             function 대신 => 기호 사용
    
*/

// // 함수 선언
// function intro() {
//     console.log('스프링반 잼민이입니다');
// }

const intro = () => {
    console.log('스프링반 잼민이입니다');
}

// 함수 호출
intro();


// // 매개변수
// function intro2(name) {
//     console.log(`스프링반 ${name}입니다.`);
// }

const intro2 = name => {
    console.log(`스프링반 ${name}입니다.`);
}

// 호출
intro2('준식');

// // 매개변수 + return문
// function intro3(name) {
//     return `스프링반 ${name}입니다.`
// }

const intro3 = name => `스프링반 ${name}입니다.`;
//함수의 문장이 한개고 retrun하는 함수면 retrun과 {}생략가능


//호출
console.log(intro3('응우옌'));

