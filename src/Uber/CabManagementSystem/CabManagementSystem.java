package Uber.CabManagementSystem;

import Uber.CabSelectionStrategy.CabSelectionStrategy;
import Uber.CabSystem.Cab;

import java.util.List;

public class CabManagementSystem {
    CabManagementType cabManagementType;
    List<Cab>cabList;
    CabSelectionStrategy cabSelectionStrategy;
    public CabManagementSystem(CabManagementType cabManagementType) {
        this.cabManagementType = cabManagementType;
    }

    public void addCab(Cab cab)
    {
        cabList.add(cab);
    }
    public void removeCab(Cab cab)
    {
        cabList.remove(cab);
    }
    public Cab getCab(String pickUp,String drop)
    {
        cabSelectionStrategy.getCab(pickUp,drop);
    }
}
