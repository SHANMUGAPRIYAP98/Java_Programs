package com.srm.threads;

public class DeadLock {

	public static void main(String[] args) {
		String Fname = "Shanmuga Priya";
		String Lname = "Parthiban";
		Thread t1 = new Thread() {
			public void run() {
				synchronized (Fname) {
					System.out.println("Thread 1: locked resource 1");

					try {
						Thread.sleep(100);
					} catch (Exception e) {
					}

					synchronized (Lname) {
						System.out.println("Thread 1: locked resource 2");
					}
				}

			}

		};
		Thread t2 = new Thread() {
			public void run() {
				synchronized (Lname) {
					System.out.println("Thread 2: locked resource 2");

					try {
						Thread.sleep(100);
					} catch (Exception e) {
					}

					synchronized (Fname) {
						System.out.println("Thread 2: locked resource 2");
					}
				}

			}

		};
		t1.start();
		t2.start();
	}
}
