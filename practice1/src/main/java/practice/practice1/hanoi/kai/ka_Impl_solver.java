package practice.practice1.hanoi.kai;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import practice.practice1.hanoi.Solver;
import practice.practice1.hanoi.Tower;

public class ka_Impl_solver implements Solver {

	@Override
	public List<String> solve(Tower from, Tower to, Tower work, int height,
			List<String> result) {
		
		if(height > 0){
			solve(from, work, to, height - 1, result);
			result.add(String.format("%1$s　から %2$s へ円盤 %3$d を移動",
					from.getName(), to.getName(), from.peek() ));
			solve(to, work, from, height - 1, result);
		}
		
		return result;
		
	}

}
