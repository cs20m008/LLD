package PaymentSystem_GPay.TransactionManager;

import java.util.List;

public class TransactionManager {
    List<Transaction>transactionList;
    private static volatile   TransactionManager instance;
    private TransactionManager() {
    }
    public static TransactionManager getInstance()
    {
        if(instance==null)
        {
            synchronized (TransactionManager.class)
            {
                if(instance==null)
                {
                    instance=new TransactionManager();
                }
            }

        }
        return instance;
    }
    public void addTransaction(Transaction transaction)
    {
        transactionList.add(transaction);
    }
    public void removeTransaction(Transaction transaction)
    {
        transactionList.remove(transaction);
    }
}
