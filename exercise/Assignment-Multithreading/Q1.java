//Create and Run a Thread using Runnable Interface and Thread class.

class MyRunnable implements Runnable
{
    @Override
    public void run()
    {
        System.out.println("Thread created via Runnable interface::" + Thread.currentThread().getName());
    }
}

class MyThread extends Thread
{
    @Override
    public void run()
    {
        System.out.println("Thread created via Thread class::" + Thread.currentThread().getName());
    }
}

class Q1
{
    public static void main(String args[])
    {
        System.out.println("This is main Thread::" + Thread.currentThread().getName());
        
        //Runnable thread start
        MyRunnable thread1 = new MyRunnable();
        new Thread(thread1).start();
        
        //Thread class start
        MyThread thread2 = new MyThread();
        thread2.start();
    }
}

