# 로또
## 진행 방법
* 로또 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)

---

## step 1 - 문자열 덧셈 계산기

### 기능 요구사항
* 쉼표(,) 또는 콜론(:)을 구분자로 가지는 문자열을 전달하는 경우 구분자를 기준으로 분리한 각 숫자의 합을 반환 
(예: “” => 0, "1,2" => 3, "1,2,3" => 6, “1,2:3” => 6)
* 앞의 기본 구분자(쉼표, 콜론)외에 커스텀 구분자를 지정할 수 있다. 커스텀 구분자는 문자열 앞부분의 “//”와 “\n” 사이에 위치하는 문자를 커스텀 구분자로 사용한다. 예를 들어 “//;\n1;2;3”과 같이 값을 입력할 경우 커스텀 구분자는 세미콜론(;)이며, 결과 값은 6이 반환되어야 한다.
* 문자열 계산기에 숫자 이외의 값 또는 음수를 전달하는 경우 RuntimeException 예외를 throw한다.

### 프로그래밍 요구사항
* indent(들여쓰기) depth를 2단계에서 1단계로 줄여라.
* depth의 경우 if문을 사용하는 경우 1단계의 depth가 증가한다. if문 안에 while문을 사용한다면 depth가 2단계가 된다.
* 메소드의 크기가 최대 10라인을 넘지 않도록 구현한다.
* method가 한 가지 일만 하도록 최대한 작게 만들어라.
* else를 사용하지 마라.

### Tasks List
* [X] null 또는 Empty 받으면 0을 반환
* [X] 숫자 하나를 입력하면 해당 숫자 반환
* [X] 구분자로 컴마 사용 가능
* [X] 구분자로 콜론 사용 가능
* [X] "//" 와 "\n" 사이 값으로 커스텀 구분자 사용 가능
* [X] 음수 입력시 throw RuntimeException

---

## step 2 - 로또 (자동)

### 기능 요구사항
* 로또 구입 금액을 입력하면 구입 금액에 해당하는 로또를 발급해야 한다.
* 로또 1장의 가격은 1000원이다.

### Tasks List
- [X] 금액에 맞게 로또 n개 구매 기능
    - [X] 로또는 1000원에 한개
        - [X] 900원 에러
        - [X] 1000원 1개
        - [X] 1500원 1개
        - [X] 2000원 2개
    - [X] 구매한 로또 리스트 출력
    - [X] 로또는 번호 6개로 구성
        - [X] 번호는 중복 불가
        - [X] 번호의 범위는 1 ~ 45
        - [X] 번호 랜덤 생성
- [X] 사용자로부터 입력받은 당첨번호 문자열을 로또 번호로 변환
- [X] 로또 리스트와 당첨번호 비교하여 결과 리턴
    - [X] 결과 출력
   
### step2 피드백
- [ ] Lottos 일급 컬렉션         // TODO
- [ ] LottoResult 일급 컬렉션
- [ ] view 내부 기능 로직 제거
- [ ] BigDecimal 사용    
 
---
