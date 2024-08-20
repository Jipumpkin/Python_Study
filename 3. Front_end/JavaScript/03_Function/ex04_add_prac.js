/*
(1) 두개의 수를 입력 받는다
(2) 입력 받은 두 수의 합을 구하는 함수를 생성한다.
(3) 결과값을 알림 팝업팡의 형태로 출력한다

*/

let num1 = parseInt(prompt('첫번째 수 입력'))
let num2 = parseInt(prompt('두번째 수 입력'))

const addNumber = (a,b) => { return a+b;};

alert(`결과 : ${addNumber(num1,num2)}`)