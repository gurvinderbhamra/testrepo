import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
class Q8
{
    public static void main(String args[])throws Exception
    {
        //Schedule task using schedule(), scheduleAtFixedRate() and scheduleAtFixedDelay()
        ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();

        scheduledExecutorService.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("this service will be executed after 4 second");
            }
        }, 4, TimeUnit.SECONDS);

        scheduledExecutorService.scheduleWithFixedDelay(new Runnable() {
            @Override
            public void run() {
                System.out.println("Service schedules with fixed delay");
            }
        }, 0, 5, TimeUnit.SECONDS);

        scheduledExecutorService.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println("Service 1 is scheduled");
            }
        }, 0, 3, TimeUnit.SECONDS);

        scheduledExecutorService.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println("Service 2 is scheduled");
            }
        }, 0, 1, TimeUnit.SECONDS);

        Thread.sleep(10000l);
        scheduledExecutorService.shutdown();
    }
}
