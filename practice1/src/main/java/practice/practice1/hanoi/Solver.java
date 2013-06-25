package practice.practice1.hanoi;

import java.util.List;

public interface Solver {
	/**
	 * 繝上ヮ繧､縺ｮ蝪斐ｒ隗｣縺�
	 * from 縺ｮ蝪斐↓遨阪∪繧後※縺�ｋ荳翫°繧�height蛻��蜀�乢繧�to 縺ｫ遘ｻ蜍輔☆繧九�
	 * @param from	遘ｻ蜍募�
	 * @param to	遘ｻ蜍募�
	 * @param work	3譛ｬ縺ｮ蝪斐�縺�■縲∫ｧｻ蜍募�縺ｧ繧らｧｻ蜍募�縺ｧ繧ゅ↑縺�｡�
	 * @param height	遘ｻ蜍募ｯｾ雎｡縺ｮ蜀�乢縺ｮ謨ｰ縲∫ｧｻ蜍募�縺ｮ蝪斐�荳翫°繧�height 謨ｰ縺檎ｧｻ蜍募ｯｾ雎｡縺ｨ縺ｪ繧�
	 * @param result	遘ｻ蜍慕ｵ先棡	蠑墓焚縺ｮ遘ｻ蜍慕ｵ先棡縺ｯ縺薙�蜻ｼ縺ｳ蜃ｺ縺励∪縺ｧ縺ｫ縺吶〒縺ｫ螳滓命縺励◆遘ｻ蜍墓焔鬆��繝ｪ繧ｹ繝医′蜈･縺｣縺ｦ縺�ｋ
	 * @return			遘ｻ蜍慕ｵ先棡
	 *	遘ｻ蜍慕ｵ先棡縺ｫ縺ｯ縲∫ｧｻ蜍墓焔鬆��繝ｪ繧ｹ繝医′蜈･繧九� 遘ｻ蜍墓焔鬆��縲�笳銀雷縲�°繧�ﾃ療�縺ｸ蜀�乢 笆ｳ 繧堤ｧｻ蜍�縲��
	 *	繝輔か繝ｼ繝槭ャ繝医〒遘ｻ蜍輔�鬆�↓繝ｪ繧ｹ繝医↓逋ｻ骭ｲ縺輔ｌ縺ｦ縺�ｋ縲ゅ�蠑墓焚縺ｧ荳弱∴繧峨ｌ縺溽ｧｻ蜍慕ｵ先棡縺ｫ縺薙�蜻ｼ縺ｳ蜃ｺ縺励〒遘ｻ蜍輔＠縺滓焔鬆�ｒ霑ｽ蜉�＠縺ｦ
	 *	霑斐☆
	 */
	List<String> solve(Tower from, Tower to, Tower work, int height, List<String> result);
}