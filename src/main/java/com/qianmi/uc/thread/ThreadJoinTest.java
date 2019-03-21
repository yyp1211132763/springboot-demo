package com.qianmi.uc.thread;

/**
 * 测试线程的Join方法
 *
 * @author 叶延平[OF1643]
 * @create 2018-10-23 23:23
 **/
public class ThreadJoinTest {
    public static void main(String[] args) throws InterruptedException {
        ThreadJoin threadJoinA=new ThreadJoin("小平");
        ThreadJoin threadJoinB=new ThreadJoin("小曼");
        threadJoinA.start();
        threadJoinA.join();
        threadJoinB.start();
    }




}

class ThreadJoin extends Thread{
    public ThreadJoin(String name){
        super(name);
    }
    @Override
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println(this.getName() + ":" + i);
        }
    }
}

