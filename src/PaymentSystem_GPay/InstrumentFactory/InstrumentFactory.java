package PaymentSystem_GPay.InstrumentFactory;

import PaymentSystem_GPay.InstrumentManager.*;

public class InstrumentFactory {
    private static volatile InstrumentFactory instance;
    private InstrumentFactory()
    {

    }
    public static InstrumentFactory getInstance()
    {
        if(instance==null)
        {
            synchronized (InstrumentFactory.class)
            {
                if(instance==null)
                {
                    instance=new InstrumentFactory();
                }
            }
        }
        return instance;
    }
    public InstrumentManager getInstrumentManager(InstrumentType instrumentType)
    {
        if (instrumentType.equals(InstrumentType.BankAccount))
        {
            new BankAccountInstrumentManager();
        }
        else if(instrumentType.equals(InstrumentType.CreditCard))
        {
            new CreditCardInstrumentManager();
        }
        else if(instrumentType.equals(InstrumentType.DebitCard))
        {
            new DebitCardInstrumentManager();
        }
        return  null;
    }

}
