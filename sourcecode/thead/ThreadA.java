/*
Copyright 2010 kiddy
*/
package thead;

public class ThreadA {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Thread A ִ��");
		
		Thread threadB = new Thread(new Runnable() {
			
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Thread B ��ʼ����");
				try {
					for (int i = 0; i < 5; i++) {
						Thread.sleep(1000);
						System.out.println("Thread B ִ�С���");
					}
					System.out.println("Thread B ��������");
				}
				catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		threadB.start();
		/*
		try {
			// Thread B ���� Thread B
			threadB.join();
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		*/
		System.out.println("Thread A ִ��");
	}

}
