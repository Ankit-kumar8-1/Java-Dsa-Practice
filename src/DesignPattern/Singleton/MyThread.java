package DesignPattern.Singleton;

public class MyThread extends Thread{
    public  void  run(){
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.hashCode());
    }

    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.start();
        t2.start();
    }
}
