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
public class SolverImpl implements Solver {

	/* (îÒ Javadoc)
	 * @see practice.practice1.hanoi.Solver#solve(practice.practice1.hanoi.Tower, practice.practice1.hanoi.Tower, practice.practice1.hanoi.Tower, int, java.util.List)
	 */
	@Override
	public List<String> solve(Tower from, Tower to, Tower work, int height,
			List<String> result) {
		if (height == 1) {
			Integer val = from.pop();
			to.push(val);
			result.add(String.format("%1$sÅ@Ç©ÇÁ %2$s Ç÷â~î’ %3$d Çà⁄ìÆ", from.getName(), to.getName(), val));
		}
		else {
			result = solve(from, work, to, height -1, result);
			Integer val = from.pop();
			to.push(val);
			result.add(String.format("%1$sÅ@Ç©ÇÁ %2$s Ç÷â~î’ %3$d Çà⁄ìÆ", from.getName(), to.getName(), val));
			result = solve(work, to, from, height -1, result);
		}
		return result;
	}
}
