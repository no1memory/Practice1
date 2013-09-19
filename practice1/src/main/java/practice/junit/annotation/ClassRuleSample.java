package practice.junit.annotation;

import org.junit.ClassRule;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

// ClassRule_TestSampleA と ClassRule_TestSampleB を実行するテストクラス

@RunWith(Suite.class)
@SuiteClasses({ClassRule_TestSampleA.class,	ClassRule_TestSampleB.class})	// 実行するテストクラスを指定
public class ClassRuleSample {

}
