package practice.junit.annotation;

import static org.junit.Assert.*;

import org.junit.Test;

public class ClassRule_TestSampleA {

	@Test
	public void test() {
		System.out.println(Thread.currentThread().getStackTrace()[1].getClassName() +
				" : " + Thread.currentThread().getStackTrace()[1].getMethodName());
	}

}
