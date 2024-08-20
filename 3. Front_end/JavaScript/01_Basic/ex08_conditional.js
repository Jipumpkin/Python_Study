// 조건문 : 주어진 조건을 비교, 판단하여 결과를 얻는 구문

let coffeeMenu = '아메리카노';

// 조건이 참 또는 거짓일 때
// (조건) ? (참일때 실행) : (거짓일때 실행)

coffeeMenu == '아메리카노' ? console.log('주문한 아아 나왔다') : console.log('기다려라');

// 조건이 하나일 때
// (조건) && (실행문)

coffeeMenu == '수박주스' && console.log('이벤트중임');


let num = 20;
if (num>10) {
    console.log('10보다 큰수임');
}else {
    console.log('10보다 작거나 같음');
}