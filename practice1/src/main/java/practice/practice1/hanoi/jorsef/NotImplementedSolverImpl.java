/**
 * 
 */
package practice.practice1.hanoi.jorsef;

import java.util.List;

import practice.practice1.hanoi.Solver;
import practice.practice1.hanoi.Tower;

/**
 * @author yokoyama
 *
 */
public class NotImplementedSolverImpl implements Solver {

	/* (非 Javadoc)
	 * これは正しく実装されていません。
	 * @see practice.practice1.hanoi.Solver#solve(practice.practice1.hanoi.Tower, practice.practice1.hanoi.Tower, practice.practice1.hanoi.Tower, int, java.util.List)
	 */
	@Override
	public List<String> solve(Tower from, Tower to, Tower work, int height,
			List<String> result) {
		Integer val = from.pop();
		to.push(val);
		result.add(String.format("%1$s　から %2$s へ円盤 %3$d を移動", from.getName(), to.getName(), val));
		return result;
	}
}
