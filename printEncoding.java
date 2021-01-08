import java.util.*;

public class printEncoding {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		Encoding(str, "");
	}

	public static void Encoding(String str, String ans) {
		if (str.length() == 0) {
			System.out.println(ans);
			return;
		} else if (str.length() == 1) {
			char ch = str.charAt(0);
			if (ch == '0') {
					return;
				} else {
					int characterValue = ch - '0';
					char code = (char) ('a' + characterValue - 1);
					System.out.println(ans+code);
			}
		}
		else {
			char ch = str.charAt(0);
			String ros = str.substring(1);
			
			if (ch == '0') {
				return;
			} else {
				int characterValue = ch - '0';
				char code = (char) ('a' + characterValue - 1);
				Encoding(ros, ans+code);
			}
			
			String ch12 = str.substring(0,2);
			String rosExcept12 = str.substring(2);
			
			int ch12v = Integer.parseInt(ch12);
			if(ch12v <= 26) {
				char code = (char)('a'+ch12v-1);
				Encoding(rosExcept12, ans+code);
			}
		}
	}
}
