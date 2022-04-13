package ua.lviv.iot.lab2.manager;
import ua.lviv.iot.lab2.model.ComputerPart;
import java.util.List;

public interface IComputerStoreManager {

    void addComputerPart(List <ComputerPart> details);

    public List<List<ComputerPart>> findByRequestedTotalPrice(List<ComputerPart> details);

    List<ComputerPart> sortByPrice(List <ComputerPart> details, boolean isReversed);

    List<ComputerPart> sortByManufacturer(List <ComputerPart> details, boolean isReversed);


}
