class Q10
{
    synchronized static void display()throws InterruptedException
    {
        System.out.println("thread::" + Thread.currentThread().getName() + "::entered in synchronized method");
        for(int i = 0 ; i < 5 ; i++) {
            Thread.sleep(500l);
            System.out.println("executing thread::" + Thread.currentThread().getName());
        }
    }

    public static void main(String args[])
    {
        //Use Synchronize method to enable synchronization between multiple threads trying to access method at same time.

        Thread t1 = new Thread(()-> {
            try {
                display();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread t2 = new Thread(()-> {
            try {
                display();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread t3 = new Thread(()-> {
            try {
                display();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        t1.start();
        t2.start();
        t3.start();
    }
}
