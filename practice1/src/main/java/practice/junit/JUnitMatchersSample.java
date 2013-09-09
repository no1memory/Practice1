package practice.junit;

import static org.junit.Assert.*;
import static org.junit.matchers.JUnitMatchers.*;


import org.junit.Test;

public class JUnitMatchersSample {

	@Test
	public void test_assertThat() {
		{
			String actual = "abcde";
			assertThat(actual, containsString("a"));	// 指定した文字が含まれていればOK
		}

		{
			String actual = "abcde";
			assertThat(actual, both(containsString("a")).and(containsString("b")).and(containsString("c")));
			
			// containsString()を and() で連結する場合に使用する模様。
			// allOf() でも同じ事ができるので、わかりやすい方を使用すればOK
		}

		{
			String actual = "abcde";
			assertThat(actual, either(containsString("a")).or(containsString("x")).or(containsString("y")));
			
			// containsString()を or() で連結する場合に使用する模様。
			// anyOf() でも同じ事ができるので、わかりやすい方を使用すればOK
		}

//		everyItem
//		hasItem
//		hasItems
	}
}
