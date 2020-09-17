// Write a program to set the priority of threads and get the priority of threads and display the priority of each thread.


import java.io.*;
class A extends Thread{
	public void run(){
		for(int i=0;i<=5;i++){
			System.out.println("From thread A i ="+i);
		}
		System.out.println("Exit from A thread");
	}
}
class B extends Thread{
	public void run(){
		for(int j=0;j<=5;j++){
			System.out.println("From thread B, j ="+j);
		}
		System.out.println("Exit from B thread");
	}
}
class C extends Thread{
	public void run(){
		for(int k=0;k<=5;k++){
			System.out.println("From thread C, k ="+k);
		}
		System.out.println("Exit from C thread");
	}
}
class ThreadPriority {
	public static void main(String []args){
		A threadA = new A();
		B threadB = new B();
		C threadC = new C();
	
		threadC.setPriority(2);
		threadB.setPriority(6);
		threadA.setPriority(4);
		
		System.out.println("Start thread A");
		threadA.start();
		System.out.println("Start thread B");
		threadB.start();
		System.out.println("Start thread C");
		threadC.start();
		
		
		System.out.println("End of Main thread");
	}
}