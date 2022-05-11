package ua.lviv.iot.lab2.manager.impl;

import lombok.Getter;
import ua.lviv.iot.lab2.manager.IComputerStoreManager;
import java.util.*;

import ua.lviv.iot.lab2.model.ComputerPart;


@Getter
public class ComputerStoreManager implements IComputerStoreManager {

    private Map<String, List<ComputerPart>> detailsMap = new HashMap<>();

    @Override
    public void addComputerPart(List<ComputerPart> details) {
        details.forEach(detail -> {
            String typeName = detail.getType();
            var availableGoods = detailsMap.get(typeName);
            if (availableGoods == null) {
                availableGoods = new LinkedList<ComputerPart>();
                detailsMap.put(typeName, availableGoods);
            }
            availableGoods.add(detail);
        });

    }

    @Override
    public List<List<ComputerPart>> findByRequestedTotalPrice(List<ComputerPart> details) {
        sortByPrice(details, false);
        List<List<ComputerPart>> affordable = new LinkedList<>();
        for (int i = 0; i < details.size(); i++) {

            for (int j = i; j < details.size(); j++) {

                if (totalPrice(details.subList(i, j + 1)) < 500) {

                    affordable.add(details.subList(i, j + 1));
                }
            }
        }
        return affordable;
    }


    @Override
    public void sortByPrice(List<ComputerPart> details, boolean isReversed) {

        if (isReversed) {
            details.sort(Collections.reverseOrder(Comparator.comparing(ComputerPart::getPrice)));
        }
        else {
            details.sort(Comparator.comparing(ComputerPart::getPrice));
        }

    }

    @Override
    public void sortByManufacturer(List<ComputerPart> details, boolean isReversed) {

        if (isReversed) {
            details.sort(Collections.reverseOrder(Comparator.comparing(ComputerPart::getManufacturer)));
        }
        else {
            details.sort(Comparator.comparing(ComputerPart::getManufacturer));
        }

    }

    @Override
    public double totalPrice(List<ComputerPart> details) {
        double sum = 0;
        for (int i = 0; i < details.size(); i++) {
            sum += details.get(i).getPrice();
        }
        return sum;
    }


}
