import java.util.*;

public class printMazepathWithJumps {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int sr = scn.nextInt();
		int sc = scn.nextInt();
		int er = scn.nextInt();
		int ec = scn.nextInt();
		printMPWJ(sr, sc, er, ec, "");
	}

	public static void printMPWJ(int sr, int sc, int er, int ec, String ans) {
		if (sr == er && sc == ec) {
			System.out.println(ans);
			return;
		}

		for (int ms = 1; ms <= ec - sc; ms++) {
			printMPWJ(sr, sc + ms, er, ec, ans + "H" + ms);
		}
		for (int ms = 1; ms <= er - sr; ms++) {
			printMPWJ(sr + ms, sc, er, ec, ans + "V" + ms);
		}
		for (int ms = 1; ms <= er - sr && ms <= ec - sc; ms++) {
			printMPWJ(sr + ms, sc + ms, er, ec, ans + "D" + ms);
		}
	}
}

