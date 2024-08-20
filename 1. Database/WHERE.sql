CHAPTER 02. WHERE

--WHERE 절 기본 사용방법
--SELECT 조회할 컬렴 명 ~~
--  FROM 조회할 테이블명
--  WHERE 조회할 행을 선별하기 위한 조건 식


--실습) 직원 테이블에 직원아이디가 105인 직원의 퍼스트네임과 라스트네임을 출력

SELECT EMPLOYEE_ID, FIRST_NAME, LAST_NAME
  FROM EMPLOYEES
 WHERE EMPLOYEE_ID = 105;
 
-- 실습2) 부서테이블에서 매니터 아이디가 100인 부서이름과 부서아이디를 출력

SELECT DEPARTMENT_NAME, DEPARTMENT_ID
  FROM DEPARTMENTS
 WHERE MANAGER_ID = 100;


--직원테이블에서 급여가 9000인 직원의 직원아이디 직원이름 급여 정보를 출력

SELECT EMPLOYEE_ID, SALARY, FIRST_NAME
  FROM EMPLOYEES
 WHERE SALARY = 9000;

DESC EMPLOYEES ;


-- 산술 연산자 ( +,-,*,/)

-- 비교 연산자 ( >, >=, <, <=)


--직원테이블에서 급여가 5000이하인 직원의 이름과 급여 정보를 출력

SELECT FIRST_NAME, SALARY
  FROM EMPLOYEES
 WHERE SALARY <= 5000;
 
 --직원테이블에서 직업아이디가 IT_PROG 가 아닌 직원의 이름과 직업아이디를 출력
 
SELECT *
  FROM EMPLOYEES;
 
SELECT FIRST_NAME, JOB_ID
  FROM EMPLOYEES
 WHERE JOB_ID != 'IT PROG';


--논리연산자 (AND, OR)


--직원테이블에서 부서아이디가 90이고 급여가 5000인 직원의 
-- 직원아이디와 직원이름을 출력

SELECT FIRST_NAME, EMPLOYEE_ID,DEPARTMENT_ID ,SALARY
  FROM EMPLOYEES
 WHERE DEPARTMENT_ID = 90
   AND SALARY >= 5000;
   
   
--직원테이블에서 부서아이디가 100이거나
--입사일이 06년 02월02일 이후에 입사한 직원의 이름과 입사일 정보를 출력

SELECT FIRST_NAME, HIRE_DATE
  FROM EMPLOYEES
 WHERE DEPARTMENT_ID = 100
    OR HIRE_DATE > '06/02/02';
    
    
--직원테이블에서 부서 ID가 100이거나 90인 직원 중
-- 직원ID가 101인 직원의 직원ID 이름 연봉을 출력
-- 단 연봉은 AnnSal이라는 별칭을 사용해서 출력
SELECT EMPLOYEE_ID, FIRST_NAME, SALARY*12 AS "AnnSal"
  FROM EMPLOYEES
 WHERE (DEPARTMENT_ID = 100
    OR DEPARTMENT_ID = 90)
   AND EMPLOYEE_ID = 101;
   
-- AND연산자가 OR연산자보다 우선순위가 높아서 연산자 우선순위에 따라서
-- 결과값이 달라진다.

-- NULL관련 연산자
-- IS NULL :데이터값이 NULL인 값을 조회
-- IS NOT NULL : 데이터 값이 NULL이 아닌 값을 조회
--NULL은 비교연산하면 무조건 false

--직원테이블에서 보너스가 있는 직언의 이름과 보너스 정보를 출력
SELECT * FROM EMPLOYEES;


SELECT FIRST_NAME, COMMISSION_PCT
  FROM EMPLOYEES
 WHERE COMMISSION_PCT IS NOT NULL;
 
 
 
SELECT DEPARTMENT_ID FROM EMPLOYEES;

-- 부서 ID가 없는 직원의 이름 구하기

SELECT FIRST_NAME
  FROM EMPLOYEES
 WHERE DEPARTMENT_ID IS NULL ;


IN 연산자
-- NULL값을 넣게되면 제외되는 특성을 가지고 잇다
-- -,+,OR가 합쳐진 연산자기 때문에


SELECT *
  FROM EMLPOYEES
 WHERE DEPARTMENT_ID IN (30,50,90);
 
 
 
-- 직원테이블에서 매니저 아이디가 100 102 103인 직원의 이름과 매니저 아이디를 출력

SELECT FIRST_NAME, MANAGER_ID
  FROM EMPLOYEES
 WHERE MANAGER_ID IN (100,102,103)
    OR MANAGER_ID IS NULL;
    
--NULL값은 IS NULL로 찾음


--NOT IN 
--> IN뒤의 조건에 해당하지 않는 데이터를 출력
--> !-,AND 연산자가 합쳐진 연산자
--> NULL을 넣으면 출력자체가 안됨(AND조건은 모두TRUE여야하고 NULL은 무조건 FALSE)


--직원테이블에서 매니저 아이디가 100,120,121이 아닌 직원들의
-- 이름과 매니저 아이디를 출력

SELECT FIRST_NAME, MANAGER_ID
  FROM EMPLOYEES
 WHERE MANAGER_ID NOT IN (100,120,121);
 





-- 직원테이블에서 직업아이디가 AD_VP거나 ST_MAN인 직원의
-- 이름과 직업아이디를 출력

SELECT FIRST_NAME, JOB_ID
  FROM EMPLOYEES
 WHERE JOB_ID IN ('AD_VP', 'ST_MAN');
 
 
-- 직원테이블에서 매니저 아이디가 145,146,147,148,149가 아닌 직원의
-- 이름과 매니저 아이디를 출력

SELECT FIRST_NAME, MANAGER_ID
  FROM EMPLOYEES
 WHERE MANAGER_ID NOT IN (145,146,147,148,149);
 
 
-- BETWEEN A AND B
-- 일정 범위 내의 뎅터를 조회할 때 사용
-- A는 최소값 B는 최대값
-- 특정 열 값의 최소, 최고 범위를 지정하여 해당 범위 내의 데이터만 조회



-- 직원테이블에서 급여가 10000이상 20000이하인 직원의 이름과 급여의 정보를 출력

SELECT FIRST_NAME, SALARY
  FROM EMPLOYEES
 WHERE SALARY BETWEEN 10000 AND 20000; 
 
-- BETWEEN은 최소값 이상, 최대값 이하이다.

-- 직원테이블에서 05년에 입사한 직원의 이름과 입사일을 출력

SELECT FIRST_NAME, HIRE_DATE
  FROM EMPLOYEES
 WHERE HIRE_DATE BETWEEN '05/01/01' AND '05/12/31';
 
--LIKE 연산자
-- 일부 문자열이 포함된 데이터를 조회할때 사용
--%, _ 라는 와일드 카드를 이용해서 매칭연산을 진행한다.
-- % : 길이와 상관없이 모든 문자 데이터를 의미
-- _ : 어떤 값이든 상관없이 한개의 문자 데이터를 의미


-- 직원 테이블에서 핸드폰번호가 650으로 시작하는 직원의 이름과 핸드폰 번호 출력

--SELECT FIRST_NAME, PHONE_NUMBER
--  FROM EMPLOYEES
-- WHERE PHONE_NUMBER LIKE '650.___.____';

SELECT FIRST_NAME, PHONE_NUMBER
  FROM EMPLOYEES
 WHERE PHONE_NUMBER LIKE '650%';
 
 
-- 1) 직원테이블에서 이름이 S로 시작하고 n으로 끝나는 직원의 이름 찾기

SELECT FIRST_NAME
  FROM EMPLOYEES
 WHERE FIRST_NAME LIKE 'S%n';
 
-- 2) 직원테이블에서 이름이 it으로 끝나고 총 4글자인 직원의 이름 찾기

SELECT FIRST_NAME
  FROM EMPLOYEES
 WHERE FIRST_NAME LIKE '__it';

-- 3) 직원테이블에서 이름이 두번째 글자가 e인 직원의 이름 찾기
SELECT FIRST_NAME
  FROM EMPLOYEES
 WHERE FIRST_NAME LIKE '_e%';
 
-- 4) 직원테이블에서 01월에 입사한 직원의 이름과 입사날짜 찾기
 SELECT FIRST_NAME
   FROM EMPLOYEES
  WHERE HIRE_DATE LIKE '__/01/__';







 
 
 
 
 
 