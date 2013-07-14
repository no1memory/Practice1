package practice.practice1.hanoi.yujim78;

import java.util.List;

import practice.practice1.hanoi.Solver;
import practice.practice1.hanoi.Tower;

public class SolverImpl implements Solver {

	@Override
	public List<String> solve(Tower from, Tower to, Tower work, int height,
			List<String> result) {
		
			if(height > 0){
				//from -> work
				result = solve(from, work, to, height-1, result);
				
				Integer val = from.pop();
				to.push(val);
				result.add(String.format("%1$s　から %2$s へ円盤 %3$d を移動", from.getName(), to.getName(), val));
				
				//work -> to
				result = solve(work, to, from, height-1, result);
			}
		
		return result;
	}

}
