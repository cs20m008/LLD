package SimpleProducerConsumer.ProducerConsumer;

public class Producer implements Runnable{
    SharedResource sharedResource;

    public Producer(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        for(int i=1;i<100;i++)
        {
            if(i%7==0)
            {
                try {
                    sharedResource.addData(i);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        }
        sharedResource.production =false;

    }
}
