package Bai4;

import java.util.*;
public class Thread2 extends Thread{
	List<Character> list = new ArrayList<>();
	public void run() {
		int min = (int) 'a';
		int max = (int) 'z';
		int limit = max - min;		
		Random random = new Random();
		for(int i = 0; i < 10; i++) {
			int rad = random.nextInt(limit) + min;
			char c = (char) rad;			
			list.add( c);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		}	
	}	
}
	
