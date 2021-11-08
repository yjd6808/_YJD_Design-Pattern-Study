<p align="center">작성자 : 윤정도</p>

### 구조 패턴 <small>(Structural Pattern)</small>

* [어댑터](https://youtu.be/IHU-wDglGM0?list=PLDV-cCQnUlIaOFXCUv8vEMGxqzrrkGv_P)
* [프록시](https://youtu.be/oeavBf8eDu8?list=PLDV-cCQnUlIaOFXCUv8vEMGxqzrrkGv_P)
* [퍼사드](https://youtu.be/wC-aEK_xc7c?list=PLDV-cCQnUlIaOFXCUv8vEMGxqzrrkGv_P)
* [데코레이터](https://youtu.be/jqABDD1hBcU?list=PLDV-cCQnUlIaOFXCUv8vEMGxqzrrkGv_P)
* [브릿지](https://youtu.be/Dyt1rL3lIlQ?list=PLDV-cCQnUlIaOFXCUv8vEMGxqzrrkGv_P)
* [플라이웨이트](https://youtu.be/oRThakO5o-Q?list=PLDV-cCQnUlIaOFXCUv8vEMGxqzrrkGv_P)
* [컴포지트](https://youtu.be/XXvrHAsfTso?list=PLDV-cCQnUlIaOFXCUv8vEMGxqzrrkGv_P)

<hr>

### 어댑터 <small>(Adapter Pattern)</small>

`인터페이스(A)를 호환되지 않는 다른 인터페이스(B)와 호환될 수 있도록 해주는 디자인 패턴`

다음의 경우에 사용한다.

* 사용자가 요구하는 인터페이스가 없는 클래스를 사용하고자 할 때  <br>
  &nbsp;&nbsp;ex) 휴대폰 클래스에 boot() 함수가 없는데 사용자가 휴대폰 클래스에서 boot() 함수를 호출하고자 하는 경우
* 서로 다른 호환되지 않는 클래스가 호환될 수 있도록 하고 싶을 때 <br>
  &nbsp;&nbsp;ex) 사람 클래스에 walk() 함수가 있고 물고기 클래스에 swim() 함수가 있는데 사람이 수영하게 하고 물고기가 걷게 하고 싶을 경우
* 클래스에 다른 대체 인터페이스를 부착하고자 할 때 <br>
  &nbsp;&nbsp;ex) 물고기는 swim() 인터페이스만 가지고 있도록 설계되어 있는데 이때 기존 설계는 건들지 않고 walk() 인터페이스를 추가적으로 갖고 싶을 때

![찐 어뎁터](_1_adapter/design/adapter.png)<br><small>어댑터 예시 이미지</small><br><br>

![어댑터 UML 구조](_1_adapter/design/structure.png)<br><small>내가 디자인한 어댑터 패턴 UML</small><br><br>
![위키피디아 어댑터 UML 구조](_1_adapter/design/wiki_structure.png)<br><small>위키피디아 어댑터 패턴 UML</small><br><br>

<hr>
