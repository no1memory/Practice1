package practice.practice1.hanoi.yujim78;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import practice.practice1.hanoi.Solver;
import practice.practice1.hanoi.Tower;

public class SolverImplTest {

	@Test
	public void testSolver1() {
		
		Tower a = new Tower("A", 1);
		Tower b = new Tower("B");
		Tower c = new Tower("C");
		
		Solver slv = new SolverImpl();
		
		List<String> result = new ArrayList<String>();
		result = slv.solve(a, b, c, 1, result);
		assertEquals("A　から B へ円盤 1 を移動", result.get(0));
	}

	@Test
	public void testSolver2() {
		
		Tower a = new Tower("A", 2);
		Tower b = new Tower("B");
		Tower c = new Tower("C");
		
		Solver slv = new SolverImpl();
		
		List<String> result = new ArrayList<String>();
		result = slv.solve(a, b, c, 2, result);
		
		assertEquals("A　から C へ円盤 1 を移動", result.get(0));
		assertEquals("A　から B へ円盤 2 を移動", result.get(1));
		assertEquals("C　から B へ円盤 1 を移動", result.get(2));
	}

	@Test
	public void testSolver3() {
		
		Tower a = new Tower("A", 3);
		Tower b = new Tower("B");
		Tower c = new Tower("C");
		
		Solver slv = new SolverImpl();
		
		List<String> result = new ArrayList<String>();
		result = slv.solve(a, b, c, 3, result);
		
		
		assertEquals("A　から B へ円盤 1 を移動", result.get(0));
		assertEquals("A　から C へ円盤 2 を移動", result.get(1));
		assertEquals("B　から C へ円盤 1 を移動", result.get(2));
		assertEquals("A　から B へ円盤 3 を移動", result.get(3));
		assertEquals("C　から A へ円盤 1 を移動", result.get(4));
		assertEquals("C　から B へ円盤 2 を移動", result.get(5));
		assertEquals("A　から B へ円盤 1 を移動", result.get(6));
	}

	@Test
	public void testSolver4() {
		
		Tower a = new Tower("A", 4);
		Tower b = new Tower("B");
		Tower c = new Tower("C");
		
		Solver slv = new SolverImpl();
		
		List<String> result = new ArrayList<String>();
		result = slv.solve(a, b, c, 4, result);
		
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
		
	}

}
