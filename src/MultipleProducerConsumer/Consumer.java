package MultipleProducerConsumer;

public class Consumer implements Runnable{
    SharedResource sharedResource;

    public Consumer(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        sharedResource.getData();

    }
}
