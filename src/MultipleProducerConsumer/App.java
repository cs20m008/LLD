package MultipleProducerConsumer;



import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App {
    public static void multipleProducerConsumerMain()
    {
        SharedResource sharedResource=new SharedResource();
        ExecutorService executorService = Executors.newFixedThreadPool(6);
        for(int i=0;i<3;i++)
        {
            executorService.submit(new Producer(sharedResource,i));
        }
        for(int i=0;i<3;i++)
        {
            executorService.submit(new Consumer(sharedResource));

        }
    }
}
