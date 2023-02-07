package Bai3;

import java.util.Random;

public class Thread_BinhPhuong {
	static int i;
		static class Thread1 extends Thread{
			public void run()
			{
				while (true) {
					Random ran = new Random();
					i = ran.nextInt(21);
					System.out.println("Thread 1 "+ i);
					try {
						Thread.sleep(2000);
					}catch (InterruptedException e) {
						System.err.println(e.getMessage());
					}
					
				}
			}
		}

		static class Thread2 extends Thread {
			public void run() {
				while (true) {
					
					System.out.println("Thread 2 "+ Math.pow(i, 2));
					try {
						Thread.sleep(1000);
					}catch (InterruptedException e) {
						System.err.println(e.getMessage());
					}
					
				}
			}
		}
public static void main(String[] args) {
		new Thread1().start();
		new Thread2().start();

	}

}
