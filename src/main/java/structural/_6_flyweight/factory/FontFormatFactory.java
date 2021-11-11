package structural._6_flyweight.factory;

import structural._6_flyweight.format.*;

import java.util.HashMap;

public class FontFormatFactory {
	private static final FontFormatFactory INSTANCE = new FontFormatFactory();
	public static FontFormatFactory getInstance() { return INSTANCE;}

	private FontFormatFactory() {
		formatMap.put(FontFormatType.FONT_FAMILY, new HashMap<>());
		formatMap.put(FontFormatType.FONT_STYLE, new HashMap<>());

		initialize();
	}

	private void initialize() {
		addFormat(FontFormatType.FONT_FAMILY, "����", new FontFamilyFormat("����", "C:\\"));
		addFormat(FontFormatType.FONT_FAMILY, "���", new FontFamilyFormat("���", "D:\\"));
		addFormat(FontFormatType.FONT_FAMILY, "����", new FontFamilyFormat("����", "E:\\"));

		addFormat(FontFormatType.FONT_STYLE, "��Ż��ü", new FontStyleFormat("��Ż��ü"));
		addFormat(FontFormatType.FONT_STYLE, "����ü", new FontStyleFormat("����ü"));
		addFormat(FontFormatType.FONT_STYLE, "����ü", new FontStyleFormat("����ü"));
	}

	private HashMap<FontFormatType, HashMap<String, IFormat>> formatMap = new HashMap<>();

	public void addFormat(FontFormatType type, String formatName, IFormat format) {
		formatMap.get(type).putIfAbsent(formatName, format);
	}

	public IFormat getFontStyle(String formatName) {
		return formatMap.get(FontFormatType.FONT_STYLE).get(formatName);
	}

	public IFormat getFontFamily(String formatName) {
		return formatMap.get(FontFormatType.FONT_FAMILY).get(formatName);
	}
}
