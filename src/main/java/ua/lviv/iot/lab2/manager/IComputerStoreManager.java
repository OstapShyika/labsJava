package ua.lviv.iot.lab2.manager;
import ua.lviv.iot.lab2.model.ComputerPart;
import java.util.List;

public interface IComputerStoreManager {

    void addComputerPart(List <ComputerPart> details);

    public List<List<ComputerPart>> findByRequestedTotalPrice(List<ComputerPart> details);

    void sortByPrice(List <ComputerPart> details, boolean is_reversed);

    void sortByManufacturer(List <ComputerPart> details, boolean is_reversed);

    double TotalPrice(List <ComputerPart> details);
}
