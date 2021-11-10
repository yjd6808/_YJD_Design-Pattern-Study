<p align="center">�ۼ��� : ������</p>

### ���� ���� <small>(Structural Pattern)</small>

* [�����](https://youtu.be/IHU-wDglGM0?list=PLDV-cCQnUlIaOFXCUv8vEMGxqzrrkGv_P)
* [���Ͻ�](https://youtu.be/oeavBf8eDu8?list=PLDV-cCQnUlIaOFXCUv8vEMGxqzrrkGv_P)
* [�ۻ��](https://youtu.be/wC-aEK_xc7c?list=PLDV-cCQnUlIaOFXCUv8vEMGxqzrrkGv_P)
* [���ڷ�����](https://youtu.be/jqABDD1hBcU?list=PLDV-cCQnUlIaOFXCUv8vEMGxqzrrkGv_P)
* [�긴��](https://youtu.be/Dyt1rL3lIlQ?list=PLDV-cCQnUlIaOFXCUv8vEMGxqzrrkGv_P)
* [�ö��̿���Ʈ](https://youtu.be/oRThakO5o-Q?list=PLDV-cCQnUlIaOFXCUv8vEMGxqzrrkGv_P)
* [������Ʈ](https://youtu.be/XXvrHAsfTso?list=PLDV-cCQnUlIaOFXCUv8vEMGxqzrrkGv_P)

<hr>

### ����� <small>(Adapter Pattern)</small>

`�������̽�(A)�� ȣȯ���� �ʴ� �ٸ� �������̽�(B)�� ȣȯ�� �� �ֵ��� ���ִ� ������ ����`

������ ��쿡 ����Ѵ�.

* ����ڰ� �䱸�ϴ� �������̽��� ���� Ŭ������ ����ϰ��� �� ��  <br>
  &nbsp;&nbsp;ex) �޴��� Ŭ������ boot() �Լ��� ���µ� ����ڰ� �޴��� Ŭ�������� boot() �Լ��� ȣ���ϰ��� �ϴ� ���
* ���� �ٸ� ȣȯ���� �ʴ� Ŭ������ ȣȯ�� �� �ֵ��� �ϰ� ���� �� <br>
  &nbsp;&nbsp;ex) ��� Ŭ������ walk() �Լ��� �ְ� ����� Ŭ������ swim() �Լ��� �ִµ� ����� �����ϰ� �ϰ� ����Ⱑ �Ȱ� �ϰ� ���� ���
* Ŭ������ �ٸ� ��ü �������̽��� �����ϰ��� �� �� <br>
  &nbsp;&nbsp;ex) ������ swim() �������̽��� ������ �ֵ��� ����Ǿ� �ִµ� �̶� ���� ����� �ǵ��� �ʰ� walk() �������̽��� �߰������� ���� ���� ��

![�� ���](_1_adapter/design/adapter.png)<br><small>����� ���� �̹���</small><br><br>

![����� UML ����](_1_adapter/design/structure.png)<br><small>���� �������� ����� ���� UML</small><br><br>
![��Ű�ǵ�� ����� UML ����](_1_adapter/design/wiki_structure.png)<br><small>��Ű�ǵ�� ����� ���� UML</small><br><br>

<hr>

### ���Ͻ� <small>(Proxy Pattern)</small>

`�ٸ� ��ü�� �̾����� �������̽� ������ ������ �� �ֵ��� ���ִ� ������ ����`

�ٸ� ��ü�� Ư���� �����ΰ��� �ƴ϶� �ƹ��ų� �� �ȴ�.<br>
�߰����� �̾��ִ� ����?

**���� ������ �ذ� �� �� �ִ°�?**
1. ��ü�� ���� �Ǵ� ��ü�� ����� �����ؾ��ϴ� ���
2. ��ü�� ���� �Ǵ� ��ü�� ��� ���� �߰����� ����� �䱸�Ǵ� ���


**���Ͻð� �ַ� ���Ǵ� ���**

1. ��Ʈ��ũ ���� 
2. �޸� ���� Ŀ�ٶ� ��ü
3. ����
4. �� ������ �� ���ų� ���䰡 ���� ���ҽ�

![���Ͻ� UML ����](_2_proxy/design/structure_v2.png)<br><small>���� �������� ���Ͻ� ���� UML</small><br><br>
![��Ű�ǵ�� ���Ͻ� UML ����](_2_proxy/design/wiki_structure.png)<br><small>��Ű�ǵ�� ���Ͻ� ���� UML</small><br><br>

<hr>

### �ۻ�� <small>(Facade Pattern)</small>

`������ ���� �������̽��� �Ⱥ��̵��� ���鿡 �������� ��ü�̴�.`<br>
`Ŭ���� ���̺귯�� ���� ������ �ڵ忡 ���� ����ȭ�� �������̽��� �����ϴ� ��ü�̴�.`

������� ��ǻ�͸� �ٷ�� �Ϲ����� ��� ��ǻ���� ���α׷��� � ������� ����Ǵ����� ����
�ڼ��� ���ۿ����� ���� ������ �ʿ� ����.  
 �ܼ��� ���콺 ����Ŭ������ ���α׷��� �����ϸ� ��ǻ�� ���������� �۾��� �������ֱ� �����̴�.

![�ۻ�� �˻�](_3_facade/design/facade.png)<br><small>�ۻ�带 �˻��ϸ� ������ �ǹ� ���� ������</small><br><br>

#### [�ۻ�� ������ ����ϴ� ���]
1. ������ ������ ����Ʈ���� ���̺귯���� ����� �� �������� ��� ������ ���� ��Ű���� �ϴ� ���<br>
   &nbsp;&nbsp;ex) ������ �������̽��� ���� ���̺귯���� �����ϰ� ����� �� �ֵ��� ���ߵ� ���ο� ���̺귯�� 
2. �� �� �Ϲ����� ����� �����ϰ��� �ϴ� ���
3. serve as a launching point for a broader refactor of monolithic or tightly-coupled systems in favor of more loosely-coupled code<br>
   ���ϰ� ���յ� �ý��ۿ� ���� ������ ���� ������ ���������� �����ϰ��� �� ��? �ռҸ���


![�ۻ�� UML ����](_3_facade/design/structure.png)<br><small>���� �������� �ۻ�� ���� UML</small><br><br>
![��Ű�ǵ�� �ۻ�� UML ����](_3_facade/design/wiki_structure.png)<br><small>��Ű�ǵ�� �ۻ�� ���� UML</small><br><br>

<hr>

### ���ڷ����� <small>(Decorator Pattern)</small>

`Ŭ������ �ٸ� ������Ʈ�� ��ɿ� ������ �����ʰ� �������� ����� �߰����� �� �ִ� ����̴�.`

[���� ��α�](https://coding-factory.tistory.com/713?category=974095)  
[���� ��Ű�ǵ��](https://en.wikipedia.org/wiki/Decorator_pattern)

[����]
1. �ݺ��Ǵ� ���� ���� ���� ������ �ذ����� �����Ѵ�.
2. �׽�Ʈ, ����, Ȯ���� ����.
3. ���� �ڵ带 �������� �ʰ� ���ڷ����� ������ ���� ����� Ȯ���ų �� �ִ�.<br>
   &nbsp;�� ���� å���� ��Ģ - SRP(Single Responsibility Principle)�� ��Ű�� ����.

[����]
1. �ڵ尡 �ʿ� �̻����� �������� �� �ִ�.

[�ʿ��� ���]
1. ���� ��ҵ��� �����ؼ� ����ϴ� Ŭ���� ������ ���
2. Ŭ������ ��ҵ��� ����ؼ� �����ϸ鼭 ����ϴ� ������ �ʿ��� ���


![���ڷ����� UML ����](_4_decorator/design/structure.png)<br><small>���� �������� ���ڷ����� ���� UML</small><br><br>
![��Ű�ǵ�� ���ڷ����� UML ����](_4_decorator/design/wiki_structure.png)<br><small>��Ű�ǵ�� ���ڷ����� ���� UML</small><br><br>

<hr>

### �긴�� <small>(Bridge Pattern)</small>

`�߻����� ���� ������ �и��Ͽ� ���� �ſ� ���������� ������ �� �ְ� ������ִ� �����̴�.`

�߻����̶�°� ������ �巯���� UI ������ ���ϰ� ���� ������ UI ���� ����? �׷��� ���Ѵ�.
������� �߻����� �ڵ����� ������ ���� �������δ� ������ ���� �� �ְڴ�.

[���� ����ϴ°�?]
1. �߻����� �������� ���� ���������� Ȯ�� �� ���ǵǾ��� ���<br>
    -> ������ �ְ� �� ������ �׸��� API�� ���� �޶����� ���?<br>
    new Circle(new SuperDrawAPI()), new Circle(new NormalDrawAPI()) 
2. A compile-time binding between an abstraction and its implementation should be avoided so that an implementation can be selected at run-time.<br>
   �� �ؼ� : �߻����� �� �߻����� ������ ������ ������ Ÿ���� �ƴ� ��Ÿ�� �߿� ���� ������ ���õǾ�� �ϴ� ���<br>
    -> ��.. 1�� ����ó�� SuperDrawAPI ���ù�ư�� ������ ��Ÿ���߿� ������ �׷����� ������ �ٲ� �� ������.. �׷��� ��?


![�긴�� UML ����](_5_bridge/design/structure.png)<br><small>���� �������� �긴�� ���� UML</small><br><br>
![��Ű�ǵ�� �긴�� UML ����](_5_bridge/design/wiki_structure.png)<br><small>��Ű�ǵ�� �긴�� ���� UML</small><br><br>