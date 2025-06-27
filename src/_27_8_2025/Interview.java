package _27_8_2025;

import java.util.HashMap;
import java.util.Map;

public class Interview {

	public static void main(String[] args) {
		// 1. frequency of characters
		// hello -> h-1, e-1, l-2, o-1
		String str = "varalakshmi";
		
		Map<Character, Integer> map = new HashMap();
		
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			map.put(c, map.getOrDefault(c,0)+1);
		}
		System.out.println(map);
	}
}
