import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
class Q9
{
    public static void main(String args[])throws Exception
    {
        //Increase concurrency with Thread pools using newCachedThreadPool() and newFixedThreadPool().

        ExecutorService executorService = Executors.newCachedThreadPool();
        //ExecutorService executorService = Executors.newFixedThreadPool(4);
        for(int i = 0 ; i < 10 ; i++)
        {
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(2000l);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Thread::" + Thread.currentThread().getName());
                }
            });
        }
        executorService.shutdown();
    }
}

