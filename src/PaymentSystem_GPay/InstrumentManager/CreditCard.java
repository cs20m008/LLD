package PaymentSystem_GPay.InstrumentManager;

public class CreditCard implements Instrument{
    String name;
    String cardNo;
    String cardBank;
    InstrumentType instrumentType=InstrumentType.CreditCard;
    public CreditCard(String name, String cardNo, String cardBank) {
        this.name = name;
        this.cardNo = cardNo;
        this.cardBank = cardBank;
    }

    @Override
    public InstrumentType getInstrumentType() {
        return instrumentType;
    }
}
