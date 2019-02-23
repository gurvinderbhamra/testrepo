import java.util.concurrent.atomic.AtomicInteger;

class Q12
{
    AtomicInteger count = new AtomicInteger();

    void increment()
    {
        count.incrementAndGet();
    }

    void thread1()
    {
        for(int i = 0 ; i < 5 ; i++)
        increment();
    }
    void thread2()
    {
        for(int i = 0 ; i < 5 ; i++)
        increment();
    }
    void thread3()
    {
        for(int i = 0 ; i < 5 ; i++)
        increment();
    }

    public static void main(String args[])throws InterruptedException
    {
        //Use Atomic Classes instead of Synchronize method and blocks.
        Q12 obj = new Q12();
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
        t1.start();
        t2.start();
        t3.start();
        t1.join();
        t2.join();
        t3.join();

        System.out.println("Final value : " + obj.count);
    }
}
