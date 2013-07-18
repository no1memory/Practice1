package assertsample;

import org.hamcrest.Matcher;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.*;

import java.awt.List;
import java.util.NoSuchElementException;
import java.util.concurrent.ThreadFactory;

import org.junit.Ignore;
import org.omg.CORBA.Object;

public class ProductTest {
	/*
	 * 同じかどうかを比較する関数
	 * assertThat(actual, expected );
	 * 左辺は、なんでも入れれるが、右辺がMatcher系列のオブジェクトを使用する必要がある。
	*/
	
	@Test
	public void plus整数値比較(){
		int a=0;
		int b=1;
		Product p = new Product();
		int actual = p.plus(a, b);
		//プリミティブ型の比較可能
		assertThat(actual, is( (a + b) ));
		//notで条件反転もできる
		assertThat(actual, is(not(a)));
	}
	
	@Test
	public void ToString文字列比較() {
		int a = 0;
		Product p = new Product();
		String actual = p.ToString(a);
		
		//同値比較
		assertThat(actual, is("0"));
		//期待値にnull入れるときはnullvalueを使う必要有り　CoreMatchsクラスのせいか？
		assertThat(null, is(nullValue()));
		//null以外の判定らしい
		assertThat(actual, is(notNullValue()));
	}
	
	@Test
	public void equalブーリアン比較() {
		int a=0;
		int b = 0;
		Product p = new Product();
		boolean actual =  p.equal(a, b);
		
		//特になし
		assertThat(actual, is(true));
	}
	
	@Test
	public void getInstanceOfInputインスタンスの所属クラスで比較(){
		String actual = "";
		Product p = new Product();
		Product q = new Product(10);
		
		//オブジェクトの同一性チェック
		assertThat(actual, is(sameInstance( "" ) ) );
		//完全一致でないとダメらしい
		assertThat(actual, is( not(sameInstance("a")) ) );
		//フィールドの値まで含めて完全一致でないとダメらしい
		assertThat(new Product(100), is( not( new Product(10) ) ) );
		
		//実測値が期待値のインスタンスと互換性があるかを調べる。継承したインターフェースなどと
		assertThat(p, instanceOf(インターフェース.class));
		//例外クラスも取れる
        try {
        	throw new NullPointerException("");
            //fail("NullPointerException is expected");
	    } catch (Exception e) {
	            // assertTrue(e instanceof NullPointerException);
	            assertThat(e, instanceOf(NullPointerException.class));
	    }
        
	}
	
	/*
	 * この程度の比較だけでは使い勝手が悪いですが、
	 * org.hamcrest.BaseMatcher<T>を継承した自作クラスを
	 * 作成することで、assertThatの第二引数の比較オブジェクトを改造できます
	 * ※比較メソッドmatchesをoverrideすることで
	 * また、エラー時の出力もdescribeTOをoverrideすることで変更することができる
	 *
	 * 自作するより、有志が作っているライブラリを持ってくるのが早いと思うので
	 * ここではこれ以上触れません。
	*/

	
}
