package practice.practice1.hanoi.no1memory;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import practice.practice1.hanoi.Solver;
import practice.practice1.hanoi.Tower;
import practice.practice1.hanoi.no1memory.SolverImpl;

/**
 * @author araki
 *
 */
public class SolverImplTest {

	/**
	 * {@link practice.practice1.hanoi.no1memory.SolverImpl#solve(practice.practice1.hanoi.Tower, practice.practice1.hanoi.Tower, practice.practice1.hanoi.Tower, int, java.util.List)} のためのテスト・メソッド。
	 * 円盤の数=1、height=1の場合（全ての円盤を移動）
	 */
	@Test
	public void testSolve1() {
		Tower a =  new Tower("A", 1);
		Tower b =  new Tower("B");
		Tower c =  new Tower("C");
		
		Solver solver = new SolverImpl();
	
		List<String> result = solver.solve(a, b, c, 1, new ArrayList<String>());
		assertEquals(1, result.size());
		assertEquals("A　から B へ円盤 1 を移動", result.get(0));
	}

	/**
	 * {@link practice.practice1.hanoi.no1memory.SolverImpl#solve(practice.practice1.hanoi.Tower, practice.practice1.hanoi.Tower, practice.practice1.hanoi.Tower, int, java.util.List)} のためのテスト・メソッド。
	 * 円盤の数=3、height=3の場合（全ての円盤を移動）
	 */
	@Test
	public void testSolve2() {
		Tower a =  new Tower("A", new Integer[]{1,3,5});
		Tower b =  new Tower("B");
		Tower c =  new Tower("C");
		
		Solver solver = new SolverImpl();
	
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
	public void testSolve3() {
		Tower a =  new Tower("A", new Integer[]{1,3,5});
		Tower b =  new Tower("B");
		Tower c =  new Tower("C");
		
		Solver solver = new SolverImpl();
	
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
	public void testSolve4() {
		Tower a =  new Tower("A", new Integer[]{1,3,5});
		Tower b =  new Tower("B");
		Tower c =  new Tower("C");
		
		Solver solver = new SolverImpl();
	
		List<String> result = solver.solve(a, b, c, 0, new ArrayList<String>());
		assertEquals(0, result.size());
	}
	
	/**
	 * {@link practice.practice1.hanoi.no1memory.SolverImpl#solve(practice.practice1.hanoi.Tower, practice.practice1.hanoi.Tower, practice.practice1.hanoi.Tower, int, java.util.List)} のためのテスト・メソッド。
	 * 円盤の数=0、height=1の場合（移動対象の円盤がない）
	 */
	@Test
	public void testSolve5() {
		Tower a =  new Tower("A");
		Tower b =  new Tower("B");
		Tower c =  new Tower("C");
		
		Solver solver = new SolverImpl();
	
		List<String> result = solver.solve(a, b, c, 1, new ArrayList<String>());
		assertEquals(0, result.size());
	}
}
