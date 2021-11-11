package structural._6_flyweight;

import structural._6_flyweight.document.Document;
import structural._6_flyweight.document.Sentence;
import structural._6_flyweight.factory.FontFormatFactory;
import structural._6_flyweight.format.FontFormatType;

public class FlyweightMain {
	public static void main(String[] args) {
		Document document = new Document();
		System.out.println("== > 팩토리 초기화");
		FontFormatFactory factory = FontFormatFactory.getInstance();
		System.out.println("== > 팩토리 초기화 완료");
		System.out.println();

		System.out.println("== > 문서 작업 시작");
		document.addSentence(new Sentence(
				factory.getFontFamily("고딕"),
				factory.getFontStyle("보통체"),
				20,
				"안녕하세요"
		));

		document.addSentence(new Sentence(
				factory.getFontFamily("고딕"),
				factory.getFontStyle("보통체"),
				20,
				"저는"
		));

		document.addSentence(new Sentence(
				factory.getFontFamily("고딕"),
				factory.getFontStyle("보통체"),
				30,
				"윤정도 라고 합니다."
		));

		System.out.println("== > 문서 작업 완료");

		System.out.println();
		System.out.println("== > 문서 렌더 시작");
		document.render();
		System.out.println("== > 문서 렌더 완료");
	}
}
