<p align="center">�ۼ��� : ������</p>

### ���� ���� <small>(Creational Pattern)</small>

* [���丮](https://youtu.be/AmwEIt0vhxA?list=PLDV-cCQnUlIYcAmW4j27i8aYPbja9HePm) 
* [���丮 �޼ҵ�](https://youtu.be/ejXUhFKcbIU?list=PLDV-cCQnUlIYcAmW4j27i8aYPbja9HePm)
* [�߻� ���丮](https://youtu.be/XTgCYtQAQ4c?list=PLDV-cCQnUlIYcAmW4j27i8aYPbja9HePm)
* [����](https://youtu.be/qWiqt5EctSE?list=PLDV-cCQnUlIYcAmW4j27i8aYPbja9HePm)
* [�̱���](https://youtu.be/-oy5jOd5PBg?list=PLDV-cCQnUlIYcAmW4j27i8aYPbja9HePm)
* [������Ÿ��](https://youtu.be/F7dVyB48grs?list=PLDV-cCQnUlIYcAmW4j27i8aYPbja9HePm)

<hr>

### ���丮 <small>(Factory Pattern)</small>
������ ���������� ���ϱ� �����̴�.<br>
Ŭ���̾�Ʈ�� ��ǻ�͸� ���Ѵٸ� ��ǻ���� ������ ���������� ���ϰ�
�ܼ��� ���忡 �ֹ��� �ִ� ������ ���� ȹ���� �� �ִ�.<br>
��, Ŭ���̾�Ʈ�� ��ǻ���� ���������� ���� �ȴ�.

![���丮 UML ����](_1_factory/design/structure.png)<br><small>���� �������� ���丮 ���� UML</small><br><br>

<hr>

### ���丮 �޼ҵ� <small>(Factory Method Pattern)</small>
```��ü�� ������ �κ��� ���� Ŭ������ �����ϴ� ����```  
���丮 ������ �� �� Ȯ����Ѽ� �پ��� ����� ���� ���丮�� �����ϰ����� �� ����.  
��ü�� ������ �κ� : <span style="text-decoration: underline">createComputer</span>  
���� Ŭ���� : <span style="text-decoration: underline">NormalComputerFactory, SuperComputerFactory</span>   
 
![���丮 �޼ҵ� UML ����](_2_factory_method/design/structure.png)<br><small>���� �������� ���丮 �޼ҵ� ���� UML</small><br><br>
![��Ű�ǵ�� UML ����](_2_factory_method/design/wiki_structure.png)<br><small>��Ű�ǵ�� ���丮 �޼ҵ� ���� UML</small><br><br>

<hr>

### �߻� ���丮 <small>(Abstract Factory Pattern)</small>

```���� ���� ������ ���� Ŭ������ Ư�� �׷����� ���� �ѹ��� ��ü�� �� �ֵ��� ���� ������ ����```<br>
���� �� �츮�� ����ϴ� ���ڸ����� �׸��� ������ �׸��� �Ͼ�� �׸��� �ִٰ� �����غ���.<br>
������ �׸��� ����� ��� ������ ��ư, ������ ��ũ�ѹ�, ������ üũ�ڽ��� �����װ�<br>
�Ͼ�� �׸��� ����� ��� �Ͼ�� ��ư, �Ͼ�� ��ũ�ѹ�, �Ͼ�� üũ�ڽ��� ���ϰ��̴�.<br>

![�߻� ���丮 UML ����](_3_abstract_factory/design/structure.png)<br><small>���� �������� �߻� ���丮 ���� UML (Ŭ���̾�Ʈ ����)</small><br><br>
![��Ű�ǵ�� ���� UML ����](_3_abstract_factory/design/wiki_structure.png)<br><small>��Ű�ǵ�� �߻� ���丮 ���� UML</small><br><br>

<hr>

### ���� <small>(Builder Pattern)</small>

```�پ��� �������ڸ� �޴� ������Ʈ�� ���� �����ϰ� �������ְ� ������ ���������� �и����ִ� GOF ������ �������� �ϳ��̴�.```<br>
[��Ű�ǵ�� ��ũ](https://en.wikipedia.org/wiki/Builder_pattern)


![���� UML ����](_4_builder/design/structure.png)<br><small>���� �������� ���� ���� UML</small><br><br>
![��Ű�ǵ�� ���� UML ����](_4_builder/design/wiki_structure.png)<br><small>��Ű�ǵ�� ���� ���� UML</small><br><br>


#### ����

* �ʿ��� �����͸� ������ �� ����
* �������� Ȯ���� �� ����
* �������� ���� �� ����
* �Һ����� Ȯ���� �� ����

<hr>

### �̱��� <small>(Singleton Pattern)</small>

`�������� �ý��ۿ� ���ļ� �� �ϳ��� ��ü�� �ʿ��� ��쿡 ��� (�� �ϳ��� �ν��Ͻ��� �����ϴ� Ŭ����)`<br>
[��Ű�ǵ�� ��ũ](https://en.wikipedia.org/wiki/Singleton_pattern)

#### ����
* �̸� �ε� �̱��� (������ ������ ������)<br>
  &nbsp;&nbsp;&nbsp;&nbsp; �� ���α׷� ���۰� ���ÿ� �̱��� �ν��Ͻ��� ����     
* ���� �ε� �̱���<br>
  &nbsp;&nbsp;&nbsp;&nbsp; �� ����ڰ� ���ϴ� ������ �̱��� �ν��Ͻ��� ����
  * ����ȭ �Լ� �̱���
  * ���� Ŭ���� �̱���
  * ���� üũ�� ��ŷ �̱���

<hr>

### ������Ÿ�� <small>(Prototype Pattern)</small>

`�̹� �����ϴ� ��ü�� ������� �����ϴ� ������ ����`<br>
������ ��ü�� Ÿ���� �̹� �����ϴ� ��ü(�ν��Ͻ�)�κ��� �����ȴ�.

* new �� �̿��ؼ� �����ϴ� ����� �ſ� Ŭ �� ����Ѵ�.<br>
  �� ���� �����ø��� DB�� �����ϴ� ����� �̹� �����ϴ� ��ü�� Ŭ���Ͽ� ���°� �ξ� ����� �δ�.   

![������Ÿ�� UML ����](_6_prototype/design/structure.png)<br><small>���� �������� ������Ÿ�� ���� UML</small><br><br>
![��Ű�ǵ�� ���� UML ����](_6_prototype/design/wiki_structure.png)<br><small>��Ű�ǵ�� ������Ÿ�� ���� UML</small><br><br>