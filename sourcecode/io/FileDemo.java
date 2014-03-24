/*
Copyright 2010 kiddy
*/
package io;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


public class FileDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File file = new File(args[0]);
			if(file.isFile()) {	//�Ƿ�Ϊ�ļ�
				System.out.println(args[0] + " �ļ�");
				System.out.print(
						file.canRead() ? "�ɶ� " : "���ɶ� ");
				System.out.print(
						file.canWrite() ? "��д " : "����д ");
				System.out.println(file.length() + "�ֽ� ");
			}
			
			else {
				//�г����е��ļ���Ŀ¼
				File[] files = file.listFiles();
				List<File> fileList = new ArrayList<File>();
				//���г�Ŀ¼
				for(int i = 0; i < files.length; i++) {
					if(files[i].isDirectory()) {	//�Ƿ�ΪĿ¼
						//ȡ��·����
						System.out.println("[" +
								files[i].getPath() + "]");
					}
					
					else {
						//�ļ��ȴ���fileList���������г�
						fileList.add(files[i]);
					}
				}
				//�г������ļ�
				for(File f : fileList) {
					System.out.println(f.toString());
				}
				System.out.println();
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("using: Java FileDemo pathname");
		}
	}

}
