package creational._4_builder.object;

public class Food {
	private String name;

	public Food(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
}
