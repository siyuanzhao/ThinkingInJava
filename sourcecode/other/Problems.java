/*
Copyright 2010 kiddy
*/
package other;

public class Problems {
	
	//�ж��Ƿ�Ϊ�������Ǿͷ���true
	public static boolean isOdd(int i){
		//return i % 2==1;
		return (i & 1) == 1;
	}
	
	public static void main(String[] args){
		int j = -1;
		System.out.println(Integer.toBinaryString(j));
		for(int i=-2;i<=2;i++){
		System.out.println(isOdd(i));
		}
		System.out.println(2.00-1.10);
//		System.out.println(-1 % 2);
		System.out.println(-2 % 2);
		System.out.println(-3 % 2);
		System.out.println(-4 % 2);
		System.out.println(-5 % 2);
	}
	//���ʣ���γ��򽫻����ʲô��
           //����Ͳ��Ż��ô���
}
