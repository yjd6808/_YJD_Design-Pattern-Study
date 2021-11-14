package behavioral._8_mediator.colleague;

import behavioral._8_mediator.mediator.Broker;

import java.util.ArrayList;
import java.util.List;

public class BuildingOwner {
	private String name;
	private List<Furniture> furnitures = new ArrayList<>();
	private Broker broker;

	public BuildingOwner(String name, Broker broker) {
		this.name = name;
		this.broker = broker;
	}

	public void addFurniture(Furniture furniture) {
		furnitures.add(furniture);
	}

	public List<Furniture> getFurnitures() {
		return furnitures;
	}

	public String getName() {
		return name;
	}

	public void requestFix() {
		broker.mediateFixingAllFurnitureFromOwner();
	}

	public void requestSell() {
		broker.mediateRoomFromOwner();
	}
}
