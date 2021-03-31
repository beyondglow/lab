package com.yifeng.lab.leetcode;

import java.util.HashMap;
import java.util.Map;

public class AbcRepeat {
	public static void main(String[] args) {
		int s = lengthOfLongestSubstring("dvdf");
		System.out.println(s);
	}

	public static int lengthOfLongestSubstring(String s) {
		int maxLen = 0, per = 0, cnt = 0;
		int slength = s.length();
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < slength; i++) {
			//System.out.println(map);
			char p = s.charAt(i);
			if (map.containsKey(p)) {
				int front = map.get(p);
				if (front>=per) {
					cnt = i-per;
					if (front != i-1) {
						per = front+1;
					} else {
						per = i;
					}
				}
				System.out.println("per:"+per + "==front:" +front+ "==cnt:" +cnt + "==i:"  + i+"字母是："+p);
				maxLen = Math.max(cnt,maxLen);
			}
			if(i==slength-1) {
				maxLen = Math.max(i-per+1,maxLen);//加1
			}
			map.put(p, i);
			
		}
		return maxLen;
	}
}
