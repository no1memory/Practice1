package practice.practice1.hanoi.useFactory;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import practice.practice1.hanoi.Solver;
import practice.practice1.hanoi.Tower;

public class SolverImplTest {
	private Solver solver = null;

	@Before
	public void prepare() {
		solver = SolverFactory.getInstance();
	}

	@Test
	public void testSolve1() {
		Tower a =  new Tower("A", 1);
		Tower b =  new Tower("B");
		Tower c =  new Tower("C");
		
	
		List<String> result = solver.solve(a, b, c, 1, new ArrayList<String>());
		assertEquals(1, result.size());
		assertEquals("A　から B へ円盤 1 を移動", result.get(0));
		assertTrue(a.isEmpty());
		assertFalse(b.isEmpty());
		assertTrue(c.isEmpty());
		assertArrayEquals(new Integer[] {1}, b.toArray());
	}

	@Test
	public void testSolve2() {
		Tower a =  new Tower("A", 2);
		Tower b =  new Tower("B");
		Tower c =  new Tower("C");
		
		List<String> result = solver.solve(a, b, c, 2, new ArrayList<String>());
		assertEquals(3, result.size());
		assertEquals("A　から C へ円盤 1 を移動", result.get(0));
		assertEquals("A　から B へ円盤 2 を移動", result.get(1));
		assertEquals("C　から B へ円盤 1 を移動", result.get(2));
		assertTrue(a.isEmpty());
		assertFalse(b.isEmpty());
		assertTrue(c.isEmpty());
		assertArrayEquals(new Integer[] {1,2}, b.toArray());
	}

	@Test
	public void testSolve3() {
		Tower a =  new Tower("A", 3);
		Tower b =  new Tower("B");
		Tower c =  new Tower("C");
		
		List<String> result = solver.solve(a, b, c, 3, new ArrayList<String>());
		assertEquals(7, result.size());
		assertEquals("A　から B へ円盤 1 を移動", result.get(0));
		assertEquals("A　から C へ円盤 2 を移動", result.get(1));
		assertEquals("B　から C へ円盤 1 を移動", result.get(2));
		assertEquals("A　から B へ円盤 3 を移動", result.get(3));
		assertEquals("C　から A へ円盤 1 を移動", result.get(4));
		assertEquals("C　から B へ円盤 2 を移動", result.get(5));
		assertEquals("A　から B へ円盤 1 を移動", result.get(6));
		assertTrue(a.isEmpty());
		assertFalse(b.isEmpty());
		assertTrue(c.isEmpty());
		assertArrayEquals(new Integer[] {1,2,3}, b.toArray());
	}

	@Test
	public void testSolve4() {
		
		Tower a = new Tower("A", 4);
		Tower b = new Tower("B");
		Tower c = new Tower("C");
		
		List<String> result = new ArrayList<String>();
		result = solver.solve(a, b, c, 4, result);
		
		assertEquals("A　から C へ円盤 1 を移動", result.get(0));
		assertEquals("A　から B へ円盤 2 を移動", result.get(1));
		assertEquals("C　から B へ円盤 1 を移動", result.get(2));
		assertEquals("A　から C へ円盤 3 を移動", result.get(3));
		assertEquals("B　から A へ円盤 1 を移動", result.get(4));
		assertEquals("B　から C へ円盤 2 を移動", result.get(5));
		assertEquals("A　から C へ円盤 1 を移動", result.get(6));
		assertEquals("A　から B へ円盤 4 を移動", result.get(7));
		assertEquals("C　から B へ円盤 1 を移動", result.get(8));
		assertEquals("C　から A へ円盤 2 を移動", result.get(9));
		assertEquals("B　から A へ円盤 1 を移動", result.get(10));
		assertEquals("C　から B へ円盤 3 を移動", result.get(11));
		assertEquals("A　から C へ円盤 1 を移動", result.get(12));
		assertEquals("A　から B へ円盤 2 を移動", result.get(13));
		assertEquals("C　から B へ円盤 1 を移動", result.get(14));
		
		assertTrue(a.isEmpty());
		assertFalse(b.isEmpty());
		assertTrue(c.isEmpty());
		assertArrayEquals(new Integer[] {1,2,3,4}, b.toArray());
	}

	@Test
	public void testSolve5() {
		int n = 5;
		int ans = (int) (Math.pow(2, n) - 1);
		Tower a =  new Tower("A",n);
		Tower b =  new Tower("B");
		Tower c =  new Tower("C");
		
		List<String> result = solver.solve(a, b, c, 5, new ArrayList<String>());
		assertEquals(ans, result.size());
		assertEquals("A　から B へ円盤 1 を移動", result.get(0));
	}
	
	//空の塔から円盤を取り出そうとした
	@Test @Ignore("エラーが起こるテスト")
	public void testpopSolve() {
		Tower a =  new Tower("A");
		Tower b =  new Tower("B");
		Tower c =  new Tower("C");
		
		List<String> result = solver.solve(a, b, c, 1, new ArrayList<String>());
		assertEquals(1, result.size());
		assertEquals("A　から B へ円盤 1 を移動", result.get(0));
	}

	/**
	 * {@link practice.practice1.hanoi.no1memory.SolverImpl#solve(practice.practice1.hanoi.Tower, practice.practice1.hanoi.Tower, practice.practice1.hanoi.Tower, int, java.util.List)} のためのテスト・メソッド。
	 * 円盤の数=3、height=3の場合（全ての円盤を移動）
	 */
	@Test
	public void testSolve135() {
		Tower a =  new Tower("A", new Integer[]{1,3,5});
		Tower b =  new Tower("B");
		Tower c =  new Tower("C");
		
		List<String> result = solver.solve(a, b, c, 3, new ArrayList<String>());
		assertEquals(7, result.size());
		assertEquals("A　から B へ円盤 1 を移動", result.get(0));
		assertEquals("A　から C へ円盤 3 を移動", result.get(1));
		assertEquals("B　から C へ円盤 1 を移動", result.get(2));
		assertEquals("A　から B へ円盤 5 を移動", result.get(3));
		assertEquals("C　から A へ円盤 1 を移動", result.get(4));
		assertEquals("C　から B へ円盤 3 を移動", result.get(5));
		assertEquals("A　から B へ円盤 1 を移動", result.get(6));
	}

	/**
	 * {@link practice.practice1.hanoi.no1memory.SolverImpl#solve(practice.practice1.hanoi.Tower, practice.practice1.hanoi.Tower, practice.practice1.hanoi.Tower, int, java.util.List)} のためのテスト・メソッド。
	 * 円盤の数=3、height=2の場合（一部の円盤を移動）
	 */
	@Test
	public void testSolve135_2() {
		Tower a =  new Tower("A", new Integer[]{1,3,5});
		Tower b =  new Tower("B");
		Tower c =  new Tower("C");
		
		List<String> result = solver.solve(a, b, c, 2, new ArrayList<String>());
		assertEquals(3, result.size());
		assertEquals("A　から C へ円盤 1 を移動", result.get(0));
		assertEquals("A　から B へ円盤 3 を移動", result.get(1));
		assertEquals("C　から B へ円盤 1 を移動", result.get(2));
	}
	
	/**
	 * {@link practice.practice1.hanoi.no1memory.SolverImpl#solve(practice.practice1.hanoi.Tower, practice.practice1.hanoi.Tower, practice.practice1.hanoi.Tower, int, java.util.List)} のためのテスト・メソッド。
	 * 円盤の数=3、height=0の場合（移動しない）
	 */
	@Test
	public void testSolve135_0() {
		Tower a =  new Tower("A", new Integer[]{1,3,5});
		Tower b =  new Tower("B");
		Tower c =  new Tower("C");
		
		List<String> result = solver.solve(a, b, c, 0, new ArrayList<String>());
		assertEquals(0, result.size());
	}
}
