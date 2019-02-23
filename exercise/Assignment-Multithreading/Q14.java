class Q14
{
    synchronized void thread1()
    {
        System.out.println("thread::" + Thread.currentThread().getName() + " entered, started waiting here");
        try
        {
            wait();
            Thread.sleep(500l);
        }
        catch(Exception exc)
        {}
        System.out.println("thread::" + Thread.currentThread().getName() + " completed");
    }
    synchronized void thread2()
    {
        System.out.println("thread::" + Thread.currentThread().getName() + " entered, started waiting here");
        try {
            wait();
            Thread.sleep(500l);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("thread::" + Thread.currentThread().getName() + " completed");
    }
    synchronized void thread3()
    {
        System.out.println("thread::" + Thread.currentThread().getName() + " entered, started waiting here");
        try {
            wait();
            Thread.sleep(500l);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("thread::" + Thread.currentThread().getName() + " completed");
    }
    synchronized void thread4()
    {
        System.out.println("thread::" + Thread.currentThread().getName() + " entered here to notify other threads");
        notifyAll();
        System.out.println("thread::" + Thread.currentThread().getName() + " completed");
    }

    public static void main(String args[])
    {
        //Coordinate 2 threads using wait() and notifyAll().
        System.out.println("This is main thread");
        Q14 obj = new Q14();

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
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                obj.thread3();
            }
        });

        Thread t4 = new Thread(new Runnable() {
            @Override
            public void run() {
                obj.thread4();
            }
        });

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
