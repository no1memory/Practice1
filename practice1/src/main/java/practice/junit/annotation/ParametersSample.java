package practice.junit.annotation;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParametersSample {

	private int _x = 0;
	private int _y = 0;
	private int _z = 0;
	
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

	
	// コンストラクタを作成する。
	// パラメータを指定するとコンストラクタの引数として渡される。
	public ParametersSample(int x, int y, int z) {
		System.out.println("こんすとらくた");
		
		_x = x;
		_y = y + 20;
		_z += z;
	}

	//コンストラクタは１つだけ
//	// コンストラクタを作成する。
//	// パラメータを指定するとコンストラクタの引数として渡される。
//	public ParametersSample(long x, long y, long z, String w) {
//		System.out.println("こんすとらくた 2");
//		
//		_x = (int)x;
//		_y = (int)y + 20;
//		_z += z;
//	}
	
	// パラメータを指定する
	// staticでないといけない。
	//　戻り値はコレクション型でないといけない。
	@Parameters
	public static ArrayList<Integer[]> parameter() {
		ArrayList<Integer[]> list = new ArrayList<Integer[]>();
		list.add(new Integer[]{1, 2, 3});
		list.add(new Integer[]{10, 11, 12});
		list.add(new Integer[]{-1, -2, -3});
		return list;
	}
	
	@Test
	public void test() {
		System.out.println("start");
		
		System.out.println("_x : " + _x);
		System.out.println("_y : " + _y);
		System.out.println("_z : " + _z);
		
		System.out.println("end");
		System.out.println();
	}
	@Test
	public void test2() {
		System.out.println("start 2");
		
		System.out.println("_x : " + _x);
		System.out.println("_y : " + _y);
		System.out.println("_z : " + _z);
		
		System.out.println("end 2");
		System.out.println();
	}
/*
 *  実行結果は以下。
 *  _yの値から、コンストラクタで値を操作するのは有効。
 *  _zの値から、前回の結果は次回に引き継げない。

	start
	_x : 1
	_y : 22
	_z : 3
	end

	start
	_x : 10
	_y : 31
	_z : 12
	end

	start
	_x : -1
	_y : 18
	_z : -3
	end
	
	メソッド自体はパラメータを受け取らず、コンストラクタで受け取っている。
	このため、同クラス内で別のテストメソッドを追加しようとした場合に、
	コンストラクタを変更する必要がある。
	詳しくは未調査だが、TestNGというテスティングフレームワークがあり、
	そちらの方であれば、メソッド単位に引数が渡せるらしい。。。
	
	[参考]
	JUnitより簡単なオープンソースの「TestNG」とは？ 
	http://www.atmarkit.co.jp/ait/articles/0809/11/news151.html
*/
}
