package com.dyb.thread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Component("threadPoolExcute")
public class ThreadPoolExcute {
	static ThreadPoolExecutor exe = new ThreadPoolExecutor(8, 8, 0,
            TimeUnit.SECONDS, new ArrayBlockingQueue(5),
            new ThreadPoolExecutor.AbortPolicy());
	
	public void  mostThreadTicketOut(int param){
		 CountDownLatch latch = new CountDownLatch(5);
		for (int i = 0; i < 10 ; i++) {
			System.out.println("任务"+i+"：开始");
			exe.execute(new Task(param));//每new一次都是一个任务	
			System.out.println("任务"+i+"：结束");
		}
		/**
		 * 
任务0：开始
任务0：结束
任务1：开始
任务1：结束
run
任务2：开始
run
任务2：结束
任务3：开始
run
任务3：结束
任务4：开始
run
任务4：结束
任务5：开始
任务5：结束
任务6：开始
run
run
任务6：结束
任务7：开始
任务7：结束
任务8：开始
任务8：结束
任务9：开始
run
run
任务9：结束
run
run
由以上可以看出，主线程将任务放到等待队列中就行了，其他的执行run方法就交给线程池就可以了，不是等到线程池中线程把run执行完，而是直接放到等待队列中，接下来在执行下一循环，继续创建任务放到队列中，不等待run方法是否执行完。这就是线程池可以异步处理。
*/
		exe.isTerminated();
	}
	
	
	
	
}
