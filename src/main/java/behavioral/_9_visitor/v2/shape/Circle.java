package behavioral._9_visitor.v2.shape;

import behavioral._9_visitor.v2.visitor.ShapeVisitor;

public class Circle extends Shape {
	public Circle(int x, int y) {
		super(x, y);
	}

	@Override
	public void accept(ShapeVisitor visitor) {
		visitor.visit(this);
	}
}
