package PaymentSystem_GPay.ProcessorFactory;

import PaymentSystem_GPay.InstrumentFactory.InstrumentFactory;
import PaymentSystem_GPay.InstrumentManager.*;
import PaymentSystem_GPay.Processor.Processor;
import PaymentSystem_GPay.Processor.ProcessorType;
import PaymentSystem_GPay.Processor.RazorPay;

public class ProcessorFactory {
    private static volatile ProcessorFactory instance;
    private ProcessorFactory
    {

    }
    public static ProcessorFactory getInstance()
    {
        if(instance==null)
        {
            synchronized (InstrumentFactory.class)
            {
                if(instance==null)
                {
                    instance=new ProcessorFactory();
                }
            }
        }
        return instance;
    }
    public Processor getProcessor(ProcessorType processorType)
    {
        if (processorType.equals(ProcessorType.RazorPay))
        {
            new RazorPay();
        }
        return null;

    }
}
