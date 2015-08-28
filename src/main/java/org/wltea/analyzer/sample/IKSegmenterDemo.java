package org.wltea.analyzer.sample;

import java.io.StringReader;

import org.wltea.analyzer.core.IKSegmenter;
import org.wltea.analyzer.core.Lexeme;

public class IKSegmenterDemo {

	public static void main(String[] args) throws Exception {
		IKSegmenter analyzer = new IKSegmenter(null,true);
		StringReader reader = new StringReader("你好中国！我是一个人！");
		analyzer.reset(reader);
		Lexeme lexeme = null;
		while (!((lexeme = analyzer.next()) == null)) {
			System.out.println(lexeme.getLexemeText());
		}
	}

}
