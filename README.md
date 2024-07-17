## **프로젝트 개발 동기**
- 이 프로젝트는 근로자와 사장 모두의 불편을 해결하기 위해 개발되었습니다. 근무 시간과 임금 계산의 불편함, 그리고 인수인계의 부재로 인한 업무 연속성 문제를 해결하는 것이 주요 목적입니다.

## **핵심 동기**
- **출퇴근 관리 기능:** 아르바이트 근로자는 출근 버튼과 퇴근 버튼을 클릭하여 자신의 근무시간을 기록할 수 있으며, 이 데이터를 기반으로 달별로 임금을 자동으로 계산합니다.
- **인수인계 기능:** 근무자와 사장님의 필요한 정보를 기록하고 확인할 수 있는 인수인계 버튼을 통해 업무 연속성을 유지하고 정보 전달의 손실을 최소화합니다.
- **관리자 기능:** 사장님 화면에서는 근로자의 정보를 수정하거나 삭제할 수 있어 인력 관리가 용이합니다.

## **기대효과**
- **업무 효율성 증대:** 정확한 시간 추적과 임금 계산을 통해 분쟁을 줄이고, 업무 효율성을 높일 수 있습니다.
- **업무 연속성 보장:** 인수인계 문서를 통해 근무자 간의 원활한 정보 전달이 가능해져, 업무 연속성이 강화됩니다.
<br>

![ERD](https://github.com/rlaDonghwan/NetBeans-final-exam-project/blob/main/%EC%9D%B4%EB%AF%B8%EC%A7%80/ERD.png?raw=true)
<br> 데이터베이스 ERD
이 ERD를 기반으로 각 테이블의 역할을 설명해드리겠습니다.

1. **authentication 테이블**
   - **역할:** 관리자의 비밀번호를 저장하는 테이블입니다.
   - **컬럼:**
     - `admin_password`: 관리자 비밀번호를 저장하는 컬럼입니다. (VARCHAR(255))

2. **user 테이블**
   - **역할:** 사용자의 기본 정보를 저장하는 테이블입니다.
   - **컬럼:**
     - `user_id`: 사용자의 고유 ID를 저장하는 컬럼입니다. (INTEGER)
     - `name`: 사용자의 이름을 저장하는 컬럼입니다. (VARCHAR(255))
     - `phone_number`: 사용자의 전화번호를 저장하는 컬럼입니다. (VARCHAR(255))
     - `birth_date`: 사용자의 생년월일을 저장하는 컬럼입니다. (VARCHAR(255))
     - `pay`: 사용자의 급여를 저장하는 컬럼입니다. (INTEGER)
     - `password`: 사용자의 비밀번호를 저장하는 컬럼입니다. (INTEGER)

3. **user_role 테이블**
   - **역할:** 사용자와 그들의 역할(권한)을 연결하는 테이블입니다.
   - **컬럼:**
     - `user_id`: 사용자의 고유 ID를 저장하는 컬럼입니다. (INTEGER, FK)
     - `role`: 사용자의 역할을 저장하는 컬럼입니다. (VARCHAR(50))

4. **hand_over 테이블**
   - **역할:** 인수인계 정보를 저장하는 테이블입니다.
   - **컬럼:**
     - `handover_id`: 인수인계의 고유 ID를 저장하는 컬럼입니다. (INTEGER)
     - `user_id`: 인수인계를 수행하는 사용자의 ID를 저장하는 컬럼입니다. (INTEGER, FK)
     - `input_time`: 인수인계가 입력된 시간을 저장하는 컬럼입니다. (VARCHAR(1000))
     - `handover_notes`: 인수인계 내용을 저장하는 컬럼입니다. (VARCHAR(1000))

5. **work_hour 테이블**
   - **역할:** 사용자의 근무 시간을 기록하는 테이블입니다.
   - **컬럼:**
     - `record_id`: 근무 시간 기록의 고유 ID를 저장하는 컬럼입니다. (INTEGER)
     - `user_id`: 근무한 사용자의 ID를 저장하는 컬럼입니다. (INTEGER, FK)
     - `work_duration`: 근무 시간을 저장하는 컬럼입니다. (INTEGER)
     - `total_work_duration`: 총 근무 시간을 저장하는 컬럼입니다. (INTEGER)
     - `start_time`: 근무 시작 시간을 저장하는 컬럼입니다. (DATETIME)
     - `end_time`: 근무 종료 시간을 저장하는 컬럼입니다. (DATETIME)

각 테이블은 특정 사용자 관리 시스템의 일부분으로, 사용자의 정보, 역할, 인수인계, 그리고 근무 시간 등을 관리하는 데 사용됩니다. Foreign Key(FK)를 통해 각 테이블 간의 관계를 설정하고 있습니다. 예를 들어, `user_role` 테이블은 `user_id`를 Foreign Key로 사용하여 `user` 테이블과 연결되어 있으며, `hand_over`와 `work_hour` 테이블 또한 `user_id`를 Foreign Key로 사용하여 `user` 테이블과 연결됩니다.
<br>


![회원가입 화면](https://github.com/rlaDonghwan/NetBeans-final-exam-project/blob/main/%EC%9D%B4%EB%AF%B8%EC%A7%80/%ED%9A%8C%EC%9B%90%EA%B0%80%EC%9E%85%20%ED%99%94%EB%A9%B4.png?raw=true)
<br> 회원가입 화면
<br>
![관리자 인증 화면](https://github.com/rlaDonghwan/NetBeans-final-exam-project/blob/main/%EC%9D%B4%EB%AF%B8%EC%A7%80/%EA%B4%80%EB%A6%AC%EC%9E%90%20%EC%9D%B8%EC%A6%9D%20%ED%99%94%EB%A9%B4.png?raw=true)
<br>관리자 인증 화면
- 관리자로 회원가입을 할 경우 필요합니다.
<br>
![일반 사용자 로그인 후 화면](https://github.com/rlaDonghwan/NetBeans-final-exam-project/blob/main/%EC%9D%B4%EB%AF%B8%EC%A7%80/%EC%9D%BC%EB%B0%98%20%EC%82%AC%EC%9A%A9%EC%9E%90%20%EB%A1%9C%EA%B7%B8%EC%9D%B8%20%ED%9B%84%20%ED%99%94%EB%A9%B4.png?raw=true)
<br> 일반 사용자 로그인 화면
- 출근, 퇴근 버튼을 클릭 시 아래 화면에 시작, 종료 시간이 출력되고 시작, 종료 시간을 바탕으로 근무 시간을 측정합니다.<br>

![admin 로그인 후 화면](https://github.com/rlaDonghwan/NetBeans-final-exam-project/blob/main/%EC%9D%B4%EB%AF%B8%EC%A7%80/admin%20%EB%A1%9C%EA%B7%B8%EC%9D%B8%20%ED%9B%84%20%ED%99%94%EB%A9%B4.png?raw=true)
<br> admin 사용자 로그인 화면
- 사용자의 ID를 검색하여 일반 사용자들의 내용을 수정하거나 삭제할 수 있습니다. <br>

![인수인계 창](https://github.com/rlaDonghwan/NetBeans-final-exam-project/blob/main/%EC%9D%B4%EB%AF%B8%EC%A7%80/%EC%9D%B8%EC%88%98%EC%9D%B8%EA%B3%84%20%EC%B0%BD.png?raw=true)
<br> 인수인계 대화 창
- 직원과 사장이 서로 대화할 수 있으며 가독성을 위해 admin 사용자가 입력하는 글자 색은 붉은색으로 처리했습니다. 
