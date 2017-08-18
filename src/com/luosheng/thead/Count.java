package com.luosheng.thead;

import java.util.concurrent.ThreadLocalRandom;

public class Count {
		private int num;
		public void count() {
			for(int i = 1; i <= 10; i++) {
				num += i;
			}
			System.out.println(Thread.currentThread().getName() + "-" + num);
		}
		
		public void countAnquan() {
			int num = 0;
			for(int i = 1; i <= 10; i++) {
				num += i;
			}
			System.out.println("anquan-"+Thread.currentThread().getName() + "-" + num);
		}
}