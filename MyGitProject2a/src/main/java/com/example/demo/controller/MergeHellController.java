package com.example.demo.controller;

import java.util.Random;

public class MergeHellController {
	public static void main(String[] args) {
		kadaiB();
	}
	static void kadaiB(){
		Random a = new Random();
		int x = a.nextInt(101) + 1;
		System.out.println(x + "が出ました");
	}
}