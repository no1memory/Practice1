package practice.junit;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class CoreMatchersSample {

	@Test
	public void test_assertThat() {
		
		// 第一引数(actual)と第二引数(matcher)を比較
		
		{
			String actual = "a";
			assertThat(actual, is("a"));	// 同じであれば成功
		}
		
		{
			String actual = "a";
			assertThat(actual, is(not("b")));	// 違っていれば成功
		}
		
		{
			Object actual = null;
			assertThat(actual, nullValue());	// nullであれば成功
		}
		
		{
			Object actual = "a";
			assertThat(actual, notNullValue());	// nullでなければ成功
		}

		{
			Object actual = "a";
			assertThat(actual, instanceOf(Object.class));	// 指定したインスタンスであれば成功
															// クラス名.classの指定が必要

			ArrayList<Object> actual2 = new ArrayList<Object>();
			assertThat(actual2, instanceOf(ArrayList.class));	// ArrayList.classでも成功
			assertThat(actual2, instanceOf(List.class));		// List.classでも成功
		}

		{
			// 【参考】
			// 演算子の instanceof でも同じことができる
			String actual = "a";
			assertTrue(actual instanceof String);
		}

		{
			String actual = "a";
			String actual2 = actual;
			assertThat(actual, sameInstance(actual2));	// 同じインスタンスであれば成功
		}
		
		{
			String actual = "a";
			String actual2 = "a";
			assertThat(actual, sameInstance(actual2));	// これは成功
		}

		{
			ArrayList<Object> actual = new ArrayList<Object>();
			assertThat(actual, 
					allOf(
							instanceOf(ArrayList.class),
							notNullValue()
						)
					);		// 全ての条件がOKなら成功
		}

		{
			ArrayList<Object> actual = new ArrayList<Object>();
			assertThat(actual, 
					anyOf(
							instanceOf(ArrayList.class),
							instanceOf(String.class),
							instanceOf(StringBuilder.class)
						)
					);		// 全ての条件がOKなら成功
		}
		
		{
			String actual = "a";
			assertThat(actual, anything());		// なんでもよい
		}
		
		{
			String actual = "a";
			assertThat(actual, equalTo("a"));		// 同じ値であればOK
													// is()と同じ。内部的にもis()はequalto()を呼び出している。
		}
	}
}
