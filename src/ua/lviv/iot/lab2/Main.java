package ua.lviv.iot.lab2;

import ua.lviv.iot.lab2.manager.impl.ComputerStoreManager;
import ua.lviv.iot.lab2.model.*;
import ua.lviv.iot.lab2.model.ComputerPart;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args){

        ComputerStoreManager a = new ComputerStoreManager();

        Case case1 = new Case(1, "FFF", 1);
        CPU cpu1 = new CPU(1, "GG", 55);
        Keyboard keyboard1 = new Keyboard(1, "PPO", 2, "dsj");
        Monitor monitor1 = new Monitor(1, "sAMSUNG", 2, "398");
        Motherboard motherboard1 = new Motherboard(1, "Intell", 1);
        PSU psu1 = new PSU(1, "fgm", 2);
        SSD ssd1 = new SSD(1, "Shaome", 1, 1, 1);

    }
}
