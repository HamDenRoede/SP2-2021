class PetrolCar extends Car
{
    public int octane;
    public int kmPrL;

    public PetrolCar(String regNo, String brand, String model, int year, int doors, int octane, int kmPerL)
    {
        super(regNo, brand, model, year, doors);
        this.octane = octane;
        this.kmPrL = kmPerL;
    }

    public int getOctane()
    {
        return octane;
    }

    public void setOctane(int octane)
    {
        this.octane = octane;
    }

    public float getKmPerL()
    {
        return kmPrL;
    }

    public void setKmPerL(int kmPerL)
    {
        this.kmPrL = kmPerL;
    }

    @Override
    public String toString()
    {
        return "PetrolCar{" +
                "regNo='" + regNo + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", doors=" + doors +
                ", octane=" + octane +
                ", kmPerL=" + kmPrL +
                '}';
    }

    public double calculateGreenOwnersTax()
    {
        if ( kmPrL < 5)
        {
            return 10470;
        }
        if (5 <= kmPrL && kmPrL < 10)
        {
            return 5500;
        }
        if (10 <= kmPrL && kmPrL < 15)
        {
            return 2340;
        }
        if (15 <= kmPrL && kmPrL < 20)
        {
            return 1050;
        }
        if (20 <= kmPrL && kmPrL < 50)
        {
            return 330;
        }
        return 0;
    }
}