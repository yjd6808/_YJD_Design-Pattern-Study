<p align="center">작성자 : 윤정도</p>

### 행동 패턴 <small>(Behavioral Pattern)</small>

* [전략](https://victorydntmd.tistory.com/292)
* [상태](https://victorydntmd.tistory.com/294)
* [템플릿 메소드](https://coding-factory.tistory.com/712)


<hr>

### 전략 <small>(Strategy Pattern)</small>

`프로그램 실행중에(런타임에) 알고리즘을 선택할 수 있게 한다.`

예를들어 우리가 자체적으로 구현한 선형 자료구조가 있다고 하자
음.. 인터페이스 이름은 ICollections으로 지었다.

그러면 이 인터페이스를 실체화 하기위해 Array와 LinkedList를 구현하였다.<br>
이때 Array의 sort 함수는 버블함수로 정렬하도록 오버라이딩 하였고<br>
LinkedList는 sort함수를 선택정렬로 정렬하도록 오버라이딩하여 구현하였다.

![OCP 위반 예시](_1_strategy/design/OCP_violated.png)<br><small>OCP를 위반한 구조</small><br><br>

만약 정렬 알고리즘을 통일시키거나 더 좋은 알고리즘이 있어서 변경해야할 경우<br>
둘 모두 오버라이딩된 sort() 함수를 수정해줘야 한다.<br>

그러면 OCP (Open-Closed Principle)에 위배되는 수정방식이 된다.<br>
OCP : 확장에 대해서는 개방(Open)되어있고 수정에 대해서는 닫혀있는(Closed)구조를 말한다.<br>

그렇다면 어떻게 하면 알고리즘을 선택적으로 수정할 수 있을까?<br>

내가 작성해놓은 UML과 코드를 보면 단 1초만에 파악할 수 있다.

![전략 UML 구조](_1_strategy/design/structure.png)<br><small>내가 디자인한 전략 패턴 UML</small><br><br>
![위키피디아 전략 UML 구조](_1_strategy/design/wiki_structure.png)<br><small>위키피디아 전략 패턴 UML</small><br><br>

<hr>

### 상태 <small>(State Pattern)</small>

`상태에 대한 행동을 직접 처리하지 않고 상태 객체에 위임하는 패턴을 말한다.`

먼저 잘못된 예를 들어보자.<br>
게임을 플레이중인 유저가 있다.<br>

유저는 다음 움직임 상태가 있다고 가정하자.<br>
1. 걷고 있는 경우
2. 달리고 있는 경우
3. 멈춘 경우가 있을 수 있다.

이를 코드로 나타내면 다음과 같다.

![OCP 위반 예시](_2_state/design/OCP_violated.png)<br><small>OCP를 위반한 구조</small><br><br>

우선 상태에 대한 행위를 수행하지만
위의 코드는 2가지 문제점을 안고 있다.

1. OCP 위반
2. 상태패턴의 정의 무시

첫번째 문제점에 대해서 생각해보자.<br>
만약 천천히 걷는 경우, 좀더 빠르게 달리고 있는 경우가 추가된다면<br>
우리는 기존 코드의 수정이 필요하다.

이는 OCP (Open-Closed Principle)에 위배되는 수정방식이 된다.<br>
OCP : 확장에 대해서는 개방(Open)되어있고 수정에 대해서는 닫혀있는(Closed)구조를 말한다.<br>

이제 두번째 문제점에 대해서 생각해보자<br>
상태패턴은 그 정의대로 상태에 해당하는 처리를 직접 User 객체가 수행하지 않고
상태 객체에 위임하여 처리해야한다.

하지만 위 코드는 User객체가 상태에 따른 처리를 모두 수행하기 때문에 상태패턴이라고 할 수 없다.<br> 
그러면 OCP를 준수하면서 상태 패턴의 정의를 수행하는 코드를 작성해보자.

<hr>

### 템플릿 메소드 <small>(Strategy Pattern)</small>

`작업을 수행하는 알고리즘(함수)의 기본 구조를 만들고 이를 서브 클래스로 만들어서 기본 구조는 바꾸지 않으면서 특정 단계에서 수행하는 알고리즘의 내용을 바꾸는 방법이다.`

예를들어 보겠다.

작업을 수행하는 알고리즘 : 라면을 요리한다.<br>
기본 구조(작업 순서) : 물을 넣는다. 그리고 라면을 넣는다. 기다린다!<br>
특정 단계에서 수행하는 알고리즘 : 물을 넣는다. or 라면을 넣는다 or 기다린다<br>

[장점]
1. 코드 중복 감소
2. 확장이 쉽다.
3. 자식 클래스의 역할을 감소시키면서 핵심 로직 관리 용이

[단점]
1. 추상 메소드가 너무 많아지면 클래스 관리가 복잡해진다.
2. 클래스간의 관계와 코드가 꼬여버릴 염려가 있다.

![템플릿 메소드 UML 구조](_3_template_method/design/structure.png)<br><small>내가 디자인한 템플릿 메소드 패턴 UML</small><br><br>
![위키피디아 템플릿 메소드 UML 구조](_3_template_method/design/wiki_structure.png)<br><small>위키피디아 템플릿 메소드 패턴 UML</small><br><br>


