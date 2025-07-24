package PaymentSystem_GPay.InstrumentManager;

import java.util.List;

public class InstrumentManager {
    List<Instrument> instrumentList;

    public InstrumentManager() {
    }
    public void addInstrument(Instrument instrument)
    {
        instrumentList.add(instrument);
    }
    public void removeInstrument(Instrument instrument)
    {
        instrumentList.remove(instrument);
    }
}
