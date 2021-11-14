package behavioral._8_mediator.colleague;

import behavioral._8_mediator.mediator.Broker;

public class RepairMan {
	private String name;
	private Broker broker;

	public RepairMan(String name, Broker broker) {
		this.name = name;
		this.broker = broker;
	}

	public void fix(Furniture furniture) {
		System.out.printf("\t������� %s�� ���� %s�� �����߽��ϴ�.\n", name, furniture.getName());
		furniture.setDurability(100);
	}

	public String getName() {
		return name;
	}
}
