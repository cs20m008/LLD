package SimpleProducerConsumer.ProducerConsumer;

public class Consumer  implements Runnable {
    SharedResource sharedResource;

    public Consumer(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        for ( ;;)
        {
            try {

                System.out.println(sharedResource.getData());
                if(!sharedResource.production && sharedResource.getData()==-1)
                    break;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            try {
                System.out.println("read sleep ");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
