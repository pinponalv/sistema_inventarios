package com.repasopoo.sistemainventarios;

import java.util.ArrayList;
import java.util.List;

public class Movements {
    private List<Movements> historyMovements;

    public Movements() {
    }

    public Movements(List<Movements> historyMovements) {
        this.historyMovements = new ArrayList<>();
    }

    public List<Movements> getHistoryMovements() {
        return historyMovements;
    }    
    
}
