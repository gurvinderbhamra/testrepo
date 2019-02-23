class Q13
{
    synchronized void thread1()
    {
        System.out.println("thread::" + Thread.currentThread().getName() + " entered started waiting here");
        try
        {
            wait();
        }
        catch(Exception exc)
        {}
        System.out.println("thread::" + Thread.currentThread().getName() + " completed");
    }
    synchronized void thread2()
    {
        System.out.println("thread::" + Thread.currentThread().getName() + " entered here to notify other thread");
        notify();
        System.out.println("thread::" + Thread.currentThread().getName() + " completed");
    }

    public static void main(String args[])
    {
        //Coordinate 2 threads using wait() and notify().
        System.out.println("This is main thread");
        Q13 obj = new Q13();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                obj.thread1();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                obj.thread2();
            }
        });

        t1.start();
        t2.start();
    }
}
