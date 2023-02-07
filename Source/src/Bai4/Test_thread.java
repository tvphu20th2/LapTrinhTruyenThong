package Bai4;

public class Test_thread {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.out.println("\n Main Bắt đầu ");
		   Thread1 t1 = new Thread1();
		   Thread2 t2 = new Thread2();	 
	        t1.start();
	        t2.start();
	        t1.join();
	        t2.join();
	        System.out.println("Hien thi ket quả sinh ngau nhien 2 so 1 và 2");
	        System.out.println("\nT1: ");
	        for(int i = 0; i < t1.list.size(); i++) {
	        	System.out.print(" " + t1.list.get(i));	        	
	        }
	        System.out.println("\nT2: ");
	        for(int i = 0; i < t2.list.size(); i++) {
	        	System.out.print(" " + t2.list.get(i));	        	
	        }	        
	        System.out.println("\n Main kết thúc ");


	}

}
