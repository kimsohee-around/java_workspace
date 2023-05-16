수업 내용 요약

### day17 (5.15)


#### InterfaceA.java
+ 인터페이스 정의 형식 
+ 상수필드 public static final , 추상메소드는 public abstract : 키워드 생략
+ 인스턴스 메소드 : default 키워드 작성
+ 상수,*추상 메소드*,인스턴스 메소드, static 메소드만 포함하며 모두 접근 한정자 public 입니다. (*인스턴스 필드*는 인터페이스에 없습니다.)

#### ClassA.java
+ InterfaceA 의 구현 클래스 정의
+ 추상메소드는 모두 정의(구현,implements) 했습니다.

#### C01InterfaceATest.java
+ ClassA 객체 생성
+ 인터페이스 타입으로 변수 선언하는 연습했습니다.

#### beable 패키지
+ Runnable , Thinkable , Cookable 인터페이스 정의
+ 구현 클래스 AI , Dog , People 정의
+ BeAble 인터페이스 정의하여 Runnable , Thinkable , Cookable 의 부모 인터페이스로 수정하고 테스트
+ BeAble 인터페이스의 default 메소드 역할 테스트(소스파일 주석 참고하세요.)

#### C02BeAbleTest.java
+ beable 패키지의 구현클래스 객체 생성
+ 인터페이스를 사용한 다형성 연습 : 구현 클래스의 타입체크

#### C03ComparToTest.java
+ 기본형 타입 데이터 비교 : 관계연산 < , >
+ String 타입 데이터 비교 : comparTo 메소드

#### C04MemberCompareTest.java
+ 기본형, String 타입처럼 객체의 비교를 위한 연습
+ Comparable 인터페이스의 compareTo 메소드를 재정의하는 연습
   + Member 클래스에서 연습 - 비교할 특정 필드를 지정.
   + 단점 : 비교할 필드를 고정시켜야 합니다.(name 또는 age 필드 선택)
   + 수정사항 : 비교하는 실행시점(Runtime)에서 필드를 정하도록 다른 인터페이스를 사용할 예정.
+ Member 클래스 객체를 compareTo 메소드로 비교

#### C05MySort.java
+ 비교를 사용하는 대표적인 메소드 sort(정렬) 알고리즘 연습
+ 선택 정렬. 인덱스 0부터 시작해서 가장 작은 값을 순서대로 찾는 방법
+ 정렬 방식 : 기본은 오름차순(작=> 큰값) , 내림 차순(큰=>작은값)


## 참고 

### 다형성을 애플리케이션에서 구현한다면 필요한 개념들은 아래와 같습니다.

+ 상속 또는 인터페이스
+ 메소드 오버라이딩(재정의 또는 구현)
+ 업캐스팅 : 자식 클래스 또는 인터페이스의 구현클래스 객체를 부모 타입 변수(배열) 또는 인터페이스 타입 변수(배열)에 참조.배열은 이후에 다양한 자료구조로 변경되어 데이터를 저장.
+ 다운캐스팅 : 업캐스팅했던 객체를 실제 객체 타입으로 변환.(타입 체크는 instanceof 연산)













