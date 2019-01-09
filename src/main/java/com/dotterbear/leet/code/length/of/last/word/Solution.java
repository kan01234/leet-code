package com.dotterbear.leet.code.length.of.last.word;

class Solution {

	public int lengthOfLastWord(String s) {
		s = s.trim();
		return s.length() - s.lastIndexOf(' ') - 1;
	}
}
