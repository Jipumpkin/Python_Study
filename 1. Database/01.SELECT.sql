CHAPTER 01. SELECT

-- 주석

-- 글자 크기 키우기 : 도구 > 환경설정 > 코드편집기 > 글꼴
-- 글자 크기 키우기 : 도구 > 환경설정 > 코드편집기 > PL/SQL
-- 주석 형태  /**/
/*
1.sql문장에는 대소문자를 구분하지 않는다.
2.띄어쓰기나 줄바꿈 또한 수행에 영향을 주지 않는다.
3.SQL 문장 끝에는 꼭 세미클론(;)을 찍어줘야 한다
4.SQL 실행 단축키 : ctrl + enter , F9
*/

select first_name from employees ;

SELECT FIRST_NAME
  FROM EMPLOYEES;
--직원 테이블에서 직원의 이메일 정보를 출력

SELECT EMAIL FROM EMPLOYEES;
-- SELECT 절 기본 사용방법
--2. SELECT 조회할 컬럼명1,2,3 ...N
--1. FROM 조회할 테이블 이름

SELECT FIRST_NAME, EMPLOYEE_ID, PHONE_NUMBER, SALARY
  FROM EMPLOYEES ;
  
  -- * 곱하기
  -- SELECT 절에 *를 쓰게 되면 아스타리스크 라는 와일드카드로 변한다.
  -- *(아스타리스크) -> 전체를 의미를 한다.
  -- 직원테이블의 전체 정보를 출력하기
  SELECT *
    FROM EMPLOYEES;
    
-- 부서 테이블의 전체 정보를 출력하고 행의 갯수가 몇개입니까?
SELECT *
  FROM DEPARTMENTS;
-- 부서는 총 27개로 구성되어있다.

--실습1) 직원테이블에 직원ID,FIRST_NAME,매니저 ID를 출력
SELECT EMPLOYEE_ID, FIRST_NAME, MANAGER_ID
  FROM EMPLOYEES;
-- 실습2) 부서테이블에 부서ID, 부서명, 위치ID를 출력
SELECT DEPARTMENT_ID,DEPARTMENT_NAME,LOCATION_ID
  FROM DEPARTMENTS;
-- 직원테이블에서 직원의 부서 ID를 출력
SELECT DEPARTMENT_ID
  FROM EMPLOYEES;
  
-- 데이터 중복 제거하기
-- DISTINCT : 데이터 중복 제거
-- SELECT [DISTINCT / ALL] 조회할 컬럼명
-- FROM

SELECT DISTINCT DEPARTMENT_ID
  FROM EMPLOYEES;
  
-- 실습) 직원테이블에서 JOB_ID 컬러의 중복을 제거하여 출력

SELECT DISTINCT JOB_ID
  FROM EMPLOYEES;
  
  --실습) 직원테이블에서 JOB_ID와 부서ID를 중복 제거하여 출력
  
SELECT DISTINCT JOB_ID, DEPARTMENT_ID
  FROM EMPLOYEES;
  
--TIP 
-- > 컬럼에 숫자 연산이 가능하다 ( +, -, *, /)
-- 직원 테이블에서 직원의 이름과 급여의 정보를 출력

SELECT FIRST_NAME, SALARY
  FROM EMPLOYEES;
  
-- 직원의 이름과 급여와 연봉의 정보를 출력

SELECT FIRST_NAME,SALARY,SALARY*12
  FROM EMPLOYEES;

-- 별칭을 사용하기
-- ALIAS 라고 하며 한눈에 보기 좋게 설정 할 수 있다.
-- AS 라는 키워드를 사용해서 별칭을 지정한다.

-- 별칭 사용방법
-- 1. SELECT 컬럼 별칭
-- 2. SELECT 컬럼 "별칭"
-- 3. SELECT 컬럼 AS 별칭
-- 4. SELECT 컬럼 AS "별칭"

SELECT FIRST_NAME AS 이름, SALARY * 12 AS "AnnSal"
  FROM EMPLOYEES ;
  
  
-- 직원 테이블에서 직원의 이름과 입사일(HIRE_DATE), 입사일 다음날의 정보를 출력

SELECT HIRE_DATE 입사일, HIRE_DATE +1 "입사일 다음날"
  FROM EMPLOYEES ;
  
SELECT HIRE_DATE "입사일", HIRE_DATE +1 "입사일 다음날"
  FROM EMPLOYEES ;
  
SELECT HIRE_DATE AS 입사일, HIRE_DATE +1 AS "입사일 다음날"
  FROM EMPLOYEES ;
  
SELECT HIRE_DATE AS "입사일", HIRE_DATE +1 AS "입사일 다음날"
  FROM EMPLOYEES ;

SELECT HIRE_DATE AS "입사일", HIRE_DATE +1 AS "입사일 다음날"
  FROM EMPLOYEES ;
  
-- ORDERBY  절 
-- 특정 컬럼을 기준으로 정렬된 상태로 출력하고자 할 때 사용한다
-- SQL실행 순서에서 가장 마지막에 실행된다
-- 별도로 정렬방식을 지정하지 않으면 기본적으로 오름차순(ASC)이 적용된다
-- 정렬방식
-- ASC(Ascending) : 오름차순 정렬 ( 1,2,3~)
-- DESC (Descending) : 내림차순 정렬 ( 10,9,8,7~)

DESC EMPLOYEES;
-- DESC(DESCRITE)
-- 테이블의 구조를 확인하는 명령어

-- 실습) 직원테이블에서 모든 직원의 정보를 출력하는데 급여 기준으로
-- 오름차순으로 정렬하여 출력

SELECT * 
  FROM EMPLOYEES
  ORDER BY SALARY ASC ;
  
-- 직원테이블에서 최근에 입사한 날짜를 기준으로 직원의 이름과 입사날짜를 출력

SELECT FIRST_NAME, HIRE_DATE,SALARY
  FROM EMPLOYEES
  ORDER BY HIRE_DATE DESC;
  
-- 직원테이블에서 직원 ID 부서ID 이름 급여 순으로 출력
--  단 부서ID는 오름차순으로 정렬  급여는 내림차순으로 정렬
SELECT * FROM EMPLOYEES;

SELECT EMPLOYEE_ID,DEPARTMENT_ID, FIRST_NAME, SALARY
  FROM EMPLOYEES
  ORDER BY DEPARTMENT_ID ASC, SALARY DESC;

-- 같은 부서에서 근무하고 있는 직원들끼리 묶어 급여가 높은 순서대로 출력
-- > 먼저 부서아이디를 오름차순으로 정렬한 후 급여를 내림차순으로 순차정렬

--NULL 이란?
-- NULL값이란 데이터의 값이 완전히 비어있는 상태를 말한다
-- 값이 존재하지 않거나 정해지지 않은 것을 의미합니다.
--> 숫자 0 과 문자열 ' ' 은 NULL값이 아니다.
-- NULL 과 연산하면 결과 값은 NULL값이 나온다.
-- NULL과 비교를하면 결과값은 무조건 FALSE가 나온다.


-- 직원 테이블에서 직원ID와 보너스, 보너스두배 의 정보를 출력

SELECT EMPLOYEE_ID, SALARY*COMMISSION_PCT, 2*SALARY*COMMISSION_PCT AS "UP_BONUS"
  FROM EMPLOYEES
  ORDER BY COMMISSION_PCT ;
  
--UP_BONUS 값이 그렇게 나온 이유
-- 보너스를 받지 않은 직원이 있기 때문에 NULL값이 존재하고
-- NULL값과 연산되면 NULL값이 되기 때문이다.


-- NULL값은 완전히 비어있는 상태를 의미하기 때문에
-- NULL값은 연산자체가 불가능하기에 결과값이 무조건 NULL이 나온다.















  
  
  
  
  
  
  