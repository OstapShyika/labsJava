package ua.lviv.iot.lab2.manager.impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.lab2.model.*;

import java.util.LinkedList;
import java.util.List;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class ComputerStoreManagerTest {
    private ComputerStoreManager manager;
    private List<ComputerPart> details;

    @BeforeEach
    void setUp() {
        manager = new ComputerStoreManager();
        details = new LinkedList<ComputerPart>();
        details.add(new Case(400, "B", 1));
        details.add(new CPU(700, "C", 55));
        details.add(new Keyboard(700, "E", 2, "dsj"));
        details.add(new Monitor(700, "F", 2, "398"));
        details.add(new Motherboard(700, "G", 1));
        details.add(new PSU(99, "A", 2));
        details.add(new SSD(700, "D", 1, 1, 1));
        manager.addComputerPart(details);
    }


    @Test
    void addComputerPart() {
        Assertions.assertFalse(manager.getDetailsMap().isEmpty());
        Assertions.assertEquals(details.size(), manager.getDetailsMap().size());
    }

    @Test
    void findByRequestedTotalPrice() {
        Assertions.assertEquals(3, manager.findByRequestedTotalPrice(details).size());
        Assertions.assertEquals(99, manager.findByRequestedTotalPrice(details).get(0).get(0).getPrice());
        Assertions.assertEquals(99, manager.findByRequestedTotalPrice(details).get(1).get(0).getPrice());
        Assertions.assertEquals(400, manager.findByRequestedTotalPrice(details).get(1).get(1).getPrice());
        Assertions.assertEquals(400, manager.findByRequestedTotalPrice(details).get(2).get(0).getPrice());

    }

    @Test
    void sortByPriceDesc() {
        manager.sortByPrice(details, true);
        Assertions.assertEquals(99, details.get(6).getPrice());
        Assertions.assertEquals(400, details.get(5).getPrice());
        Assertions.assertEquals(700, details.get(4).getPrice());
        Assertions.assertEquals(700, details.get(3).getPrice());
        Assertions.assertEquals(700, details.get(2).getPrice());
        Assertions.assertEquals(700, details.get(1).getPrice());
        Assertions.assertEquals(700, details.get(0).getPrice());
    }

    @Test
    void sortByPriceAsc() {
        manager.sortByPrice(details, false);
        Assertions.assertEquals(700, details.get(6).getPrice());
        Assertions.assertEquals(700, details.get(5).getPrice());
        Assertions.assertEquals(700, details.get(4).getPrice());
        Assertions.assertEquals(700, details.get(3).getPrice());
        Assertions.assertEquals(700, details.get(2).getPrice());
        Assertions.assertEquals(400, details.get(1).getPrice());
        Assertions.assertEquals(99, details.get(0).getPrice());
    }

    @Test
    void sortByManufacturerDesc() {
        manager.sortByManufacturer(details, true);
        Assertions.assertEquals("A", details.get(6).getManufacturer());
        Assertions.assertEquals("B", details.get(5).getManufacturer());
        Assertions.assertEquals("C", details.get(4).getManufacturer());
        Assertions.assertEquals("D", details.get(3).getManufacturer());
        Assertions.assertEquals("E", details.get(2).getManufacturer());
        Assertions.assertEquals("F", details.get(1).getManufacturer());
        Assertions.assertEquals("G", details.get(0).getManufacturer());
    }

    @Test
    void TotalPriceTest() {
        Assertions.assertEquals(3999, manager.totalPrice(details));
    }

    @Test
    void sortByManufacturerAsc() {
        manager.sortByManufacturer(details, false);
        Assertions.assertEquals("G", details.get(6).getManufacturer());
        Assertions.assertEquals("F", details.get(5).getManufacturer());
        Assertions.assertEquals("E", details.get(4).getManufacturer());
        Assertions.assertEquals("D", details.get(3).getManufacturer());
        Assertions.assertEquals("C", details.get(2).getManufacturer());
        Assertions.assertEquals("B", details.get(1).getManufacturer());
        Assertions.assertEquals("A", details.get(0).getManufacturer());
    }
}