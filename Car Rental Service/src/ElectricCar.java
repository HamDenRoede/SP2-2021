class ElectricCar extends Car
{

    public int batteryCapacityKWh;
    public int maxKm;
    public int whPrKm;


    public ElectricCar(String regNo, String brand, String model, int year, int doors, int batteryCapacityKWh, int maxKm, int whPrKm)
    {
        super(regNo, brand, model, year, doors);
        this.batteryCapacityKWh = batteryCapacityKWh;
        this.maxKm = maxKm;
        this.whPrKm = whPrKm;
    }

    public int getBatteryCapacityKWh()
    {
        return batteryCapacityKWh;
    }

    public void setBatteryCapacityKWh(int batteryCapacityKWh)
    {
        this.batteryCapacityKWh = batteryCapacityKWh;
    }

    public int getMaxKm()
    {
        return maxKm;
    }

    public void setMaxKm(int maxKm)
    {
        this.maxKm = maxKm;
    }

    public int getWhPrKm()
    {
        return whPrKm;
    }

    public void setWhPrKm(int whPrKm)
    {
        this.whPrKm = whPrKm;
    }

    @Override
    public String toString()
    {
        return "ElectricCar -" +
                " regNo= '" + regNo + '\'' +
                ", brand= '" + brand + '\'' +
                ", model= '" + model + '\'' +
                ", year= '" + year + '\'' +
                ", doors= '" + doors + '\'' +
                ", batteryCapacityKWh= '" + batteryCapacityKWh + '\'' +
                ", maxKm= '" + maxKm + '\'' +
                ", whPrKm= '" + whPrKm + '\'';
    }

    public double calculateGreenOwnersTax()
    {
        double x;
        x = 100/(whPrKm/91.25);
        if ( x < 5)
        {
            return 10470;
        }
        if (5 <= x && x < 10)
        {
            return 5500;
        }
        if (10 <= x && x < 15)
        {
            return 2340;
        }
        if (15 <= x && x < 20)
        {
            return 1050;
        }
        if (20 <= x && x < 50)
        {
            return 330;
        }
        return 0;

    }

}
