<p align="center">작성자 : 윤정도</p>

### 행동 패턴 <small>(Behavioral Pattern)</small>

* [전략](https://victorydntmd.tistory.com/292)


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
