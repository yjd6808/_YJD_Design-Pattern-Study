package behavioral._9_visitor.v2.visitor;

import behavioral._9_visitor.v2.shape.Circle;
import behavioral._9_visitor.v2.shape.Hexagon;
import behavioral._9_visitor.v2.shape.Rectangle;

public class HaxagonPositioningShapeVisitor extends PositioningShapeVisitor {

	public HaxagonPositioningShapeVisitor(int x, int y) {
		super(x, y);
	}

	@Override
	public void visit(Circle circle) {
		System.out.println("\t���׶���� ��ġ�� �������� �ʽ��ϴ�!");
	}

	@Override
	public void visit(Hexagon hexagon) {
		System.out.printf("\t�������� ��ġ�� [%d, %d]�� ����Ϸ�!\n", x, y);
		hexagon.setX(x);
		hexagon.setY(y);
	}

	@Override
	public void visit(Rectangle rectangle) {
		System.out.println("\t�簢���� ��ġ�� �������� �ʽ��ϴ�!");
	}
}
