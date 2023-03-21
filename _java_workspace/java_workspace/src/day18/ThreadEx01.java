package day18;

// Thread 클래스를 상속
class MyThread extends Thread{
	//Thread를 상속받음녀 반드시 run() 메서드를 구현해야 함.
	public void run() {
		for(int i=0; i<200; i++) {
			System.out.println(i+"번째"+getName());
		}
	}
}

public class ThreadEx01 {

	public static void main(String[] args) {
		/* Thread(쓰레드) 
		 * - 실행중인 프로그램의 OS부터 메모리를 할당 받아 process 상태가 됨
		 * - 하나의 프로세스는 하나 이상의 Tread를 가지게 되고,
		 * 실제 작업을 수행하는 단위는 thread 단위임.
		 * - thread 단위는 실제 CPU가 처리하는 단위
		 * - multi-thread는 여러 thread가 동시에 수행되는 프로그래밍
		 * - CPU는 시간을 잘게 쪼개서 thread들을 수행하면 사용자들은 동시에 처리되는 듯한 효과
		 * - thread는 각각 자신만의 작업 공간을 가짐(context)
		 * - 각 thread 사이에 공유하는 자원이 있을 수 있음. (자바에서는 static instance)
		 * - 여러 thread가 공유하는 자원 중 경쟁이 발생하는 부분을 critical section(임계영역)
		 * - critical section에 대한 동기화(순차적 수행)를 구현하여 오류를 막음. 
		 * 
		 * thread 구현 방식 상속(Thread), 구현(Runnable)하는 방식 2가지
		 * */ 
		System.out.println(Thread.currentThread());
		
		MyThread th = new MyThread();
		th.start();
		
		MyThread th2 = new MyThread();
		th2.start();

	}

}
