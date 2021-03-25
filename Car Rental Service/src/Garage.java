import java.util.List;
import java.util.ArrayList;

public class Garage
{
    List<Car> myGarage;
    String name;

    public Garage(String name)
    {
        this.myGarage = myGarage;
        this.name = name;
    }

    public void addCar(Car a)
    {
        myGarage.add(a);
    }

    @Override
    public String toString()
    {
        return "My Garage: \n \n" + myGarage;
    }

    public double calculateGreenTaxForCarPark()
    {
        double totalFee = 0;
        for (Car b: myGarage)
        {
            totalFee += b.calculateGreenOwnersTax();
        }

        return totalFee;
    }
}
