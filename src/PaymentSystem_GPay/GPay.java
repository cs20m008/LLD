package PaymentSystem_GPay;

import PaymentSystem_GPay.InstrumentFactory.InstrumentFactory;
import PaymentSystem_GPay.InstrumentManager.*;
import PaymentSystem_GPay.Processor.Processor;
import PaymentSystem_GPay.Processor.ProcessorType;
import PaymentSystem_GPay.ProcessorFactory.ProcessorFactory;
import PaymentSystem_GPay.TransactionManager.Transaction;
import PaymentSystem_GPay.TransactionManager.TransactionManager;
import PaymentSystem_GPay.UserManager.User;
import PaymentSystem_GPay.UserManager.UserManager;

public class GPay {
    UserManager userManager;
    InstrumentManager instrumentManager;
    TransactionManager transactionManager;
    InstrumentFactory instrumentFactory;
    ProcessorFactory processorFactory;
    public GPay()
    {
        userManager=UserManager.getInstance();
        transactionManager=TransactionManager.getInstance();
        instrumentFactory=InstrumentFactory.getInstance();
        processorFactory=ProcessorFactory.getInstance();
        T
    }
    public void addUser(User user)
    {
        userManager.addUser(user);
    }
    public void addInstrument(Instrument instrument)
    {
        instrumentManager=instrumentFactory.getInstrumentManager(instrument.getInstrumentType());
        instrumentManager.addInstrument(instrument);
    }
    public void createTransaction(User sender,User reciever,int amount)
    {   Transaction transaction=new Transaction(sender,reciever,amount);
        Processor processor=processorFactory.getProcessor(ProcessorType.RazorPay);
        processor.pay(transaction);
        transactionManager.addTransaction(transaction);
    }
}
