package practice.practice1.hanoi;

import java.util.List;

public interface Solver {
	/**
	 * ハノイの塔を解く
	 * from の塔に積まれている上から height分の円盤を to に移動する。
	 * @param from	移動元
	 * @param to	移動先
	 * @param work	3本の塔のうち、移動元でも移動先でもない塔
	 * @param height	移動対象の円盤の数、移動元の塔の上から height 数が移動対象となる
	 * @param result	移動結果	引数の移動結果はこの呼び出しまでにすでに実施した移動手順のリストが入っている
	 * @return			移動結果
	 *	移動結果には、移動手順のリストが入る。 移動手順は　"○○　から ×× へ円盤 △ を移動"　の
	 *	フォーマットで移動の順にリストに登録されている。　引数で与えられた移動結果にこの呼び出しで移動した手順を追加して
	 *	返す
	 */
	List<String> solve(Tower from, Tower to, Tower work, int height, List<String> result);
}