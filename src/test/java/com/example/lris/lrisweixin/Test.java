package com.example.lris.lrisweixin;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

import org.omg.CORBA.PRIVATE_MEMBER;

public class Test {

	public static void main(String[] args) {

		for(int i=1;i<37;i++) {
			getServen();
		}
	}

	private static void getServen() {

		int blue = (int) (Math.random() * 16 + 1);
		HashSet<Integer> hu = new HashSet<Integer>();
		for (int i = 0; i < 6; i++) {
			// 添加随机数红球
			int red = (int) (Math.random() * 33 + 1);
			hu.add(red);
		}
		while (hu.size() < 6) {
			// 前面在hu中添加随机数红球如果有重复时，不能达到6个球，在这里从新再添加，直到有6个红球结束。
			int red = (int) (Math.random() * 33 + 1);
			hu.add(red);
		}
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (final Integer value : hu) {
			list.add(value);
		}
		Collections.sort(list);
		System.out.println("红球：" + list);
		System.out.println("篮球：" + blue);
	}
}
