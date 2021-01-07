import java.util.*;
public class printPermutation {
public static void main(String args[]) {
	Scanner sc= new Scanner(System.in);
	String str = sc.nextLine();
	PP(str, "");
}
public static void PP(String str, String ans) {
	if(str.length()==0) {
		System.out.println(ans);
		return;
	}
	for(int i=0;i<str.length();i++) {
		char cc = str.charAt(i);
		String ros = str.substring(0,i)+str.substring(i+1);
		PP(ros, ans+cc);
	}
	
}
}
