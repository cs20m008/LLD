package Uber;

import Uber.CabManagementSystem.CabManagementSystem;
import Uber.CabManagementSystem.CabManagementType;
import Uber.CabManagementSystem.FourWheelerCabManagementSystem;
import Uber.CabManagementSystem.TwoWheelerCabManagementSystem;

public class CabManagementFactory {
    public static volatile CabManagementFactory instance;

    private CabManagementFactory() {
    }
    public static CabManagementFactory getInstance()
    {
        if(instance==null)
        {
            synchronized (CabManagementFactory.class)
            {
                if(instance==null)
                    instance=new CabManagementFactory();
            }
        }
        return instance;
    }
    public CabManagementSystem getCabManagementSystem(CabManagementType cabManagementType)
    {
        if(cabManagementType.equals(CabManagementType.FourWheeler))
            return new FourWheelerCabManagementSystem(CabManagementType.FourWheeler);
        else if(cabManagementType.equals((CabManagementType.TwoWheeler)))
            return new TwoWheelerCabManagementSystem(CabManagementType.TwoWheeler);
        else if(cabManagementType.equals(CabManagementType.ThreeWheeler))
            return new TwoWheelerCabManagementSystem(CabManagementType.ThreeWheeler);
        return null;
    }
}
