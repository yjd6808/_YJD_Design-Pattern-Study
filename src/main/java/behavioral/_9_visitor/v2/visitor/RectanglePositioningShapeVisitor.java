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
		System.out.println("\t���׶���� ��ġ�� �������� �ʽ��ϴ�!");
	}

	@Override
	public void visit(Hexagon hexagon) {
		System.out.println("\t�������� ��ġ�� �������� �ʽ��ϴ�!");
	}

	@Override
	public void visit(Rectangle rectangle) {
		System.out.printf("\t�簢���� ��ġ�� [%d, %d]�� ����Ϸ�!\n", x, y);
		rectangle.setX(x);
		rectangle.setY(y);
	}
}
