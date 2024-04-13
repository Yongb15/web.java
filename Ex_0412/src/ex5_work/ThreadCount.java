package ex5_work;

public class ThreadCount extends Thread{
	int n;
	
	public ThreadCount(int n) {
		this.n = n;
	}
	
	@Override
	public void run() {
		for(int i = n; i >= 0; i--) {
			try {
				System.out.println(i);
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		System.out.println("종료");
	}
}
