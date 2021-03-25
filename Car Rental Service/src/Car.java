public abstract class Car
{
    public String regNo;
    public String brand;
    public String model;
    public int year;
    public int doors;


    public Car(String regNo, String brand, String model, int year, int doors)
    {
        this.regNo = regNo;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.doors = doors;
    }

    public String getRegNo()
    {
        return regNo;
    }

    public void setRegNo(String regNo)
    {
        this.regNo = regNo;
    }

    public String getBrand()
    {
        return brand;
    }

    public void setBrand(String brand)
    {
        this.brand = brand;
    }

    public String getModel()
    {
        return model;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public int getYear()
    {
        return year;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    public int getDoors()
    {
        return doors;
    }

    public void setDoors(int doors)
    {
        this.doors = doors;
    }

    public abstract double calculateGreenOwnersTax();

}
