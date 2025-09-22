public class Vehicle{
    private int vehiclenum;
    private String name;
    private String model;
    private String year;
    private String manufacturer;
    private int basecost;
    private Mechanical mechanical;
    private Invoice invoice;

    public Vehicle(int vehiclenum, String name, String model, String year, String manufacturer, int basecost){
        this.name = name;
        this.model = model;
        this.year = year;
        this.manufacturer = manufacturer;
        this.basecost = basecost;
    }

    @Override
    public String toString() {
        return "Vehicle Number: " + vehiclenum + "\n" +
            "Name: " + name + "\n" +
            "Model: " + model + "\n" +
            "Year: " + year + "\n" +
            "Manufacturer: " + manufacturer + "\n" +
            "Base Cost: $" + basecost;
    }

}
