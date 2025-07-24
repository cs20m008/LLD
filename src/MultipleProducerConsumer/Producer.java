package MultipleProducerConsumer;

public class Producer implements Runnable{
    SharedResource sharedResource;
    int data;

    public Producer(SharedResource sharedResource, int data) {
        this.sharedResource = sharedResource;
        this.data = data;
    }

    @Override
    public void run() {
        sharedResource.addData(data);

    }
}
