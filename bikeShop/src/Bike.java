public class Bike {

	private double prize;

	public double getPrize() {
	return prize;
	}


	public void setPrize(double prize) throws Wyjatek
	{
	if(prize < 0)
	throw new Wyjatek("prize can not be less than zero");
	else
	this.prize=prize;
	}
	public String brand;
    public String model;
    public BikeTypes type;
	private String bike_id;

   
    public Bike (String brand, String model, String type)
    {
        this.brand=brand;
        this.model=model;
        
    }

    public void printBike()
    {
        System.out.println("Marka:"+brand+ "\t Model:"+model+"\t Typ:"+type);
    }

    public BikeTypes getType()
    {
    return this.type;
    }

   
    public Bike(BikeTypes type, String bike_id)
    {
    this.type=type;
    this.bike_id=bike_id;
    }
    
    

    public void setType(BikeTypes type)
    {
    this.type=type;
    }

    public String getbike_id()
    {
    return this.bike_id;
    }
    public void set(String bike_id)
    {
    this.bike_id=bike_id;
    }


}