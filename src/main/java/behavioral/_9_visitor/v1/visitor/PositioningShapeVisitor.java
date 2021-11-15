package behavioral._9_visitor.v1.visitor;

import behavioral._9_visitor.v1.shape.Shape;

public class PositioningShapeVisitor implements ShapeVisitor {
	private int x;
	private int y;

	public PositioningShapeVisitor(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public void visit(Shape shape) {
		System.out.printf("\t%s의 위치를 [%d, %d]로 변경완료!\n",
				shape.getClass().getSimpleName(), x, y);
		shape.setX(x);
		shape.setY(y);
	}
}
