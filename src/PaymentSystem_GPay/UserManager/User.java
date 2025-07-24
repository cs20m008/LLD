package PaymentSystem_GPay.UserManager;

import PaymentSystem_GPay.InstrumentManager.Instrument;

import java.util.List;

public class User {
    String name;
    List<Instrument>instrumentList;

    public User(String name) {
        this.name = name;
    }
}
