import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Q16
{

    Lock lock1 = new ReentrantLock(true);
    Lock lock2 = new ReentrantLock(true);

    void acquireLock(Lock lock1, Lock lock2)
    {
        boolean acquireLock1 = lock1.tryLock();
        boolean acquireLock2 = lock2.tryLock();

        if(acquireLock1 && acquireLock2)
            return;

        if(acquireLock1)
            lock1.unlock();

        if(acquireLock2)
            lock2.unlock();

    }

    void thread1()
    {
        acquireLock(lock1, lock2);
        System.out.println("thread::" + Thread.currentThread().getName() + "::lock1");
        System.out.println("thread::" + Thread.currentThread().getName() + "::lock2");
        lock2.unlock();
        lock1.unlock();
    }
    void thread2()
    {
        acquireLock(lock2, lock1);
        System.out.println("thread::" + Thread.currentThread().getName() + "::lock1");
        System.out.println("thread::" + Thread.currentThread().getName() + "::lock2");
        lock1.unlock();
        lock2.unlock();
    }

    public static void main(String args[])throws InterruptedException
    {
        Q16 obj = new Q16();
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
        t1.join();
        t2.join();
    }

}
