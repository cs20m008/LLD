package SimpleProducerConsumer;

import SimpleProducerConsumer.ProducerConsumer.Consumer;
import SimpleProducerConsumer.ProducerConsumer.Producer;
import SimpleProducerConsumer.ProducerConsumer.SharedResource;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App {
    public static void simpleProducerConsumerMain() throws InterruptedException {
        SharedResource sharedResource=new SharedResource();
        ExecutorService executor= Executors.newFixedThreadPool(2);
        executor.submit(new Producer(sharedResource));
        executor.submit(new Consumer(sharedResource));
        executor.shutdown();



    }

}
