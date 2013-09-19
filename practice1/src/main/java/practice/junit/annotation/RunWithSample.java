package practice.junit.annotation;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;

public class RunWithSample {

	// テストの実行方法を指定する
	// テストクラスに何も指定しない場合はデフォルト(@RunWith(BlockJUnit4ClassRunner.class))が
	// 指定されている。
	// 標準的なRunnerのようで、JUnit4ClassRunnerと同じ振る舞いをするらしい。

	// 何も指定しないので　@RunWith(BlockJUnit4ClassRunner.class)
	public class RunwithSampleA {
		
	}

	// RunWith には JUnit4 のクラスを指定することが推奨されている模様。
	// 例えば。。。
	//   Suite : @SuiteClassesで指定したクラスに対してテストを実施する。(ClassRuleSample参照)
	//   Parameterized : @Parametersの使用が可能になる。(ParametersSample参照)
	//   Categories : 
	//   Enclosed : 
	//   Theories : 

	public class RunwithSampleB {
		
	}

	public class RunwithSampleC {
		
	}

}
