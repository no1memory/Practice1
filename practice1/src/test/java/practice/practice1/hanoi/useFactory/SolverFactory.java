package practice.practice1.hanoi.useFactory;

import practice.practice1.hanoi.Solver;
import practice.practice1.hanoi.no1memory.SolverImpl;

public class SolverFactory {

	public static Solver getInstance() {
		return new SolverImpl();
	}

}
