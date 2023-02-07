package Bai2;
import java.util.Scanner;
public class Thread_DoanSo extends Thread{

	private int guessNumber = 0;
	private int count=0;
	
	public Thread_DoanSo(int guessNumber)
	{
		this.guessNumber = guessNumber;
	}
	
	public void run() {
		int randomNumber = 0;
		do {
			randomNumber = (int)(Math.random()*100+1);
			count++;
			System.out.println(getName()+ "đoán số" + randomNumber);
			try {
				Thread.sleep(500);
				
			}catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			
		}while (randomNumber != guessNumber);
		System.out.println(getName()+ " đã đoán ra số " + guessNumber + 
				" trong "+count+" lần đếm ");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập một số nguyên để các thread đoán: ");
		int number = sc.nextInt();
		Thread_DoanSo th1 = new Thread_DoanSo(number);
		Thread_DoanSo th2 = new Thread_DoanSo(number);
		Thread_DoanSo th3 = new Thread_DoanSo(number);
		th1.setName("Thread 1");
		th2.setName("Thread 2");
		th3.setName("Thread 3");
		th1.start();
		th2.start();
		th3.start();

	}

}
