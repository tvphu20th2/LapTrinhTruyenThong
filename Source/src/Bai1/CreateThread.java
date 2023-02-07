package Bai1;

public class CreateThread extends Thread{
	private String prefix="";
	public CreateThread (String p)
	{
		prefix=p;
	}
	public void run () 
	{
		for(int i=0;i<100;i++)
			System.out.println (prefix+i) ;
	}
	public static void main(String[] args) {
		CreateThread t1 = new CreateThread("Luồng thứ 1 : ");
		CreateThread t2 = new CreateThread("Luồng thứ 2 : ");
		CreateThread t3 = new CreateThread("Luồng thứ 3 : ");
		t1.start();
		t2.start();
		t3.start();

	}

}
