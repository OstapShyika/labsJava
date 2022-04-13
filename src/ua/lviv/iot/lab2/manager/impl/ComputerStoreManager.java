package ua.lviv.iot.lab2.manager.impl;

import ua.lviv.iot.lab2.manager.IComputerStoreManager;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import ua.lviv.iot.lab2.model.ComputerPart;
import java.util.List;

public class ComputerStoreManager implements IComputerStoreManager {

    private Map<String, List<ComputerPart>> detailsMap = new HashMap<>();

    @Override
    public void addComputerPart(List<ComputerPart> details) {

    }

    @Override
    public List<List<ComputerPart>> findByRequestedTotalPrice(List<ComputerPart> details) {
        List<List<ComputerPart>> affordable= new LinkedList<>();
        return affordable;
    }


    @Override
    public List<ComputerPart> sortByPrice(List<ComputerPart> details, boolean isReversed) {

        return null;

    }

    @Override
    public List<ComputerPart> sortByManufacturer(List<ComputerPart> details, boolean isReversed) {

        return null;
    }
}
