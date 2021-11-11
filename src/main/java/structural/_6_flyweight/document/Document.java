package structural._6_flyweight.document;

import java.util.ArrayList;
import java.util.List;

public class Document {
	List<Sentence> sentences = new ArrayList<>();

	public void addSentence(Sentence sentence) {
		System.out.println("문장 추가 : " + sentence.content);
		sentences.add(sentence);
	}

	public void render() {
		sentences.forEach(Sentence::render);
	}
}
