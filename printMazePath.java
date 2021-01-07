import java.util.*;
public class printMazePath {
public static void main(String args[]) {
	Scanner scn = new Scanner(System.in);
	int sr = scn.nextInt();
	int sc = scn.nextInt();
	int er = scn.nextInt();
	int ec = scn.nextInt();
	printMP(sr, sc, er, ec, "");
	
}
public static void printMP(int sr,int sc,int er, int ec, String ans) {
	if(sr==er && sc==ec) {
		System.out.println(ans);
		return;
	}
	if(sr>er || sc>ec) {
		return;
	}
	
	printMP(sr, sc+1, er, ec, ans+"H");
	printMP(sr+1, sc, er, ec, ans+"V");
	
	
}
}
