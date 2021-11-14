package behavioral._8_mediator.colleague;

public class Furniture {
	private int durability = 100;
	private String name;

	public Furniture(String name) {
		this.name = name;
	}

	public int getDurability() {
		return durability;
	}

	public void setDurability(int durability) {
		this.durability = durability;
	}

	public String getName() {
		return name;
	}
}
