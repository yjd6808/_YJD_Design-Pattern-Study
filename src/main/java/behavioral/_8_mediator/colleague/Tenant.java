package behavioral._8_mediator.colleague;

import behavioral._8_mediator.mediator.Broker;

public class Tenant {
	private String name;
	private Broker broker;

	public Tenant(String name, Broker broker) {
		this.name = name;
		this.broker = broker;
	}

	public String getName() {
		return name;
	}

	public void requestRoom() {
		broker.mediateRoomFromTenant();
	}

	public void requestFix(String furnitureName) {
		broker.mediateFixingFurnitureFromTenant(furnitureName);
	}
}
