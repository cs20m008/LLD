package PaymentSystem_GPay.InstrumentManager;

public class BankAccount implements Instrument{
    String name;
    String bankAccountNumber;
    String bankName;
    String ifscCode;
    String branchName;
    InstrumentType instrumentType=InstrumentType.BankAccount;
    public BankAccount(String name, String bankAccountNumber, String bankName, String ifscCode, String branchName) {
        this.name = name;
        this.bankAccountNumber = bankAccountNumber;
        this.bankName = bankName;
        this.ifscCode = ifscCode;
        this.branchName = branchName;
    }

    @Override
    public InstrumentType getInstrumentType() {
        return instrumentType;
    }
}
