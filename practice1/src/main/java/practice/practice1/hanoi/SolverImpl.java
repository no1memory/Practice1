package practice.practice1.hanoi;

import java.util.List;

public class SolverImpl implements Solver {

	/* (非 Javadoc)
	 * solveメソッドの実装
	 * @see practice.practice1.hanoi.Solver#solve(practice.practice1.hanoi.Tower, practice.practice1.hanoi.Tower, practice.practice1.hanoi.Tower, int, java.util.List)
	 */
	@Override
	public List<String> solve(Tower from, Tower to, Tower work, int height, List<String> result) {

		//fromが空ではなく、かつ、heightが0より大きい時、円盤を移動する
		if (!from.isEmpty() && height > 0) {
			solve(from, work, to, height - 1, result);
			Integer val = from.pop();
			to.push(val);
			result.add(String.format("%1$s　から %2$s へ円盤 %3$d を移動", from.getName(), to.getName(), val));
			solve(work, to, from, height - 1, result);
		}
		return result;
	}

}
