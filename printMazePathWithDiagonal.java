import java.util.*;
public class printMazePathWithDiagonal {
public static void main(String args[]) {
	Scanner scn = new Scanner(System.in);
	int sr = scn.nextInt();
	int sc = scn.nextInt();
	int er = scn.nextInt();
	int ec = scn.nextInt();
	printMPD(sr,sc,er,ec,"");
}
public static void printMPD(int sr, int sc, int er, int ec, String ans) {
	if(sr>er || sc>ec) {
		return;
	}
	if(sr==er && sc==ec) {
		System.out.println(ans);
		return;
	}
	printMPD(sr, sc+1, er, ec, ans+"H");
	printMPD(sr+1, sc, er, ec, ans+"V");
	printMPD(sr+1, sc+1, er, ec, ans+"D");
	
}
}
