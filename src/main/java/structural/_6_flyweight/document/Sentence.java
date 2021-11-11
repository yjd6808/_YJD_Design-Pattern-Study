package structural._6_flyweight.document;

import structural._6_flyweight.format.*;

public class Sentence {
	IFormat fontFamilyFormat;
	IFormat fontStyleFormat;
	int fontSize;
	String content;

	public Sentence(IFormat fontFamilyFormat,
					IFormat fontStyleFormat,
					int fontSize, String content) {

		this.fontFamilyFormat = fontFamilyFormat;
		this.fontStyleFormat = fontStyleFormat;
		this.fontSize = fontSize;
		this.content = content;
	}

	void render() {
		fontFamilyFormat.render();
		fontStyleFormat.render();
		System.out.println(content);
	}
}
