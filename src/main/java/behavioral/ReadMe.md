<p align="center">�ۼ��� : ������</p>

### �ൿ ���� <small>(Behavioral Pattern)</small>

* [����](https://victorydntmd.tistory.com/292)


<hr>

### ���� <small>(Strategy Pattern)</small>

`���α׷� �����߿�(��Ÿ�ӿ�) �˰����� ������ �� �ְ� �Ѵ�.`

������� �츮�� ��ü������ ������ ���� �ڷᱸ���� �ִٰ� ����
��.. �������̽� �̸��� ICollections���� ������.

�׷��� �� �������̽��� ��üȭ �ϱ����� Array�� LinkedList�� �����Ͽ���.<br>
�̶� Array�� sort �Լ��� �����Լ��� �����ϵ��� �������̵� �Ͽ���<br>
LinkedList�� sort�Լ��� �������ķ� �����ϵ��� �������̵��Ͽ� �����Ͽ���.

![OCP ���� ����](_1_strategy/design/OCP_violated.png)<br><small>OCP�� ������ ����</small><br><br>

���� ���� �˰����� ���Ͻ�Ű�ų� �� ���� �˰����� �־ �����ؾ��� ���<br>
�� ��� �������̵��� sort() �Լ��� ��������� �Ѵ�.<br>

�׷��� OCP (Open-Closed Principle)�� ����Ǵ� ��������� �ȴ�.<br>
OCP : Ȯ�忡 ���ؼ��� ����(Open)�Ǿ��ְ� ������ ���ؼ��� �����ִ�(Closed)������ ���Ѵ�.<br>

�׷��ٸ� ��� �ϸ� �˰����� ���������� ������ �� ������?<br>

���� �ۼ��س��� UML�� �ڵ带 ���� �� 1�ʸ��� �ľ��� �� �ִ�.

![���� UML ����](_1_strategy/design/structure.png)<br><small>���� �������� ���� ���� UML</small><br><br>
![��Ű�ǵ�� ���� UML ����](_1_strategy/design/wiki_structure.png)<br><small>��Ű�ǵ�� ���� ���� UML</small><br><br>

<hr>
