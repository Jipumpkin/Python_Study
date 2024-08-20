// 배열 : 여러 변수를 하나의 묶음으로 다루는 구조

// (1) 배열 생성
let numList = []; // 배열 선언
numList = [1,2,3]; // 재할당 방식으로 초기화 (const 불가)
console.log(numList);

let numList2 = [4,5,6]; // 배열 선언과 동시에 초기화
console.log(numList2);

let numList3 = new Array(5); // Array 생성자를 통해 배열선언 및 크기를 지정하여 초기화 (값들은 undifined)
console.log(numList3);
numList3 = [1,2,3,4,5,6,7]; // 배열을 재할당
console.log(numList3);

// (2) 배열 인덱스
let numList4 = [7,8,9];
console.log(numList4[0]);

const numList5 = [];
numList5[0] = 1;
numList5[1] = '가나다';
numList5[2] = true;
console.log(numList5);

// (3) 배열의 길이
console.log(numList.length); // numList의 길이를 출력

