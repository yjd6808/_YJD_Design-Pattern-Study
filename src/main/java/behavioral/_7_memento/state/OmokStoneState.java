package behavioral._7_memento.state;

public class OmokStoneState {
	private final int x;
	private final int y;
	private final OmokColor color;

	public OmokStoneState(int x, int y, OmokColor color) {
		this.x = x;
		this.y = y;
		this.color = color;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public OmokColor getColor() {
		return color;
	}

	@Override
	public OmokStoneState clone()  {
		return new OmokStoneState(this.x, this.y, this.color);
	}

	@Override
	public String toString() {
		return String.format("[%d, %d] %s Âø¼ö¿Ï·á",
				x, y, color == OmokColor.BLACK ? "Èæµ¹" : "¹éµ¹");
	}
}
