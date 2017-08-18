package com.luosheng.thead;
public class ThreadTest {
	public static void main(String[] args) {
		Runnable runnable = new Runnable() {
			Count count = new Count();
			public void run() {
				count.count();
			}
		};
		for(int i = 0; i < 10; i++) {
			new Thread(runnable).start();
		}
		
		Runnable runnable1 = new Runnable() {
			Count count = new Count();
			public void run() {
				count.countAnquan();
			}
		};
		for(int i = 0; i < 10; i++) {
			new Thread(runnable1).start();
		}
		Runnable runnable2 = new Runnable() {
			public void run() {
				Count count = new Count();
				count.count();
			}
		};
		for(int i = 0; i < 10; i++) {
			new Thread(runnable2).start();
		}
	}
}