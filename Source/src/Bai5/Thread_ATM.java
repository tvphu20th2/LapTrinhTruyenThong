package Bai5;
//import java.lang.InterruptedException;
public class Thread_ATM {
	private int balance = 1000;
	public Thread_ATM() {
		System.out.println("Tài khoản của bạn là: " +balance);
	}
	private synchronized void withdraw(int amount, String ten) {
		System.out.println(ten +": Giao dịch rút tiền đang thực hiện " +amount + "...");
		while (balance<amount) {
			System.out.println(ten + ": Không thể rút tiền !");
			try {
				wait();
			}catch(InterruptedException e) {
					System.out.println(e.toString());
		}
	}
		balance -=amount;
		System.out.println(ten +": Rút tiền thành công. Tài khoản hiện tại là: " +balance);
	}

	private synchronized void deposit(int amount, String ten) {
		System.out.println(ten +": Giao dịch nạp tiền " +amount + "...");
		balance+= amount;
		System.out.println(ten+ ": Nạp tiền thành công.Tài khoản hiện tại của bạn là :"+ balance);
		notifyAll();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Thread_ATM atm = new Thread_ATM();
		Thread t1 = new Thread() {
			public void run() {
				atm.withdraw(2000, getName());
			}
		};
		t1.start();
		Thread t2 = new Thread() {
			public void run() {
				atm.withdraw(3000, getName());
			}
		};
		t2.start();
		Thread t3 = new Thread() {
			public void run() {
				atm.withdraw(1000, getName());
			}
		};
		t3.start();
		Thread t4 = new Thread() {
			public void run() {
				atm.deposit(500, getName());
			}
		};
		t4.start();
		Thread t5 = new Thread() {
			public void run() {
				atm.deposit(1500, getName());
			}
		};
		t5.start();

	}
}
