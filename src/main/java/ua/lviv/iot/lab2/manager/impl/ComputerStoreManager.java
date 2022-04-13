package ua.lviv.iot.lab2.manager.impl;

import ua.lviv.iot.lab2.manager.IComputerStoreManager;

import java.util.*;

import ua.lviv.iot.lab2.model.ComputerPart;

public class ComputerStoreManager implements IComputerStoreManager {

    private Map<String, List<ComputerPart>> detailsMap = new HashMap<>();

    @Override
    public void addComputerPart(List<ComputerPart> details) {
        details.forEach(detail -> {
            String typeName = detail.getType();
            var availableGoods = detailsMap.get(typeName);
            if(availableGoods == null) {
                availableGoods = new LinkedList<ComputerPart>();
                detailsMap.put(typeName, availableGoods);
            }
            availableGoods.add(detail);
        });

    }

    @Override
    public List<List<ComputerPart>> findByRequestedTotalPrice(List<ComputerPart> details) {
        List<List<ComputerPart>> affordable= new LinkedList<>();
        for (int i = 0; i< details.size(); i++){
            int temp_sum = 0;
            for (int j = 0; j < details.subList(0,i).size(); j++) {
                temp_sum += details.subList(0, i).get(j).getPrice();
            }
            if (temp_sum < 500){
                affordable.add(details.subList(0,i));
            }
        }
        return affordable;
    }


    @Override
    public void sortByPrice(List<ComputerPart> details, boolean is_reversed) {

        if(is_reversed)
            details.sort(Collections.reverseOrder(Comparator.comparing(ComputerPart::getPrice)));
        else
            details.sort(Comparator.comparing(ComputerPart::getPrice));

    }

    @Override
    public void sortByManufacturer(List<ComputerPart> details, boolean is_reversed) {

        if(is_reversed)
            details.sort(Collections.reverseOrder(Comparator.comparing(ComputerPart::getManufacturer)));
        else
            details.sort(Comparator.comparing(ComputerPart::getManufacturer));

    }
}