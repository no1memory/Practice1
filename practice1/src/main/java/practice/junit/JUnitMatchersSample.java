package practice.junit;

import static org.junit.Assert.*;
import static org.junit.matchers.JUnitMatchers.*;

import java.util.ArrayList;


import org.junit.Test;

public class JUnitMatchersSample {

	@Test
	public void test_assertThat() {
		// containsString
		{
			String actual = "abcde";
			assertThat(actual, containsString("a"));	// 指定した文字が含まれていればOK
		}

		// both / and
		{
			String actual = "abcde";
			assertThat(actual, both(containsString("a")).and(containsString("b")).and(containsString("c")));
			
			// containsString()を and() で連結する場合に使用する模様。
			// allOf() でも同じ事ができるので、わかりやすい方を使用すればOK
		}

		// either / or
		{
			String actual = "abcde";
			assertThat(actual, either(containsString("a")).or(containsString("x")).or(containsString("y")));
			
			// containsString()を or() で連結する場合に使用する模様。
			// anyOf() でも同じ事ができるので、わかりやすい方を使用すればOK
		}

//		everyItem

		// hasItem
		{
			ArrayList<String> actual = new ArrayList<String>();
			actual.add("a");
			actual.add("b");
			actual.add("c");
			assertThat(actual, hasItem("b"));
			
			// assertArrayEquals()でArrayを指定する場合はtoArray()で取り出す必要があったが、
			// これは、そのまま評価ができる。
		}
		
		//　hasItems
		{
			ArrayList<String> actual = new ArrayList<String>();
			actual.add("a");
			actual.add("b");
			actual.add("c");
			assertThat(actual, hasItems("a", "b"));
			
			// まとめて指定可能。
		}
	}
}
