import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Q5
{
    public static void main(String args[])throws InterruptedException
    {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        try
        {
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Thread1::" + Thread.currentThread().getName());
                }
            });

            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Thread2::" + Thread.currentThread().getName());
                }
            });

            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    try
                    {
                        Thread.sleep(3000l);
                    }
                    catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                    System.out.println("Thread3::" + Thread.currentThread().getName());
                }
            });
        }
        catch(Exception exc)
        {}
        finally {
            executorService.shutdownNow();
        }
        System.out.println("Shut down : " + executorService.isShutdown());
        System.out.println("Terminated : " + executorService.isTerminated());
    }
}

