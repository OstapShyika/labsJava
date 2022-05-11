package ua.lviv.iot.lab2.manager;

import ua.lviv.iot.lab2.model.ComputerPart;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Comparator;
import java.util.List;

public class ComputerPartWriter {

    public static void writeToFile(List<ComputerPart> details) throws IOException {

        try (FileWriter writer = new FileWriter("ComputerPartFile.csv", StandardCharsets.UTF_8)) {

            details.sort(Comparator.comparing(ComputerPart::getType));
            String previousType = "";

            for (var detail: details) {
                if (!detail.getType().equals(previousType)) {
                    writer.write(detail.getHeaders());
                    writer.write("\r\n");
                    previousType = detail.getType();
                }
                writer.write(detail.toCSV());
                writer.write("\r\n");
            }

            writer.flush();

        }

    }
}
