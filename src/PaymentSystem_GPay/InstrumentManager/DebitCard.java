package PaymentSystem_GPay.InstrumentManager;

public class DebitCard implements Instrument {
    String name;
    String cardNumber;
    String cardBankAccount;
    String cvv;
    InstrumentType instrumentType=InstrumentType.DebitCard;

    public DebitCard(String name, String cardNumber, String cardBankAccount, String cvv) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.cardBankAccount = cardBankAccount;
        this.cvv = cvv;
    }

    @Override
    public InstrumentType getInstrumentType() {
        return instrumentType;
    }
}
