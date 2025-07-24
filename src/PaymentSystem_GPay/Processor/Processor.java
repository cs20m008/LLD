package PaymentSystem_GPay.Processor;

import PaymentSystem_GPay.TransactionManager.Transaction;

public interface Processor {
    public Boolean pay(Transaction transaction);
    public ProcessorType getProcessorType();
}
