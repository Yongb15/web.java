package ex2_Thread;

// 스레드를 생성하는 방법1
class ThreadTest extends Thread {
	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println("스레드 진행 중 : " + i);
		}
	}
}

// 스레드를 생성하는 방법2
class RunnableTest implements Runnable {
	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println("러너블 진행 중 : " + i);
		}
	}
}
public class ThreadMain {
	public static void main(String[] args) {
		ThreadTest tt = new ThreadTest();
		
		tt.start();		// run()을 직접 호출하게 되면 독립적으로 수행 X / 일반 메서드처럼 호출
						// 독립적으로 사용하고 싶다면 start()를 사용
		
		RunnableTest rt = new RunnableTest();
		Thread t1 = new Thread(rt);
		
		t1.start();
		
		// Runnable 인터페이스를 직접 구현하지 않고 람다식으로 표현
		Thread t2 = new Thread(() -> {
			while(true) {
				System.out.println("백기 올려");
			}
		});
		
		t2.start();
		
		Thread t3 = new Thread(() -> {
			while(true) {
				System.out.println("청기 올려");
			}
		});
		
		t3.start();
	}
}
