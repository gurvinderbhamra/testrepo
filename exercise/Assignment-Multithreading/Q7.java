import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Q7
{
    public static void main(String args[])throws Exception
    {
        //Submit List of tasks to ExecutorService and wait for the completion of all the tasks.

        List<Callable<Integer>> list = new ArrayList<>();
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        list.add(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return 1;
            }
        });
        list.add(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return 2;
            }
        });
        list.add(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return 3;
            }
        });

        List<Future<Integer>> futureList = executorService.invokeAll(list);

        for(Future<Integer> f : futureList){
            if(f.isDone())
                System.out.println("Future item : " + f.get());
        }

        executorService.shutdown();
    }
}
