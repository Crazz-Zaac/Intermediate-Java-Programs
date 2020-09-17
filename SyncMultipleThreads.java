// Write a program to synchronization multiple threads .


import java.io.*;
class A extends Thread{
	public void run(){
		for(int i=0;i<=5;i++){
			System.out.println(Thread.currentThread().getName()+(i));
		}
	}
}

class SyncMultipleThreads {
	public static void main(String []args){
		A threadA = new A();
		Thread t1= new Thread(threadA);
		t1.setName("t1:");
		t1.start();
		Thread t2= new Thread(threadA);
		t2.setName("t2:");
		t2.start();
	}
}