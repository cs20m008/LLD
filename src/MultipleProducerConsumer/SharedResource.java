package MultipleProducerConsumer;

public class SharedResource {
    private int data;

    public SharedResource() {

    }
    public void addData(int data)
    {
        synchronized (this)
        {   System.out.println(Thread.currentThread().getName());
            System.out.println(data);
            this.data=data;
        }
    }
    public int getData()
    {
        synchronized (this)
        {   System.out.println(Thread.currentThread().getName());
            System.out.println(this.data);
            return this.data;
        }
    }
}
