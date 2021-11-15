package behavioral._9_visitor.v1.visitor;

import behavioral._9_visitor.v1.shape.Shape;

public class PrintingInfoShapeVisitor implements ShapeVisitor {
	@Override
	public void visit(Shape shape) {
		System.out.printf("\t[%s의 정보]!\n", shape.getClass().getSimpleName());
		System.out.printf("\t\tx : %d\n", shape.getX());
		System.out.printf("\t\ty : %d\n", shape.getY());
		System.out.printf("\t\t배경색 : 0x%x\n", shape.getBackgroundColor());
		System.out.printf("\t\t전경색 : 0x%x\n", shape.getForegroundColor());
	}
}
