package com.qianmi.uc.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * 常用的四种创建线程池方法
 *
 * @author 叶延平[OF1643]
 * @create 2018-10-23 17:03
 **/
public class TreadServiceTest {
    public static void main(String[] args) {

        //定长 执行完count数量的后 放入队列排队
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 20; i++) {
            MyTask myTask = new MyTask(i);
            fixedThreadPool.execute(myTask);
        }
        fixedThreadPool.shutdown();


        //缓存threadPool 理论上是无限大 有多少任务创建多少线程
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();

        for (int i = 0; i < 20; i++) {
            MyTask myTask = new MyTask(i);
            newCachedThreadPool.execute(myTask);
        }
        newCachedThreadPool.shutdown();


        //单个线程 先进先出
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 20; i++) {
            MyTask myTask = new MyTask(i);
            newSingleThreadExecutor.execute(myTask);
        }
        newSingleThreadExecutor.shutdown();


        //可支持延期任务
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(5);
        for (int i = 0; i < 10; i++) {
            final int b = i;
            newScheduledThreadPool.schedule(new Runnable() {
                @Override
                public void run() {
                    System.out.println(b);
                    try {
                        Thread.currentThread().sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }, 1, TimeUnit.SECONDS);
        }
        newScheduledThreadPool.shutdown();


    }
}

