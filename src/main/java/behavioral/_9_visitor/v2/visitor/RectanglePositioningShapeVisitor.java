package behavioral._9_visitor.v2.visitor;

import behavioral._9_visitor.v2.shape.Circle;
import behavioral._9_visitor.v2.shape.Hexagon;
import behavioral._9_visitor.v2.shape.Rectangle;

public class RectanglePositioningShapeVisitor extends PositioningShapeVisitor {

	public RectanglePositioningShapeVisitor(int x, int y) {
		super(x, y);
	}

	@Override
	public void visit(Circle circle) {
		System.out.println("\t동그라미의 위치는 변경하지 않습니다!");
	}

	@Override
	public void visit(Hexagon hexagon) {
		System.out.println("\t육각형의 위치는 변경하지 않습니다!");
	}

	@Override
	public void visit(Rectangle rectangle) {
		System.out.printf("\t사각형의 위치를 [%d, %d]로 변경완료!\n", x, y);
		rectangle.setX(x);
		rectangle.setY(y);
	}
}
