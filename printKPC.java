import java.util.*;
public class printKPC {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	String str = sc.next();
	kpc(str, "");
}

static String[] codes = {
        ".;",
        "abc",
        "def",
        "ghi",
        "jkl",
        "mno",
        "pqrs",
        "tu",
        "vwx",
        "yz"
    };
public static void kpc(String str, String ans) {
	if(str.length()==0) {
		System.out.println(ans);
		return;
	}
	char cc = str.charAt(0);
	String ros = str.substring(1);
	
	String codeforcc = codes[cc-'0'];
	for(int i=0;i<codeforcc.length();i++) {
		char chcode = codeforcc.charAt(i);
		kpc(ros, ans+chcode);
	}
}
}
