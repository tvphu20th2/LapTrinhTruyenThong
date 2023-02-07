package Bai4;

import java.util.*;
public class Thread1 extends Thread{
	List<Integer> list = new ArrayList<>();
	public void run() {
		Random random = new Random();
		for(int i = 0; i < 10; i++) {
			int rad = random.nextInt(10);
			list.add(rad);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

