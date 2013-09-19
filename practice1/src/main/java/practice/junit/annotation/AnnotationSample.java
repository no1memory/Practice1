package practice.junit.annotation;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.ClassRule;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;


public class AnnotationSample {

	/*
	 * Junit4.10　で利用可能なアノテーション
	 */
	//****************************************************************
	// @After		各テストメソッド(@Test)の直後に実行。JUnit3 の tearDown() に相当。
	// @AfterClass	テストクラスの実行後に実行。一度だけ。
	// @Before		各テストメソッド(@Test)の直前に実行。JUnit3 の setup() に相当。
	// @BeforeClass	テストクラスの実行前に実行。一度だけ。
	//
	// @ClassRule	テストクラス全体に適用するルールの作成
	// @Rule		各テストメソッド(@Test)に対するルールの作成
	// @Ignore		該当のテストメソッドをスキップする。
	// @Test		テストメソッド用のアノテーション
	// @Parameters	テストメソッド(正確にはメソッドを有するクラスのコンストラクタ)にパラメータを渡す
	// @RunWith		テストの実行方法を指定。
	//****************************************************************

	/*
	 * 呼び出し順序
	 */
	// @BeforeClass
	//		↓
	// {
	//		@Before
	//			↓
	//		@Test
	//			↓
	//		@After
	// }
	//		↓
	// @AfterClass

	/*
	 * 実行ログ
	 */
	// BeforeClass
	// Before
	// testA
	// After
	// Before
	// testC
	// After
	// AfterClass
	
	@BeforeClass
	public static void BeforeClass() throws Exception {
		System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@AfterClass
	public static void AfterClass() throws Exception {
		System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Before
	public void Before() throws Exception {
		System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@After
	public void After() throws Exception {
		System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	
	
	//private int _timeout = 200;
	private int _timeout = 100;
	
	@ClassRule	// クラス全体のテスト実行時間のタイムアウトを指定。この例では、全テストがトータル400ms以上かかると失敗となる。
	public static Timeout class_timeout = new Timeout(400);

	@Rule	// 各メソッドのテスト実行時間のタイムアウトを指定。この例では、あるメソッドのテストが300ms以上かかると失敗となる。
	public static Timeout method_timeout = new Timeout(300);
	
	
	@Test
	public void testA() throws Exception {
		Thread.sleep(_timeout);
		System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	@Ignore	// テストケースから除外される。ケースとして認識されるが実行はされない。
	@Test
	public void testB() {
		System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
	@Test
	public void testC() throws Exception {
		Thread.sleep(_timeout);
		System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
}
