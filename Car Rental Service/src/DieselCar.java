class DieselCar extends Car
{

    public boolean hasParticleFilter;
    public int kmPrL;


    public DieselCar(String regNo, String brand, String model, int year, int doors, boolean hasParticleFilter, int kmPrL)
    {
        super(regNo, brand, model, year, doors);
        this.hasParticleFilter = hasParticleFilter;
        this.kmPrL = kmPrL;
    }

    public boolean isHasParticleFilter()
    {
        return hasParticleFilter;
    }

    public void setHasParticleFilter(boolean hasParticleFilter)
    {
        this.hasParticleFilter = hasParticleFilter;
    }

    public int getKmPrL()
    {
        return kmPrL;
    }

    public void setKmPrL(int kmPrL)
    {
        this.kmPrL = kmPrL;
    }

    @Override
    public String toString()
    {
        return "DieselCar{" +
                "regNo='" + regNo + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", doors=" + doors +
                ", hasParticleFilter=" + hasParticleFilter +
                ", kmPrL=" + kmPrL +
                '}';
    }
    
    
    public double calculateGreenOwnersTax()
    {
        if ( kmPrL < 5 && hasParticleFilter == true)
        {
            return 15260;
        }
        if (5 <= kmPrL && kmPrL < 10 && hasParticleFilter == true)
        {
            return 2770;
        }
        if (10 <= kmPrL && kmPrL < 15 && hasParticleFilter == true)
        {
            return 1850;
        }
        if (15 <= kmPrL && kmPrL < 20 && hasParticleFilter == true)
        {
            return 1390;
        }
        if (20 <= kmPrL && kmPrL < 50 && hasParticleFilter == true)
        {
            return 130;
        }
        if ( kmPrL < 5 && hasParticleFilter == false)
        {
            return 16260;
        }
        if (5 <= kmPrL && kmPrL < 10 && hasParticleFilter == false)
        {
            return 3770;
        }
        if (10 <= kmPrL && kmPrL < 15 && hasParticleFilter == false)
        {
            return 2850;
        }
        if (15 <= kmPrL && kmPrL < 20 && hasParticleFilter == false)
        {
            return 2390;
        }
        if (20 <= kmPrL && kmPrL < 50 && hasParticleFilter == false)
        {
            return 1130;
        }
        return 0;
    }
}