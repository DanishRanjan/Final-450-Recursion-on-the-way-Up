import java.util.*;
public class printStairPath {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	PSS(n,"");
}
public static void PSS(int n, String ans) {
	if(n==0) {
		System.out.println(ans);
		return;
	}
	if(n<0) {
		return;
	}
	
	PSS(n-1, ans+"1");
	PSS(n-2, ans+"2");
	PSS(n-3, ans+"3");
}
}
