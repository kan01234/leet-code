package com.dotterbear.leet.code.integer.to.roman;

import java.util.LinkedHashMap;
import java.util.Map;

class Solution {
	public String intToRoman(int num) {
		Map<Integer, String> map = new LinkedHashMap<Integer, String>();
		map.put(1000, "M");
		map.put(900, "CM");
		map.put(500, "D");
		map.put(400, "CD");
		map.put(100, "C");
		map.put(90, "XC");
		map.put(50, "L");
		map.put(40, "XL");
		map.put(10, "X");
		map.put(9, "IX");
		map.put(5, "V");
		map.put(4, "IV");
		map.put(1, "I");
		String roman = "";
		for (int i : map.keySet()) {
			while (num >= i) {
				num -= i;
				roman += map.get(i);
			}
		}
		return roman;
	}
}
