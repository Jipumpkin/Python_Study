/*
(1) 주어진 데이터를 담은 배열을 생성
(2) 반복문을 통해 최댓값을 검색
(3) 알림팝업창 출력
*/

let numList = new Array(23,54,78,13,44);

let max=0;
for(let i=0; i<numList.length; i++) {
    if(max<numList[i]) {
        max = numList[i];
    }
}

alert(max)