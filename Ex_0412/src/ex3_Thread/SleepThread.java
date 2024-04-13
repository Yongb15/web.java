package ex3_Thread;

public class SleepThread extends Thread {
	@Override
	public void run() {
		System.out.println("카운트다운 5초");
		for(int i = 5; i >= 0; i--) {
			System.out.println(i);
			if(i != 0) {
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					
				}
			}
		}
		System.out.println("종료!");
	}
}
