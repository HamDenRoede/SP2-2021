public class Main
{
    public static void main(String[] args)
    {
        Garage primaryGarage = new Garage ("Garage 1");
        PetrolCar renaultPetrol = new PetrolCar("BC20193", "Renault", "Megane", 1998, 5, 100, 16);
        DieselCar audiDiesel = new DieselCar("VA10222", "Audi", "A4", 2008, 5, true, 20);
        ElectricCar teslaElectric = new ElectricCar("DA27163", "Tesla", "S", 2016, 3, 120, 700, 249);
        primaryGarage.addCar(renaultPetrol);
        primaryGarage.addCar(audiDiesel);
        primaryGarage.addCar(teslaElectric);

        System.out.println(primaryGarage);
        System.out.println("\nTotal green tax =");
        System.out.println(primaryGarage.calculateGreenTaxForCarPark());
    }
}
