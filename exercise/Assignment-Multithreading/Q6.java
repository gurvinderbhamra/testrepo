import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Q6
{
    public static void main(String args[])throws Exception
    {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Future<Integer> integerFuture = executorService.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return 2;
            }
        });

        executorService.shutdown();

        if (integerFuture.isDone()) {
            System.out.println(integerFuture.get());
        }

        if(integerFuture.isCancelled()){
            System.out.println("Your task has been cancelled");
        }
    }
}
