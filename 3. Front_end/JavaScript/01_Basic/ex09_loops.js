// 반복문 : 어떤 조건을 만족할 때까지 같은 처리를 반복하여 실행하는 구문

let num1 = 0;
console.log('(1) while문');
while(num1<3) {
    console.log(num1);
    num1++
}

let num2 = 0;
while(true) {
    console.log(num2);
    num2++;
    if(num2==3) {
        break;
    }
}

console.log('(2) for문');
for(let i=6; i<9; i++){
    console.log(i);
}