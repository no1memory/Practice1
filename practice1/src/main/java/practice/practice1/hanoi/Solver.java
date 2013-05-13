package practice.practice1.hanoi;

public interface Solver {
	/**
	 * ƒnƒmƒC‚Ì“ƒ‚ğ‰ğ‚­
	 * from ‚Ì“ƒ‚ÉÏ‚Ü‚ê‚Ä‚¢‚éã‚©‚ç height•ª‚Ì‰~”Õ‚ğ to ‚ÉˆÚ“®‚·‚éB
	 */
	void solve(Tower from, Tower to, Tower work, int height);
}