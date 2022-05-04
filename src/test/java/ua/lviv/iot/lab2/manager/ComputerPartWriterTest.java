package ua.lviv.iot.lab2.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.lab2.model.*;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


class ComputerPartWriterTest {
    List<ComputerPart> details = new LinkedList<>();
    Path expectedFilePath = Paths.get("C:\\JavaAll\\JavaINtelliJProjects\\Lab2_java\\src\\test\\resources\\expected_cp_file.csv");
    Path actualFilePath = Path.of("C:\\JavaAll\\JavaINtelliJProjects\\Lab2_java\\ComputerPartFile.csv");

    @BeforeEach
    void setUp() {
        details.add(new Case(400, "FFF", 1));
        details.add(new CPU(700, "GG", 55));
        details.add(new Keyboard(700, "PPO", 2, "dsj"));
        details.add(new Monitor(700, "sAMSUNG", 2, "398"));
        details.add(new Motherboard(700, "Intell", 1));
        details.add(new PSU(99, "fgm", 2));
        details.add(new SSD(700, "Shaome", 1, 1, 1));

    }

    @Test
    void writeToFile() throws IOException{

        Assertions.assertFalse(details.isEmpty());
        ComputerPartWriter.writeToFile(details);
        try(FileReader expectedReader = new FileReader(String.valueOf(expectedFilePath));
            BufferedReader expectedBR = new BufferedReader(expectedReader);
            FileReader actualReader = new FileReader(String.valueOf(actualFilePath));
            BufferedReader actualBR = new BufferedReader(actualReader)){
            String expectedLine = expectedBR.readLine();
            String actualLine = actualBR.readLine();
            while ( (expectedLine != null) || (actualLine != null) ){
                Assertions.assertEquals(expectedLine, actualLine);
                expectedLine = expectedBR.readLine();
                actualLine = actualBR.readLine();

            }
        }
    }
}