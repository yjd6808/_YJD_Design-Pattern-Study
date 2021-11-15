package behavioral._9_visitor.v2.shape;

import behavioral._9_visitor.v2.visitor.ShapeVisitor;

public class Rectangle extends Shape {
	public Rectangle(int x, int y) {
		super(x, y);
	}
	
	@Override
	public void accept(ShapeVisitor visitor) {
		visitor.visit(this);
	}
}
