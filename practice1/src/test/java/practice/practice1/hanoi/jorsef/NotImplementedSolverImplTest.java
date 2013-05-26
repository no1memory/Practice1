package practice.practice1.hanoi.jorsef;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import practice.practice1.hanoi.Solver;
import practice.practice1.hanoi.Tower;

/**
 * @author araki
 *
 */
public class NotImplementedSolverImplTest {

	@Test
	public void testSolve() {
		Tower a =  new Tower("A", 1);
		Tower b =  new Tower("B");
		Tower c =  new Tower("C");
		
		Solver solver = new NotImplementedSolverImpl();
	
		List<String> result = solver.solve(a, b, c, 1, new ArrayList<String>());
		assertEquals(1, result.size());
		assertEquals("A�@���� B �։~�� 1 ���ړ�", result.get(0));
	}

	@Test
	public void testSolve2() {
		Tower a =  new Tower("A", new Integer[]{1,2});
		Tower b =  new Tower("B");
		Tower c =  new Tower("C");
		
		Solver solver = new NotImplementedSolverImpl();
	
		List<String> result = solver.solve(a, b, c, 2, new ArrayList<String>());
		//2�̉~�Ղ��ړ�����ہAwork�𗘗p���A�Œ�ł�3��̈ړ����K�v
		//�i1��:from �� work�A2��:from��to�A3��:work��to�j
		assertTrue(3 <= result.size());		
	}	
	
	
}
