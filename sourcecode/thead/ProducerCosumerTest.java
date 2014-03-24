/*
Copyright 2010 kiddy
*/
package thead;

class CubbyHoly {
	private int number;
	private boolean flag = false;	//��־λ��Ϊtrue��ʾ�����߷�����ɣ������߿���ȡ��
	
	public synchronized void put(int number) {
		while(flag) {
			try {
				wait();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		this.number = number;
		flag = true;
		System.out.println("Producer put number "+this.number);
		notifyAll();
	}
	
	public synchronized int get() {
		while(!flag) {
			try {
				wait();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		flag = false;
		notifyAll();
		return this.number;
	}
}

class Producer extends Thread {
	private CubbyHoly ch;
	
	public Producer(CubbyHoly ch) {
		this.ch = ch;
	}
	
	public void run() {
		for(int i=0; i < 10; i++) {
			ch.put(i);
		}
	}
}

class Consumer extends Thread {
	private CubbyHoly ch;
	
	public Consumer(CubbyHoly ch) {
		this.ch = ch;
	}
	
	public void run() {
		for(int i=0; i < 10; i++)
			System.out.println("Consumer get number "+ch.get());
	}
}

public class ProducerCosumerTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CubbyHoly ch = new CubbyHoly();
		Producer producer = new Producer(ch);
		Consumer consumer = new Consumer(ch);
		Thread t1 = new Thread(producer);
		Thread t2 = new Thread(consumer);
		t1.start();
		/*
		try {
			t1.join();
		} catch(Exception e) {
			e.printStackTrace();
		}*/
		t2.start();
	}

}
