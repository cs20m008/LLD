package PaymentSystem_GPay.Processor;

import PaymentSystem_GPay.TransactionManager.Transaction;

public class RazorPay implements Processor{
    @Override
    public Boolean pay(Transaction transaction) {

        return true;
    }

    @Override
    public ProcessorType getProcessorType() {
        return ProcessorType.RazorPay;
    }
}
