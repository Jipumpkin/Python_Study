-- 서브쿼리란?
--> SQL문을 실행하는데 필요한 데이터를 추가로 조회하기 위해
--  SQL 내부에서 사용하는 SELECT문을 의미합니다.
-- 서브쿼리는 메인쿼리 안에 포함된 종속적인 관계입니다.

-- 메인쿼리 : 서브쿼리의 결과값을 사용하여 기능을 수행하는 영역
-- 서브쿼리 : 메인쿼리의 조건식에 들어가는 값을 의미

--직원테이블에서 이름이 Jack인 급여 정보를 출력

SELECT SALARY
  FROM EMPLOYEES
 WHERE FIRST_NAME = 'Jack';
 
-- Jack이라는 직원의 급여보다 낮은 직원의 이름과 급여를 출력하여라

SELECT FIRST_NAME, SALARY
  FROM EMPLOYEES
 WHERE SALARY < 8400;

-- 서브쿼리를 사용
SELECT FIRST_NAME, SALARY
  FROM EMPLOYEES
 WHERE SALARY < ( SELECT SALARY
                    FROM EMPLOYEES
                   WHERE FIRST_NAME = 'Jack' ) ;


-- 직원테이블에서 James의 급여보다 낮은 직원의 이름과 급여 정보를 조회
-- 1. 테이블의 정보 확인
-- 2. 조건의 기준이 되는 James의 급여의 정보를 확인
-- 3. 2번의 결과값을 가지고 조건절을 통해 결과 값을 출력

SELECT FIRST_NAME, SALARY
  FROM EMPLOYEES
 WHERE SALARY < ( SELECT SALARY FROM EMPLOYEES WHERE FIRST_NAME = 'James');
-- ORA-01427: single-row subquery returns more than one row
--> 단일행 서브쿼리는 하나의 행만 출력을 할수가 있다.

-- 서브쿼리의 특징 
-- 1. 서브쿼리는 연산자와 같은 비교 또는 조회 대상의 오른쪽 높이며 ()로 묶어서 사용한다.
-- 2. 서브쿼리의 SELECT절에 명시한 칼럼은
--    메인쿼리의 비교대상과 같은 자료형과 개수를 지정해야 한다
-- 3. 서브쿼리에 있는 SELECT 문의 결과 행 수는 함께 사용하는 메인쿼리의 연산자 종류와
--    호환 가능해야한다.
--> 즉 단 하나의 데이터로만 연산이 가능한 연산자라면 서브 쿼리의 결과 행 수 도 하나여야만 한다.
--> 연산자와 함께 상호 작용하는 방식에 따라서 단일행 서브쿼리와 다중 행 서브쿼리로 나뉜다.

-- 단일행 서브쿼리란?
--> 실행 결과가 단 하나의 행으로 나오는 서브쿼리
--> = , >=< , <> , != , ^= (단일행 연산자)



-- 직원테이블에서 Nancy 보다 빨리 입사한 직원의 이름과 입사일을 조회

-- 조건이 되는 Nancy의 입사일 정보를 출력
-- 2. 1의 조건을 가지고 서브쿼리를 이용해서 결과를 출력



SELECT FIRST_NAME, HIRE_DATE
  FROM EMPLOYEES
 WHERE HIRE_DATE < (SELECT HIRE_DATE FROM EMPLOYEES WHERE FIRST_NAME = 'Nancy');


-- 직원테이블에서 평균 급여보다 높은 급여를 받는 직원의 이름과 급여 정보를 조회

SELECT FIRST_NAME, SALARY
  FROM EMPLOYEES
 WHERE SALARY > (SELECT AVG(SALARY) FROM EMPLOYEES);


-- 단일행 연산자로는 하나의 결과 값만 비교가된다.
-- 서브쿼리의 결과값이 2개 이상이면 단일행 연산자로는 비교가 안된다.
-- 그래서 다중행 연산자로 비교를 해야한다.

-- 다중행 서브쿼리 란?
-- 실행 결과 행이 여러개로 나오는 서브쿼리를 말한다.
-- 단일행 연산자는 사용할 수 없고 다중 행 연산자를 사용해야 한다.

-- 다중행 연산자의 종류
-- IN : 메인쿼리의 데이터가 서브쿼리의 결과 중 하나라도 일치한 데이터가 있으면 TRUE 반환
--> IN(서브쿼리)
-- ANY : 메인쿼리의 조건식을 만족하는 서브쿼리의 결과가 하나 이상이면 TRUE 반환
--> 비교연산자 ANY (서브쿼리)
-- ALL : 메인쿼리의 조건식을 서브쿼리의 결과 모두가 만족하면 TRUE 반환
--> 비교연산자 ALL (서브쿼리)
-- EXISTS : 서브쿼리 결과 값이 존재하는지 여부를 확인 ( 즉 행이 한개 이상이면 TRUE)
--> EXISTS (서브쿼리)


-- 각 부서별 최고 급여 정보를 출력

SELECT MAX(SALARY)
  FROM EMPLOYEES
GROUP BY DEPARTMENT_ID;



-- 각 부서별 최고 급여와 동일한 급여를 받는 직원의 정보를 출력(부서아이디 이름 급여)

SELECT DEPARTMENT_ID, FIRST_NAME, SALARY
  FROM EMPLOYEES
 WHERE SALARY IN (SELECT MAX(SALARY) FROM EMPLOYEES GROUP BY DEPARTMENT_ID);
 
 
 
-- 부서별 최고급여와 같은 급여를 가지는 모든 직원이 출력됨
-- IN 서브쿼리 결과에 존재하는 값들 중 일치해야 한다.


-- ANY연산자 활용

SELECT DEPARTMENT_ID, FIRST_NAME, SALARY
  FROM EMPLOYEES
 WHERE SALARY = ANY (SELECT MAX(SALARY) FROM EMPLOYEES GROUP BY DEPARTMENT_ID);
 
-- IN 연산자와 같은 결과 값이 나온다.
-- 조건에 만족하는 결과가 하나라도 참이면 참을 반환
--> ANY 에 =연산자를 사용하니 IN연산자와 같은 값을 출력

SELECT DEPARTMENT_ID, FIRST_NAME, SALARY
  FROM EMPLOYEES
 WHERE SALARY >= ANY (SELECT MAX(SALARY) FROM EMPLOYEES GROUP BY DEPARTMENT_ID);

-- 부서별 최고 급여가 하나라도 참이면 참이 반환이기 때문에
-- 서브 쿼리의 값들 중 어떤 하나의 값보다 메인 쿼리의 값이
-- 큰 값을 가지면 모든 값이 출력이 된다.
-- 즉 부서별 최소 급여보다 높은 값은 다 출력이 된다.

-- ALL 사용
SELECT DEPARTMENT_ID, FIRST_NAME, SALARY
  FROM EMPLOYEES
 WHERE SALARY >= ALL (SELECT MAX(SALARY) FROM EMPLOYEES GROUP BY DEPARTMENT_ID);
 
 
-- ALL은 서브쿼리 결과에 존쟇는 모든 값들에 조건을 만족해야한다.
-- 메인쿼리는 서브 쿼리의 모든 결과 값을 만족해야한다.
-- 서브 쿼리의 결과 값 중 가장 큰 값인 24000과 비교를 해서 크거나 같은 값을
-- 가진 데이터만 출력을 하라고 명령을 내린것
-- 결과적으로 최대값보다 큰 건이 출력이 되서 최대값을 구하는거랑 같다.

-- EXISTS 연산자는 존재 여부만 확인을 한다.
SELECT FIRST_NAME, DEPARTMENT_ID
  FROM EMPLOYEES
 WHERE EXISTS (SELECT FIRST_NAME FROM EMPLOYEES WHERE DEPARTMENT_ID = 110);
 
 
 
-- 