package structural._6_flyweight;

import structural._6_flyweight.document.Document;
import structural._6_flyweight.document.Sentence;
import structural._6_flyweight.factory.FontFormatFactory;
import structural._6_flyweight.format.FontFormatType;

public class FlyweightMain {
	public static void main(String[] args) {
		Document document = new Document();
		System.out.println("== > ���丮 �ʱ�ȭ");
		FontFormatFactory factory = FontFormatFactory.getInstance();
		System.out.println("== > ���丮 �ʱ�ȭ �Ϸ�");
		System.out.println();

		System.out.println("== > ���� �۾� ����");
		document.addSentence(new Sentence(
				factory.getFontFamily("���"),
				factory.getFontStyle("����ü"),
				20,
				"�ȳ��ϼ���"
		));

		document.addSentence(new Sentence(
				factory.getFontFamily("���"),
				factory.getFontStyle("����ü"),
				20,
				"����"
		));

		document.addSentence(new Sentence(
				factory.getFontFamily("���"),
				factory.getFontStyle("����ü"),
				30,
				"������ ��� �մϴ�."
		));

		System.out.println("== > ���� �۾� �Ϸ�");

		System.out.println();
		System.out.println("== > ���� ���� ����");
		document.render();
		System.out.println("== > ���� ���� �Ϸ�");
	}
}
