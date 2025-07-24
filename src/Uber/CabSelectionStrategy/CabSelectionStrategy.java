package Uber.CabSelectionStrategy;

import Uber.CabSystem.Cab;

public class CabSelectionStrategy {
    public Cab getCab(String pickUp, String drop) {
        return new Cab(1);
    }
}
