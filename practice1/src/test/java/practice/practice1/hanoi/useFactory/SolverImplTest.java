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
	private List<Solver> solvers = null;

	@Before
	public void prepare() {
		solvers = SolverFactory.getInstance();
	}

	@Test
	public void testSolve1() {
		for (Solver solver : solvers) {
			Tower a =  new Tower("A", 1);
			Tower b =  new Tower("B");
			Tower c =  new Tower("C");

			List<String> result = solver.solve(a, b, c, 1, new ArrayList<String>());
			assertEquals(solver.getClass().getName(), 1, result.size());
			assertEquals(solver.getClass().getName(), "A　から B へ円盤 1 を移動", result.get(0));
			assertTrue(solver.getClass().getName(), a.isEmpty());
			assertFalse(solver.getClass().getName(), b.isEmpty());
			assertTrue(solver.getClass().getName(), c.isEmpty());
			assertArrayEquals(solver.getClass().getName(), new Integer[] {1}, b.toArray());
		}
	}

	@Test
	public void testSolve2() {

		for (Solver solver : solvers) {
			Tower a =  new Tower("A", 2);
			Tower b =  new Tower("B");
			Tower c =  new Tower("C");

			List<String> result = solver.solve(a, b, c, 2, new ArrayList<String>());
			assertEquals(solver.getClass().getName(), 3, result.size());
			assertEquals(solver.getClass().getName(), "A　から C へ円盤 1 を移動", result.get(0));
			assertEquals(solver.getClass().getName(), "A　から B へ円盤 2 を移動", result.get(1));
			assertEquals(solver.getClass().getName(), "C　から B へ円盤 1 を移動", result.get(2));
			assertTrue(solver.getClass().getName(), a.isEmpty());
			assertFalse(solver.getClass().getName(), b.isEmpty());
			assertTrue(solver.getClass().getName(), c.isEmpty());
			assertArrayEquals(solver.getClass().getName(), new Integer[] {1,2}, b.toArray());
		}
	}

	@Test
	public void testSolve3() {
		for (Solver solver : solvers) {
			Tower a =  new Tower("A", 3);
			Tower b =  new Tower("B");
			Tower c =  new Tower("C");

			List<String> result = solver.solve(a, b, c, 3, new ArrayList<String>());
			assertEquals(solver.getClass().getName(), 7, result.size());
			assertEquals(solver.getClass().getName(), "A　から B へ円盤 1 を移動", result.get(0));
			assertEquals(solver.getClass().getName(), "A　から C へ円盤 2 を移動", result.get(1));
			assertEquals(solver.getClass().getName(), "B　から C へ円盤 1 を移動", result.get(2));
			assertEquals(solver.getClass().getName(), "A　から B へ円盤 3 を移動", result.get(3));
			assertEquals(solver.getClass().getName(), "C　から A へ円盤 1 を移動", result.get(4));
			assertEquals(solver.getClass().getName(), "C　から B へ円盤 2 を移動", result.get(5));
			assertEquals(solver.getClass().getName(), "A　から B へ円盤 1 を移動", result.get(6));
			assertTrue(solver.getClass().getName(), a.isEmpty());
			assertFalse(solver.getClass().getName(), b.isEmpty());
			assertTrue(solver.getClass().getName(), c.isEmpty());
			assertArrayEquals(solver.getClass().getName(), new Integer[] {1,2,3}, b.toArray());
		}
	}

	@Test
	public void testSolve4() {

		for (Solver solver : solvers) {
			Tower a = new Tower("A", 4);
			Tower b = new Tower("B");
			Tower c = new Tower("C");

			List<String> result = new ArrayList<String>();
			result = solver.solve(a, b, c, 4, result);

			assertEquals(solver.getClass().getName(), "A　から C へ円盤 1 を移動", result.get(0));
			assertEquals(solver.getClass().getName(), "A　から B へ円盤 2 を移動", result.get(1));
			assertEquals(solver.getClass().getName(), "C　から B へ円盤 1 を移動", result.get(2));
			assertEquals(solver.getClass().getName(), "A　から C へ円盤 3 を移動", result.get(3));
			assertEquals(solver.getClass().getName(), "B　から A へ円盤 1 を移動", result.get(4));
			assertEquals(solver.getClass().getName(), "B　から C へ円盤 2 を移動", result.get(5));
			assertEquals(solver.getClass().getName(), "A　から C へ円盤 1 を移動", result.get(6));
			assertEquals(solver.getClass().getName(), "A　から B へ円盤 4 を移動", result.get(7));
			assertEquals(solver.getClass().getName(), "C　から B へ円盤 1 を移動", result.get(8));
			assertEquals(solver.getClass().getName(), "C　から A へ円盤 2 を移動", result.get(9));
			assertEquals(solver.getClass().getName(), "B　から A へ円盤 1 を移動", result.get(10));
			assertEquals(solver.getClass().getName(), "C　から B へ円盤 3 を移動", result.get(11));
			assertEquals(solver.getClass().getName(), "A　から C へ円盤 1 を移動", result.get(12));
			assertEquals(solver.getClass().getName(), "A　から B へ円盤 2 を移動", result.get(13));
			assertEquals(solver.getClass().getName(), "C　から B へ円盤 1 を移動", result.get(14));

			assertTrue(a.isEmpty());
			assertFalse(b.isEmpty());
			assertTrue(c.isEmpty());
			assertArrayEquals(new Integer[] {1,2,3,4}, b.toArray());
		}
	}


	@Test
	public void testSolve5() {

		for (Solver solver : solvers) {

			int n = 5;
			int ans = (int) (Math.pow(2, n) - 1);
			Tower a =  new Tower("A",n);
			Tower b =  new Tower("B");
			Tower c =  new Tower("C");

			List<String> result = solver.solve(a, b, c, 5, new ArrayList<String>());
			assertEquals(solver.getClass().getName(), ans, result.size());
			assertEquals(solver.getClass().getName(), "A　から B へ円盤 1 を移動", result.get(0));
		}
	}

	//空の塔から円盤を取り出そうとした
	@Test @Ignore("エラーが起こるテスト")
	public void testpopSolve() {
		for (Solver solver : solvers) {
			Tower a =  new Tower("A");
			Tower b =  new Tower("B");
			Tower c =  new Tower("C");

			List<String> result = solver.solve(a, b, c, 1, new ArrayList<String>());
			assertEquals(solver.getClass().getName(), 1, result.size());
			assertEquals(solver.getClass().getName(), "A　から B へ円盤 1 を移動", result.get(0));
		}
	}
	/**
	 * {@link practice.practice1.hanoi.no1memory.SolverImpl#solve(practice.practice1.hanoi.Tower, practice.practice1.hanoi.Tower, practice.practice1.hanoi.Tower, int, java.util.List)} のためのテスト・メソッド。
	 * 円盤の数=3、height=3の場合（全ての円盤を移動）
	 */
	@Test
	public void testSolve135() {
		for (Solver solver : solvers) {
			Tower a =  new Tower("A", new Integer[]{1,3,5});
			Tower b =  new Tower("B");
			Tower c =  new Tower("C");

			List<String> result = solver.solve(a, b, c, 3, new ArrayList<String>());
			assertEquals(solver.getClass().getName(), 7, result.size());
			assertEquals(solver.getClass().getName(), "A　から B へ円盤 1 を移動", result.get(0));
			assertEquals(solver.getClass().getName(), "A　から C へ円盤 3 を移動", result.get(1));
			assertEquals(solver.getClass().getName(), "B　から C へ円盤 1 を移動", result.get(2));
			assertEquals(solver.getClass().getName(), "A　から B へ円盤 5 を移動", result.get(3));
			assertEquals(solver.getClass().getName(), "C　から A へ円盤 1 を移動", result.get(4));
			assertEquals(solver.getClass().getName(), "C　から B へ円盤 3 を移動", result.get(5));
			assertEquals(solver.getClass().getName(), "A　から B へ円盤 1 を移動", result.get(6));
		}
	}

	/**
	 * {@link practice.practice1.hanoi.no1memory.SolverImpl#solve(practice.practice1.hanoi.Tower, practice.practice1.hanoi.Tower, practice.practice1.hanoi.Tower, int, java.util.List)} のためのテスト・メソッド。
	 * 円盤の数=3、height=2の場合（一部の円盤を移動）
	 */
	@Test
	public void testSolve135_2() {
		for (Solver solver : solvers) {
			Tower a =  new Tower("A", new Integer[]{1,3,5});
			Tower b =  new Tower("B");
			Tower c =  new Tower("C");

			List<String> result = solver.solve(a, b, c, 2, new ArrayList<String>());
			assertEquals(solver.getClass().getName(), 3, result.size());
			assertEquals(solver.getClass().getName(), "A　から C へ円盤 1 を移動", result.get(0));
			assertEquals(solver.getClass().getName(), "A　から B へ円盤 3 を移動", result.get(1));
			assertEquals(solver.getClass().getName(), "C　から B へ円盤 1 を移動", result.get(2));
		}
	}
	/**
	 * {@link practice.practice1.hanoi.no1memory.SolverImpl#solve(practice.practice1.hanoi.Tower, practice.practice1.hanoi.Tower, practice.practice1.hanoi.Tower, int, java.util.List)} のためのテスト・メソッド。
	 * 円盤の数=3、height=0の場合（移動しない）
	 */
	@Test
	public void testSolve135_0() {
		for (Solver solver : solvers){
			Tower a =  new Tower("A", new Integer[]{1,3,5});
			Tower b =  new Tower("B");
			Tower c =  new Tower("C");

			List<String> result = solver.solve(a, b, c, 0, new ArrayList<String>());
			assertEquals(solver.getClass().getName(), 0, result.size());
		}
	}
}
