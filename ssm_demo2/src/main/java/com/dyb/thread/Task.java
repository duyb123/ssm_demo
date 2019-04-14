package com.dyb.thread;

import com.dyb.pojo.User;
//任务类，也叫共享资源类，也叫锁对象，锁的就是此对象Task；
public class Task implements Runnable {
	 private static User user = null;
     private int taskId;
     public Task (int id){
    	 taskId=id;
     }
	@Override
	public void run() {
		// TODO Auto-generated method stub
		/**
		 *  run
			12222333
			run
			run
			run
			run
			run  只创建一次对象，要是不安全则同时创建多次，说明线程池这一块在执行多任务的时候，实际上是线程安全的，多个线程之间是互不干扰的
			数据也不共享，不像多线程共同处理一个任务，数据是共享的，数据容易混乱，线程不安全。
		 */
		System.out.println("run");
		if(taskId == 2 && user==null){
			user = new User();
			System.out.println("12222333");
		}
		
	 if(taskId == 1){
		 try {
			Thread.sleep(5000);
			System.out.println("休眠结束");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
	}

}
