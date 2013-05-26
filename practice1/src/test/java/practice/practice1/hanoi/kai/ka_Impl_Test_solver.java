package practice.practice1.hanoi.kai;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import practice.practice1.hanoi.Solver;
import practice.practice1.hanoi.Tower;

public class ka_Impl_Test_solver{

	//空の塔から円盤を取り出そうとした
	@Test
	public void testpopSolve() {
		Tower a =  new Tower("A");
		Tower b =  new Tower("B");
		Tower c =  new Tower("C");
		
		Solver solver = new ka_Impl_solver();
		List<String> result = solver.solve(a, b, c, 1, new ArrayList<String>());
		assertEquals(1, result.size());
		assertEquals("A　から B へ円盤 1 を移動", result.get(0));
	}
	
	@Test
	public void testSolve() {
		int n = 5;
		int ans = (int) (Math.pow(2, n) - 1);
		Tower a =  new Tower("A",n);
		Tower b =  new Tower("B");
		Tower c =  new Tower("C");
		
		Solver solver = new ka_Impl_solver();
		List<String> result = solver.solve(a, b, c, 5, new ArrayList<String>());
		assertEquals(ans, result.size());
		assertEquals("A　から B へ円盤 1 を移動", result.get(0));
	}
	
	

}
