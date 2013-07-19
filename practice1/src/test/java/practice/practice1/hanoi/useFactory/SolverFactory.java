package practice.practice1.hanoi.useFactory;

import java.util.Arrays;
import java.util.List;

import practice.practice1.hanoi.Solver;

public class SolverFactory {
	private static Solver [] targets = {
		new practice.practice1.hanoi.jorsef.SolverImpl(),
		new practice.practice1.hanoi.no1memory.SolverImpl(),
//		new practice.practice1.hanoi.kai.ka_Impl_solver(),
		new practice.practice1.hanoi.yujim78.SolverImpl()
	};

	public static List<Solver> getInstance() {
		return Arrays.asList(targets);
	}

}
