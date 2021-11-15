package behavioral._9_visitor.v2;

import behavioral._9_visitor.v2.shape.*;
import behavioral._9_visitor.v2.visitor.*;

import java.util.ArrayList;
import java.util.List;

public class VisitorMainV2 {

	private static List<Shape> shapes = new ArrayList<>();

	// �������� 0,0 ��ǥ�� �̵������ִ� �湮��
	private static PositioningShapeVisitor hexagonMoveToZeroVisitor =
			new HaxagonPositioningShapeVisitor(0, 0);

	// �簢���� 0,0 ��ǥ�� �̵������ִ� �湮��
	private static PositioningShapeVisitor rectangleMoveToZeroVisitor =
			new RectanglePositioningShapeVisitor(0, 0);

	// ���׶�̸� 0,0 ��ǥ�� �̵������ִ� �湮��
	private static PositioningShapeVisitor circleMoveToZeroVisitor =
			new CirclePositioningShapeVisitor(0, 0);

	// ���� ������ ������ִ� �湮��
	private static PrintingInfoShapeVisitor printingInfoShapeVisitor =
			new PrintingInfoShapeVisitor();

	public static void main(String[] args) {
		shapes.add(new Hexagon(50, 50));
		shapes.add(new Circle(50, 50));
		shapes.add(new Rectangle(50, 50));
		
		System.out.println("[�������� 0,0 ��ǥ�� �̵������ִ� �湮�� ��ȸ]");
		shapes.forEach(x -> x.accept(hexagonMoveToZeroVisitor)); System.out.println();

		System.out.println("[���� ������ ������ִ� �湮�� ��ȸ]");
		shapes.forEach(x -> x.accept(printingInfoShapeVisitor)); System.out.println();
		
		System.out.println("[���׶�̸� 0,0 ��ǥ�� �̵������ִ� �湮�� ��ȸ]");
		shapes.forEach(x -> x.accept(circleMoveToZeroVisitor)); System.out.println();

		System.out.println("[���� ������ ������ִ� �湮�� ��ȸ]");
		shapes.forEach(x -> x.accept(printingInfoShapeVisitor)); System.out.println();

		System.out.println("[�簢���� 0,0 ��ǥ�� �̵������ִ� �湮�� ��ȸ]");
		shapes.forEach(x -> x.accept(rectangleMoveToZeroVisitor)); System.out.println();

		System.out.println("[���� ������ ������ִ� �湮�� ��ȸ]");
		shapes.forEach(x -> x.accept(printingInfoShapeVisitor)); System.out.println();


	}
}
