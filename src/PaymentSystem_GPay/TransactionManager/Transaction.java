package PaymentSystem_GPay.TransactionManager;

import PaymentSystem_GPay.InstrumentManager.Instrument;
import PaymentSystem_GPay.UserManager.User;

public class Transaction {
    TransactionType transactionType;
    User sender;
    Instrument senderInstrument;
    User reciever;

    public Transaction(TransactionType transactionType, User sender, Instrument senderInstrument, User reciever, Instrument recieverInstrument, int amount) {
        this.transactionType = transactionType;
        this.sender = sender;
        this.senderInstrument = senderInstrument;
        this.reciever = reciever;
        this.recieverInstrument = recieverInstrument;
        this.amount = amount;
    }
    public Transaction(User sender,User reciever,int amount)
    {
        this.sender=sender;
        this.reciever=reciever;
        this.amount=amount;
    }

    Instrument recieverInstrument;
    int amount;

}
