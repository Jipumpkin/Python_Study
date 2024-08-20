// 함수 : 특정 기능을 수행하는 소스 코드를
//          하나로 묶어서 필요할 때마다 사용하기 위한 구조

// 함수 선언
function intro() {
    console.log('스프링반 잼민이입니다');
}


// 함수 호출
intro();


// 매개변수
function intro2(name) {
    console.log(`스프링반 ${name}입니다.`);
}

// 호출

intro2('준식');

// 매개변수 + return문
function intro3(name) {
    return `스프링반 ${name}입니다.`
}

intro3('응우옌') // 출력안됨


console.log(intro3('응우옌'));

