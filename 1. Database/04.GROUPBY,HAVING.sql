-- CHAPTER 04. GROUP BY / HAVING


-- 내장함수의 종류
-- 단일행 함수 : 입력된 하나의 행당 결과가 하나씩 나오는 함수
--> 문자형, 숫자형, 날짜형, 변환형, NULL관련함수, 조건함수
-- 다중행 함수 : 여러 행을 입력받아 하나의 결과 값으로 출력이 되는 함수
--> 다중행 함수를 "집계함수" 라고 부른다.

-- 다중행 함수(집계함수)의 특징
-- 1. 집계함수는 NULL값을 제외하는 특성을 가지고 있다.
-- 2. 집계함수는 그룹화(GROUP BY)가 되어 있는 상태에서만 사용이 가능하다.

-- 집계함수 종류
-- COUNT() : 지정한 데이터의 개수 반환
-- SUM() : 지정한 데이터의 합 반환
-- MAX() : 지정한 데이터 중 최댓값 반환
-- MIN() : 지정한 데이터 중 최소값 반환
-- AVG() : 지정한 데이터의 평균 값 반환

--직원테이블에서 직원ID의 행의 개수를 조회
SELECT COUNT(EMPLOYEE_ID)
  FROM EMPLOYEES;SELECT COUNT(EMPLOYEE_ID)
  FROM EMPLOYEES;
--GROUP BY(); 생략된것

--> EMPLOYEES테이블을 하나의 그룹으로 묶은걸로 인식을 하는 것

SELECT COUNT(EMPLOYEE_ID) -- 1개의 행
      , EMPLOYEE_ID -- 107개의 행
  FROM EMPLOYEES;
--> 출력하고자 하는 행의 개수가 맞지 않아서 에러가 난다.
--> 해결방법은 그룹바이로 특정 컬럼을 그룹화 해줘야 된다.

-- 직원테이블에서 부서ID의 행의 갯수를 조회

SELECT COUNT(DEPARTMENT_ID)
  FROM EMPLOYEES;

-- COUNT함수는 *(아스타리스크) 사용가능
--> 다른 집계함수는 불가능
--> *(아스타리스크)를 사용하면 NULL값까지 포함해서 출력을 해준다.

SELECT COUNT(*)
  FROM EMPLOYEES;
  

 
--문제1) 직원 테이블에서 급여의 총 합계를 출력 (SUM함수)
SELECT SUM(SALARY)
  FROM EMPLOYEES;
--문제2) 직원테이블에서 직언들의 최대 급여와 최소 급여를 출력
SELECT MAX(SALARY), MIN(SALARY)
  FROM EMPLOYEES;
--문제3) 직원테이블에서 부서ID가 100인 직원의 평균 급여를 출력 (AVG함수)
-- 결과값은 소수점 1의자리까지만 출력
SELECT ROUND(AVG(SALARY),1 )
  FROM EMPLOYEES
 WHERE DEPARTMENT_ID = 100;
 
 
 
 
 DROP TABLE 학생인적사항 ;
DROP TABLE 수강생정보 ; 
DROP TABLE 성적표 ; 

CREATE TABLE 수강생정보 (
학생ID   VARCHAR2(9) PRIMARY KEY , 
학생이름  VARCHAR2(50) NOT NULL , 
소속반    VARCHAR2(5) 
); 

CREATE TABLE 성적표 ( 
    학생ID VARCHAR2(9) , 
    과목   VARCHAR2(30) , 
    성적   NUMBER  , 
    CONSTRAINT PK_성적표 PRIMARY KEY(학생ID , 과목) , 
    CONSTRAINT FK_성적표 FOREIGN KEY(학생ID) REFERENCES 수강생정보(학생ID) 
)  ; 

INSERT INTO 수강생정보 VALUES ('SMHRD1' , '조준용' , 'A') ; 
INSERT INTO 수강생정보 VALUES ('SMHRD2' , '박수현' , 'A') ; 
INSERT INTO 수강생정보 VALUES ('SMHRD3' , '박병관' , 'B') ; 
INSERT INTO 수강생정보 VALUES ('SMHRD4' , '이명훈' , 'B') ; 
INSERT INTO 수강생정보 VALUES ('SMHRD5' , '나예호' , 'B') ; 
INSERT INTO 수강생정보 VALUES ('SMHRD6' , '선영표' , 'C') ; 
INSERT INTO 수강생정보 VALUES ('SMHRD7' , '최영화' , 'C') ; 
INSERT INTO 수강생정보 VALUES ('SMHRD8' , '송찬호' , 'C') ; 
INSERT INTO 수강생정보 VALUES ('SMHRD9' , '임승환' , 'C') ; 

INSERT INTO 성적표 VALUES('SMHRD1'  ,'JAVA' , 90); 
INSERT INTO 성적표 VALUES('SMHRD1'  ,'DATABASE' , 85); 
INSERT INTO 성적표 VALUES('SMHRD1'  ,'PYTHON' , 100); 
INSERT INTO 성적표 VALUES('SMHRD2'  ,'JAVA' , 100); 
INSERT INTO 성적표 VALUES('SMHRD2'  ,'DATABASE' , 100); 
INSERT INTO 성적표 VALUES('SMHRD2'  ,'PYTHON' , 20); 
INSERT INTO 성적표 VALUES('SMHRD3'  ,'JAVA' , 100); 
INSERT INTO 성적표 VALUES('SMHRD3'  ,'DATABASE' , 100); 
INSERT INTO 성적표 VALUES('SMHRD3'  ,'PYTHON' , 20); 
INSERT INTO 성적표 VALUES('SMHRD4'  ,'JAVA' , 85); 
INSERT INTO 성적표 VALUES('SMHRD4'  ,'DATABASE' , 40); 
INSERT INTO 성적표 VALUES('SMHRD4'  ,'PYTHON' , 60); 
INSERT INTO 성적표 VALUES('SMHRD5'  ,'JAVA' , 100); 
INSERT INTO 성적표 VALUES('SMHRD5'  ,'DATABASE' , 100); 
INSERT INTO 성적표 VALUES('SMHRD5'  ,'PYTHON' , 100); 
INSERT INTO 성적표 VALUES ( 'SMHRD6' , 'JAVA' , NULL ) ; 
INSERT INTO 성적표 VALUES ( 'SMHRD6' , 'DATABASE' , NULL ) ; 
INSERT INTO 성적표 VALUES ( 'SMHRD6' , 'PYTHON' , NULL ) ; 

COMMIT;








DROP TABLE 학생인적사항 ;
DROP TABLE 수강생정보 ; 
DROP TABLE 성적표 ; 

CREATE TABLE 수강생정보 (
학생ID   VARCHAR2(9) PRIMARY KEY , 
학생이름  VARCHAR2(50) NOT NULL , 
소속반    VARCHAR2(5) 
); 

CREATE TABLE 성적표 ( 
    학생ID VARCHAR2(9) , 
    과목   VARCHAR2(30) , 
    성적   NUMBER  , 
    CONSTRAINT PK_성적표 PRIMARY KEY(학생ID , 과목) , 
    CONSTRAINT FK_성적표 FOREIGN KEY(학생ID) REFERENCES 수강생정보(학생ID) 
)  ; 

INSERT INTO 수강생정보 VALUES ('SMHRD1' , '조준용' , 'A') ; 
INSERT INTO 수강생정보 VALUES ('SMHRD2' , '박수현' , 'A') ; 
INSERT INTO 수강생정보 VALUES ('SMHRD3' , '박병관' , 'B') ; 
INSERT INTO 수강생정보 VALUES ('SMHRD4' , '이명훈' , 'B') ; 
INSERT INTO 수강생정보 VALUES ('SMHRD5' , '나예호' , 'B') ; 
INSERT INTO 수강생정보 VALUES ('SMHRD6' , '선영표' , 'C') ; 
INSERT INTO 수강생정보 VALUES ('SMHRD7' , '최영화' , 'C') ; 
INSERT INTO 수강생정보 VALUES ('SMHRD8' , '송찬호' , 'C') ; 
INSERT INTO 수강생정보 VALUES ('SMHRD9' , '임승환' , 'C') ; 

INSERT INTO 성적표 VALUES('SMHRD1'  ,'JAVA' , 90); 
INSERT INTO 성적표 VALUES('SMHRD1'  ,'DATABASE' , 85); 
INSERT INTO 성적표 VALUES('SMHRD1'  ,'PYTHON' , 100); 
INSERT INTO 성적표 VALUES('SMHRD2'  ,'JAVA' , 100); 
INSERT INTO 성적표 VALUES('SMHRD2'  ,'DATABASE' , 100); 
INSERT INTO 성적표 VALUES('SMHRD2'  ,'PYTHON' , 20); 
INSERT INTO 성적표 VALUES('SMHRD3'  ,'JAVA' , 100); 
INSERT INTO 성적표 VALUES('SMHRD3'  ,'DATABASE' , 100); 
INSERT INTO 성적표 VALUES('SMHRD3'  ,'PYTHON' , 20); 
INSERT INTO 성적표 VALUES('SMHRD4'  ,'JAVA' , 85); 
INSERT INTO 성적표 VALUES('SMHRD4'  ,'DATABASE' , 40); 
INSERT INTO 성적표 VALUES('SMHRD4'  ,'PYTHON' , 60); 
INSERT INTO 성적표 VALUES('SMHRD5'  ,'JAVA' , 100); 
INSERT INTO 성적표 VALUES('SMHRD5'  ,'DATABASE' , 100); 
INSERT INTO 성적표 VALUES('SMHRD5'  ,'PYTHON' , 100); 
INSERT INTO 성적표 VALUES ( 'SMHRD6' , 'JAVA' , NULL ) ; 
INSERT INTO 성적표 VALUES ( 'SMHRD6' , 'DATABASE' , NULL ) ; 
INSERT INTO 성적표 VALUES ( 'SMHRD6' , 'PYTHON' , NULL ) ; 

COMMIT;









SELECT * FROM 수강생정보;
  
SELECT * FROM 성적표;


--  GROUP BY : 특정 컬러을 기준으로 그룹화 (묶음)

-- 4.SELECT     원하는 컬럼명
-- 1.FROM       조회할 테이블명
-- 2.WHERE      원하는 행을 선별하기 위한 조건식
-- 3.GROUP BY   특정 컬럼을 기준으로 그룹화

--수강생 정보 테이블에서 소속반 별 학생의 인원수를 조회

SELECT 소속반, COUNT(학생ID) 
  FROM 수강생정보
GROUP BY 소속반 ;

-- 시험??
-- SQL의 작성 순서
-- SELECT > FROM > WHERE > GROUP BY > HAVING > ORDER BY
-- *** SQL 실행 순서
-- FROM > WHERE > GROUP BY > HAVING > SELECT > ORDER BY
-- 작성 순서와 실행 순서가 다르다.

-- 성적표 테이블에서 과목별로 최고 성적과 최저 성적을 출력

SELECT 과목, MAX(성적), MIN(성적)
  FROM 성적표
GROUP BY 과목;

-- 그룹바이 절을 사용할때 유의할점
-- 1. 실제 출력되는 행이 감소하기 때문에 그룹바이 절보다 늦게 실행되는절인
-- HAVING, SELECT, ORDER BY절에는 출력 할수 있는 행이 제한된다.
-- 2. 대신 집계함수로 처리하는 컬럼은 사용이 가능하다.



-- 성적표 테이블에서 학생별로 평균 점수를 출력
-- 단 소수점 1자리까지만 출력

SELECT 학생ID, ROUND(AVG(성적), 1)
  FROM 성적표
GROUP BY 학생ID;


-- 성적표 테이블에서 학생별로 JAVA와 DATABASE의 과목의 합만 출력

SELECT 학생ID, SUM(성적)
  FROM 성적표
-- WHERE 과목 = 'JAVA' OR 과목 = 'DATABASE'
 WHERE 과목 IN ('JAVA','DATABASE')
GROUP BY 학생ID;



-- HAVING절 : GROUP BY절이 존재할때만 사용가능
--> 집계가 완료된 대상을 조건을 통해서 필터링 하는 문법
--> 조건이 참인 결과만 출력이 된다는 점에서는 WHERE절과 비슷하지만,
-- HAVING절은 그룹화된 대상에서 출력이 된다.

--문제) 성적표 테이블에서 학생별 평균 성적을 구하고,
-- 평균 성적이 75 이하이 학생들만 출력

SELECT 학생ID, ROUND(AVG(성적), 1)
  FROM 성적표
GROUP BY 학생ID
HAVING AVG(성적) <= 75;



-- 수강생 정보테이블에서 소속반별 인원수가 3명이상인 반만 출력

SELECT 소속반, COUNT(학생ID)
  FROM 수강생정보
GROUP BY 소속반
HAVING COUNT(학생ID) >= 3;

-- 직원테이블에서 부서별 최고연봉이 100000인 부서만 출력

SELECT DEPARTMENT_ID, MAX(SALARY)*12 AS 최고연봉10만이상
  FROM EMPLOYEES
GROUP BY DEPARTMENT_ID
HAVING MAX(SALARY)*12>=100000;












































