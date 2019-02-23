class Q2
{
    public static void main(String args[])throws InterruptedException
    {
        System.out.println("\n Main Thread starts...\n");

        Thread thread0 = new Thread(()->{
            for(int i = 1 ; i < 5 ; i++)
            {
                try {
                    Thread.sleep(0l);
                    System.out.println(Thread.currentThread().getName() + "::");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread1 = new Thread(()->{
            for(int i = 1 ; i < 5 ; i++)
            {
                try {
                    Thread.sleep(500l);
                    System.out.println(Thread.currentThread().getName() + "::");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread2 = new Thread(()->{
            for(int i = 1 ; i < 5 ; i++)
            {
                try {
                    Thread.sleep(250l);
                    System.out.println(Thread.currentThread().getName() + "::");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread0.start();

        thread1.start();
        thread2.start();

        thread0.join();

    }
}

