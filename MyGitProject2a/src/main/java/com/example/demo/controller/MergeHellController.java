package com.example.demo.controller;

import java.util.Random;

public class MergeHellController {
	public static void main(String[] args) {
		kadaiA();
		kadaiB();

	}

	static void kadaiB() {
		Random a = new Random();
		int x = a.nextInt(101) + 1;
		System.out.println(x + "が出ました");
	}

	static void kadaiA() {
		for (int i = 1; i < 11; i++) {
			System.out.println("現在" + i + "回目のループです");
		}
	}
}