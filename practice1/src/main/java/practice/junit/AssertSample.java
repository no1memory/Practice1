package practice.junit;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class AssertSample {

	@Test
	public void test_assertTrue() {

		// 条件がTRUEになれば成功
		assertTrue("a".equals("a"));

		//assertTrue("障害トレースにメッセージを出力できるよ", "a".equals("b"));
	}

	@Test
	public void test_assertFalse() {

		// 条件がFALSEになれば成功
		assertFalse("a".equals("b"));

		//assertFalse("障害トレースにメッセージを出力できるよ", "a".equals("a"));
	}

	@Test
	public void test_fail() {
		
		//fail("必ず失敗する。");
	}

	@Test
	public void test_assertEquals() {
		
		assertEquals("a", "a");	// 内部的にObject.equals()で判定している

		// Double.compare()で比較している。
		// ただし、浮動小数の場合、計算により誤差が生じることを考慮してい
		// delta(第三引数)が存在している(と思われる。)
		// 第一、第二引数の差(絶対値)が第三引数より小さければ成功としている。
		// 以下、内部処理
		//
		//	if (Double.compare(expected, actual) == 0)
		//		return;
		//	if (!(Math.abs(expected-actual) <= delta))
		//		failNotEquals(message, new Double(expected), new Double(actual));
		//
		assertEquals(0.111, 0.11, 0.01);		// これは成功
		
		//assertEquals(0.111, 0.11, 0.001);		// これは失敗
	}

	@Test
	public void test_assertArrayEquals() {
		
		{
			// 配列の中身を確認
			// 内部ではObject型で比較しているので数値でもOK
			
			String[] expected = {"a", "b", "c"};
			String[] actual = {"a", "b", "c"};
			assertArrayEquals(expected, actual);
		}
		
		{
			// 二次元配列でもOK
			
			String[][] expected = {
					{"a", "b", "c"},
					{"d", "e", "f"},
					{"h", "i", "j"},
			};
			String[][] actual = {
					{"a", "b", "c"},
					{"d", "e", "f"},
					{"h", "i", "j"},
			};
			assertArrayEquals(expected, actual);
		}
		
		{
			// ArrayListの場合はtoArray()で配列を取り出して比較。
			
			ArrayList<String> expected = new ArrayList<String>();
			expected.add("a");
			expected.add("b");
			expected.add("c");
			ArrayList<String> actual = new ArrayList<String>();
			actual.add("a");
			actual.add("b");
			actual.add("c");
			assertArrayEquals(expected.toArray(), actual.toArray());
		}
	}
	@Test
	public void test_assertNotNull() {
		
		Object obj;
		obj = "a";
		assertNotNull(obj);		// これは成功

		//obj = null;
		//assertNotNull("障害トレースにメッセージを出力できるよ", obj);		// これは失敗
	}
	
	@Test
	public void test_assertNull() {

		Object obj;
		//obj = "a";
		//assertNull(obj);		// これは失敗

		obj = null;
		assertNull("障害トレースにメッセージを出力できるよ", obj);		// これは成功
	}
	
	@Test
	public void test_assertSame() {
		
		{
			StringBuilder expected = new StringBuilder("abc");
			StringBuilder actual = expected;
			assertSame(expected, actual);
		}
		
//		{
//			StringBuilder expected = new StringBuilder("abc");
//			StringBuilder actual = new StringBuilder("abc");
//			assertSame(expected, actual);	// これは失敗
//		}
	}
	
	@Test
	public void test_assertNotSame() {
		
		{
			//StringBuilder expected = new StringBuilder("abc");
			//StringBuilder actual = expected;
			//assertNotSame(expected, actual);		// これは失敗
		}
		
		{
			StringBuilder expected = new StringBuilder("abc");
			StringBuilder actual = new StringBuilder("abc");
			assertNotSame(expected, actual);
		}
	}
}
