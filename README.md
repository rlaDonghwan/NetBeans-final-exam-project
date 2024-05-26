# 2023학년도 자바 프로젝트 완료 보고서

## 알바노트

### 2023년 12월 12일

컴퓨터정보과


## 프로젝트 요약문
이 프로젝트는 아르바이트를 하다가 인수인계가 안되어 업무에 지장이 생기게 되는 경우나, 자신의 근무시간이나 시급, 월급을 계산하기 불편한 문제 등을 해결하기 위해서 업무 처리의 편의성을 높이는 것을 목적으로 계획하게 되었습니다.

아르바이트는 유동적인 근무 시간을 가지게 될 수 있는데 이에 따라 근무 일정과 출퇴근 시간을 관리함으로써 자신의 근무 시간을 확실하게 확인을 할 수가 있고 근무 일수와 시간을 고려해 정확한 급여 계산을 도와주는 시급 계산 기능으로 급여 계산에 도움을 받을 수 있습니다.

관리자는 직원관리창을 통해서 아르바이트생의 개인정보를 관리하고, 확인할 수 있도록 하여 더 나은 업무 처리를 가능하게 했습니다.

인수인계 창에서는 관리자와 사용자 모두 인수인계를 확인할 수 있고 관리자의 인수인계 내용은 빨간색으로 표시하여 직원과 관리자의 인수인계 내용을 구별할 수 있도록 하였습니다. 또한 전체 유저 및 유저 이름 검색 창을 넣어 모든 인수인계와 해당 유저만의 인수인계를 확인할 수 있게 설계했습니다.


## 목차
1. 프로젝트 목적
2. 프로젝트 목표와 기대 효과
3. 프로젝트 진행범위 및 방법
4. 프로젝트 주요 내용
5. 연구 결과물
   - 5-1. 프로젝트명
   - 5-2. 프로젝트 개요
   - 5-3. 프로젝트 수행 세부 일정 및 내용
   - 5-4. 프로젝트 결과
- 부록
  - 사용자 설명서

## 1. 프로젝트 목적
현재 본인이 학교 학과사무실이나 아르바이트를 하면서 시급 계산이나 직원들 간에 인수인계가 제대로 되지 않아 일이 꼬이는 경우가 있어서 불편할 때가 많았다. 또한 인수인계를 메모하거나 말로 전달하는 경우가 많은데 이렇게 정보를 전달할 경우 메모가 사라지거나 듣는 사람이 이해를 정확히 못 했을 경우 실수할 수 있다. 이러한 경우를 방지하고 개선하고자 프로젝트를 기획하게 되었다.

## 2. 프로젝트 목표 및 기대효과

### 2-1 프로젝트 목표
기존에 있는 프로그램들은 한 가지 목적에만 초점을 두고 있어 본인이 원하는 기능들이 독립적으로 나누어져 프로그램이 구성되어 있다. 프로젝트 목표는 사용자가 본인의 출퇴근 기록이나 얼마나 근무를 했는지 근무를 했으면 그만큼의 시간과 일한 만큼의 총액 그리고 3.3% 세금을 제외하고 금액을 보이게 하여 사용자가 시급계산을 편하게 할 수 있게 하는 것이다. 또한 일을 하다 보면 소통의 부재 또는 인수인계를 받다 보면 누락이 되거나 달라지는 경우가 있다. 이런 경우를 대비하여 사용자들 간 소통을 위해 인수인계 창을 만들어 누락되는 정보를 방지할 것이다. 또한 사장님 같은 경우에는 직원들의 인적 사항을 직접 관리할 수 있어서 직원들의 시급을 수정하거나 직원이 그만둘 경우 직원의 인적 사항을 삭제하여 직원이 몇 명 있는지 손쉽게 관리할 수 있을 것이다.

### 2-2 프로젝트 기대효과
- 편한 시급 계산: 개인 사용자는 아르바이트를 할 때 본인이 일한 시간을 따로 메모하고 계산할 필요 없이 출퇴근 버튼을 클릭하면 하단에 총 일한 시간, 총액의 3.3% 세 후 금액을 한눈에 확인하여 시급 관리를 더욱 편리하게 할 수 있다.
- 소통 능력 강화: 아르바이트생과 사장님 또는 아르바이트생과 아르바이트생이 일을 하다 보면 서로 소통이 원활하게 되지 않아 정보교류 간 잘못 이해하거나 메모를 사용하여 전달하는 경우가 많은데 메모가 사라지거나 하는 경우를 대비하여 인수인계 창을 만들어 사장님과 아르바이트생들 간 소통 능력을 강화할 수 있다. 또한 사장이 말하는 내용은 빨간색으로 표시하여 사장이 말하는 것은 쉽게 확인할 수 있고 검색 기능을 통해 이름을 입력하면 어떤 사용자가 언제 어떤 내용을 말했는지 한눈에 확인할 수 있다.
- 손쉬운 직원 관리: 직원마다 시급이 다를 수도 있고 직원이 그만두는 경우도 있을 것이다. 사장 같은 경우에는 직원 명단에서 시급을 수정하거나 직원이 그만두는 경우 직원 명단을 삭제하여 직원 관리를 한눈에 할 수 있다.

## 3. 프로젝트 진행범위 및 방법
이 프로젝트는 NetBeans 프로그램과 MySQL 프로그램을 사용하여 수업 시간에 배운 내용을 바탕으로 계획 및 설계되었습니다. 데이터베이스의 테이블을 주로 활용하여 관리자는 직원관리 및 인수인계를, 사용자는 출퇴근 등록 및 인수인계를 간편하게 확인할 수 있도록 하여 더 나은 근무 경험과 업무 처리의 편의성을 추구하고자 해당 프로젝트를 설계하였습니다.

## 4. 프로젝트 주요 내용
- 관리자와 사용자는 하나의 회원가입 화면에서 가입을 가능하게 했고 관리자가 가입 시 인증만 따로 두어 회원가입의 UI를 간단하게 설계하였습니다.
  - 회원가입 시 전화번호 중복될 경우 오류 메시지가 나옵니다.
- 관리자는 모든 사용자의 정보를 확인 및 수정을 할 수 있게 설계되었습니다.
  - 관리자 창에서 검색을 추가하여 전체 인원과 이름 검색만으로 해당 사용자를 찾을 수 있게 설계되었습니다.
- 사용자가 출근, 퇴근 버튼을 눌러 근무 시간을 확인할 수가 있습니다.
  - 시급 및 출퇴근 관리에서 근무 시간에 대한 정보를 나타내기 위해 일한 시간과 시간에 대한 시급 정보를 같이 설계했습니다.
- 인수인계 창에서는 관리자와 사용자 모두 인수인계를 확인할 수 있습니다.
  - 인수인계 창에 전체 유저 및 유저 이름 검색 창을 넣어 모든 인수인계와 해당 유저만의 인수인계를 확인할 수 있게 설계했습니다.
- 관리자와 사용자의 페이지를 나누어 효율적인 관리를 할 수 있게끔 설계하였습니다.

## 5. 프로젝트 결과물
### 5-1. 프로젝트명
- 아르바이트 인수인계 및 시급 계산 시스템

### 5-2. 프로젝트 개요
아르바이트 생활을 하다 보면 정보 공유가 안되어 업무에 지장이 되는 경우나 인수인계가 제대로 되지 않아 불편함을 겪는 등의 불편한 근무환경을 편리하게 관리하고 업무 처리의 편의성을 높이는 것을 목적으로 프로젝트를 계획하게 되었습니다.  
이 프로젝트로 다양한 업무와 정보를 효율적으로 관리하고, 월급 계산, 인수인계 기능 등을 통해 더 나은 근무 환경을 제공할 수가 있습니다.

![페이지 흐름도](image.png)

### 5-3. 프로젝트 수행 세부 일정 및 내용
#### 프로젝트 수행 세부 일정
프로젝트 진행 계획(2023. 08. 31. - 2023. 12. 20)
진행 내용 | 책임자 | 8 | 9 | 10 | 11 | 12 | 비고
:-- | :-- | :--: | :--: | :--: | :--: | :--: | :--:
프로젝트 설계 데이터 베이스 설계 및 핵심 기능 설계 프론트 기획 | 김동환 박민제 정성훈 | ● | ● | ● | ● | ● | 
로그인, 회원가입 로그인 (reCAPTCHA) 및 세션처리 | 박민제 | ● | | | | |
유저 화면 출퇴근, 시급계산, 월별 확인, 인수인계 | 김동환 박민제 | ● | ● | ● | | |
직원관리 화면 유저 정보 수정, 삭제, 인수인계 | 김동환 박민제 | | ● | ● | ● | |
결과보고서 프로젝트 버그 수정 및 보고서 작성 | 김동환 정성훈 | | | ● | ● | |

#### 프로젝트 수행 내용

### 5-4. 프로젝트 결과
- 프로젝트 소스 (부록)
- 사용자 메뉴얼 (부록)

## 부록
### 1. 프로젝트 소스
#### 1-1 테이블 DDL
- User 테이블 DDL
- UserRole 테이블 DDL
- Authentication 테이블 DDL
- HandOver 테이블 DDL
- WorkHour 테이블 DDL

#### 1-2 DB 생성 및 테이블 ERD

### 2. 로그인(reCAPTCHA) 및 회원가입
- 로그인 화면
- 로그인 버튼 메서드
- 로그인 시 비밀번호 해싱 메서드
- reCAPTCHA label set 메서드
- reCAPTCHA 인증 버튼 메서드
- reCAPTCHA 새로고침 메서드
- 회원가입 버튼 메서드
- 회원가입 화면
- 중복 체크 버튼 메서드
- 인증 버튼 메서드
- 관리자 인증번호 입력 화면
- 관리자 인증번호 화면에서 인증 버튼 메서드
- 테이블에서 비밀번호를 가져오는 메서드
- UserRole테이블에 권한을 추가하는 메서드
- 등록 버튼 화면

### 3. 시급 및 출퇴근 관리
- 시급 및 출퇴근 관리 화면
- TextArea에 값을 뿌려주는 메서드
- 이름 TextField에 값을 뿌려주는 메서드
- DB에서 로그인된 사용자 이름을 가져오는 메서드
- DB에서 시급 값을 가져오는 메서드
- 출근 버튼 메서드
- 퇴근 버튼 메서드
- 출근 시간을 가져오는 메서드
- 누적 출근 시간 메서드
- 인수인계 버튼 메서드
- 콤보박스 메서드

### 4. 직원 관리
- 직원 관리 화면
- DB에서 값을 가져와 출력하는 메서드
- 검색 버튼 메서드
- 사용자 전체 검색 버튼 메서드
- 사용자 정보 수정 버튼 메서드
- 사용자 정보 삭제 버튼 메서드
- 직원관리 화면 인수인계 버튼 메서드
- 직원관리 화면 로그아웃 버튼 메서드

### 5. 인수인계
- 인수인계 화면
- 전체보기 버튼
- 유저 이름 검색 메서드
- 인수인계 입력 메서드
- 화면 출력 값 업데이트 해주는 메서드

### 사용자 설명서
- 로그인 화면
  처음 프로그램을 실행하게 되면 로그인 화면이 뜨게 된다.
- reCAPTCHA 인증 성공화면
  reCAPTCHA 인증을 성공 시 하단에 있는 로그인 버튼이 활성화되게 된다.
- reCAPTCHA 인증 실패 화면
  reCAPTCHA 인증을 실패 시 다시 비활성화된다.
- 로그인 실패 화면
  아이디나 비밀번호가 틀릴 시 알림 창이 띄게 된다.
- 회원가입 화면
- 중복체크 버튼
  중복 체크 버튼을 클릭 시 아이디가 중복이 되는지 안되는지 위에 레이블을 통해 확인이 가능하다. 중복이 되지 않을 시 하단에 있는 등록 버튼이 활성화된다.
- 비밀번호 불일치 화면
  등록 버튼을 클릭 시 비밀번호와 비밀번호 확인에 값이 일치하지 않으면 등록이 되지 않는다.
- 관리자 인증 버튼
  관리자 인증 버튼 클릭 시 관리자 인증 비밀번호를 입력하라는 다이얼로그 화면이 뜨게 되고 인증에 성공하게 되면 인증 완료라는 화면과 함께 ADMIN 버튼이 활성화되게 된다.
- 로그인 성공 화면
  로그인이 성공 시 일반 사용자는 상단 화면을 보게 된다.
- 출근 버튼 클릭 화면
  출근 버튼 클릭 시 출근 버튼은 비활성화되고 퇴근 버튼이 활성화되며 하단에는 출근 시간이 출력되게 된다.
- 퇴근 버튼 클릭 화면
  퇴근 버튼 클릭 시 시작 시간 값을 바탕으로 출퇴근 시간을 계산하여 근무시간을 표시하여 준다. 아직 사장 계정에서 로그인 되어 있는 계정에 시급을 지정해 주지 않았기 때문에 하단에는 총 일한 시간만 뜨고 금액 들은 0원으로 표시되게 된다.
- 콤보박스 클릭 화면
  콤보 박스를 클릭 시 1월부터 12월까지에 항목이 뜨게 되는데 10월에는 근무한 기록이 없기 때문에 뜨지 않고 11월을 클릭하게 되면 클릭한 달에 출퇴근 기록이 뜨게 된다.
- 로그아웃 클릭 화면
- 인수인계 화면
- 입력 후 화면
  값을 입력하게 되면 이름|시간|내용이 입력되게 된다.
- 검색 후 화면
  사용자 이름을 검색하게 검색된 사용자의 기록만 볼 수 있다.
- 전체보기 버튼
  전체 보기 버튼을 클릭하게 되면 값이 원래 상태로 돌아오게 된다.
- 직원관리 화면
- 직원관리 검색
  ID를 검색을 하면 필드에 값이 들어가게 되고 값을 수정하고 수정 버튼을 클릭하게 되면 값이 수정이 된다.
- 직원관리 사용자 삭제
- 직원관리 사용자 삭제 문구
  삭제를 하게 되면 삭제가 완료되었다는 문구가 뜨게 된다.
- 직원관리 인수인계
  사장권한으로 인수인계를 남기게 되면 빨간색으로 뜨게 된다.
- 시급 값 수정 후
  직원관리에서 시급 값이 수정이 되면 일반 사용자에 시급이 0에서 수정된 값으로 변경되고 하단에 값이 적용되어서 지금까지 얼마를 벌었는지 알 수 있게 된다.
