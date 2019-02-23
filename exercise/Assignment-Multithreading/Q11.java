class Q11
{
    void display()throws InterruptedException
    {
        System.out.println("thread::" + Thread.currentThread().getName() + "::entered in method");

        synchronized (this)
        {
            for (int i = 0; i < 5; i++) {
                Thread.sleep(500l);
                System.out.println("executing thread::" + Thread.currentThread().getName() + "::in synchronized block");
            }
        }
    }

    public static void main(String args[])
    {
        //Use Synchronize block to enable synchronization between multiple threads trying to access method at same time.
        Q11 obj = new Q11();

        Thread t1 = new Thread(()-> {
            try {
                obj.display();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread t2 = new Thread(()-> {
            try {
                obj.display();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread t3 = new Thread(()-> {
            try {
                obj.display();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        t1.start();
        t2.start();
        t3.start();
    }
}
