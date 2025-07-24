package SimpleProducerConsumer.ProducerConsumer;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class SharedResource {
    private List<Integer>data=new ArrayList<>();
    Boolean production=true;
    ReadWriteLock readWrite=new ReentrantReadWriteLock(true);
    Lock write=readWrite.writeLock();
    Lock read= readWrite.readLock();

    public SharedResource() {

    }
    public void addData(int value) throws InterruptedException {
        write.lock();
        try {
            data.add(value);
        }
        finally {
            write.unlock();
        }

    }
    public int getData() throws InterruptedException {
       read.lock();
       try {
           if(data.isEmpty())
               return -1;
           else
           {
               int val=data.getLast();
               data.removeLast();
               return val;
           }
       }
       finally {
           read.unlock();
       }

    }

}
